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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.ControlSource.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        org.gtk.glib.Mutex.getMemoryLayout().withName("lock"),
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
     * Create a LFOControlSource proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public LFOControlSource(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to LFOControlSource if its GType is a (or inherits from) "GstLFOControlSource".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code LFOControlSource} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstLFOControlSource", a ClassCastException will be thrown.
     */
    public static LFOControlSource castFrom(org.gtk.gobject.Object gobject) {
            return new LFOControlSource(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_lfo_control_source_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.ControlSource.Build {
        
         /**
         * A {@link LFOControlSource.Build} object constructs a {@link LFOControlSource} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link LFOControlSource} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link LFOControlSource} using {@link LFOControlSource#castFrom}.
         * @return A new instance of {@code LFOControlSource} with the properties 
         *         that were set in the Build object.
         */
        public LFOControlSource construct() {
            return LFOControlSource.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    LFOControlSource.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Specifies the amplitude for the waveform of this {@link LFOControlSource}.
         * @param amplitude The value for the {@code amplitude} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAmplitude(double amplitude) {
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
        public Build setFrequency(double frequency) {
            names.add("frequency");
            values.add(org.gtk.gobject.Value.create(frequency));
            return this;
        }
        
        /**
         * Specifies the value offset for the waveform of this {@link LFOControlSource}.
         * @param offset The value for the {@code offset} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setOffset(double offset) {
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
        public Build setTimeshift(long timeshift) {
            names.add("timeshift");
            values.add(org.gtk.gobject.Value.create(timeshift));
            return this;
        }
        
        /**
         * Specifies the waveform that should be used for this {@link LFOControlSource}.
         * @param waveform The value for the {@code waveform} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setWaveform(org.gstreamer.controller.LFOWaveform waveform) {
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
