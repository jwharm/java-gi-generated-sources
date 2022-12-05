package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the base class for audio sources. Subclasses need to implement the
 * ::create_ringbuffer vmethod. This base class will then take care of
 * reading samples from the ringbuffer, synchronisation and flushing.
 */
public class AudioBaseSrc extends org.gstreamer.base.PushSrc {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioBaseSrc";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.base.PushSrc.getMemoryLayout().withName("element"),
        Interop.valueLayout.ADDRESS.withName("ringbuffer"),
        Interop.valueLayout.C_LONG.withName("buffer_time"),
        Interop.valueLayout.C_LONG.withName("latency_time"),
        Interop.valueLayout.C_LONG.withName("next_sample"),
        Interop.valueLayout.ADDRESS.withName("clock"),
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
     * Create a AudioBaseSrc proxy instance for the provided memory address.
     * <p>
     * Because AudioBaseSrc is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AudioBaseSrc(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to AudioBaseSrc if its GType is a (or inherits from) "GstAudioBaseSrc".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AudioBaseSrc} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAudioBaseSrc", a ClassCastException will be thrown.
     */
    public static AudioBaseSrc castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), AudioBaseSrc.getType())) {
            return new AudioBaseSrc(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAudioBaseSrc");
        }
    }
    
    /**
     * Create and return the {@link AudioRingBuffer} for {@code src}. This function will call
     * the ::create_ringbuffer vmethod and will set {@code src} as the parent of the
     * returned buffer (see gst_object_set_parent()).
     * @return The new ringbuffer of {@code src}.
     */
    public @NotNull org.gstreamer.audio.AudioRingBuffer createRingbuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_base_src_create_ringbuffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.audio.AudioRingBuffer(RESULT, Ownership.NONE);
    }
    
    /**
     * Queries whether {@code src} will provide a clock or not. See also
     * gst_audio_base_src_set_provide_clock.
     * @return {@code true} if {@code src} will provide a clock.
     */
    public boolean getProvideClock() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_base_src_get_provide_clock.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the current slave method used by {@code src}.
     * @return The current slave method used by {@code src}.
     */
    public @NotNull org.gstreamer.audio.AudioBaseSrcSlaveMethod getSlaveMethod() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_base_src_get_slave_method.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioBaseSrcSlaveMethod.of(RESULT);
    }
    
    /**
     * Controls whether {@code src} will provide a clock or not. If {@code provide} is {@code true},
     * gst_element_provide_clock() will return a clock that reflects the datarate
     * of {@code src}. If {@code provide} is {@code false}, gst_element_provide_clock() will return NULL.
     * @param provide new state
     */
    public void setProvideClock(boolean provide) {
        try {
            DowncallHandles.gst_audio_base_src_set_provide_clock.invokeExact(
                    handle(),
                    provide ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Controls how clock slaving will be performed in {@code src}.
     * @param method the new slave method
     */
    public void setSlaveMethod(@NotNull org.gstreamer.audio.AudioBaseSrcSlaveMethod method) {
        java.util.Objects.requireNonNull(method, "Parameter 'method' must not be null");
        try {
            DowncallHandles.gst_audio_base_src_set_slave_method.invokeExact(
                    handle(),
                    method.getValue());
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
            RESULT = (long) DowncallHandles.gst_audio_base_src_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.base.PushSrc.Build {
        
         /**
         * A {@link AudioBaseSrc.Build} object constructs a {@link AudioBaseSrc} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link AudioBaseSrc} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioBaseSrc} using {@link AudioBaseSrc#castFrom}.
         * @return A new instance of {@code AudioBaseSrc} with the properties 
         *         that were set in the Build object.
         */
        public AudioBaseSrc construct() {
            return AudioBaseSrc.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    AudioBaseSrc.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Actual configured size of audio buffer in microseconds.
         * @param actualBufferTime The value for the {@code actual-buffer-time} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setActualBufferTime(long actualBufferTime) {
            names.add("actual-buffer-time");
            values.add(org.gtk.gobject.Value.create(actualBufferTime));
            return this;
        }
        
        /**
         * Actual configured audio latency in microseconds.
         * @param actualLatencyTime The value for the {@code actual-latency-time} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setActualLatencyTime(long actualLatencyTime) {
            names.add("actual-latency-time");
            values.add(org.gtk.gobject.Value.create(actualLatencyTime));
            return this;
        }
        
        public Build setBufferTime(long bufferTime) {
            names.add("buffer-time");
            values.add(org.gtk.gobject.Value.create(bufferTime));
            return this;
        }
        
        public Build setLatencyTime(long latencyTime) {
            names.add("latency-time");
            values.add(org.gtk.gobject.Value.create(latencyTime));
            return this;
        }
        
        public Build setProvideClock(boolean provideClock) {
            names.add("provide-clock");
            values.add(org.gtk.gobject.Value.create(provideClock));
            return this;
        }
        
        public Build setSlaveMethod(org.gstreamer.audio.AudioBaseSrcSlaveMethod slaveMethod) {
            names.add("slave-method");
            values.add(org.gtk.gobject.Value.create(slaveMethod));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_base_src_create_ringbuffer = Interop.downcallHandle(
            "gst_audio_base_src_create_ringbuffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_base_src_get_provide_clock = Interop.downcallHandle(
            "gst_audio_base_src_get_provide_clock",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_base_src_get_slave_method = Interop.downcallHandle(
            "gst_audio_base_src_get_slave_method",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_audio_base_src_set_provide_clock = Interop.downcallHandle(
            "gst_audio_base_src_set_provide_clock",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_base_src_set_slave_method = Interop.downcallHandle(
            "gst_audio_base_src_set_slave_method",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_audio_base_src_get_type = Interop.downcallHandle(
            "gst_audio_base_src_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
