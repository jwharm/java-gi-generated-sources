package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GStreamer clock class. Override the vmethods to implement the clock
 * functionality.
 */
public class ClockClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstClockClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("change_resolution"),
            Interop.valueLayout.ADDRESS.withName("get_resolution"),
            Interop.valueLayout.ADDRESS.withName("get_internal_time"),
            Interop.valueLayout.ADDRESS.withName("wait"),
            Interop.valueLayout.ADDRESS.withName("wait_async"),
            Interop.valueLayout.ADDRESS.withName("unschedule"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ClockClass}
     * @return A new, uninitialized @{link ClockClass}
     */
    public static ClockClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ClockClass newInstance = new ClockClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface ChangeResolutionCallback {
        org.gstreamer.gst.ClockTime run(org.gstreamer.gst.Clock clock, org.gstreamer.gst.ClockTime oldResolution, org.gstreamer.gst.ClockTime newResolution);

        @ApiStatus.Internal default long upcall(MemoryAddress clock, long oldResolution, long newResolution) {
            var RESULT = run((org.gstreamer.gst.Clock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(clock)), org.gstreamer.gst.Clock.fromAddress).marshal(clock, Ownership.NONE), new org.gstreamer.gst.ClockTime(oldResolution), new org.gstreamer.gst.ClockTime(newResolution));
            return RESULT.getValue().longValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChangeResolutionCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code change_resolution}
     * @param changeResolution The new value of the field {@code change_resolution}
     */
    public void setChangeResolution(ChangeResolutionCallback changeResolution) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("change_resolution"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeResolution == null ? MemoryAddress.NULL : changeResolution.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetResolutionCallback {
        org.gstreamer.gst.ClockTime run(org.gstreamer.gst.Clock clock);

        @ApiStatus.Internal default long upcall(MemoryAddress clock) {
            var RESULT = run((org.gstreamer.gst.Clock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(clock)), org.gstreamer.gst.Clock.fromAddress).marshal(clock, Ownership.NONE));
            return RESULT.getValue().longValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetResolutionCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_resolution}
     * @param getResolution The new value of the field {@code get_resolution}
     */
    public void setGetResolution(GetResolutionCallback getResolution) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_resolution"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getResolution == null ? MemoryAddress.NULL : getResolution.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetInternalTimeCallback {
        org.gstreamer.gst.ClockTime run(org.gstreamer.gst.Clock clock);

        @ApiStatus.Internal default long upcall(MemoryAddress clock) {
            var RESULT = run((org.gstreamer.gst.Clock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(clock)), org.gstreamer.gst.Clock.fromAddress).marshal(clock, Ownership.NONE));
            return RESULT.getValue().longValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetInternalTimeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_internal_time}
     * @param getInternalTime The new value of the field {@code get_internal_time}
     */
    public void setGetInternalTime(GetInternalTimeCallback getInternalTime) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_internal_time"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInternalTime == null ? MemoryAddress.NULL : getInternalTime.toCallback()));
    }
    
    @FunctionalInterface
    public interface WaitCallback {
        org.gstreamer.gst.ClockReturn run(org.gstreamer.gst.Clock clock, org.gstreamer.gst.ClockEntry entry, @Nullable org.gstreamer.gst.ClockTimeDiff jitter);

        @ApiStatus.Internal default int upcall(MemoryAddress clock, MemoryAddress entry, MemoryAddress jitter) {
            org.gstreamer.gst.ClockTimeDiff jitterALIAS = new org.gstreamer.gst.ClockTimeDiff(jitter.get(Interop.valueLayout.C_LONG, 0));
            var RESULT = run((org.gstreamer.gst.Clock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(clock)), org.gstreamer.gst.Clock.fromAddress).marshal(clock, Ownership.NONE), org.gstreamer.gst.ClockEntry.fromAddress.marshal(entry, Ownership.NONE), jitterALIAS);
            jitter.set(Interop.valueLayout.C_LONG, 0, jitterALIAS.getValue());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WaitCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait}
     * @param wait_ The new value of the field {@code wait}
     */
    public void setWait(WaitCallback wait_) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("wait"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (wait_ == null ? MemoryAddress.NULL : wait_.toCallback()));
    }
    
    @FunctionalInterface
    public interface WaitAsyncCallback {
        org.gstreamer.gst.ClockReturn run(org.gstreamer.gst.Clock clock, org.gstreamer.gst.ClockEntry entry);

        @ApiStatus.Internal default int upcall(MemoryAddress clock, MemoryAddress entry) {
            var RESULT = run((org.gstreamer.gst.Clock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(clock)), org.gstreamer.gst.Clock.fromAddress).marshal(clock, Ownership.NONE), org.gstreamer.gst.ClockEntry.fromAddress.marshal(entry, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(WaitAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait_async}
     * @param waitAsync The new value of the field {@code wait_async}
     */
    public void setWaitAsync(WaitAsyncCallback waitAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("wait_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitAsync == null ? MemoryAddress.NULL : waitAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnscheduleCallback {
        void run(org.gstreamer.gst.Clock clock, org.gstreamer.gst.ClockEntry entry);

        @ApiStatus.Internal default void upcall(MemoryAddress clock, MemoryAddress entry) {
            run((org.gstreamer.gst.Clock) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(clock)), org.gstreamer.gst.Clock.fromAddress).marshal(clock, Ownership.NONE), org.gstreamer.gst.ClockEntry.fromAddress.marshal(entry, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnscheduleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unschedule}
     * @param unschedule The new value of the field {@code unschedule}
     */
    public void setUnschedule(UnscheduleCallback unschedule) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unschedule"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unschedule == null ? MemoryAddress.NULL : unschedule.toCallback()));
    }
    
    /**
     * Create a ClockClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ClockClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ClockClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ClockClass(input, ownership);
    
    /**
     * A {@link ClockClass.Builder} object constructs a {@link ClockClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ClockClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ClockClass struct;
        
        private Builder() {
            struct = ClockClass.allocate();
        }
        
         /**
         * Finish building the {@link ClockClass} struct.
         * @return A new instance of {@code ClockClass} with the fields 
         *         that were set in the Builder object.
         */
        public ClockClass build() {
            return struct;
        }
        
        /**
         * the parent class structure
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setChangeResolution(ChangeResolutionCallback changeResolution) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_resolution"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changeResolution == null ? MemoryAddress.NULL : changeResolution.toCallback()));
            return this;
        }
        
        public Builder setGetResolution(GetResolutionCallback getResolution) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_resolution"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getResolution == null ? MemoryAddress.NULL : getResolution.toCallback()));
            return this;
        }
        
        public Builder setGetInternalTime(GetInternalTimeCallback getInternalTime) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_internal_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getInternalTime == null ? MemoryAddress.NULL : getInternalTime.toCallback()));
            return this;
        }
        
        public Builder setWait(WaitCallback wait_) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (wait_ == null ? MemoryAddress.NULL : wait_.toCallback()));
            return this;
        }
        
        public Builder setWaitAsync(WaitAsyncCallback waitAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (waitAsync == null ? MemoryAddress.NULL : waitAsync.toCallback()));
            return this;
        }
        
        public Builder setUnschedule(UnscheduleCallback unschedule) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unschedule"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unschedule == null ? MemoryAddress.NULL : unschedule.toCallback()));
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
