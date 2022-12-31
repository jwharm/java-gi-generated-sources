package org.gstreamer.controller;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link LFOControlSource} is a {@link org.gstreamer.gst.ControlSource}, that provides several periodic
 * waveforms as control values.
 * <p>
 * To use {@link LFOControlSource} get a new instance by calling
 * gst_lfo_control_source_new(), bind it to a {@link org.gtk.gobject.ParamSpec} and set the relevant
 * properties.
 * <p>
 * All functions are MT-safe.
 */
public class LFOControlSource extends org.gstreamer.gst.ControlSource {
    
    static {
        GstController.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstLFOControlSource";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ControlSource.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            org.gtk.glib.Mutex.getMemoryLayout().withName("lock"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a LFOControlSource proxy instance for the provided memory address.
     * <p>
     * Because LFOControlSource is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected LFOControlSource(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, LFOControlSource> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new LFOControlSource(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_lfo_control_source_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This returns a new, unbound {@link LFOControlSource}.
     */
    public LFOControlSource() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_lfo_control_source_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link LFOControlSource.Builder} object constructs a {@link LFOControlSource} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link LFOControlSource.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.ControlSource.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link LFOControlSource} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link LFOControlSource}.
         * @return A new instance of {@code LFOControlSource} with the properties 
         *         that were set in the Builder object.
         */
        public LFOControlSource build() {
            return (LFOControlSource) org.gtk.gobject.GObject.newWithProperties(
                LFOControlSource.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Specifies the amplitude for the waveform of this {@link LFOControlSource}.
         * @param amplitude The value for the {@code amplitude} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAmplitude(double amplitude) {
            names.add("amplitude");
            values.add(org.gtk.gobject.Value.create(amplitude));
            return this;
        }
        
        /**
         * Specifies the frequency that should be used for the waveform
         * of this {@link LFOControlSource}. It should be large enough
         * so that the period is longer than one nanosecond.
         * @param frequency The value for the {@code frequency} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFrequency(double frequency) {
            names.add("frequency");
            values.add(org.gtk.gobject.Value.create(frequency));
            return this;
        }
        
        /**
         * Specifies the value offset for the waveform of this {@link LFOControlSource}.
         * @param offset The value for the {@code offset} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffset(double offset) {
            names.add("offset");
            values.add(org.gtk.gobject.Value.create(offset));
            return this;
        }
        
        /**
         * Specifies the timeshift to the right that should be used for the waveform
         * of this {@link LFOControlSource} in nanoseconds.
         * <p>
         * To get a n nanosecond shift to the left use
         * "(GST_SECOND / frequency) - n".
         * @param timeshift The value for the {@code timeshift} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTimeshift(long timeshift) {
            names.add("timeshift");
            values.add(org.gtk.gobject.Value.create(timeshift));
            return this;
        }
        
        /**
         * Specifies the waveform that should be used for this {@link LFOControlSource}.
         * @param waveform The value for the {@code waveform} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setWaveform(org.gstreamer.controller.LFOWaveform waveform) {
            names.add("waveform");
            values.add(org.gtk.gobject.Value.create(waveform));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_lfo_control_source_new = Interop.downcallHandle(
            "gst_lfo_control_source_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_lfo_control_source_get_type = Interop.downcallHandle(
            "gst_lfo_control_source_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
