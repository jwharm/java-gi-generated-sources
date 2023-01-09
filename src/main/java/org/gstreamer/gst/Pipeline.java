package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link Pipeline} is a special {@link Bin} used as the toplevel container for
 * the filter graph. The {@link Pipeline} will manage the selection and
 * distribution of a global {@link Clock} as well as provide a {@link Bus} to the
 * application.
 * <p>
 * gst_pipeline_new() is used to create a pipeline. when you are done with
 * the pipeline, use gst_object_unref() to free its resources including all
 * added {@link Element} objects (if not otherwise referenced).
 * <p>
 * Elements are added and removed from the pipeline using the {@link Bin}
 * methods like gst_bin_add() and gst_bin_remove() (see {@link Bin}).
 * <p>
 * Before changing the state of the {@link Pipeline} (see {@link Element}) a {@link Bus}
 * should be retrieved with gst_pipeline_get_bus(). This {@link Bus} should then
 * be used to receive {@link Message} from the elements in the pipeline. Listening
 * to the {@link Bus} is necessary for retrieving error messages from the
 * {@link Pipeline} and otherwise the {@link Pipeline} might stop without any
 * indication, why. Furthermore, the {@link Pipeline} posts messages even if
 * nobody listens on the {@link Bus}, which will pile up and use up memory.
 * <p>
 * By default, a {@link Pipeline} will automatically flush the pending {@link Bus}
 * messages when going to the NULL state to ensure that no circular
 * references exist when no messages are read from the {@link Bus}. This
 * behaviour can be changed with gst_pipeline_set_auto_flush_bus().
 * <p>
 * When the {@link Pipeline} performs the PAUSED to PLAYING state change it will
 * select a clock for the elements. The clock selection algorithm will by
 * default select a clock provided by an element that is most upstream
 * (closest to the source). For live pipelines (ones that return
 * {@code GST_STATE_CHANGE_NO_PREROLL} from the gst_element_set_state() call) this
 * will select the clock provided by the live source. For normal pipelines
 * this will select a clock provided by the sinks (most likely the audio
 * sink). If no element provides a clock, a default {@link SystemClock} is used.
 * <p>
 * The clock selection can be controlled with the gst_pipeline_use_clock()
 * method, which will enforce a given clock on the pipeline. With
 * gst_pipeline_auto_clock() the default clock selection algorithm can be
 * restored.
 * <p>
 * A {@link Pipeline} maintains a running time for the elements. The running
 * time is defined as the difference between the current clock time and
 * the base time. When the pipeline goes to READY or a flushing seek is
 * performed on it, the running time is reset to 0. When the pipeline is
 * set from PLAYING to PAUSED, the current clock time is sampled and used to
 * configure the base time for the elements when the pipeline is set
 * to PLAYING again. The effect is that the running time (as the difference
 * between the clock time and the base time) will count how much time was spent
 * in the PLAYING state. This default behaviour can be changed with the
 * gst_element_set_start_time() method.
 */
