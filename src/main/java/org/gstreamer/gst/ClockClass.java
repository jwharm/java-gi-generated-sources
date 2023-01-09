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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ClockClass newInstance = new ClockClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChangeResolutionCallback} callback.
     */
    @FunctionalInterface
    public interface ChangeResolutionCallback {
    
        org.gstreamer.gst.ClockTime run(org.gstreamer.gst.Clock clock, org.gstreamer.gst.ClockTime oldResolution, org.gstreamer.gst.ClockTime newResolution);
        
        @ApiStatus.Internal default long upcall(MemoryAddress clock, long oldResolution, long newResolution) {
            var RESULT = run((org.gstreamer.gst.Clock) Interop.register(clock, org.gstreamer.gst.Clock.fromAddress).marshal(clock, null), new org.gstreamer.gst.ClockTime(oldResolution), new org.gstreamer.gst.ClockTime(newResolution));
            return RESULT.getValue().longValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangeResolutionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code change_resolution}
     * @param changeResolution The new value of the field {@code change_resolution}
     */
    public void setChangeResolution(ChangeResolutionCallback changeResolution) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("change_resolution"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changeResolution == null ? MemoryAddress.NULL : changeResolution.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetResolutionCallback} callback.
     */
    @FunctionalInterface
    public interface GetResolutionCallback {
    
        org.gstreamer.gst.ClockTime run(org.gstreamer.gst.Clock clock);
        
        @ApiStatus.Internal default long upcall(MemoryAddress clock) {
            var RESULT = run((org.gstreamer.gst.Clock) Interop.register(clock, org.gstreamer.gst.Clock.fromAddress).marshal(clock, null));
            return RESULT.getValue().longValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetResolutionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_resolution}
     * @param getResolution The new value of the field {@code get_resolution}
     */
    public void setGetResolution(GetResolutionCallback getResolution) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_resolution"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getResolution == null ? MemoryAddress.NULL : getResolution.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetInternalTimeCallback} callback.
     */
    @FunctionalInterface
    public interface GetInternalTimeCallback {
    
        org.gstreamer.gst.ClockTime run(org.gstreamer.gst.Clock clock);
        
        @ApiStatus.Internal default long upcall(MemoryAddress clock) {
            var RESULT = run((org.gstreamer.gst.Clock) Interop.register(clock, org.gstreamer.gst.Clock.fromAddress).marshal(clock, null));
            return RESULT.getValue().longValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetInternalTimeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_internal_time}
     * @param getInternalTime The new value of the field {@code get_internal_time}
     */
    public void setGetInternalTime(GetInternalTimeCallback getInternalTime) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_internal_time"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getInternalTime == null ? MemoryAddress.NULL : getInternalTime.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WaitCallback} callback.
     */
    @FunctionalInterface
    public interface WaitCallback {
    
        org.gstreamer.gst.ClockReturn run(org.gstreamer.gst.Clock clock, org.gstreamer.gst.ClockEntry entry, @Nullable org.gstreamer.gst.ClockTimeDiff jitter);
        
        @ApiStatus.Internal default int upcall(MemoryAddress clock, MemoryAddress entry, MemoryAddress jitter) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                org.gstreamer.gst.ClockTimeDiff jitterALIAS = new org.gstreamer.gst.ClockTimeDiff(jitter.get(Interop.valueLayout.C_LONG, 0));
                var RESULT = run((org.gstreamer.gst.Clock) Interop.register(clock, org.gstreamer.gst.Clock.fromAddress).marshal(clock, null), org.gstreamer.gst.ClockEntry.fromAddress.marshal(entry, null), jitterALIAS);
                jitter.set(Interop.valueLayout.C_LONG, 0, jitterALIAS.getValue());
                return RESULT.getValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WaitCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait}
     * @param wait_ The new value of the field {@code wait}
     */
    public void setWait(WaitCallback wait_) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (wait_ == null ? MemoryAddress.NULL : wait_.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code WaitAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface WaitAsyncCallback {
    
        org.gstreamer.gst.ClockReturn run(org.gstreamer.gst.Clock clock, org.gstreamer.gst.ClockEntry entry);
        
        @ApiStatus.Internal default int upcall(MemoryAddress clock, MemoryAddress entry) {
            var RESULT = run((org.gstreamer.gst.Clock) Interop.register(clock, org.gstreamer.gst.Clock.fromAddress).marshal(clock, null), org.gstreamer.gst.ClockEntry.fromAddress.marshal(entry, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), WaitAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code wait_async}
     * @param waitAsync The new value of the field {@code wait_async}
     */
    public void setWaitAsync(WaitAsyncCallback waitAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("wait_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (waitAsync == null ? MemoryAddress.NULL : waitAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UnscheduleCallback} callback.
     */
    @FunctionalInterface
    public interface UnscheduleCallback {
    
        void run(org.gstreamer.gst.Clock clock, org.gstreamer.gst.ClockEntry entry);
        
        @ApiStatus.Internal default void upcall(MemoryAddress clock, MemoryAddress entry) {
            run((org.gstreamer.gst.Clock) Interop.register(clock, org.gstreamer.gst.Clock.fromAddress).marshal(clock, null), org.gstreamer.gst.ClockEntry.fromAddress.marshal(entry, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UnscheduleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unschedule}
     * @param unschedule The new value of the field {@code unschedule}
     */
    public void setUnschedule(UnscheduleCallback unschedule) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unschedule"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unschedule == null ? MemoryAddress.NULL : unschedule.toCallback()));
        }
    }
    
    /**
     * Create a ClockClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ClockClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ClockClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ClockClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setChangeResolution(ChangeResolutionCallback changeResolution) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("change_resolution"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changeResolution == null ? MemoryAddress.NULL : changeResolution.toCallback()));
                return this;
            }
        }
        
        public Builder setGetResolution(GetResolutionCallback getResolution) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_resolution"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getResolution == null ? MemoryAddress.NULL : getResolution.toCallback()));
                return this;
            }
        }
        
        public Builder setGetInternalTime(GetInternalTimeCallback getInternalTime) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_internal_time"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getInternalTime == null ? MemoryAddress.NULL : getInternalTime.toCallback()));
                return this;
            }
        }
        
        public Builder setWait(WaitCallback wait_) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("wait"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (wait_ == null ? MemoryAddress.NULL : wait_.toCallback()));
                return this;
            }
        }
        
        public Builder setWaitAsync(WaitAsyncCallback waitAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("wait_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (waitAsync == null ? MemoryAddress.NULL : waitAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setUnschedule(UnscheduleCallback unschedule) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("unschedule"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (unschedule == null ? MemoryAddress.NULL : unschedule.toCallback()));
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
