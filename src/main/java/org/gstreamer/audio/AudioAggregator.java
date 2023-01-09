package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses must use (a subclass of) {@link AudioAggregatorPad} for both
 * their source and sink pads,
 * gst_element_class_add_static_pad_template_with_gtype() is a convenient
 * helper.
 * <p>
 * {@link AudioAggregator} can perform conversion on the data arriving
 * on its sink pads, based on the format expected downstream: in order
 * to enable that behaviour, the GType of the sink pads must either be
 * a (subclass of) {@link AudioAggregatorConvertPad} to use the default
 * {@link AudioConverter} implementation, or a subclass of {@link AudioAggregatorPad}
 * implementing {@link AudioAggregatorPadClass}.convert_buffer.
 * <p>
 * To allow for the output caps to change, the mechanism is the same as
 * above, with the GType of the source pad.
 * <p>
 * See {@code GstAudioMixer} for an example.
 * <p>
 * When conversion is enabled, {@link AudioAggregator} will accept
 * any type of raw audio caps and perform conversion
 * on the data arriving on its sink pads, with whatever downstream
 * expects as the target format.
 * <p>
 * In case downstream caps are not fully fixated, it will use
 * the first configured sink pad to finish fixating its source pad
 * caps.
 * <p>
 * A notable exception for now is the sample rate, sink pads must
 * have the same sample rate as either the downstream requirement,
 * or the first configured pad, or a combination of both (when
 * downstream specifies a range or a set of acceptable rates).
 * <p>
 * The {@link org.gstreamer.base.Aggregator}::samples-selected signal is provided with some
 * additional information about the output buffer:
 * <ul>
 * <li>"offset"  G_TYPE_UINT64   Offset in samples since segment start
 *   for the position that is next to be filled in the output buffer.
 * <li>"frames"  G_TYPE_UINT   Number of frames per output buffer.
 * </ul>
 * <p>
 * In addition the gst_aggregator_peek_next_sample() function returns
 * additional information in the info {@link org.gstreamer.gst.Structure} of the returned sample:
 * <ul>
 * <li>"output-offset"  G_TYPE_UINT64   Sample offset in output segment relative to
 *   the output segment's start where the current position of this input
 *   buffer would be placed
 * <li>"position"  G_TYPE_UINT   current position in the input buffer in samples
 * <li>"size"  G_TYPE_UINT   size of the input buffer in samples
 * </ul>
 * @version 1.14
 */
public class AudioAggregator extends org.gstreamer.base.Aggregator {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioAggregator";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.Aggregator.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("current_caps"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AudioAggregator proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioAggregator(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioAggregator> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioAggregator(input);
    
    public void setSinkCaps(org.gstreamer.audio.AudioAggregatorPad pad, org.gstreamer.gst.Caps caps) {
        try {
            DowncallHandles.gst_audio_aggregator_set_sink_caps.invokeExact(
                    handle(),
                    pad.handle(),
                    caps.handle());
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
            RESULT = (long) DowncallHandles.gst_audio_aggregator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AudioAggregator.Builder} object constructs a {@link AudioAggregator} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AudioAggregator.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.Aggregator.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AudioAggregator} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioAggregator}.
         * @return A new instance of {@code AudioAggregator} with the properties 
         *         that were set in the Builder object.
         */
        public AudioAggregator build() {
            return (AudioAggregator) org.gtk.gobject.GObject.newWithProperties(
                AudioAggregator.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setAlignmentThreshold(long alignmentThreshold) {
            names.add("alignment-threshold");
            values.add(org.gtk.gobject.Value.create(alignmentThreshold));
            return this;
        }
        
        public Builder setDiscontWait(long discontWait) {
            names.add("discont-wait");
            values.add(org.gtk.gobject.Value.create(discontWait));
            return this;
        }
        
        /**
         * Don't wait for inactive pads when live. An inactive pad
         * is a pad that hasn't yet received a buffer, but that has
         * been waited on at least once.
         * <p>
         * The purpose of this property is to avoid aggregating on
         * timeout when new pads are requested in advance of receiving
         * data flow, for example the user may decide to connect it later,
         * but wants to configure it already.
         * @param ignoreInactivePads The value for the {@code ignore-inactive-pads} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIgnoreInactivePads(boolean ignoreInactivePads) {
            names.add("ignore-inactive-pads");
            values.add(org.gtk.gobject.Value.create(ignoreInactivePads));
            return this;
        }
        
        public Builder setOutputBufferDuration(long outputBufferDuration) {
            names.add("output-buffer-duration");
            values.add(org.gtk.gobject.Value.create(outputBufferDuration));
            return this;
        }
        
        /**
         * Output block size in nanoseconds, expressed as a fraction.
         * @param outputBufferDurationFraction The value for the {@code output-buffer-duration-fraction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOutputBufferDurationFraction(org.gstreamer.gst.Fraction outputBufferDurationFraction) {
            names.add("output-buffer-duration-fraction");
            values.add(org.gtk.gobject.Value.create(outputBufferDurationFraction));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_aggregator_set_sink_caps = Interop.downcallHandle(
                "gst_audio_aggregator_set_sink_caps",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_aggregator_get_type = Interop.downcallHandle(
                "gst_audio_aggregator_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_audio_aggregator_get_type != null;
    }
}
