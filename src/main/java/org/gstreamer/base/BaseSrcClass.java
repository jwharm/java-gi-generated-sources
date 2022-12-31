package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override any of the available virtual methods or not, as
 * needed. At the minimum, the {@code create} method should be overridden to produce
 * buffers.
 */
public class BaseSrcClass extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseSrcClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_caps"),
            Interop.valueLayout.ADDRESS.withName("negotiate"),
            Interop.valueLayout.ADDRESS.withName("fixate"),
            Interop.valueLayout.ADDRESS.withName("set_caps"),
            Interop.valueLayout.ADDRESS.withName("decide_allocation"),
            Interop.valueLayout.ADDRESS.withName("start"),
            Interop.valueLayout.ADDRESS.withName("stop"),
            Interop.valueLayout.ADDRESS.withName("get_times"),
            Interop.valueLayout.ADDRESS.withName("get_size"),
            Interop.valueLayout.ADDRESS.withName("is_seekable"),
            Interop.valueLayout.ADDRESS.withName("prepare_seek_segment"),
            Interop.valueLayout.ADDRESS.withName("do_seek"),
            Interop.valueLayout.ADDRESS.withName("unlock"),
            Interop.valueLayout.ADDRESS.withName("unlock_stop"),
            Interop.valueLayout.ADDRESS.withName("query"),
            Interop.valueLayout.ADDRESS.withName("event"),
            Interop.valueLayout.ADDRESS.withName("create"),
            Interop.valueLayout.ADDRESS.withName("alloc"),
            Interop.valueLayout.ADDRESS.withName("fill"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BaseSrcClass}
     * @return A new, uninitialized @{link BaseSrcClass}
     */
    public static BaseSrcClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BaseSrcClass newInstance = new BaseSrcClass(segment.address(), Ownership.NONE);
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
        org.gstreamer.gst.Caps run(org.gstreamer.base.BaseSrc src, @Nullable org.gstreamer.gst.Caps filter);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress src, MemoryAddress filter) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(filter, Ownership.NONE));
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
    public interface NegotiateCallback {
        boolean run(org.gstreamer.base.BaseSrc src);

        @ApiStatus.Internal default int upcall(MemoryAddress src) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE));
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
    public interface FixateCallback {
        org.gstreamer.gst.Caps run(org.gstreamer.base.BaseSrc src, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress src, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
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
    public interface SetCapsCallback {
        boolean run(org.gstreamer.base.BaseSrc src, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
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
    public interface DecideAllocationCallback {
        boolean run(org.gstreamer.base.BaseSrc src, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
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
    public interface StartCallback {
        boolean run(org.gstreamer.base.BaseSrc src);

        @ApiStatus.Internal default int upcall(MemoryAddress src) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE));
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
        boolean run(org.gstreamer.base.BaseSrc src);

        @ApiStatus.Internal default int upcall(MemoryAddress src) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE));
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
    public interface GetTimesCallback {
        void run(org.gstreamer.base.BaseSrc src, org.gstreamer.gst.Buffer buffer, org.gstreamer.gst.ClockTime start, org.gstreamer.gst.ClockTime end);

        @ApiStatus.Internal default void upcall(MemoryAddress src, MemoryAddress buffer, MemoryAddress start, MemoryAddress end) {
            org.gstreamer.gst.ClockTime startALIAS = new org.gstreamer.gst.ClockTime(start.get(Interop.valueLayout.C_LONG, 0));
            org.gstreamer.gst.ClockTime endALIAS = new org.gstreamer.gst.ClockTime(end.get(Interop.valueLayout.C_LONG, 0));
            run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE), startALIAS, endALIAS);
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
    public interface GetSizeCallback {
        boolean run(org.gstreamer.base.BaseSrc src, Out<Long> size);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress size) {
            Out<Long> sizeOUT = new Out<>(size.get(Interop.valueLayout.C_LONG, 0));
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), sizeOUT);
            size.set(Interop.valueLayout.C_LONG, 0, sizeOUT.get());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetSizeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_size}
     * @param getSize The new value of the field {@code get_size}
     */
    public void setGetSize(GetSizeCallback getSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSize == null ? MemoryAddress.NULL : getSize.toCallback()));
    }
    
    @FunctionalInterface
    public interface IsSeekableCallback {
        boolean run(org.gstreamer.base.BaseSrc src);

        @ApiStatus.Internal default int upcall(MemoryAddress src) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IsSeekableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_seekable}
     * @param isSeekable The new value of the field {@code is_seekable}
     */
    public void setIsSeekable(IsSeekableCallback isSeekable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_seekable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isSeekable == null ? MemoryAddress.NULL : isSeekable.toCallback()));
    }
    
    @FunctionalInterface
    public interface PrepareSeekSegmentCallback {
        boolean run(org.gstreamer.base.BaseSrc src, org.gstreamer.gst.Event seek, org.gstreamer.gst.Segment segment);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress seek, MemoryAddress segment) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(seek, Ownership.NONE), org.gstreamer.gst.Segment.fromAddress.marshal(segment, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrepareSeekSegmentCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_seek_segment}
     * @param prepareSeekSegment The new value of the field {@code prepare_seek_segment}
     */
    public void setPrepareSeekSegment(PrepareSeekSegmentCallback prepareSeekSegment) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prepare_seek_segment"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareSeekSegment == null ? MemoryAddress.NULL : prepareSeekSegment.toCallback()));
    }
    
    @FunctionalInterface
    public interface DoSeekCallback {
        boolean run(org.gstreamer.base.BaseSrc src, org.gstreamer.gst.Segment segment);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress segment) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), org.gstreamer.gst.Segment.fromAddress.marshal(segment, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DoSeekCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code do_seek}
     * @param doSeek The new value of the field {@code do_seek}
     */
    public void setDoSeek(DoSeekCallback doSeek) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("do_seek"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doSeek == null ? MemoryAddress.NULL : doSeek.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnlockCallback {
        boolean run(org.gstreamer.base.BaseSrc src);

        @ApiStatus.Internal default int upcall(MemoryAddress src) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE));
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
        boolean run(org.gstreamer.base.BaseSrc src);

        @ApiStatus.Internal default int upcall(MemoryAddress src) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE));
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
        boolean run(org.gstreamer.base.BaseSrc src, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
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
        boolean run(org.gstreamer.base.BaseSrc src, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
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
    public interface CreateCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSrc src, long offset, int size, Out<org.gstreamer.gst.Buffer> buf);

        @ApiStatus.Internal default int upcall(MemoryAddress src, long offset, int size, MemoryAddress buf) {
            Out<org.gstreamer.gst.Buffer> bufOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(buf, Ownership.FULL));
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), offset, size, bufOUT);
            buf.set(Interop.valueLayout.ADDRESS, 0, bufOUT.get().handle());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create}
     * @param create The new value of the field {@code create}
     */
    public void setCreate(CreateCallback create) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create == null ? MemoryAddress.NULL : create.toCallback()));
    }
    
    @FunctionalInterface
    public interface AllocCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSrc src, long offset, int size, Out<org.gstreamer.gst.Buffer> buf);

        @ApiStatus.Internal default int upcall(MemoryAddress src, long offset, int size, MemoryAddress buf) {
            Out<org.gstreamer.gst.Buffer> bufOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(buf, Ownership.FULL));
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), offset, size, bufOUT);
            buf.set(Interop.valueLayout.ADDRESS, 0, bufOUT.get().handle());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AllocCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code alloc}
     * @param alloc The new value of the field {@code alloc}
     */
    public void setAlloc(AllocCallback alloc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (alloc == null ? MemoryAddress.NULL : alloc.toCallback()));
    }
    
    @FunctionalInterface
    public interface FillCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseSrc src, long offset, int size, org.gstreamer.gst.Buffer buf);

        @ApiStatus.Internal default int upcall(MemoryAddress src, long offset, int size, MemoryAddress buf) {
            var RESULT = run((org.gstreamer.base.BaseSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.BaseSrc.fromAddress).marshal(src, Ownership.NONE), offset, size, org.gstreamer.gst.Buffer.fromAddress.marshal(buf, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FillCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code fill}
     * @param fill The new value of the field {@code fill}
     */
    public void setFill(FillCallback fill) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fill"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fill == null ? MemoryAddress.NULL : fill.toCallback()));
    }
    
    /**
     * Create a BaseSrcClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BaseSrcClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BaseSrcClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BaseSrcClass(input, ownership);
    
    /**
     * A {@link BaseSrcClass.Builder} object constructs a {@link BaseSrcClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BaseSrcClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BaseSrcClass struct;
        
        private Builder() {
            struct = BaseSrcClass.allocate();
        }
        
         /**
         * Finish building the {@link BaseSrcClass} struct.
         * @return A new instance of {@code BaseSrcClass} with the fields 
         *         that were set in the Builder object.
         */
        public BaseSrcClass build() {
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
        
        public Builder setNegotiate(NegotiateCallback negotiate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate.toCallback()));
            return this;
        }
        
        public Builder setFixate(FixateCallback fixate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fixate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fixate == null ? MemoryAddress.NULL : fixate.toCallback()));
            return this;
        }
        
        public Builder setSetCaps(SetCapsCallback setCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
            return this;
        }
        
        public Builder setDecideAllocation(DecideAllocationCallback decideAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
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
        
        public Builder setGetTimes(GetTimesCallback getTimes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_times"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getTimes == null ? MemoryAddress.NULL : getTimes.toCallback()));
            return this;
        }
        
        public Builder setGetSize(GetSizeCallback getSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSize == null ? MemoryAddress.NULL : getSize.toCallback()));
            return this;
        }
        
        public Builder setIsSeekable(IsSeekableCallback isSeekable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_seekable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isSeekable == null ? MemoryAddress.NULL : isSeekable.toCallback()));
            return this;
        }
        
        public Builder setPrepareSeekSegment(PrepareSeekSegmentCallback prepareSeekSegment) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_seek_segment"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareSeekSegment == null ? MemoryAddress.NULL : prepareSeekSegment.toCallback()));
            return this;
        }
        
        public Builder setDoSeek(DoSeekCallback doSeek) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_seek"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doSeek == null ? MemoryAddress.NULL : doSeek.toCallback()));
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
        
        public Builder setCreate(CreateCallback create) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create == null ? MemoryAddress.NULL : create.toCallback()));
            return this;
        }
        
        public Builder setAlloc(AllocCallback alloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (alloc == null ? MemoryAddress.NULL : alloc.toCallback()));
            return this;
        }
        
        public Builder setFill(FillCallback fill) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fill"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fill == null ? MemoryAddress.NULL : fill.toCallback()));
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
