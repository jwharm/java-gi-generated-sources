package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Manages a set of pads with the purpose of aggregating their buffers.
 * Control is given to the subclass when all pads have data.
 * <p>
 *  * Base class for mixers and muxers. Subclasses should at least implement
 *    the {@link AggregatorClass}::aggregate virtual method.
 * <p>
 *  * Installs a {@link org.gstreamer.gst.PadChainFunction}, a {@link org.gstreamer.gst.PadEventFullFunction} and a
 *    {@link org.gstreamer.gst.PadQueryFunction} to queue all serialized data packets per sink pad.
 *    Subclasses should not overwrite those, but instead implement
 *    {@link AggregatorClass}::sink_event and {@link AggregatorClass}::sink_query as
 *    needed.
 * <p>
 *  * When data is queued on all pads, the aggregate vmethod is called.
 * <p>
 *  * One can peek at the data on any given GstAggregatorPad with the
 *    gst_aggregator_pad_peek_buffer() method, and remove it from the pad
 *    with the gst_aggregator_pad_pop_buffer () method. When a buffer
 *    has been taken with pop_buffer (), a new buffer can be queued
 *    on that pad.
 * <p>
 *  * When gst_aggregator_pad_peek_buffer() or gst_aggregator_pad_has_buffer()
 *    are called, a reference is taken to the returned buffer, which stays
 *    valid until either:
 * <ul>
 * <li>gst_aggregator_pad_pop_buffer() is called, in which case the caller
 *        is guaranteed that the buffer they receive is the same as the peeked
 *        buffer.
 * <li>gst_aggregator_pad_drop_buffer() is called, in which case the caller
 *        is guaranteed that the dropped buffer is the one that was peeked.
 * <li>the subclass implementation of {@link AggregatorClass}.aggregate returns.
 * </ul>
 * <p>
 *    Subsequent calls to gst_aggregator_pad_peek_buffer() or
 *    gst_aggregator_pad_has_buffer() return / check the same buffer that was
 *    returned / checked, until one of the conditions listed above is met.
 * <p>
 *    Subclasses are only allowed to call these methods from the aggregate
 *    thread.
 * <p>
 *  * If the subclass wishes to push a buffer downstream in its aggregate
 *    implementation, it should do so through the
 *    gst_aggregator_finish_buffer() method. This method will take care
 *    of sending and ordering mandatory events such as stream start, caps
 *    and segment. Buffer lists can also be pushed out with
 *    gst_aggregator_finish_buffer_list().
 * <p>
 *  * Same goes for EOS events, which should not be pushed directly by the
 *    subclass, it should instead return GST_FLOW_EOS in its aggregate
 *    implementation.
 * <p>
 *  * Note that the aggregator logic regarding gap event handling is to turn
 *    these into gap buffers with matching PTS and duration. It will also
 *    flag these buffers with GST_BUFFER_FLAG_GAP and GST_BUFFER_FLAG_DROPPABLE
 *    to ease their identification and subsequent processing.
 * <p>
 *  * Subclasses must use (a subclass of) {@link AggregatorPad} for both their
 *    sink and source pads.
 *    See gst_element_class_add_static_pad_template_with_gtype().
 * <p>
 * This class used to live in gst-plugins-bad and was moved to core.
 * @version 1.14
 */
public class Aggregator extends org.gstreamer.gst.Element {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAggregator";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Element.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("srcpad"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Aggregator proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Aggregator(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Aggregator> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Aggregator(input);
    
