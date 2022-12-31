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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.PushSrc.getMemoryLayout().withName("element"),
            Interop.valueLayout.ADDRESS.withName("ringbuffer"),
            Interop.valueLayout.C_LONG.withName("buffer_time"),
            Interop.valueLayout.C_LONG.withName("latency_time"),
            Interop.valueLayout.C_LONG.withName("next_sample"),
            Interop.valueLayout.ADDRESS.withName("clock"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AudioBaseSrc proxy instance for the provided memory address.
     * <p>
     * Because AudioBaseSrc is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioBaseSrc(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, AudioBaseSrc> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioBaseSrc(input, ownership);
    
    /**
     * Create and return the {@link AudioRingBuffer} for {@code src}. This function will call
     * the ::create_ringbuffer vmethod and will set {@code src} as the parent of the
     * returned buffer (see gst_object_set_parent()).
     * @return The new ringbuffer of {@code src}.
     */
    public org.gstreamer.audio.AudioRingBuffer createRingbuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_base_src_create_ringbuffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.audio.AudioRingBuffer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the current slave method used by {@code src}.
     * @return The current slave method used by {@code src}.
     */
    public org.gstreamer.audio.AudioBaseSrcSlaveMethod getSlaveMethod() {
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
                    Marshal.booleanToInteger.marshal(provide, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Controls how clock slaving will be performed in {@code src}.
     * @param method the new slave method
     */
    public void setSlaveMethod(org.gstreamer.audio.AudioBaseSrcSlaveMethod method) {
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_base_src_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AudioBaseSrc.Builder} object constructs a {@link AudioBaseSrc} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AudioBaseSrc.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.PushSrc.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AudioBaseSrc} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioBaseSrc}.
         * @return A new instance of {@code AudioBaseSrc} with the properties 
         *         that were set in the Builder object.
         */
        public AudioBaseSrc build() {
            return (AudioBaseSrc) org.gtk.gobject.GObject.newWithProperties(
                AudioBaseSrc.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Actual configured size of audio buffer in microseconds.
         * @param actualBufferTime The value for the {@code actual-buffer-time} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActualBufferTime(long actualBufferTime) {
            names.add("actual-buffer-time");
            values.add(org.gtk.gobject.Value.create(actualBufferTime));
            return this;
        }
        
        /**
         * Actual configured audio latency in microseconds.
         * @param actualLatencyTime The value for the {@code actual-latency-time} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActualLatencyTime(long actualLatencyTime) {
            names.add("actual-latency-time");
            values.add(org.gtk.gobject.Value.create(actualLatencyTime));
            return this;
        }
        
        public Builder setBufferTime(long bufferTime) {
            names.add("buffer-time");
            values.add(org.gtk.gobject.Value.create(bufferTime));
            return this;
        }
        
        public Builder setLatencyTime(long latencyTime) {
            names.add("latency-time");
            values.add(org.gtk.gobject.Value.create(latencyTime));
            return this;
        }
        
        public Builder setProvideClock(boolean provideClock) {
            names.add("provide-clock");
            values.add(org.gtk.gobject.Value.create(provideClock));
            return this;
        }
        
        public Builder setSlaveMethod(org.gstreamer.audio.AudioBaseSrcSlaveMethod slaveMethod) {
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
