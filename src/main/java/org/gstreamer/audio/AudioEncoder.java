package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This base class is for audio encoders turning raw audio samples into
 * encoded audio data.
 * <p>
 * GstAudioEncoder and subclass should cooperate as follows.
 * <p>
 * <strong>Configuration</strong><br/>
 *   * Initially, GstAudioEncoder calls {@code start} when the encoder element
 *     is activated, which allows subclass to perform any global setup.
 * <p>
 *   * GstAudioEncoder calls {@code set_format} to inform subclass of the format
 *     of input audio data that it is about to receive.  Subclass should
 *     setup for encoding and configure various base class parameters
 *     appropriately, notably those directing desired input data handling.
 *     While unlikely, it might be called more than once, if changing input
 *     parameters require reconfiguration.
 * <p>
 *   * GstAudioEncoder calls {@code stop} at end of all processing.
 * <p>
 * As of configuration stage, and throughout processing, GstAudioEncoder
 * maintains various parameters that provide required context,
 * e.g. describing the format of input audio data.
 * Conversely, subclass can and should configure these context parameters
 * to inform base class of its expectation w.r.t. buffer handling.
 * <p>
 * <strong>Data processing</strong><br/>
 *     * Base class gathers input sample data (as directed by the context's
 *       frame_samples and frame_max) and provides this to subclass' {@code handle_frame}.
 *     * If codec processing results in encoded data, subclass should call
 *       gst_audio_encoder_finish_frame() to have encoded data pushed
 *       downstream. Alternatively, it might also call
 *       gst_audio_encoder_finish_frame() (with a NULL buffer and some number of
 *       dropped samples) to indicate dropped (non-encoded) samples.
 *     * Just prior to actually pushing a buffer downstream,
 *       it is passed to {@code pre_push}.
 *     * During the parsing process GstAudioEncoderClass will handle both
 *       srcpad and sinkpad events. Sink events will be passed to subclass
 *       if {@code event} callback has been provided.
 * <p>
 * <strong>Shutdown phase</strong><br/>
 *   * GstAudioEncoder class calls {@code stop} to inform the subclass that data
 *     parsing will be stopped.
 * <p>
 * Subclass is responsible for providing pad template caps for
 * source and sink pads. The pads need to be named "sink" and "src". It also
 * needs to set the fixed caps on srcpad, when the format is ensured.  This
 * is typically when base class calls subclass' {@code set_format} function, though
 * it might be delayed until calling {@code gst_audio_encoder_finish_frame}.
 * <p>
 * In summary, above process should have subclass concentrating on
 * codec data processing while leaving other matters to base class,
 * such as most notably timestamp handling.  While it may exert more control
 * in this area (see e.g. {@code pre_push}), it is very much not recommended.
 * <p>
 * In particular, base class will either favor tracking upstream timestamps
 * (at the possible expense of jitter) or aim to arrange for a perfect stream of
 * output timestamps, depending on {@link AudioEncoder}:perfect-timestamp.
 * However, in the latter case, the input may not be so perfect or ideal, which
 * is handled as follows.  An input timestamp is compared with the expected
 * timestamp as dictated by input sample stream and if the deviation is less
 * than {@link AudioEncoder}:tolerance, the deviation is discarded.
 * Otherwise, it is considered a discontuinity and subsequent output timestamp
 * is resynced to the new position after performing configured discontinuity
 * processing.  In the non-perfect-timestamp case, an upstream variation
 * exceeding tolerance only leads to marking DISCONT on subsequent outgoing
 * (while timestamps are adjusted to upstream regardless of variation).
 * While DISCONT is also marked in the perfect-timestamp case, this one
 * optionally (see {@link AudioEncoder}:hard-resync)
 * performs some additional steps, such as clipping of (early) input samples
 * or draining all currently remaining input data, depending on the direction
 * of the discontuinity.
 * <p>
 * If perfect timestamps are arranged, it is also possible to request baseclass
 * (usually set by subclass) to provide additional buffer metadata (in OFFSET
 * and OFFSET_END) fields according to granule defined semantics currently
 * needed by oggmux.  Specifically, OFFSET is set to granulepos (= sample count
 * including buffer) and OFFSET_END to corresponding timestamp (as determined
 * by same sample count and sample rate).
 * <p>
 * Things that subclass need to take care of:
 * <p>
 *   * Provide pad templates
 *   * Set source pad caps when appropriate
 *   * Inform base class of buffer processing needs using context's
 *      frame_samples and frame_bytes.
 *   * Set user-configurable properties to sane defaults for format and
 *      implementing codec at hand, e.g. those controlling timestamp behaviour
 *      and discontinuity processing.
 *   * Accept data in {@code handle_frame} and provide encoded results to
 *      gst_audio_encoder_finish_frame().
 */
