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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        BaseSinkClass newInstance = new BaseSinkClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ElementClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ElementClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetCapsCallback} callback.
     */
    @FunctionalInterface
    public interface GetCapsCallback {
    
        org.gstreamer.gst.Caps run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Caps filter);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress sink, MemoryAddress filter) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.Caps.fromAddress.marshal(filter, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetCapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_caps}
     * @param getCaps The new value of the field {@code get_caps}
     */
    public void setGetCaps(GetCapsCallback getCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCaps == null ? MemoryAddress.NULL : getCaps.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetCapsCallback} callback.
     */
    @FunctionalInterface
    public interface SetCapsCallback {
    
        boolean run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Caps caps);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetCapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_caps}
     * @param setCaps The new value of the field {@code set_caps}
     */
    public void setSetCaps(SetCapsCallback setCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FixateCallback} callback.
     */
    @FunctionalInterface
    public interface FixateCallback {
    
        org.gstreamer.gst.Caps run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Caps caps);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress sink, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FixateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code fixate}
     * @param fixate The new value of the field {@code fixate}
     */
    public void setFixate(FixateCallback fixate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fixate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fixate == null ? MemoryAddress.NULL : fixate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActivatePullCallback} callback.
     */
    @FunctionalInterface
    public interface ActivatePullCallback {
    
        boolean run(org.gstreamer.base.BaseSink sink, boolean active);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink, int active) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), Marshal.integerToBoolean.marshal(active, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivatePullCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate_pull}
     * @param activatePull The new value of the field {@code activate_pull}
     */
    public void setActivatePull(ActivatePullCallback activatePull) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate_pull"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activatePull == null ? MemoryAddress.NULL : activatePull.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetTimesCallback} callback.
     */
    @FunctionalInterface
    public interface GetTimesCallback {
    
        void run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Buffer buffer, org.gstreamer.gst.ClockTime start, org.gstreamer.gst.ClockTime end);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sink, MemoryAddress buffer, MemoryAddress start, MemoryAddress end) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                org.gstreamer.gst.ClockTime startALIAS = new org.gstreamer.gst.ClockTime(start.get(Interop.valueLayout.C_LONG, 0));
                org.gstreamer.gst.ClockTime endALIAS = new org.gstreamer.gst.ClockTime(end.get(Interop.valueLayout.C_LONG, 0));
                run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null), startALIAS, endALIAS);
                start.set(Interop.valueLayout.C_LONG, 0, startALIAS.getValue());
                end.set(Interop.valueLayout.C_LONG, 0, endALIAS.getValue());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetTimesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_times}
     * @param getTimes The new value of the field {@code get_times}
     */
    public void setGetTimes(GetTimesCallback getTimes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_times"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getTimes == null ? MemoryAddress.NULL : getTimes.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ProposeAllocationCallback} callback.
     */
    @FunctionalInterface
    public interface ProposeAllocationCallback {
    
        boolean run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ProposeAllocationCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code propose_allocation}
     * @param proposeAllocation The new value of the field {@code propose_allocation}
     */
    public void setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StartCallback} callback.
     */
    @FunctionalInterface
    public interface StartCallback {
    
        boolean run(org.gstreamer.base.BaseSink sink);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StartCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(StartCallback start) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StopCallback} callback.
     */
    @FunctionalInterface
    public interface StopCallback {
    
        boolean run(org.gstreamer.base.BaseSink sink);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StopCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void setStop(StopCallback stop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnlockCallback} callback.
     */
    @FunctionalInterface
    public interface UnlockCallback {
    
        boolean run(org.gstreamer.base.BaseSink sink);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnlockCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unlock}
     * @param unlock The new value of the field {@code unlock}
     */
    public void setUnlock(UnlockCallback unlock) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unlock"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unlock == null ? MemoryAddress.NULL : unlock.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnlockStopCallback} callback.
     */
    @FunctionalInterface
    public interface UnlockStopCallback {
    
        boolean run(org.gstreamer.base.BaseSink sink);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnlockStopCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unlock_stop}
     * @param unlockStop The new value of the field {@code unlock_stop}
     */
    public void setUnlockStop(UnlockStopCallback unlockStop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unlock_stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unlockStop == null ? MemoryAddress.NULL : unlockStop.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code QueryCallback} callback.
     */
    @FunctionalInterface
    public interface QueryCallback {
    
        boolean run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query}
     * @param query The new value of the field {@code query}
     */
    public void setQuery(QueryCallback query) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EventCallback} callback.
     */
    @FunctionalInterface
    public interface EventCallback {
    
        boolean run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EventCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code event}
     * @param event The new value of the field {@code event}
     */
    public void setEvent(EventCallback event) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("event"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (event == null ? MemoryAddress.NULL : event.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WaitEventCallback} callback.
     */
    @FunctionalInterface
    public interface WaitEventCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WaitEventCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait_event}
     * @param waitEvent The new value of the field {@code wait_event}
     */
    public void setWaitEvent(WaitEventCallback waitEvent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (waitEvent == null ? MemoryAddress.NULL : waitEvent.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PrepareCallback} callback.
     */
    @FunctionalInterface
    public interface PrepareCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Buffer buffer);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrepareCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare}
     * @param prepare The new value of the field {@code prepare}
     */
    public void setPrepare(PrepareCallback prepare) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PrepareListCallback} callback.
     */
    @FunctionalInterface
    public interface PrepareListCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.BufferList bufferList);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress bufferList) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.BufferList.fromAddress.marshal(bufferList, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrepareListCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_list}
     * @param prepareList The new value of the field {@code prepare_list}
     */
    public void setPrepareList(PrepareListCallback prepareList) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_list"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepareList == null ? MemoryAddress.NULL : prepareList.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PrerollCallback} callback.
     */
    @FunctionalInterface
    public interface PrerollCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Buffer buffer);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrerollCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code preroll}
     * @param preroll The new value of the field {@code preroll}
     */
    public void setPreroll(PrerollCallback preroll) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("preroll"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (preroll == null ? MemoryAddress.NULL : preroll.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RenderCallback} callback.
     */
    @FunctionalInterface
    public interface RenderCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.Buffer buffer);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RenderCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code render}
     * @param render The new value of the field {@code render}
     */
    public void setRender(RenderCallback render) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (render == null ? MemoryAddress.NULL : render.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RenderListCallback} callback.
     */
    @FunctionalInterface
    public interface RenderListCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSink sink, org.gstreamer.gst.BufferList bufferList);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sink, MemoryAddress bufferList) {
            var RESULT = run((org.gstreamer.base.BaseSink) Interop.register(sink, org.gstreamer.base.BaseSink.fromAddress).marshal(sink, null), org.gstreamer.gst.BufferList.fromAddress.marshal(bufferList, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RenderListCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code render_list}
     * @param renderList The new value of the field {@code render_list}
     */
    public void setRenderList(RenderListCallback renderList) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("render_list"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (renderList == null ? MemoryAddress.NULL : renderList.toCallback()));
        }
    }
    
    /**
     * Create a BaseSinkClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BaseSinkClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BaseSinkClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BaseSinkClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setGetCaps(GetCapsCallback getCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCaps == null ? MemoryAddress.NULL : getCaps.toCallback()));
                return this;
            }
        }
        
        public Builder setSetCaps(SetCapsCallback setCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
                return this;
            }
        }
        
        public Builder setFixate(FixateCallback fixate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("fixate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (fixate == null ? MemoryAddress.NULL : fixate.toCallback()));
                return this;
            }
        }
        
        public Builder setActivatePull(ActivatePullCallback activatePull) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("activate_pull"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activatePull == null ? MemoryAddress.NULL : activatePull.toCallback()));
                return this;
            }
        }
        
        public Builder setGetTimes(GetTimesCallback getTimes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_times"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getTimes == null ? MemoryAddress.NULL : getTimes.toCallback()));
                return this;
            }
        }
        
        public Builder setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
                return this;
            }
        }
        
        public Builder setStart(StartCallback start) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
                return this;
            }
        }
        
        public Builder setStop(StopCallback stop) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
                return this;
            }
        }
        
        public Builder setUnlock(UnlockCallback unlock) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unlock"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unlock == null ? MemoryAddress.NULL : unlock.toCallback()));
                return this;
            }
        }
        
        public Builder setUnlockStop(UnlockStopCallback unlockStop) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unlock_stop"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unlockStop == null ? MemoryAddress.NULL : unlockStop.toCallback()));
                return this;
            }
        }
        
        public Builder setQuery(QueryCallback query) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
                return this;
            }
        }
        
        public Builder setEvent(EventCallback event) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("event"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (event == null ? MemoryAddress.NULL : event.toCallback()));
                return this;
            }
        }
        
        public Builder setWaitEvent(WaitEventCallback waitEvent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("wait_event"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (waitEvent == null ? MemoryAddress.NULL : waitEvent.toCallback()));
                return this;
            }
        }
        
        public Builder setPrepare(PrepareCallback prepare) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prepare"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepare == null ? MemoryAddress.NULL : prepare.toCallback()));
                return this;
            }
        }
        
        public Builder setPrepareList(PrepareListCallback prepareList) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prepare_list"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepareList == null ? MemoryAddress.NULL : prepareList.toCallback()));
                return this;
            }
        }
        
        public Builder setPreroll(PrerollCallback preroll) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("preroll"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (preroll == null ? MemoryAddress.NULL : preroll.toCallback()));
                return this;
            }
        }
        
        public Builder setRender(RenderCallback render) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("render"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (render == null ? MemoryAddress.NULL : render.toCallback()));
                return this;
            }
        }
        
        public Builder setRenderList(RenderListCallback renderList) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("render_list"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (renderList == null ? MemoryAddress.NULL : renderList.toCallback()));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
