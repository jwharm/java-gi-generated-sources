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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.Aggregator.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("current_caps"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a AudioAggregator proxy instance for the provided memory address.
     * <p>
     * Because AudioAggregator is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioAggregator(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to AudioAggregator if its GType is a (or inherits from) "GstAudioAggregator".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AudioAggregator} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAudioAggregator", a ClassCastException will be thrown.
     */
    public static AudioAggregator castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AudioAggregator.getType())) {
            return new AudioAggregator(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAudioAggregator");
        }
    }
    
    public void setSinkCaps(@NotNull org.gstreamer.audio.AudioAggregatorPad pad, @NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_aggregator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.base.Aggregator.Build {
        
         /**
         * A {@link AudioAggregator.Build} object constructs a {@link AudioAggregator} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AudioAggregator} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioAggregator} using {@link AudioAggregator#castFrom}.
         * @return A new instance of {@code AudioAggregator} with the properties 
         *         that were set in the Build object.
         */
        public AudioAggregator construct() {
            return AudioAggregator.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AudioAggregator.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setAlignmentThreshold(long alignmentThreshold) {
            names.add("alignment-threshold");
            values.add(org.gtk.gobject.Value.create(alignmentThreshold));
            return this;
        }
        
        public Build setDiscontWait(long discontWait) {
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
        public Build setIgnoreInactivePads(boolean ignoreInactivePads) {
            names.add("ignore-inactive-pads");
            values.add(org.gtk.gobject.Value.create(ignoreInactivePads));
            return this;
        }
        
        public Build setOutputBufferDuration(long outputBufferDuration) {
            names.add("output-buffer-duration");
            values.add(org.gtk.gobject.Value.create(outputBufferDuration));
            return this;
        }
        
        /**
         * Output block size in nanoseconds, expressed as a fraction.
         * @param outputBufferDurationFraction The value for the {@code output-buffer-duration-fraction} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOutputBufferDurationFraction(org.gstreamer.gst.Fraction outputBufferDurationFraction) {
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
}