public class AudioEncoder extends org.gstreamer.gst.Element implements org.gstreamer.gst.Preset {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioEncoder";
    
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
            org.gtk.glib.RecMutex.getMemoryLayout().withName("stream_lock"),
            org.gstreamer.gst.Segment.getMemoryLayout().withName("input_segment"),
            org.gstreamer.gst.Segment.getMemoryLayout().withName("output_segment"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AudioEncoder proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioEncoder(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioEncoder> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioEncoder(input);
    
    /**
     * Helper function that allocates a buffer to hold an encoded audio frame
     * for {@code enc}'s current output format.
     * @param size size of the buffer
     * @return allocated buffer
     */
    public org.gstreamer.gst.Buffer allocateOutputBuffer(long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_encoder_allocate_output_buffer.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Collects encoded data and pushes encoded data downstream.
     * Source pad caps must be set when this is called.
     * <p>
     * If {@code samples} &lt; 0, then best estimate is all samples provided to encoder
     * (subclass) so far.  {@code buf} may be NULL, in which case next number of {@code samples}
     * are considered discarded, e.g. as a result of discontinuous transmission,
     * and a discontinuity is marked.
     * <p>
     * Note that samples received in {@link AudioEncoderClass}.handle_frame()
     * may be invalidated by a call to this function.
     * @param buffer encoded data
     * @param samples number of samples (per channel) represented by encoded data
     * @return a {@link org.gstreamer.gst.FlowReturn} that should be escalated to caller (of caller)
     */
    public org.gstreamer.gst.FlowReturn finishFrame(@Nullable org.gstreamer.gst.Buffer buffer, int samples) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_encoder_finish_frame.invokeExact(
                    handle(),
                    (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()),
                    samples);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Lets {@link AudioEncoder} sub-classes to know the memory {@code allocator}
     * used by the base class and its {@code params}.
     * <p>
     * Unref the {@code allocator} after use it.
     * @param allocator the {@link org.gstreamer.gst.Allocator}
     * used
     * @param params the
     * {@link org.gstreamer.gst.AllocationParams} of {@code allocator}
     */
    public void getAllocator(@Nullable Out<org.gstreamer.gst.Allocator> allocator, @Nullable org.gstreamer.gst.AllocationParams params) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment allocatorPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_audio_encoder_get_allocator.invokeExact(
                        handle(),
                        (Addressable) (allocator == null ? MemoryAddress.NULL : (Addressable) allocatorPOINTER.address()),
                        (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (allocator != null) allocator.set((org.gstreamer.gst.Allocator) Interop.register(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Allocator.fromAddress).marshal(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            params.yieldOwnership();
        }
    }
    
    public org.gstreamer.audio.AudioInfo getAudioInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_encoder_get_audio_info.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioInfo.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Queries encoder drain handling.
     * @return TRUE if drainable handling is enabled.
     * <p>
     * MT safe.
     */
    public boolean getDrainable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_encoder_get_drainable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public int getFrameMax() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_encoder_get_frame_max.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getFrameSamplesMax() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_encoder_get_frame_samples_max.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public int getFrameSamplesMin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_encoder_get_frame_samples_min.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries encoder hard minimum handling.
     * @return TRUE if hard minimum handling is enabled.
     * <p>
     * MT safe.
     */
    public boolean getHardMin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_encoder_get_hard_min.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean getHardResync() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_encoder_get_hard_resync.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the variables pointed to by {@code min} and {@code max} to the currently configured
     * latency.
     * @param min a pointer to storage to hold minimum latency
     * @param max a pointer to storage to hold maximum latency
     */
    public void getLatency(@Nullable org.gstreamer.gst.ClockTime min, @Nullable org.gstreamer.gst.ClockTime max) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment minPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment maxPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_audio_encoder_get_latency.invokeExact(
                        handle(),
                        (Addressable) (min == null ? MemoryAddress.NULL : (Addressable) minPOINTER.address()),
                        (Addressable) (max == null ? MemoryAddress.NULL : (Addressable) maxPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (min != null) min.setValue(minPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (max != null) max.setValue(maxPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    public int getLookahead() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_encoder_get_lookahead.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries if the encoder will handle granule marking.
     * @return TRUE if granule marking is enabled.
     * <p>
     * MT safe.
     */
    public boolean getMarkGranule() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_encoder_get_mark_granule.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries encoder perfect timestamp behaviour.
     * @return TRUE if perfect timestamp setting enabled.
     * <p>
     * MT safe.
     */
    public boolean getPerfectTimestamp() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_encoder_get_perfect_timestamp.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries current audio jitter tolerance threshold.
     * @return encoder audio jitter tolerance threshold.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.ClockTime getTolerance() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_encoder_get_tolerance.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Sets the audio encoder tags and how they should be merged with any
     * upstream stream tags. This will override any tags previously-set
     * with gst_audio_encoder_merge_tags().
     * <p>
     * Note that this is provided for convenience, and the subclass is
     * not required to use this and can still do tag handling on its own.
     * <p>
     * MT safe.
     * @param tags a {@link org.gstreamer.gst.TagList} to merge, or NULL to unset
     *     previously-set tags
     * @param mode the {@link org.gstreamer.gst.TagMergeMode} to use, usually {@code GST_TAG_MERGE_REPLACE}
     */
    public void mergeTags(@Nullable org.gstreamer.gst.TagList tags, org.gstreamer.gst.TagMergeMode mode) {
        try {
            DowncallHandles.gst_audio_encoder_merge_tags.invokeExact(
                    handle(),
                    (Addressable) (tags == null ? MemoryAddress.NULL : tags.handle()),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Negotiate with downstream elements to currently configured {@link org.gstreamer.gst.Caps}.
     * Unmark GST_PAD_FLAG_NEED_RECONFIGURE in any case. But mark it again if
     * negotiate fails.
     * @return {@code true} if the negotiation succeeded, else {@code false}.
     */
    public boolean negotiate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_encoder_negotiate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns caps that express {@code caps} (or sink template caps if {@code caps} == NULL)
     * restricted to channel/rate combinations supported by downstream elements
     * (e.g. muxers).
     * @param caps initial caps
     * @param filter filter caps
     * @return a {@link org.gstreamer.gst.Caps} owned by caller
     */
    public org.gstreamer.gst.Caps proxyGetcaps(@Nullable org.gstreamer.gst.Caps caps, @Nullable org.gstreamer.gst.Caps filter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_encoder_proxy_getcaps.invokeExact(
                    handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()),
                    (Addressable) (filter == null ? MemoryAddress.NULL : filter.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Sets a caps in allocation query which are different from the set
     * pad's caps. Use this function before calling
     * gst_audio_encoder_negotiate(). Setting to {@code null} the allocation
     * query will use the caps from the pad.
     * @param allocationCaps a {@link org.gstreamer.gst.Caps} or {@code null}
     */
    public void setAllocationCaps(@Nullable org.gstreamer.gst.Caps allocationCaps) {
        try {
            DowncallHandles.gst_audio_encoder_set_allocation_caps.invokeExact(
                    handle(),
                    (Addressable) (allocationCaps == null ? MemoryAddress.NULL : allocationCaps.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures encoder drain handling.  If drainable, subclass might
     * be handed a NULL buffer to have it return any leftover encoded data.
     * Otherwise, it is not considered so capable and will only ever be passed
     * real data.
     * <p>
     * MT safe.
     * @param enabled new state
     */
    public void setDrainable(boolean enabled) {
        try {
            DowncallHandles.gst_audio_encoder_set_drainable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets max number of frames accepted at once (assumed minimally 1).
     * Requires {@code frame_samples_min} and {@code frame_samples_max} to be the equal.
     * <p>
     * Note: This value will be reset to 0 every time before
     * {@link AudioEncoderClass}.set_format() is called.
     * @param num number of frames
     */
    public void setFrameMax(int num) {
        try {
            DowncallHandles.gst_audio_encoder_set_frame_max.invokeExact(
                    handle(),
                    num);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets number of samples (per channel) subclass needs to be handed,
     * at most or will be handed all available if 0.
     * <p>
     * If an exact number of samples is required, gst_audio_encoder_set_frame_samples_min()
     * must be called with the same number.
     * <p>
     * Note: This value will be reset to 0 every time before
     * {@link AudioEncoderClass}.set_format() is called.
     * @param num number of samples per frame
     */
    public void setFrameSamplesMax(int num) {
        try {
            DowncallHandles.gst_audio_encoder_set_frame_samples_max.invokeExact(
                    handle(),
                    num);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets number of samples (per channel) subclass needs to be handed,
     * at least or will be handed all available if 0.
     * <p>
     * If an exact number of samples is required, gst_audio_encoder_set_frame_samples_max()
     * must be called with the same number.
     * <p>
     * Note: This value will be reset to 0 every time before
     * {@link AudioEncoderClass}.set_format() is called.
     * @param num number of samples per frame
     */
    public void setFrameSamplesMin(int num) {
        try {
            DowncallHandles.gst_audio_encoder_set_frame_samples_min.invokeExact(
                    handle(),
                    num);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures encoder hard minimum handling.  If enabled, subclass
     * will never be handed less samples than it configured, which otherwise
     * might occur near end-of-data handling.  Instead, the leftover samples
     * will simply be discarded.
     * <p>
     * MT safe.
     * @param enabled new state
     */
    public void setHardMin(boolean enabled) {
        try {
            DowncallHandles.gst_audio_encoder_set_hard_min.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public void setHardResync(boolean enabled) {
        try {
            DowncallHandles.gst_audio_encoder_set_hard_resync.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the codec headers to be sent downstream whenever requested.
     * @param headers a list of
     *   {@link org.gstreamer.gst.Buffer} containing the codec header
     */
    public void setHeaders(org.gtk.glib.List headers) {
        try {
            DowncallHandles.gst_audio_encoder_set_headers.invokeExact(
                    handle(),
                    headers.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        headers.yieldOwnership();
    }
    
    /**
     * Sets encoder latency.
     * @param min minimum latency
     * @param max maximum latency
     */
    public void setLatency(org.gstreamer.gst.ClockTime min, org.gstreamer.gst.ClockTime max) {
        try {
            DowncallHandles.gst_audio_encoder_set_latency.invokeExact(
                    handle(),
                    min.getValue().longValue(),
                    max.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets encoder lookahead (in units of input rate samples)
     * <p>
     * Note: This value will be reset to 0 every time before
     * {@link AudioEncoderClass}.set_format() is called.
     * @param num lookahead
     */
    public void setLookahead(int num) {
        try {
            DowncallHandles.gst_audio_encoder_set_lookahead.invokeExact(
                    handle(),
                    num);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Enable or disable encoder granule handling.
     * <p>
     * MT safe.
     * @param enabled new state
     */
    public void setMarkGranule(boolean enabled) {
        try {
            DowncallHandles.gst_audio_encoder_set_mark_granule.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configure output caps on the srcpad of {@code enc}.
     * @param caps {@link org.gstreamer.gst.Caps}
     * @return {@code true} on success.
     */
    public boolean setOutputFormat(org.gstreamer.gst.Caps caps) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_encoder_set_output_format.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Enable or disable encoder perfect output timestamp preference.
     * <p>
     * MT safe.
     * @param enabled new state
     */
    public void setPerfectTimestamp(boolean enabled) {
        try {
            DowncallHandles.gst_audio_encoder_set_perfect_timestamp.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(enabled, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures encoder audio jitter tolerance threshold.
     * <p>
     * MT safe.
     * @param tolerance new tolerance
     */
    public void setTolerance(org.gstreamer.gst.ClockTime tolerance) {
        try {
            DowncallHandles.gst_audio_encoder_set_tolerance.invokeExact(
                    handle(),
                    tolerance.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_encoder_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AudioEncoder.Builder} object constructs a {@link AudioEncoder} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AudioEncoder.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Element.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AudioEncoder} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioEncoder}.
         * @return A new instance of {@code AudioEncoder} with the properties 
         *         that were set in the Builder object.
         */
        public AudioEncoder build() {
            return (AudioEncoder) org.gtk.gobject.GObject.newWithProperties(
                AudioEncoder.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setHardResync(boolean hardResync) {
            names.add("hard-resync");
            values.add(org.gtk.gobject.Value.create(hardResync));
            return this;
        }
        
        public Builder setMarkGranule(boolean markGranule) {
            names.add("mark-granule");
            values.add(org.gtk.gobject.Value.create(markGranule));
            return this;
        }
        
        public Builder setPerfectTimestamp(boolean perfectTimestamp) {
            names.add("perfect-timestamp");
            values.add(org.gtk.gobject.Value.create(perfectTimestamp));
            return this;
        }
        
        public Builder setTolerance(long tolerance) {
            names.add("tolerance");
            values.add(org.gtk.gobject.Value.create(tolerance));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_encoder_allocate_output_buffer = Interop.downcallHandle(
                "gst_audio_encoder_allocate_output_buffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_finish_frame = Interop.downcallHandle(
                "gst_audio_encoder_finish_frame",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_allocator = Interop.downcallHandle(
                "gst_audio_encoder_get_allocator",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_audio_info = Interop.downcallHandle(
                "gst_audio_encoder_get_audio_info",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_drainable = Interop.downcallHandle(
                "gst_audio_encoder_get_drainable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_frame_max = Interop.downcallHandle(
                "gst_audio_encoder_get_frame_max",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_frame_samples_max = Interop.downcallHandle(
                "gst_audio_encoder_get_frame_samples_max",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_frame_samples_min = Interop.downcallHandle(
                "gst_audio_encoder_get_frame_samples_min",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_hard_min = Interop.downcallHandle(
                "gst_audio_encoder_get_hard_min",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_hard_resync = Interop.downcallHandle(
                "gst_audio_encoder_get_hard_resync",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_latency = Interop.downcallHandle(
                "gst_audio_encoder_get_latency",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_lookahead = Interop.downcallHandle(
                "gst_audio_encoder_get_lookahead",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_mark_granule = Interop.downcallHandle(
                "gst_audio_encoder_get_mark_granule",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_perfect_timestamp = Interop.downcallHandle(
                "gst_audio_encoder_get_perfect_timestamp",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_tolerance = Interop.downcallHandle(
                "gst_audio_encoder_get_tolerance",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_merge_tags = Interop.downcallHandle(
                "gst_audio_encoder_merge_tags",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_negotiate = Interop.downcallHandle(
                "gst_audio_encoder_negotiate",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_proxy_getcaps = Interop.downcallHandle(
                "gst_audio_encoder_proxy_getcaps",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_allocation_caps = Interop.downcallHandle(
                "gst_audio_encoder_set_allocation_caps",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_drainable = Interop.downcallHandle(
                "gst_audio_encoder_set_drainable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_frame_max = Interop.downcallHandle(
                "gst_audio_encoder_set_frame_max",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_frame_samples_max = Interop.downcallHandle(
                "gst_audio_encoder_set_frame_samples_max",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_frame_samples_min = Interop.downcallHandle(
                "gst_audio_encoder_set_frame_samples_min",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_hard_min = Interop.downcallHandle(
                "gst_audio_encoder_set_hard_min",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_hard_resync = Interop.downcallHandle(
                "gst_audio_encoder_set_hard_resync",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_headers = Interop.downcallHandle(
                "gst_audio_encoder_set_headers",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_latency = Interop.downcallHandle(
                "gst_audio_encoder_set_latency",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_lookahead = Interop.downcallHandle(
                "gst_audio_encoder_set_lookahead",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_mark_granule = Interop.downcallHandle(
                "gst_audio_encoder_set_mark_granule",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_output_format = Interop.downcallHandle(
                "gst_audio_encoder_set_output_format",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_perfect_timestamp = Interop.downcallHandle(
                "gst_audio_encoder_set_perfect_timestamp",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_set_tolerance = Interop.downcallHandle(
                "gst_audio_encoder_set_tolerance",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_encoder_get_type = Interop.downcallHandle(
                "gst_audio_encoder_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_audio_encoder_get_type != null;
    }
}
