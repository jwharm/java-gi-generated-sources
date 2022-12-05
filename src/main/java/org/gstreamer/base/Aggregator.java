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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Element.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("srcpad"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
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
     * Create a Aggregator proxy instance for the provided memory address.
     * <p>
     * Because Aggregator is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Aggregator(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to Aggregator if its GType is a (or inherits from) "GstAggregator".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Aggregator} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstAggregator", a ClassCastException will be thrown.
     */
    public static Aggregator castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Aggregator.getType())) {
            return new Aggregator(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstAggregator");
        }
    }
    
    /**
     * This method will push the provided output buffer downstream. If needed,
     * mandatory events such as stream-start, caps, and segment events will be
     * sent before pushing the buffer.
     * @param buffer the {@link org.gstreamer.gst.Buffer} to push.
     */
    public @NotNull org.gstreamer.gst.FlowReturn finishBuffer(@NotNull org.gstreamer.gst.Buffer buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
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
    public @NotNull org.gstreamer.gst.FlowReturn finishBufferList(@NotNull org.gstreamer.gst.BufferList bufferlist) {
        java.util.Objects.requireNonNull(bufferlist, "Parameter 'bufferlist' must not be null");
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
    public void getAllocator(@Nullable Out<org.gstreamer.gst.Allocator> allocator, @NotNull org.gstreamer.gst.AllocationParams params) {
        MemorySegment allocatorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        try {
            DowncallHandles.gst_aggregator_get_allocator.invokeExact(
                    handle(),
                    (Addressable) (allocator == null ? MemoryAddress.NULL : (Addressable) allocatorPOINTER.address()),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (allocator != null) allocator.set(new org.gstreamer.gst.Allocator(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    public @Nullable org.gstreamer.gst.BufferPool getBufferPool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_aggregator_get_buffer_pool.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.BufferPool(RESULT, Ownership.FULL);
    }
    
    public boolean getIgnoreInactivePads() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_aggregator_get_ignore_inactive_pads.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the latency values reported by {@code self} in response to the latency
     * query, or {@code GST_CLOCK_TIME_NONE} if there is not live source connected and the element
     * will not wait for the clock.
     * <p>
     * Typically only called by subclasses.
     * @return The latency or {@code GST_CLOCK_TIME_NONE} if the element does not sync
     */
    public @NotNull org.gstreamer.gst.ClockTime getLatency() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_aggregator_get_latency.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gst_aggregator_negotiate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public @Nullable org.gstreamer.gst.Sample peekNextSample(@NotNull org.gstreamer.base.AggregatorPad pad) {
        java.util.Objects.requireNonNull(pad, "Parameter 'pad' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_aggregator_peek_next_sample.invokeExact(
                    handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Sample(RESULT, Ownership.FULL);
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
    public void selectedSamples(@NotNull org.gstreamer.gst.ClockTime pts, @NotNull org.gstreamer.gst.ClockTime dts, @NotNull org.gstreamer.gst.ClockTime duration, @Nullable org.gstreamer.gst.Structure info) {
        java.util.Objects.requireNonNull(pts, "Parameter 'pts' must not be null");
        java.util.Objects.requireNonNull(dts, "Parameter 'dts' must not be null");
        java.util.Objects.requireNonNull(duration, "Parameter 'duration' must not be null");
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
                    ignore ? 1 : 0);
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
    public void setLatency(@NotNull org.gstreamer.gst.ClockTime minLatency, @NotNull org.gstreamer.gst.ClockTime maxLatency) {
        java.util.Objects.requireNonNull(minLatency, "Parameter 'minLatency' must not be null");
        java.util.Objects.requireNonNull(maxLatency, "Parameter 'maxLatency' must not be null");
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
    public void setSrcCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
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
    public @NotNull org.gstreamer.gst.ClockTime simpleGetNextTime() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_aggregator_simple_get_next_time.invokeExact(
                    handle());
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
    public void updateSegment(@NotNull org.gstreamer.gst.Segment segment) {
        java.util.Objects.requireNonNull(segment, "Parameter 'segment' must not be null");
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_aggregator_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface SamplesSelected {
        void signalReceived(Aggregator sourceAggregator, @NotNull org.gstreamer.gst.Segment segment, long pts, long dts, long duration, @Nullable org.gstreamer.gst.Structure info);
    }
    
    /**
     * Signals that the {@link Aggregator} subclass has selected the next set
     * of input samples it will aggregate. Handlers may call
     * gst_aggregator_peek_next_sample() at that point.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Aggregator.SamplesSelected> onSamplesSelected(Aggregator.SamplesSelected handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("samples-selected"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Aggregator.Callbacks.class, "signalAggregatorSamplesSelected",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, long.class, long.class, long.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Aggregator.SamplesSelected>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Element.Build {
        
         /**
         * A {@link Aggregator.Build} object constructs a {@link Aggregator} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Aggregator} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Aggregator} using {@link Aggregator#castFrom}.
         * @return A new instance of {@code Aggregator} with the properties 
         *         that were set in the Build object.
         */
        public Aggregator construct() {
            return Aggregator.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Aggregator.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Enables the emission of signals such as {@link Aggregator}::samples-selected
         * @param emitSignals The value for the {@code emit-signals} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEmitSignals(boolean emitSignals) {
            names.add("emit-signals");
            values.add(org.gtk.gobject.Value.create(emitSignals));
            return this;
        }
        
        public Build setLatency(long latency) {
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
        public Build setMinUpstreamLatency(long minUpstreamLatency) {
            names.add("min-upstream-latency");
            values.add(org.gtk.gobject.Value.create(minUpstreamLatency));
            return this;
        }
        
        public Build setStartTime(long startTime) {
            names.add("start-time");
            values.add(org.gtk.gobject.Value.create(startTime));
            return this;
        }
        
        public Build setStartTimeSelection(org.gstreamer.base.AggregatorStartTimeSelection startTimeSelection) {
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
    
    private static class Callbacks {
        
        public static void signalAggregatorSamplesSelected(MemoryAddress sourceAggregator, MemoryAddress segment, long pts, long dts, long duration, MemoryAddress info, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (Aggregator.SamplesSelected) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Aggregator(sourceAggregator, Ownership.NONE), new org.gstreamer.gst.Segment(segment, Ownership.NONE), pts, dts, duration, new org.gstreamer.gst.Structure(info, Ownership.NONE));
        }
    }
}