public class Pipeline extends org.gstreamer.gst.Bin implements org.gstreamer.gst.ChildProxy {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPipeline";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Bin.getMemoryLayout().withName("bin"),
            Interop.valueLayout.ADDRESS.withName("fixed_clock"),
            Interop.valueLayout.C_LONG.withName("stream_time"),
            Interop.valueLayout.C_LONG.withName("delay"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Pipeline proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Pipeline(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Pipeline> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Pipeline(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_pipeline_new.invokeExact((Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Create a new pipeline with the given name.
     * @param name name of new pipeline
     */
    public Pipeline(@Nullable java.lang.String name) {
        super(constructNew(name));
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Let {@code pipeline} select a clock automatically. This is the default
     * behaviour.
     * <p>
     * Use this function if you previous forced a fixed clock with
     * gst_pipeline_use_clock() and want to restore the default
     * pipeline clock selection algorithm.
     * <p>
     * MT safe.
     */
    public void autoClock() {
        try {
            DowncallHandles.gst_pipeline_auto_clock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Check if {@code pipeline} will automatically flush messages when going to
     * the NULL state.
     * @return whether the pipeline will automatically flush its bus when
     * going from READY to NULL state or not.
     * <p>
     * MT safe.
     */
    public boolean getAutoFlushBus() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pipeline_get_auto_flush_bus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the {@link Bus} of {@code pipeline}. The bus allows applications to receive
     * {@link Message} packets.
     * @return a {@link Bus}, unref after usage.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.Bus getBus() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pipeline_get_bus.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Bus) Interop.register(RESULT, org.gstreamer.gst.Bus.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the current clock used by {@code pipeline}. Users of object
     * oriented languages should use gst_pipeline_get_pipeline_clock()
     * to avoid confusion with gst_element_get_clock() which has a different behavior.
     * <p>
     * Unlike gst_element_get_clock(), this function will always return a
     * clock, even if the pipeline is not in the PLAYING state.
     * @return a {@link Clock}, unref after usage.
     */
    public org.gstreamer.gst.Clock getClock() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pipeline_get_clock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Clock) Interop.register(RESULT, org.gstreamer.gst.Clock.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the configured delay (see gst_pipeline_set_delay()).
     * @return The configured delay.
     * <p>
     * MT safe.
     */
    public org.gstreamer.gst.ClockTime getDelay() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_pipeline_get_delay.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Gets the latency that should be configured on the pipeline. See
     * gst_pipeline_set_latency().
     * @return Latency to configure on the pipeline or GST_CLOCK_TIME_NONE
     */
    public org.gstreamer.gst.ClockTime getLatency() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_pipeline_get_latency.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Gets the current clock used by {@code pipeline}.
     * <p>
     * Unlike gst_element_get_clock(), this function will always return a
     * clock, even if the pipeline is not in the PLAYING state.
     * @return a {@link Clock}, unref after usage.
     */
    public org.gstreamer.gst.Clock getPipelineClock() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_pipeline_get_pipeline_clock.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.Clock) Interop.register(RESULT, org.gstreamer.gst.Clock.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Usually, when a pipeline goes from READY to NULL state, it automatically
     * flushes all pending messages on the bus, which is done for refcounting
     * purposes, to break circular references.
     * <p>
     * This means that applications that update state using (async) bus messages
     * (e.g. do certain things when a pipeline goes from PAUSED to READY) might
     * not get to see messages when the pipeline is shut down, because they might
     * be flushed before they can be dispatched in the main thread. This behaviour
     * can be disabled using this function.
     * <p>
     * It is important that all messages on the bus are handled when the
     * automatic flushing is disabled else memory leaks will be introduced.
     * <p>
     * MT safe.
     * @param autoFlush whether or not to automatically flush the bus when
     * the pipeline goes from READY to NULL state
     */
    public void setAutoFlushBus(boolean autoFlush) {
        try {
            DowncallHandles.gst_pipeline_set_auto_flush_bus.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(autoFlush, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the clock for {@code pipeline}. The clock will be distributed
     * to all the elements managed by the pipeline.
     * @param clock the clock to set
     * @return {@code true} if the clock could be set on the pipeline. {@code false} if
     *   some element did not accept the clock.
     * <p>
     * MT safe.
     */
    public boolean setClock(org.gstreamer.gst.Clock clock) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_pipeline_set_clock.invokeExact(
                    handle(),
                    clock.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the expected delay needed for all elements to perform the
     * PAUSED to PLAYING state change. {@code delay} will be added to the
     * base time of the elements so that they wait an additional {@code delay}
     * amount of time before starting to process buffers and cannot be
     * {@code GST_CLOCK_TIME_NONE}.
     * <p>
     * This option is used for tuning purposes and should normally not be
     * used.
     * <p>
     * MT safe.
     * @param delay the delay
     */
    public void setDelay(org.gstreamer.gst.ClockTime delay) {
        try {
            DowncallHandles.gst_pipeline_set_delay.invokeExact(
                    handle(),
                    delay.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the latency that should be configured on the pipeline. Setting
     * GST_CLOCK_TIME_NONE will restore the default behaviour of using the minimum
     * latency from the LATENCY query. Setting this is usually not required and
     * the pipeline will figure out an appropriate latency automatically.
     * <p>
     * Setting a too low latency, especially lower than the minimum latency from
     * the LATENCY query, will most likely cause the pipeline to fail.
     * @param latency latency to configure
     */
    public void setLatency(org.gstreamer.gst.ClockTime latency) {
        try {
            DowncallHandles.gst_pipeline_set_latency.invokeExact(
                    handle(),
                    latency.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Force {@code pipeline} to use the given {@code clock}. The pipeline will
     * always use the given clock even if new clock providers are added
     * to this pipeline.
     * <p>
     * If {@code clock} is {@code null} all clocking will be disabled which will make
     * the pipeline run as fast as possible.
     * <p>
     * MT safe.
     * @param clock the clock to use
     */
    public void useClock(@Nullable org.gstreamer.gst.Clock clock) {
        try {
            DowncallHandles.gst_pipeline_use_clock.invokeExact(
                    handle(),
                    (Addressable) (clock == null ? MemoryAddress.NULL : clock.handle()));
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
            RESULT = (long) DowncallHandles.gst_pipeline_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Pipeline.Builder} object constructs a {@link Pipeline} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Pipeline.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.Bin.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Pipeline} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Pipeline}.
         * @return A new instance of {@code Pipeline} with the properties 
         *         that were set in the Builder object.
         */
        public Pipeline build() {
            return (Pipeline) org.gtk.gobject.GObject.newWithProperties(
                Pipeline.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether or not to automatically flush all messages on the
         * pipeline's bus when going from READY to NULL state. Please see
         * gst_pipeline_set_auto_flush_bus() for more information on this option.
         * @param autoFlushBus The value for the {@code auto-flush-bus} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAutoFlushBus(boolean autoFlushBus) {
            names.add("auto-flush-bus");
            values.add(org.gtk.gobject.Value.create(autoFlushBus));
            return this;
        }
        
        /**
         * The expected delay needed for elements to spin up to the
         * PLAYING state expressed in nanoseconds.
         * see gst_pipeline_set_delay() for more information on this option.
         * @param delay The value for the {@code delay} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDelay(long delay) {
            names.add("delay");
            values.add(org.gtk.gobject.Value.create(delay));
            return this;
        }
        
        /**
         * Latency to configure on the pipeline. See gst_pipeline_set_latency().
         * @param latency The value for the {@code latency} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLatency(long latency) {
            names.add("latency");
            values.add(org.gtk.gobject.Value.create(latency));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_pipeline_new = Interop.downcallHandle(
                "gst_pipeline_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_pipeline_auto_clock = Interop.downcallHandle(
                "gst_pipeline_auto_clock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_pipeline_get_auto_flush_bus = Interop.downcallHandle(
                "gst_pipeline_get_auto_flush_bus",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_pipeline_get_bus = Interop.downcallHandle(
                "gst_pipeline_get_bus",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_pipeline_get_clock = Interop.downcallHandle(
                "gst_pipeline_get_clock",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_pipeline_get_delay = Interop.downcallHandle(
                "gst_pipeline_get_delay",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_pipeline_get_latency = Interop.downcallHandle(
                "gst_pipeline_get_latency",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_pipeline_get_pipeline_clock = Interop.downcallHandle(
                "gst_pipeline_get_pipeline_clock",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_pipeline_set_auto_flush_bus = Interop.downcallHandle(
                "gst_pipeline_set_auto_flush_bus",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_pipeline_set_clock = Interop.downcallHandle(
                "gst_pipeline_set_clock",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_pipeline_set_delay = Interop.downcallHandle(
                "gst_pipeline_set_delay",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_pipeline_set_latency = Interop.downcallHandle(
                "gst_pipeline_set_latency",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_pipeline_use_clock = Interop.downcallHandle(
                "gst_pipeline_use_clock",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_pipeline_get_type = Interop.downcallHandle(
                "gst_pipeline_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_pipeline_get_type != null;
    }
}
