package org.gstreamer.badaudio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This base class is for decoders which do not operate on a streaming model.
 * That is: they load the encoded media at once, as part of an initialization,
 * and afterwards can decode samples (sometimes referred to as "rendering the
 * samples").
 * <p>
 * This sets it apart from GstAudioDecoder, which is a base class for
 * streaming audio decoders.
 * <p>
 * The base class is conceptually a mix between decoder and parser. This is
 * unavoidable, since virtually no format that isn't streaming based has a
 * clear distinction between parsing and decoding. As a result, this class
 * also handles seeking.
 * <p>
 * Non-streaming audio formats tend to have some characteristics unknown to
 * more "regular" bitstreams. These include subsongs and looping.
 * <p>
 * Subsongs are a set of songs-within-a-song. An analogy would be a multitrack
 * recording, where each track is its own song. The first subsong is typically
 * the "main" one. Subsongs were popular for video games to enable context-
 * aware music; for example, subsong {@code #0} would be the "main" song, {@code #1} would be
 * an alternate song playing when a fight started, {@code #2} would be heard during
 * conversations etc. The base class is designed to always have at least one
 * subsong. If the subclass doesn't provide any, the base class creates a
 * "pseudo" subsong, which is actually the whole song.
 * Downstream is informed about the subsong using a table of contents (TOC),
 * but only if there are at least 2 subsongs.
 * <p>
 * Looping refers to jumps within the song, typically backwards to the loop
 * start (although bi-directional looping is possible). The loop is defined
 * by a chronological start and end; once the playback position reaches the
 * loop end, it jumps back to the loop start.
 * Depending on the subclass, looping may not be possible at all, or it
 * may only be possible to enable/disable it (that is, either no looping, or
 * an infinite amount of loops), or it may allow for defining a finite number
 * of times the loop is repeated.
 * Looping can affect output in two ways. Either, the playback position is
 * reset to the start of the loop, similar to what happens after a seek event.
 * Or, it is not reset, so the pipeline sees playback steadily moving forwards,
 * the playback position monotonically increasing. However, seeking must
 * always happen within the confines of the defined subsong duration; for
 * example, if a subsong is 2 minutes long, steady playback is at 5 minutes
 * (because infinite looping is enabled), then seeking will still place the
 * position within the 2 minute period.
 * Loop count 0 means no looping. Loop count -1 means infinite looping.
 * Nonzero positive values indicate how often a loop shall occur.
 * <p>
 * If the initial subsong and loop count are set to values the subclass does
 * not support, the subclass has a chance to correct these values.
 * {@code get_property} then reports the corrected versions.
 * <p>
 * The base class operates as follows:
 * * Unloaded mode
 * <ul>
 * <li>Initial values are set. If a current subsong has already been
 *     defined (for example over the command line with gst-launch), then
 *     the subsong index is copied over to current_subsong .
 *     Same goes for the num-loops and output-mode properties.
 *     Media is NOT loaded yet.
 * <li>Once the sinkpad is activated, the process continues. The sinkpad is
 *     activated in push mode, and the class accumulates the incoming media
 *     data in an adapter inside the sinkpad's chain function until either an
 *     EOS event is received from upstream, or the number of bytes reported
 *     by upstream is reached. Then it loads the media, and starts the decoder
 *     output task.
 * <li>If upstream cannot respond to the size query (in bytes) of {@code load_from_buffer}
 *     fails, an error is reported, and the pipeline stops.
 * <li>If there are no errors, {@code load_from_buffer} is called to load the media. The
 *     subclass must at least call gst_nonstream_audio_decoder_set_output_format()
 *     there, and is free to make use of the initial subsong, output mode, and
 *     position. If the actual output mode or position differs from the initial
 *     value,it must set the initial value to the actual one (for example, if
 *     the actual starting position is always 0, set *initial_position to 0).
 *     If loading is unsuccessful, an error is reported, and the pipeline
 *     stops. Otherwise, the base class calls {@code get_current_subsong} to retrieve
 *     the actual current subsong, {@code get_subsong_duration} to report the current
 *     subsong's duration in a duration event and message, and {@code get_subsong_tags}
 *     to send tags downstream in an event (these functions are optional; if
 *     set to NULL, the associated operation is skipped). Afterwards, the base
 *     class switches to loaded mode, and starts the decoder output task.
 * </ul>
 * <p>
 * * Loaded mode&lt;/title&gt;
 * <ul>
 * <li>Inside the decoder output task, the base class repeatedly calls {@code decode},
 *     which returns a buffer with decoded, ready-to-play samples. If the
 *     subclass reached the end of playback, {@code decode} returns FALSE, otherwise
 *     TRUE.
 * <li>Upon reaching a loop end, subclass either ignores that, or loops back
 *     to the beginning of the loop. In the latter case, if the output mode is set
 *     to LOOPING, the subclass must call gst_nonstream_audio_decoder_handle_loop()
 *     <em>after</em> the playback position moved to the start of the loop. In
 *     STEADY mode, the subclass must <em>not</em> call this function.
 *     Since many decoders only provide a callback for when the looping occurs,
 *     and that looping occurs inside the decoding operation itself, the following
 *     mechanism for subclass is suggested: set a flag inside such a callback.
 *     Then, in the next {@code decode} call, before doing the decoding, check this flag.
 *     If it is set, gst_nonstream_audio_decoder_handle_loop() is called, and the
 *     flag is cleared.
 *     (This function call is necessary in LOOPING mode because it updates the
 *     current segment and makes sure the next buffer that is sent downstream
 *     has its DISCONT flag set.)
 * <li>When the current subsong is switched, {@code set_current_subsong} is called.
 *     If it fails, a warning is reported, and nothing else is done. Otherwise,
 *     it calls {@code get_subsong_duration} to get the new current subsongs's
 *     duration, {@code get_subsong_tags} to get its tags, reports a new duration
 *     (i.e. it sends a duration event downstream and generates a duration
 *     message), updates the current segment, and sends the subsong's tags in
 *     an event downstream. (If {@code set_current_subsong} has been set to NULL by
 *     the subclass, attempts to set a current subsong are ignored; likewise,
 *     if {@code get_subsong_duration} is NULL, no duration is reported, and if
 *     {@code get_subsong_tags} is NULL, no tags are sent downstream.)
 * <li>When an attempt is made to switch the output mode, it is checked against
 *     the bitmask returned by {@code get_supported_output_modes}. If the proposed
 *     new output mode is supported, the current segment is updated
 *     (it is open-ended in STEADY mode, and covers the (sub)song length in
 *     LOOPING mode), and the subclass' {@code set_output_mode} function is called
 *     unless it is set to NULL. Subclasses should reset internal loop counters
 *     in this function.
 * </ul>
 * <p>
 * The relationship between (sub)song duration, output mode, and number of loops
 * is defined this way (this is all done by the base class automatically):
 * <p>
 * * Segments have their duration and stop values set to GST_CLOCK_TIME_NONE in
 *   STEADY mode, and to the duration of the (sub)song in LOOPING mode.
 * <p>
 * * The duration that is returned to a DURATION query is always the duration
 *   of the (sub)song, regardless of number of loops or output mode. The same
 *   goes for DURATION messages and tags.
 * <p>
 * * If the number of loops is &gt;0 or -1, durations of TOC entries are set to
 *   the duration of the respective subsong in LOOPING mode and to G_MAXINT64 in
 *   STEADY mode. If the number of loops is 0, entry durations are set to the
 *   subsong duration regardless of the output mode.
 */
public class NonstreamAudioDecoder extends org.gstreamer.gst.Element {
    
    static {
        GstBadAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstNonstreamAudioDecoder";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Element.getMemoryLayout().withName("element"),
            Interop.valueLayout.ADDRESS.withName("sinkpad"),
            Interop.valueLayout.ADDRESS.withName("srcpad"),
            Interop.valueLayout.C_LONG.withName("upstream_size"),
            Interop.valueLayout.C_INT.withName("loaded_mode"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("input_data_adapter"),
            Interop.valueLayout.C_INT.withName("current_subsong"),
            Interop.valueLayout.C_INT.withName("subsong_mode"),
            Interop.valueLayout.C_LONG.withName("subsong_duration"),
            Interop.valueLayout.C_INT.withName("output_mode"),
            Interop.valueLayout.C_INT.withName("num_loops"),
            Interop.valueLayout.C_INT.withName("output_format_changed"),
            MemoryLayout.paddingLayout(32),
            org.gstreamer.audio.AudioInfo.getMemoryLayout().withName("output_audio_info"),
            Interop.valueLayout.C_LONG.withName("cur_pos_in_samples"),
            Interop.valueLayout.C_LONG.withName("num_decoded_samples"),
            org.gstreamer.gst.Segment.getMemoryLayout().withName("cur_segment"),
            Interop.valueLayout.C_INT.withName("discont"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("toc"),
            Interop.valueLayout.ADDRESS.withName("allocator"),
            org.gstreamer.gst.AllocationParams.getMemoryLayout().withName("allocation_params"),
            org.gtk.glib.Mutex.getMemoryLayout().withName("mutex")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a NonstreamAudioDecoder proxy instance for the provided memory address.
     * <p>
     * Because NonstreamAudioDecoder is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NonstreamAudioDecoder(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NonstreamAudioDecoder> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NonstreamAudioDecoder(input, ownership);
    
    /**
     * Allocates an output buffer with the internally configured buffer pool.
     * <p>
     * This function may only be called from within {@code load_from_buffer},
     * {@code load_from_custom}, and {@code decode}.
     * @param size Size of the output buffer, in bytes
     * @return Newly allocated output buffer, or NULL if allocation failed
     */
    public org.gstreamer.gst.Buffer allocateOutputBuffer(long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_nonstream_audio_decoder_allocate_output_buffer.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets sample format, sample rate, channel count from the allowed srcpad caps.
     * <p>
     * This is useful for when the subclass wishes to adjust one or more output
     * parameters to whatever downstream is supporting. For example, the output
     * sample rate is often a freely adjustable value in module players.
     * <p>
     * This function tries to find a value inside the srcpad peer's caps for
     * {@code format}, {@code sample_rate}, {@code num_chnanels} . Any of these can be NULL; they
     * (and the corresponding downstream caps) are then skipped while retrieving
     * information. Non-fixated caps are fixated first; the value closest to
     * their present value is then chosen. For example, if the variables pointed
     * to by the arguments are GST_AUDIO_FORMAT_16, 48000 Hz, and 2 channels,
     * and the downstream caps are:
     * <p>
     * "audio/x-raw, format={S16LE,S32LE}, rate=[1,32000], channels=[1,MAX]"
     * <p>
     * Then {@code format} and {@code channels} stay the same, while {@code sample_rate} is set to 32000 Hz.
     * This way, the initial values the the variables pointed to by the arguments
     * are set to can be used as default output values. Note that if no downstream
     * caps can be retrieved, then this function does nothing, therefore it is
     * necessary to ensure that {@code format}, {@code sample_rate}, and {@code channels} have valid
     * initial values.
     * <p>
     * Decoder lock is not held by this function, so it can be called from within
     * any of the class vfuncs.
     * @param format {@link org.gstreamer.audio.AudioFormat} value to fill with a sample format
     * @param sampleRate Integer to fill with a sample rate
     * @param numChannels Integer to fill with a channel count
     */
    public void getDownstreamInfo(PointerEnumeration<org.gstreamer.audio.AudioFormat> format, PointerInteger sampleRate, PointerInteger numChannels) {
        try {
            DowncallHandles.gst_nonstream_audio_decoder_get_downstream_info.invokeExact(
                    handle(),
                    format.handle(),
                    sampleRate.handle(),
                    numChannels.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reports that a loop has been completed and creates a new appropriate
     * segment for the next loop.
     * <p>
     * {@code new_position} exists because a loop may not start at the beginning.
     * <p>
     * This function is only useful for subclasses which can be in the
     * GST_NONSTREAM_AUDIO_OUTPUT_MODE_LOOPING output mode, since in the
     * GST_NONSTREAM_AUDIO_OUTPUT_MODE_STEADY output mode, this function
     * does nothing. See {@link NonstreamAudioOutputMode} for more details.
     * <p>
     * The subclass calls this during playback when it loops. It produces
     * a new segment with updated base time and internal time values, to allow
     * for seamless looping. It does <em>not</em> check the number of elapsed loops;
     * this is up the subclass.
     * <p>
     * Note that if this function is called, then it must be done after the
     * last samples of the loop have been decoded and pushed downstream.
     * <p>
     * This function must be called with the decoder mutex lock held, since it
     * is typically called from within {@code decode} (which in turn are called with
     * the lock already held).
     */
    public void handleLoop(org.gstreamer.gst.ClockTime newPosition) {
        try {
            DowncallHandles.gst_nonstream_audio_decoder_handle_loop.invokeExact(
                    handle(),
                    newPosition.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the output caps by means of a GstAudioInfo structure.
     * <p>
     * This must be called latest in the first {@code decode} call, to ensure src caps are
     * set before decoded samples are sent downstream. Typically, this is called
     * from inside {@code load_from_buffer} or {@code load_from_custom}.
     * <p>
     * This function must be called with the decoder mutex lock held, since it
     * is typically called from within the aforementioned vfuncs (which in turn
     * are called with the lock already held).
     * @param audioInfo Valid audio info structure containing the output format
     * @return TRUE if setting the output format succeeded, FALSE otherwise
     */
    public boolean setOutputFormat(org.gstreamer.audio.AudioInfo audioInfo) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_nonstream_audio_decoder_set_output_format.invokeExact(
                    handle(),
                    audioInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Convenience function; sets the output caps by means of common parameters.
     * <p>
     * Internally, this fills a GstAudioInfo structure and calls
     * gst_nonstream_audio_decoder_set_output_format().
     * @param sampleRate Output sample rate to use, in Hz
     * @param sampleFormat Output sample format to use
     * @param numChannels Number of output channels to use
     * @return TRUE if setting the output format succeeded, FALSE otherwise
     */
    public boolean setOutputFormatSimple(int sampleRate, org.gstreamer.audio.AudioFormat sampleFormat, int numChannels) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_nonstream_audio_decoder_set_output_format_simple.invokeExact(
                    handle(),
                    sampleRate,
                    sampleFormat.getValue(),
                    numChannels);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_nonstream_audio_decoder_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link NonstreamAudioDecoder.Builder} object constructs a {@link NonstreamAudioDecoder} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link NonstreamAudioDecoder.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Element.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link NonstreamAudioDecoder} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link NonstreamAudioDecoder}.
         * @return A new instance of {@code NonstreamAudioDecoder} with the properties 
         *         that were set in the Builder object.
         */
        public NonstreamAudioDecoder build() {
            return (NonstreamAudioDecoder) org.gtk.gobject.GObject.newWithProperties(
                NonstreamAudioDecoder.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setCurrentSubsong(int currentSubsong) {
            names.add("current-subsong");
            values.add(org.gtk.gobject.Value.create(currentSubsong));
            return this;
        }
        
        public Builder setNumLoops(int numLoops) {
            names.add("num-loops");
            values.add(org.gtk.gobject.Value.create(numLoops));
            return this;
        }
        
        public Builder setOutputMode(java.lang.foreign.MemoryAddress outputMode) {
            names.add("output-mode");
            values.add(org.gtk.gobject.Value.create(outputMode));
            return this;
        }
        
        public Builder setSubsongMode(java.lang.foreign.MemoryAddress subsongMode) {
            names.add("subsong-mode");
            values.add(org.gtk.gobject.Value.create(subsongMode));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_nonstream_audio_decoder_allocate_output_buffer = Interop.downcallHandle(
            "gst_nonstream_audio_decoder_allocate_output_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_nonstream_audio_decoder_get_downstream_info = Interop.downcallHandle(
            "gst_nonstream_audio_decoder_get_downstream_info",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_nonstream_audio_decoder_handle_loop = Interop.downcallHandle(
            "gst_nonstream_audio_decoder_handle_loop",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_nonstream_audio_decoder_set_output_format = Interop.downcallHandle(
            "gst_nonstream_audio_decoder_set_output_format",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_nonstream_audio_decoder_set_output_format_simple = Interop.downcallHandle(
            "gst_nonstream_audio_decoder_set_output_format_simple",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_nonstream_audio_decoder_get_type = Interop.downcallHandle(
            "gst_nonstream_audio_decoder_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
