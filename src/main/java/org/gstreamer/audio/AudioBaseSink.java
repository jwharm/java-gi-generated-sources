package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the base class for audio sinks. Subclasses need to implement the
 * ::create_ringbuffer vmethod. This base class will then take care of
 * writing samples to the ringbuffer, synchronisation, clipping and flushing.
 */
public class AudioBaseSink extends org.gstreamer.base.BaseSink {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioBaseSink";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseSink.getMemoryLayout().withName("element"),
            Interop.valueLayout.ADDRESS.withName("ringbuffer"),
            Interop.valueLayout.C_LONG.withName("buffer_time"),
            Interop.valueLayout.C_LONG.withName("latency_time"),
            Interop.valueLayout.C_LONG.withName("next_sample"),
            Interop.valueLayout.ADDRESS.withName("provided_clock"),
            Interop.valueLayout.C_INT.withName("eos_rendering"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AudioBaseSink proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioBaseSink(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioBaseSink> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioBaseSink(input);
    
    /**
     * Create and return the {@link AudioRingBuffer} for {@code sink}. This function will
     * call the ::create_ringbuffer vmethod and will set {@code sink} as the parent of
     * the returned buffer (see gst_object_set_parent()).
     * @return The new ringbuffer of {@code sink}.
     */
    public org.gstreamer.audio.AudioRingBuffer createRingbuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_audio_base_sink_create_ringbuffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.audio.AudioRingBuffer) Interop.register(RESULT, org.gstreamer.audio.AudioRingBuffer.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the current alignment threshold, in nanoseconds, used by {@code sink}.
     * @return The current alignment threshold used by {@code sink}.
     */
    public org.gstreamer.gst.ClockTime getAlignmentThreshold() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_base_sink_get_alignment_threshold.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the current discont wait, in nanoseconds, used by {@code sink}.
     * @return The current discont wait used by {@code sink}.
     */
    public org.gstreamer.gst.ClockTime getDiscontWait() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_base_sink_get_discont_wait.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the current drift tolerance, in microseconds, used by {@code sink}.
     * @return The current drift tolerance used by {@code sink}.
     */
    public long getDriftTolerance() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_audio_base_sink_get_drift_tolerance.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Queries whether {@code sink} will provide a clock or not. See also
     * gst_audio_base_sink_set_provide_clock.
     * @return {@code true} if {@code sink} will provide a clock.
     */
    public boolean getProvideClock() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_base_sink_get_provide_clock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the current slave method used by {@code sink}.
     * @return The current slave method used by {@code sink}.
     */
    public org.gstreamer.audio.AudioBaseSinkSlaveMethod getSlaveMethod() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_audio_base_sink_get_slave_method.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.audio.AudioBaseSinkSlaveMethod.of(RESULT);
    }
    
    /**
     * Informs this base class that the audio output device has failed for
     * some reason, causing a discontinuity (for example, because the device
     * recovered from the error, but lost all contents of its ring buffer).
     * This function is typically called by derived classes, and is useful
     * for the custom slave method.
     */
    public void reportDeviceFailure() {
        try {
            DowncallHandles.gst_audio_base_sink_report_device_failure.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Controls the sink's alignment threshold.
     * @param alignmentThreshold the new alignment threshold in nanoseconds
     */
    public void setAlignmentThreshold(org.gstreamer.gst.ClockTime alignmentThreshold) {
        try {
            DowncallHandles.gst_audio_base_sink_set_alignment_threshold.invokeExact(
                    handle(),
                    alignmentThreshold.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the custom slaving callback. This callback will
     * be invoked if the slave-method property is set to
     * GST_AUDIO_BASE_SINK_SLAVE_CUSTOM and the audio sink
     * receives and plays samples.
     * <p>
     * Setting the callback to NULL causes the sink to
     * behave as if the GST_AUDIO_BASE_SINK_SLAVE_NONE
     * method were used.
     * @param callback a {@link AudioBaseSinkCustomSlavingCallback}
     * @param notify called when user_data becomes unused
     */
    public void setCustomSlavingCallback(org.gstreamer.audio.AudioBaseSinkCustomSlavingCallback callback, org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_audio_base_sink_set_custom_slaving_callback.invokeExact(
                    handle(),
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Controls how long the sink will wait before creating a discontinuity.
     * @param discontWait the new discont wait in nanoseconds
     */
    public void setDiscontWait(org.gstreamer.gst.ClockTime discontWait) {
        try {
            DowncallHandles.gst_audio_base_sink_set_discont_wait.invokeExact(
                    handle(),
                    discontWait.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Controls the sink's drift tolerance.
     * @param driftTolerance the new drift tolerance in microseconds
     */
    public void setDriftTolerance(long driftTolerance) {
        try {
            DowncallHandles.gst_audio_base_sink_set_drift_tolerance.invokeExact(
                    handle(),
                    driftTolerance);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Controls whether {@code sink} will provide a clock or not. If {@code provide} is {@code true},
     * gst_element_provide_clock() will return a clock that reflects the datarate
     * of {@code sink}. If {@code provide} is {@code false}, gst_element_provide_clock() will return
     * NULL.
     * @param provide new state
     */
    public void setProvideClock(boolean provide) {
        try {
            DowncallHandles.gst_audio_base_sink_set_provide_clock.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(provide, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Controls how clock slaving will be performed in {@code sink}.
     * @param method the new slave method
     */
    public void setSlaveMethod(org.gstreamer.audio.AudioBaseSinkSlaveMethod method) {
        try {
            DowncallHandles.gst_audio_base_sink_set_slave_method.invokeExact(
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
            RESULT = (long) DowncallHandles.gst_audio_base_sink_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link AudioBaseSink.Builder} object constructs a {@link AudioBaseSink} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AudioBaseSink.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.base.BaseSink.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AudioBaseSink} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AudioBaseSink}.
         * @return A new instance of {@code AudioBaseSink} with the properties 
         *         that were set in the Builder object.
         */
        public AudioBaseSink build() {
            return (AudioBaseSink) org.gtk.gobject.GObject.newWithProperties(
                AudioBaseSink.getType(),
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
        
        public Builder setBufferTime(long bufferTime) {
            names.add("buffer-time");
            values.add(org.gtk.gobject.Value.create(bufferTime));
            return this;
        }
        
        public Builder setCanActivatePull(boolean canActivatePull) {
            names.add("can-activate-pull");
            values.add(org.gtk.gobject.Value.create(canActivatePull));
            return this;
        }
        
        /**
         * A window of time in nanoseconds to wait before creating a discontinuity as
         * a result of breaching the drift-tolerance.
         * @param discontWait The value for the {@code discont-wait} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDiscontWait(long discontWait) {
            names.add("discont-wait");
            values.add(org.gtk.gobject.Value.create(discontWait));
            return this;
        }
        
        /**
         * Controls the amount of time in microseconds that clocks are allowed
         * to drift before resynchronisation happens.
         * @param driftTolerance The value for the {@code drift-tolerance} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDriftTolerance(long driftTolerance) {
            names.add("drift-tolerance");
            values.add(org.gtk.gobject.Value.create(driftTolerance));
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
        
        public Builder setSlaveMethod(org.gstreamer.audio.AudioBaseSinkSlaveMethod slaveMethod) {
            names.add("slave-method");
            values.add(org.gtk.gobject.Value.create(slaveMethod));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_audio_base_sink_create_ringbuffer = Interop.downcallHandle(
                "gst_audio_base_sink_create_ringbuffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_get_alignment_threshold = Interop.downcallHandle(
                "gst_audio_base_sink_get_alignment_threshold",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_get_discont_wait = Interop.downcallHandle(
                "gst_audio_base_sink_get_discont_wait",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_get_drift_tolerance = Interop.downcallHandle(
                "gst_audio_base_sink_get_drift_tolerance",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_get_provide_clock = Interop.downcallHandle(
                "gst_audio_base_sink_get_provide_clock",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_get_slave_method = Interop.downcallHandle(
                "gst_audio_base_sink_get_slave_method",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_report_device_failure = Interop.downcallHandle(
                "gst_audio_base_sink_report_device_failure",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_set_alignment_threshold = Interop.downcallHandle(
                "gst_audio_base_sink_set_alignment_threshold",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_set_custom_slaving_callback = Interop.downcallHandle(
                "gst_audio_base_sink_set_custom_slaving_callback",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_set_discont_wait = Interop.downcallHandle(
                "gst_audio_base_sink_set_discont_wait",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_set_drift_tolerance = Interop.downcallHandle(
                "gst_audio_base_sink_set_drift_tolerance",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_set_provide_clock = Interop.downcallHandle(
                "gst_audio_base_sink_set_provide_clock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_set_slave_method = Interop.downcallHandle(
                "gst_audio_base_sink_set_slave_method",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_audio_base_sink_get_type = Interop.downcallHandle(
                "gst_audio_base_sink_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_audio_base_sink_get_type != null;
    }
}
