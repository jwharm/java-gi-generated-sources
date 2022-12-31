package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The aggregator base class will handle in a thread-safe way all manners of
 * concurrent flushes, seeks, pad additions and removals, leaving to the
 * subclass the responsibility of clipping buffers, and aggregating buffers in
 * the way the implementor sees fit.
 * <p>
 * It will also take care of event ordering (stream-start, segment, eos).
 * <p>
 * Basically, a simple implementation will override {@code aggregate}, and call
 * _finish_buffer from inside that function.
 * @version 1.14
 */
public class AggregatorClass extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAggregatorClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("flush"),
            Interop.valueLayout.ADDRESS.withName("clip"),
            Interop.valueLayout.ADDRESS.withName("finish_buffer"),
            Interop.valueLayout.ADDRESS.withName("sink_event"),
            Interop.valueLayout.ADDRESS.withName("sink_query"),
            Interop.valueLayout.ADDRESS.withName("src_event"),
            Interop.valueLayout.ADDRESS.withName("src_query"),
            Interop.valueLayout.ADDRESS.withName("src_activate"),
            Interop.valueLayout.ADDRESS.withName("aggregate"),
            Interop.valueLayout.ADDRESS.withName("stop"),
            Interop.valueLayout.ADDRESS.withName("start"),
            Interop.valueLayout.ADDRESS.withName("get_next_time"),
            Interop.valueLayout.ADDRESS.withName("create_new_pad"),
            Interop.valueLayout.ADDRESS.withName("update_src_caps"),
            Interop.valueLayout.ADDRESS.withName("fixate_src_caps"),
            Interop.valueLayout.ADDRESS.withName("negotiated_src_caps"),
            Interop.valueLayout.ADDRESS.withName("decide_allocation"),
            Interop.valueLayout.ADDRESS.withName("propose_allocation"),
            Interop.valueLayout.ADDRESS.withName("negotiate"),
            Interop.valueLayout.ADDRESS.withName("sink_event_pre_queue"),
            Interop.valueLayout.ADDRESS.withName("sink_query_pre_queue"),
            Interop.valueLayout.ADDRESS.withName("finish_buffer_list"),
            Interop.valueLayout.ADDRESS.withName("peek_next_sample"),
            MemoryLayout.sequenceLayout(15, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AggregatorClass}
     * @return A new, uninitialized @{link AggregatorClass}
     */
    public static AggregatorClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AggregatorClass newInstance = new AggregatorClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ElementClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ElementClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface FlushCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.Aggregator aggregator);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FlushCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush}
     * @param flush The new value of the field {@code flush}
     */
    public void setFlush(FlushCallback flush) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flush"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
    }
    
    @FunctionalInterface
    public interface ClipCallback {
        org.gstreamer.gst.Buffer run(org.gstreamer.base.Aggregator aggregator, org.gstreamer.base.AggregatorPad aggregatorPad, org.gstreamer.gst.Buffer buf);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress aggregator, MemoryAddress aggregatorPad, MemoryAddress buf) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), (org.gstreamer.base.AggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregatorPad)), org.gstreamer.base.AggregatorPad.fromAddress).marshal(aggregatorPad, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buf, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClipCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code clip}
     * @param clip The new value of the field {@code clip}
     */
    public void setClip(ClipCallback clip) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("clip"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clip == null ? MemoryAddress.NULL : clip.toCallback()));
    }
    
    @FunctionalInterface
    public interface FinishBufferCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.Aggregator aggregator, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.FULL));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FinishBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code finish_buffer}
     * @param finishBuffer The new value of the field {@code finish_buffer}
     */
    public void setFinishBuffer(FinishBufferCallback finishBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finish_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finishBuffer == null ? MemoryAddress.NULL : finishBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface SinkEventCallback {
        boolean run(org.gstreamer.base.Aggregator aggregator, org.gstreamer.base.AggregatorPad aggregatorPad, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator, MemoryAddress aggregatorPad, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), (org.gstreamer.base.AggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregatorPad)), org.gstreamer.base.AggregatorPad.fromAddress).marshal(aggregatorPad, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SinkEventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sink_event}
     * @param sinkEvent The new value of the field {@code sink_event}
     */
    public void setSinkEvent(SinkEventCallback sinkEvent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent.toCallback()));
    }
    
    @FunctionalInterface
    public interface SinkQueryCallback {
        boolean run(org.gstreamer.base.Aggregator aggregator, org.gstreamer.base.AggregatorPad aggregatorPad, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator, MemoryAddress aggregatorPad, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), (org.gstreamer.base.AggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregatorPad)), org.gstreamer.base.AggregatorPad.fromAddress).marshal(aggregatorPad, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SinkQueryCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sink_query}
     * @param sinkQuery The new value of the field {@code sink_query}
     */
    public void setSinkQuery(SinkQueryCallback sinkQuery) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sink_query"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkQuery == null ? MemoryAddress.NULL : sinkQuery.toCallback()));
    }
    
    @FunctionalInterface
    public interface SrcEventCallback {
        boolean run(org.gstreamer.base.Aggregator aggregator, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SrcEventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code src_event}
     * @param srcEvent The new value of the field {@code src_event}
     */
    public void setSrcEvent(SrcEventCallback srcEvent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent.toCallback()));
    }
    
    @FunctionalInterface
    public interface SrcQueryCallback {
        boolean run(org.gstreamer.base.Aggregator aggregator, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SrcQueryCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code src_query}
     * @param srcQuery The new value of the field {@code src_query}
     */
    public void setSrcQuery(SrcQueryCallback srcQuery) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("src_query"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcQuery == null ? MemoryAddress.NULL : srcQuery.toCallback()));
    }
    
    @FunctionalInterface
    public interface SrcActivateCallback {
        boolean run(org.gstreamer.base.Aggregator aggregator, org.gstreamer.gst.PadMode mode, boolean active);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator, int mode, int active) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), org.gstreamer.gst.PadMode.of(mode), Marshal.integerToBoolean.marshal(active, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SrcActivateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code src_activate}
     * @param srcActivate The new value of the field {@code src_activate}
     */
    public void setSrcActivate(SrcActivateCallback srcActivate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("src_activate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcActivate == null ? MemoryAddress.NULL : srcActivate.toCallback()));
    }
    
    @FunctionalInterface
    public interface AggregateCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.Aggregator aggregator, boolean timeout);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator, int timeout) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), Marshal.integerToBoolean.marshal(timeout, null).booleanValue());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AggregateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code aggregate}
     * @param aggregate The new value of the field {@code aggregate}
     */
    public void setAggregate(AggregateCallback aggregate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("aggregate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (aggregate == null ? MemoryAddress.NULL : aggregate.toCallback()));
    }
    
    @FunctionalInterface
    public interface StopCallback {
        boolean run(org.gstreamer.base.Aggregator aggregator);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StopCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void setStop(StopCallback stop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartCallback {
        boolean run(org.gstreamer.base.Aggregator aggregator);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(StartCallback start) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetNextTimeCallback {
        org.gstreamer.gst.ClockTime run(org.gstreamer.base.Aggregator aggregator);

        @ApiStatus.Internal default long upcall(MemoryAddress aggregator) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE));
            return RESULT.getValue().longValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetNextTimeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_next_time}
     * @param getNextTime The new value of the field {@code get_next_time}
     */
    public void setGetNextTime(GetNextTimeCallback getNextTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_next_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNextTime == null ? MemoryAddress.NULL : getNextTime.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateNewPadCallback {
        org.gstreamer.base.AggregatorPad run(org.gstreamer.base.Aggregator self, org.gstreamer.gst.PadTemplate templ, java.lang.String reqName, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress templ, MemoryAddress reqName, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gstreamer.base.Aggregator.fromAddress).marshal(self, Ownership.NONE), (org.gstreamer.gst.PadTemplate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(templ)), org.gstreamer.gst.PadTemplate.fromAddress).marshal(templ, Ownership.NONE), Marshal.addressToString.marshal(reqName, null), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateNewPadCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_new_pad}
     * @param createNewPad The new value of the field {@code create_new_pad}
     */
    public void setCreateNewPad(CreateNewPadCallback createNewPad) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_new_pad"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createNewPad == null ? MemoryAddress.NULL : createNewPad.toCallback()));
    }
    
    @FunctionalInterface
    public interface UpdateSrcCapsCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.Aggregator self, org.gstreamer.gst.Caps caps, @Nullable Out<org.gstreamer.gst.Caps> ret);

        @ApiStatus.Internal default int upcall(MemoryAddress self, MemoryAddress caps, MemoryAddress ret) {
            Out<org.gstreamer.gst.Caps> retOUT = new Out<>(org.gstreamer.gst.Caps.fromAddress.marshal(ret, Ownership.FULL));
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gstreamer.base.Aggregator.fromAddress).marshal(self, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE), retOUT);
            ret.set(Interop.valueLayout.ADDRESS, 0, retOUT.get().handle());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UpdateSrcCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code update_src_caps}
     * @param updateSrcCaps The new value of the field {@code update_src_caps}
     */
    public void setUpdateSrcCaps(UpdateSrcCapsCallback updateSrcCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("update_src_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateSrcCaps == null ? MemoryAddress.NULL : updateSrcCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface FixateSrcCapsCallback {
        org.gstreamer.gst.Caps run(org.gstreamer.base.Aggregator self, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gstreamer.base.Aggregator.fromAddress).marshal(self, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FixateSrcCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code fixate_src_caps}
     * @param fixateSrcCaps The new value of the field {@code fixate_src_caps}
     */
    public void setFixateSrcCaps(FixateSrcCapsCallback fixateSrcCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fixate_src_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fixateSrcCaps == null ? MemoryAddress.NULL : fixateSrcCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface NegotiatedSrcCapsCallback {
        boolean run(org.gstreamer.base.Aggregator self, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default int upcall(MemoryAddress self, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gstreamer.base.Aggregator.fromAddress).marshal(self, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NegotiatedSrcCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code negotiated_src_caps}
     * @param negotiatedSrcCaps The new value of the field {@code negotiated_src_caps}
     */
    public void setNegotiatedSrcCaps(NegotiatedSrcCapsCallback negotiatedSrcCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("negotiated_src_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (negotiatedSrcCaps == null ? MemoryAddress.NULL : negotiatedSrcCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface DecideAllocationCallback {
        boolean run(org.gstreamer.base.Aggregator self, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress self, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gstreamer.base.Aggregator.fromAddress).marshal(self, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DecideAllocationCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code decide_allocation}
     * @param decideAllocation The new value of the field {@code decide_allocation}
     */
    public void setDecideAllocation(DecideAllocationCallback decideAllocation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
    }
    
    @FunctionalInterface
    public interface ProposeAllocationCallback {
        boolean run(org.gstreamer.base.Aggregator self, org.gstreamer.base.AggregatorPad pad, org.gstreamer.gst.Query decideQuery, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress self, MemoryAddress pad, MemoryAddress decideQuery, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gstreamer.base.Aggregator.fromAddress).marshal(self, Ownership.NONE), (org.gstreamer.base.AggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.base.AggregatorPad.fromAddress).marshal(pad, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(decideQuery, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ProposeAllocationCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code propose_allocation}
     * @param proposeAllocation The new value of the field {@code propose_allocation}
     */
    public void setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
    }
    
    @FunctionalInterface
    public interface NegotiateCallback {
        boolean run(org.gstreamer.base.Aggregator self);

        @ApiStatus.Internal default int upcall(MemoryAddress self) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gstreamer.base.Aggregator.fromAddress).marshal(self, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NegotiateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code negotiate}
     * @param negotiate The new value of the field {@code negotiate}
     */
    public void setNegotiate(NegotiateCallback negotiate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate.toCallback()));
    }
    
    @FunctionalInterface
    public interface SinkEventPreQueueCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.Aggregator aggregator, org.gstreamer.base.AggregatorPad aggregatorPad, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator, MemoryAddress aggregatorPad, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), (org.gstreamer.base.AggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregatorPad)), org.gstreamer.base.AggregatorPad.fromAddress).marshal(aggregatorPad, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SinkEventPreQueueCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sink_event_pre_queue}
     * @param sinkEventPreQueue The new value of the field {@code sink_event_pre_queue}
     */
    public void setSinkEventPreQueue(SinkEventPreQueueCallback sinkEventPreQueue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sink_event_pre_queue"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEventPreQueue == null ? MemoryAddress.NULL : sinkEventPreQueue.toCallback()));
    }
    
    @FunctionalInterface
    public interface SinkQueryPreQueueCallback {
        boolean run(org.gstreamer.base.Aggregator aggregator, org.gstreamer.base.AggregatorPad aggregatorPad, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator, MemoryAddress aggregatorPad, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), (org.gstreamer.base.AggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregatorPad)), org.gstreamer.base.AggregatorPad.fromAddress).marshal(aggregatorPad, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SinkQueryPreQueueCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sink_query_pre_queue}
     * @param sinkQueryPreQueue The new value of the field {@code sink_query_pre_queue}
     */
    public void setSinkQueryPreQueue(SinkQueryPreQueueCallback sinkQueryPreQueue) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sink_query_pre_queue"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkQueryPreQueue == null ? MemoryAddress.NULL : sinkQueryPreQueue.toCallback()));
    }
    
    @FunctionalInterface
    public interface FinishBufferListCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.Aggregator aggregator, org.gstreamer.gst.BufferList bufferlist);

        @ApiStatus.Internal default int upcall(MemoryAddress aggregator, MemoryAddress bufferlist) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), org.gstreamer.gst.BufferList.fromAddress.marshal(bufferlist, Ownership.FULL));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FinishBufferListCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code finish_buffer_list}
     * @param finishBufferList The new value of the field {@code finish_buffer_list}
     */
    public void setFinishBufferList(FinishBufferListCallback finishBufferList) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finish_buffer_list"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finishBufferList == null ? MemoryAddress.NULL : finishBufferList.toCallback()));
    }
    
    @FunctionalInterface
    public interface PeekNextSampleCallback {
        @Nullable org.gstreamer.gst.Sample run(org.gstreamer.base.Aggregator aggregator, org.gstreamer.base.AggregatorPad aggregatorPad);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress aggregator, MemoryAddress aggregatorPad) {
            var RESULT = run((org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), (org.gstreamer.base.AggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregatorPad)), org.gstreamer.base.AggregatorPad.fromAddress).marshal(aggregatorPad, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PeekNextSampleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code peek_next_sample}
     * @param peekNextSample The new value of the field {@code peek_next_sample}
     */
    public void setPeekNextSample(PeekNextSampleCallback peekNextSample) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("peek_next_sample"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (peekNextSample == null ? MemoryAddress.NULL : peekNextSample.toCallback()));
    }
    
    /**
     * Create a AggregatorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AggregatorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AggregatorClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AggregatorClass(input, ownership);
    
    /**
     * A {@link AggregatorClass.Builder} object constructs a {@link AggregatorClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AggregatorClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AggregatorClass struct;
        
        private Builder() {
            struct = AggregatorClass.allocate();
        }
        
         /**
         * Finish building the {@link AggregatorClass} struct.
         * @return A new instance of {@code AggregatorClass} with the fields 
         *         that were set in the Builder object.
         */
        public AggregatorClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setFlush(FlushCallback flush) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
            return this;
        }
        
        public Builder setClip(ClipCallback clip) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (clip == null ? MemoryAddress.NULL : clip.toCallback()));
            return this;
        }
        
        public Builder setFinishBuffer(FinishBufferCallback finishBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finish_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finishBuffer == null ? MemoryAddress.NULL : finishBuffer.toCallback()));
            return this;
        }
        
        public Builder setSinkEvent(SinkEventCallback sinkEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent.toCallback()));
            return this;
        }
        
        public Builder setSinkQuery(SinkQueryCallback sinkQuery) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkQuery == null ? MemoryAddress.NULL : sinkQuery.toCallback()));
            return this;
        }
        
        public Builder setSrcEvent(SrcEventCallback srcEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent.toCallback()));
            return this;
        }
        
        public Builder setSrcQuery(SrcQueryCallback srcQuery) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcQuery == null ? MemoryAddress.NULL : srcQuery.toCallback()));
            return this;
        }
        
        public Builder setSrcActivate(SrcActivateCallback srcActivate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcActivate == null ? MemoryAddress.NULL : srcActivate.toCallback()));
            return this;
        }
        
        public Builder setAggregate(AggregateCallback aggregate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("aggregate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (aggregate == null ? MemoryAddress.NULL : aggregate.toCallback()));
            return this;
        }
        
        public Builder setStop(StopCallback stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
            return this;
        }
        
        public Builder setStart(StartCallback start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
            return this;
        }
        
        public Builder setGetNextTime(GetNextTimeCallback getNextTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_next_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNextTime == null ? MemoryAddress.NULL : getNextTime.toCallback()));
            return this;
        }
        
        public Builder setCreateNewPad(CreateNewPadCallback createNewPad) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_new_pad"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createNewPad == null ? MemoryAddress.NULL : createNewPad.toCallback()));
            return this;
        }
        
        public Builder setUpdateSrcCaps(UpdateSrcCapsCallback updateSrcCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_src_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateSrcCaps == null ? MemoryAddress.NULL : updateSrcCaps.toCallback()));
            return this;
        }
        
        public Builder setFixateSrcCaps(FixateSrcCapsCallback fixateSrcCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fixate_src_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fixateSrcCaps == null ? MemoryAddress.NULL : fixateSrcCaps.toCallback()));
            return this;
        }
        
        public Builder setNegotiatedSrcCaps(NegotiatedSrcCapsCallback negotiatedSrcCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("negotiated_src_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (negotiatedSrcCaps == null ? MemoryAddress.NULL : negotiatedSrcCaps.toCallback()));
            return this;
        }
        
        public Builder setDecideAllocation(DecideAllocationCallback decideAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
            return this;
        }
        
        public Builder setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
            return this;
        }
        
        public Builder setNegotiate(NegotiateCallback negotiate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate.toCallback()));
            return this;
        }
        
        public Builder setSinkEventPreQueue(SinkEventPreQueueCallback sinkEventPreQueue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_event_pre_queue"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEventPreQueue == null ? MemoryAddress.NULL : sinkEventPreQueue.toCallback()));
            return this;
        }
        
        public Builder setSinkQueryPreQueue(SinkQueryPreQueueCallback sinkQueryPreQueue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_query_pre_queue"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkQueryPreQueue == null ? MemoryAddress.NULL : sinkQueryPreQueue.toCallback()));
            return this;
        }
        
        public Builder setFinishBufferList(FinishBufferListCallback finishBufferList) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finish_buffer_list"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finishBufferList == null ? MemoryAddress.NULL : finishBufferList.toCallback()));
            return this;
        }
        
        public Builder setPeekNextSample(PeekNextSampleCallback peekNextSample) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("peek_next_sample"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (peekNextSample == null ? MemoryAddress.NULL : peekNextSample.toCallback()));
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