    /**
     * This method will push the provided output buffer downstream. If needed,
     * mandatory events such as stream-start, caps, and segment events will be
     * sent before pushing the buffer.
     * @param buffer the {@link org.gstreamer.gst.Buffer} to push.
     */
    public org.gstreamer.gst.FlowReturn finishBuffer(org.gstreamer.gst.Buffer buffer) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_aggregator_finish_buffer.invokeExact(
                    handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buffer.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * This method will push the provided output buffer list downstream. If needed,
     * mandatory events such as stream-start, caps, and segment events will be
     * sent before pushing the buffer.
     * @param bufferlist the {@link org.gstreamer.gst.BufferList} to push.
     */
    public org.gstreamer.gst.FlowReturn finishBufferList(org.gstreamer.gst.BufferList bufferlist) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_aggregator_finish_buffer_list.invokeExact(
                    handle(),
                    bufferlist.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bufferlist.yieldOwnership();
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Lets {@link Aggregator} sub-classes get the memory {@code allocator}
     * acquired by the base class and its {@code params}.
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
                DowncallHandles.gst_aggregator_get_allocator.invokeExact(
                        handle(),
                        (Addressable) (allocator == null ? MemoryAddress.NULL : (Addressable) allocatorPOINTER.address()),
                        (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (allocator != null) allocator.set((org.gstreamer.gst.Allocator) Interop.register(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Allocator.fromAddress).marshal(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    public @Nullable org.gstreamer.gst.BufferPool getBufferPool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_aggregator_get_buffer_pool.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gst.BufferPool) Interop.register(RESULT, org.gstreamer.gst.BufferPool.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public boolean getIgnoreInactivePads() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_aggregator_get_ignore_inactive_pads.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves the latency values reported by {@code self} in response to the latency
     * query, or {@code GST_CLOCK_TIME_NONE} if there is not live source connected and the element
     * will not wait for the clock.
     * <p>
     * Typically only called by subclasses.
     * @return The latency or {@code GST_CLOCK_TIME_NONE} if the element does not sync
     */
    public org.gstreamer.gst.ClockTime getLatency() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_aggregator_get_latency.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Negotiates src pad caps with downstream elements.
     * Unmarks GST_PAD_FLAG_NEED_RECONFIGURE in any case. But marks it again
     * if {@link AggregatorClass}::negotiate fails.
     * @return {@code true} if the negotiation succeeded, else {@code false}.
     */
    public boolean negotiate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_aggregator_negotiate.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Use this function to determine what input buffers will be aggregated
     * to produce the next output buffer. This should only be called from
     * a {@link Aggregator}::samples-selected handler, and can be used to precisely
     * control aggregating parameters for a given set of input samples.
     * @return The sample that is about to be aggregated. It may hold a {@link org.gstreamer.gst.Buffer}
     *   or a {@link org.gstreamer.gst.BufferList}. The contents of its info structure is subclass-dependent,
     *   and documented on a subclass basis. The buffers held by the sample are
     *   not writable.
     */
    public @Nullable org.gstreamer.gst.Sample peekNextSample(org.gstreamer.base.AggregatorPad pad) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_aggregator_peek_next_sample.invokeExact(
                    handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Sample.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Subclasses should call this when they have prepared the
     * buffers they will aggregate for each of their sink pads, but
     * before using any of the properties of the pads that govern
     * <em>how</em> aggregation should be performed, for example z-index
     * for video aggregators.
     * <p>
     * If gst_aggregator_update_segment() is used by the subclass,
     * it MUST be called before gst_aggregator_selected_samples().
     * <p>
     * This function MUST only be called from the {@link AggregatorClass}::aggregate()
     * function.
     * @param pts The presentation timestamp of the next output buffer
     * @param dts The decoding timestamp of the next output buffer
     * @param duration The duration of the next output buffer
     * @param info a {@link org.gstreamer.gst.Structure} containing additional information
     */
    public void selectedSamples(org.gstreamer.gst.ClockTime pts, org.gstreamer.gst.ClockTime dts, org.gstreamer.gst.ClockTime duration, @Nullable org.gstreamer.gst.Structure info) {
        try {
            DowncallHandles.gst_aggregator_selected_samples.invokeExact(
                    handle(),
                    pts.getValue().longValue(),
                    dts.getValue().longValue(),
                    duration.getValue().longValue(),
                    (Addressable) (info == null ? MemoryAddress.NULL : info.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Subclasses should call this when they don't want to time out
     * waiting for a pad that hasn't yet received any buffers in live
     * mode.
     * <p>
     * {@link Aggregator} will still wait once on each newly-added pad, making
     * sure upstream has had a fair chance to start up.
     * @param ignore whether inactive pads should not be waited on
     */
    public void setIgnoreInactivePads(boolean ignore) {
        try {
            DowncallHandles.gst_aggregator_set_ignore_inactive_pads.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(ignore, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Lets {@link Aggregator} sub-classes tell the baseclass what their internal
     * latency is. Will also post a LATENCY message on the bus so the pipeline
     * can reconfigure its global latency.
     * @param minLatency minimum latency
     * @param maxLatency maximum latency
     */
    public void setLatency(org.gstreamer.gst.ClockTime minLatency, org.gstreamer.gst.ClockTime maxLatency) {
        try {
            DowncallHandles.gst_aggregator_set_latency.invokeExact(
                    handle(),
                    minLatency.getValue().longValue(),
                    maxLatency.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the caps to be used on the src pad.
     * @param caps The {@link org.gstreamer.gst.Caps} to set on the src pad.
     */
    public void setSrcCaps(org.gstreamer.gst.Caps caps) {
        try {
            DowncallHandles.gst_aggregator_set_src_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This is a simple {@link AggregatorClass}::get_next_time implementation that
     * just looks at the {@link org.gstreamer.gst.Segment} on the srcpad of the aggregator and bases
     * the next time on the running time there.
     * <p>
     * This is the desired behaviour in most cases where you have a live source
     * and you have a dead line based aggregator subclass.
     * @return The running time based on the position
     */
    public org.gstreamer.gst.ClockTime simpleGetNextTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_aggregator_simple_get_next_time.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Subclasses should use this to update the segment on their
     * source pad, instead of directly pushing new segment events
     * downstream.
     * <p>
     * Subclasses MUST call this before gst_aggregator_selected_samples(),
     * if it is used at all.
     */
    public void updateSegment(org.gstreamer.gst.Segment segment) {
        try {
            DowncallHandles.gst_aggregator_update_segment.invokeExact(
                    handle(),
                    segment.handle());
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
            RESULT = (long) DowncallHandles.gst_aggregator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code SamplesSelected} callback.
     */
    @FunctionalInterface
    public interface SamplesSelected {
    
        /**
         * Signals that the {@link Aggregator} subclass has selected the next set
         * of input samples it will aggregate. Handlers may call
         * gst_aggregator_peek_next_sample() at that point.
         */
        void run(org.gstreamer.gst.Segment segment, long pts, long dts, long duration, @Nullable org.gstreamer.gst.Structure info);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceAggregator, MemoryAddress segment, long pts, long dts, long duration, MemoryAddress info) {
            run(org.gstreamer.gst.Segment.fromAddress.marshal(segment, null), pts, dts, duration, org.gstreamer.gst.Structure.fromAddress.marshal(info, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SamplesSelected.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Signals that the {@link Aggregator} subclass has selected the next set
     * of input samples it will aggregate. Handlers may call
     * gst_aggregator_peek_next_sample() at that point.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Aggregator.SamplesSelected> onSamplesSelected(Aggregator.SamplesSelected handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("samples-selected", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Aggregator.Builder} object constructs a {@link Aggregator} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Aggregator.Builder#build()}. 
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
         * Finish building the {@link Aggregator} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Aggregator}.
         * @return A new instance of {@code Aggregator} with the properties 
         *         that were set in the Builder object.
         */
        public Aggregator build() {
            return (Aggregator) org.gtk.gobject.GObject.newWithProperties(
                Aggregator.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Enables the emission of signals such as {@link Aggregator}::samples-selected
         * @param emitSignals The value for the {@code emit-signals} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setEmitSignals(boolean emitSignals) {
            names.add("emit-signals");
            values.add(org.gtk.gobject.Value.create(emitSignals));
            return this;
        }
        
        public Builder setLatency(long latency) {
            names.add("latency");
            values.add(org.gtk.gobject.Value.create(latency));
            return this;
        }
        
        /**
         * Force minimum upstream latency (in nanoseconds). When sources with a
         * higher latency are expected to be plugged in dynamically after the
         * aggregator has started playing, this allows overriding the minimum
         * latency reported by the initial source(s). This is only taken into
         * account when larger than the actually reported minimum latency.
         * @param minUpstreamLatency The value for the {@code min-upstream-latency} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMinUpstreamLatency(long minUpstreamLatency) {
            names.add("min-upstream-latency");
            values.add(org.gtk.gobject.Value.create(minUpstreamLatency));
            return this;
        }
        
        public Builder setStartTime(long startTime) {
            names.add("start-time");
            values.add(org.gtk.gobject.Value.create(startTime));
            return this;
        }
        
        public Builder setStartTimeSelection(org.gstreamer.base.AggregatorStartTimeSelection startTimeSelection) {
            names.add("start-time-selection");
            values.add(org.gtk.gobject.Value.create(startTimeSelection));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_aggregator_finish_buffer = Interop.downcallHandle(
                "gst_aggregator_finish_buffer",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_aggregator_finish_buffer_list = Interop.downcallHandle(
                "gst_aggregator_finish_buffer_list",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_aggregator_get_allocator = Interop.downcallHandle(
                "gst_aggregator_get_allocator",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_aggregator_get_buffer_pool = Interop.downcallHandle(
                "gst_aggregator_get_buffer_pool",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_aggregator_get_ignore_inactive_pads = Interop.downcallHandle(
                "gst_aggregator_get_ignore_inactive_pads",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_aggregator_get_latency = Interop.downcallHandle(
                "gst_aggregator_get_latency",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_aggregator_negotiate = Interop.downcallHandle(
                "gst_aggregator_negotiate",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_aggregator_peek_next_sample = Interop.downcallHandle(
                "gst_aggregator_peek_next_sample",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_aggregator_selected_samples = Interop.downcallHandle(
                "gst_aggregator_selected_samples",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_aggregator_set_ignore_inactive_pads = Interop.downcallHandle(
                "gst_aggregator_set_ignore_inactive_pads",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_aggregator_set_latency = Interop.downcallHandle(
                "gst_aggregator_set_latency",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_aggregator_set_src_caps = Interop.downcallHandle(
                "gst_aggregator_set_src_caps",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_aggregator_simple_get_next_time = Interop.downcallHandle(
                "gst_aggregator_simple_get_next_time",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_aggregator_update_segment = Interop.downcallHandle(
                "gst_aggregator_update_segment",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_aggregator_get_type = Interop.downcallHandle(
                "gst_aggregator_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_aggregator_get_type != null;
    }
}
