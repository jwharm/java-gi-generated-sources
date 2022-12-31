package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override any of the available virtual methods or not, as
 * needed. At the minimum, the {@code render} method should be overridden to
 * output/present buffers.
 */
public class BaseSinkClass extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseSinkClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_caps"),
            Interop.valueLayout.ADDRESS.withName("set_caps"),
            Interop.valueLayout.ADDRESS.withName("fixate"),
            Interop.valueLayout.ADDRESS.withName("activate_pull"),
            Interop.valueLayout.ADDRESS.withName("get_times"),
            Interop.valueLayout.ADDRESS.withName("propose_allocation"),
            Interop.valueLayout.ADDRESS.withName("start"),
            Interop.valueLayout.ADDRESS.withName("stop"),
            Interop.valueLayout.ADDRESS.withName("unlock"),
            Interop.valueLayout.ADDRESS.withName("unlock_stop"),
            Interop.valueLayout.ADDRESS.withName("query"),
            Interop.valueLayout.ADDRESS.withName("event"),
            Interop.valueLayout.ADDRESS.withName("wait_event"),
            Interop.valueLayout.ADDRESS.withName("prepare"),
            Interop.valueLayout.ADDRESS.withName("prepare_list"),
            Interop.valueLayout.ADDRESS.withName("preroll"),
            Interop.valueLayout.ADDRESS.withName("render"),
            Interop.valueLayout.ADDRESS.withName("render_list"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BaseSinkClass}
     * @return A new, uninitialized @{link BaseSinkClass}
     */
    public static BaseSinkClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BaseSinkClass newInstance = new BaseSinkClass(segment.address(), Ownership.NONE);
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
    public interface GetCapsCallback {
        org.gstreamer.gst.Caps run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Caps filter);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress sink, MemoryAddress filter) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(filter, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_caps}
     * @param getCaps The new value of the field {@code get_caps}
     */
    public void setGetCaps(GetCapsCallback getCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCaps == null ? MemoryAddress.NULL : getCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetCapsCallback {
        boolean run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_caps}
     * @param setCaps The new value of the field {@code set_caps}
     */
    public void setSetCaps(SetCapsCallback setCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface FixateCallback {
        org.gstreamer.gst.Caps run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress sink, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FixateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code fixate}
     * @param fixate The new value of the field {@code fixate}
     */
    public void setFixate(FixateCallback fixate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fixate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fixate == null ? MemoryAddress.NULL : fixate.toCallback()));
    }
    
    @FunctionalInterface
    public interface ActivatePullCallback {
        boolean run(org.gstreamer.base.BaseSink sink, boolean active);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, int active) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), Marshal.integerToBoolean.marshal(active, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ActivatePullCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate_pull}
     * @param activatePull The new value of the field {@code activate_pull}
     */
    public void setActivatePull(ActivatePullCallback activatePull) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("activate_pull"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activatePull == null ? MemoryAddress.NULL : activatePull.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetTimesCallback {
        void run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Buffer buffer, org.gstreamer.gst.ClockTime start, org.gstreamer.gst.ClockTime end);

        @ApiStatus.Internal default void upcall(MemoryAddress sink, MemoryAddress buffer, MemoryAddress start, MemoryAddress end) {
            org.gstreamer.gst.ClockTime startALIAS = new org.gstreamer.gst.ClockTime(start.get(Interop.valueLayout.C_LONG, 0));
            org.gstreamer.gst.ClockTime endALIAS = new org.gstreamer.gst.ClockTime(end.get(Interop.valueLayout.C_LONG, 0));
            run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE), startALIAS, endALIAS);
            start.set(Interop.valueLayout.C_LONG, 0, startALIAS.getValue());
            end.set(Interop.valueLayout.C_LONG, 0, endALIAS.getValue());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetTimesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_times}
     * @param getTimes The new value of the field {@code get_times}
     */
    public void setGetTimes(GetTimesCallback getTimes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_times"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getTimes == null ? MemoryAddress.NULL : getTimes.toCallback()));
    }
    
    @FunctionalInterface
    public interface ProposeAllocationCallback {
        boolean run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
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
    public interface StartCallback {
        boolean run(org.gstreamer.base.BaseSink sink);

        @ApiStatus.Internal default int upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE));
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
    public interface StopCallback {
        boolean run(org.gstreamer.base.BaseSink sink);

        @ApiStatus.Internal default int upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE));
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
    public interface UnlockCallback {
        boolean run(org.gstreamer.base.BaseSink sink);

        @ApiStatus.Internal default int upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnlockCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unlock}
     * @param unlock The new value of the field {@code unlock}
     */
    public void setUnlock(UnlockCallback unlock) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unlock"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unlock == null ? MemoryAddress.NULL : unlock.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnlockStopCallback {
        boolean run(org.gstreamer.base.BaseSink sink);

        @ApiStatus.Internal default int upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnlockStopCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unlock_stop}
     * @param unlockStop The new value of the field {@code unlock_stop}
     */
    public void setUnlockStop(UnlockStopCallback unlockStop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unlock_stop"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unlockStop == null ? MemoryAddress.NULL : unlockStop.toCallback()));
    }
    
    @FunctionalInterface
    public interface QueryCallback {
        boolean run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query}
     * @param query The new value of the field {@code query}
     */
    public void setQuery(QueryCallback query) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
    }
    
    @FunctionalInterface
    public interface EventCallback {
        boolean run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code event}
     * @param event The new value of the field {@code event}
     */
    public void setEvent(EventCallback event) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (event == null ? MemoryAddress.NULL : event.toCallback()));
    }
    
    @FunctionalInterface
    public interface WaitEventCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WaitEventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait_event}
     * @param waitEvent The new value of the field {@code wait_event}
     */
    public void setWaitEvent(WaitEventCallback waitEvent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("wait_event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitEvent == null ? MemoryAddress.NULL : waitEvent.toCallback()));
    }
    
    @FunctionalInterface
    public interface PrepareCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrepareCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare}
     * @param prepare The new value of the field {@code prepare}
     */
    public void setPrepare(PrepareCallback prepare) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
    }
    
    @FunctionalInterface
    public interface PrepareListCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.BufferList bufferList);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress bufferList) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.BufferList.fromAddress.marshal(bufferList, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrepareListCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_list}
     * @param prepareList The new value of the field {@code prepare_list}
     */
    public void setPrepareList(PrepareListCallback prepareList) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prepare_list"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareList == null ? MemoryAddress.NULL : prepareList.toCallback()));
    }
    
    @FunctionalInterface
    public interface PrerollCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrerollCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code preroll}
     * @param preroll The new value of the field {@code preroll}
     */
    public void setPreroll(PrerollCallback preroll) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("preroll"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preroll == null ? MemoryAddress.NULL : preroll.toCallback()));
    }
    
    @FunctionalInterface
    public interface RenderCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RenderCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code render}
     * @param render The new value of the field {@code render}
     */
    public void setRender(RenderCallback render) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (render == null ? MemoryAddress.NULL : render.toCallback()));
    }
    
    @FunctionalInterface
    public interface RenderListCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.BufferList bufferList);

        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress bufferList) {
            var RESULT = run((org.gstreamer.base.BaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.base.BaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.BufferList.fromAddress.marshal(bufferList, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RenderListCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code render_list}
     * @param renderList The new value of the field {@code render_list}
     */
    public void setRenderList(RenderListCallback renderList) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("render_list"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (renderList == null ? MemoryAddress.NULL : renderList.toCallback()));
    }
    
    /**
     * Create a BaseSinkClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BaseSinkClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BaseSinkClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BaseSinkClass(input, ownership);
    
    /**
     * A {@link BaseSinkClass.Builder} object constructs a {@link BaseSinkClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BaseSinkClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BaseSinkClass struct;
        
        private Builder() {
            struct = BaseSinkClass.allocate();
        }
        
         /**
         * Finish building the {@link BaseSinkClass} struct.
         * @return A new instance of {@code BaseSinkClass} with the fields 
         *         that were set in the Builder object.
         */
        public BaseSinkClass build() {
            return struct;
        }
        
        /**
         * Element parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetCaps(GetCapsCallback getCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCaps == null ? MemoryAddress.NULL : getCaps.toCallback()));
            return this;
        }
        
        public Builder setSetCaps(SetCapsCallback setCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
            return this;
        }
        
        public Builder setFixate(FixateCallback fixate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fixate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fixate == null ? MemoryAddress.NULL : fixate.toCallback()));
            return this;
        }
        
        public Builder setActivatePull(ActivatePullCallback activatePull) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_pull"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activatePull == null ? MemoryAddress.NULL : activatePull.toCallback()));
            return this;
        }
        
        public Builder setGetTimes(GetTimesCallback getTimes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_times"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getTimes == null ? MemoryAddress.NULL : getTimes.toCallback()));
            return this;
        }
        
        public Builder setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
            return this;
        }
        
        public Builder setStart(StartCallback start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
            return this;
        }
        
        public Builder setStop(StopCallback stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
            return this;
        }
        
        public Builder setUnlock(UnlockCallback unlock) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unlock"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unlock == null ? MemoryAddress.NULL : unlock.toCallback()));
            return this;
        }
        
        public Builder setUnlockStop(UnlockStopCallback unlockStop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unlock_stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unlockStop == null ? MemoryAddress.NULL : unlockStop.toCallback()));
            return this;
        }
        
        public Builder setQuery(QueryCallback query) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
            return this;
        }
        
        public Builder setEvent(EventCallback event) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (event == null ? MemoryAddress.NULL : event.toCallback()));
            return this;
        }
        
        public Builder setWaitEvent(WaitEventCallback waitEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitEvent == null ? MemoryAddress.NULL : waitEvent.toCallback()));
            return this;
        }
        
        public Builder setPrepare(PrepareCallback prepare) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
            return this;
        }
        
        public Builder setPrepareList(PrepareListCallback prepareList) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_list"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareList == null ? MemoryAddress.NULL : prepareList.toCallback()));
            return this;
        }
        
        public Builder setPreroll(PrerollCallback preroll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preroll"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preroll == null ? MemoryAddress.NULL : preroll.toCallback()));
            return this;
        }
        
        public Builder setRender(RenderCallback render) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (render == null ? MemoryAddress.NULL : render.toCallback()));
            return this;
        }
        
        public Builder setRenderList(RenderListCallback renderList) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render_list"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (renderList == null ? MemoryAddress.NULL : renderList.toCallback()));
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
