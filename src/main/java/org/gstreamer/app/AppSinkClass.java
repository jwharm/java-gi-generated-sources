package org.gstreamer.app;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AppSinkClass extends Struct {
    
    static {
        GstApp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAppSinkClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseSinkClass.getMemoryLayout().withName("basesink_class"),
            Interop.valueLayout.ADDRESS.withName("eos"),
            Interop.valueLayout.ADDRESS.withName("new_preroll"),
            Interop.valueLayout.ADDRESS.withName("new_sample"),
            Interop.valueLayout.ADDRESS.withName("pull_preroll"),
            Interop.valueLayout.ADDRESS.withName("pull_sample"),
            Interop.valueLayout.ADDRESS.withName("try_pull_preroll"),
            Interop.valueLayout.ADDRESS.withName("try_pull_sample"),
            Interop.valueLayout.ADDRESS.withName("try_pull_object"),
            MemoryLayout.sequenceLayout(1, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AppSinkClass}
     * @return A new, uninitialized @{link AppSinkClass}
     */
    public static AppSinkClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AppSinkClass newInstance = new AppSinkClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code basesink_class}
     * @return The value of the field {@code basesink_class}
     */
    public org.gstreamer.base.BaseSinkClass getBasesinkClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("basesink_class"));
        return org.gstreamer.base.BaseSinkClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code basesink_class}
     * @param basesinkClass The new value of the field {@code basesink_class}
     */
    public void setBasesinkClass(org.gstreamer.base.BaseSinkClass basesinkClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("basesink_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (basesinkClass == null ? MemoryAddress.NULL : basesinkClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EosCallback} callback.
     */
    @FunctionalInterface
    public interface EosCallback {
    
        void run(org.gstreamer.app.AppSink appsink);
        
        @ApiStatus.Internal default void upcall(MemoryAddress appsink) {
            run((org.gstreamer.app.AppSink) Interop.register(appsink, org.gstreamer.app.AppSink.fromAddress).marshal(appsink, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EosCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eos}
     * @param eos The new value of the field {@code eos}
     */
    public void setEos(EosCallback eos) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eos"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (eos == null ? MemoryAddress.NULL : eos.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NewPrerollCallback} callback.
     */
    @FunctionalInterface
    public interface NewPrerollCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.app.AppSink appsink);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appsink) {
            var RESULT = run((org.gstreamer.app.AppSink) Interop.register(appsink, org.gstreamer.app.AppSink.fromAddress).marshal(appsink, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NewPrerollCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code new_preroll}
     * @param newPreroll The new value of the field {@code new_preroll}
     */
    public void setNewPreroll(NewPrerollCallback newPreroll) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_preroll"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newPreroll == null ? MemoryAddress.NULL : newPreroll.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NewSampleCallback} callback.
     */
    @FunctionalInterface
    public interface NewSampleCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.app.AppSink appsink);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appsink) {
            var RESULT = run((org.gstreamer.app.AppSink) Interop.register(appsink, org.gstreamer.app.AppSink.fromAddress).marshal(appsink, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NewSampleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code new_sample}
     * @param newSample The new value of the field {@code new_sample}
     */
    public void setNewSample(NewSampleCallback newSample) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("new_sample"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newSample == null ? MemoryAddress.NULL : newSample.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PullPrerollCallback} callback.
     */
    @FunctionalInterface
    public interface PullPrerollCallback {
    
        @Nullable org.gstreamer.gst.Sample run(org.gstreamer.app.AppSink appsink);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appsink) {
            var RESULT = run((org.gstreamer.app.AppSink) Interop.register(appsink, org.gstreamer.app.AppSink.fromAddress).marshal(appsink, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PullPrerollCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code pull_preroll}
     * @param pullPreroll The new value of the field {@code pull_preroll}
     */
    public void setPullPreroll(PullPrerollCallback pullPreroll) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pull_preroll"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pullPreroll == null ? MemoryAddress.NULL : pullPreroll.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PullSampleCallback} callback.
     */
    @FunctionalInterface
    public interface PullSampleCallback {
    
        @Nullable org.gstreamer.gst.Sample run(org.gstreamer.app.AppSink appsink);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appsink) {
            var RESULT = run((org.gstreamer.app.AppSink) Interop.register(appsink, org.gstreamer.app.AppSink.fromAddress).marshal(appsink, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PullSampleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code pull_sample}
     * @param pullSample The new value of the field {@code pull_sample}
     */
    public void setPullSample(PullSampleCallback pullSample) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pull_sample"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pullSample == null ? MemoryAddress.NULL : pullSample.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TryPullPrerollCallback} callback.
     */
    @FunctionalInterface
    public interface TryPullPrerollCallback {
    
        @Nullable org.gstreamer.gst.Sample run(org.gstreamer.app.AppSink appsink, org.gstreamer.gst.ClockTime timeout);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appsink, long timeout) {
            var RESULT = run((org.gstreamer.app.AppSink) Interop.register(appsink, org.gstreamer.app.AppSink.fromAddress).marshal(appsink, null), new org.gstreamer.gst.ClockTime(timeout));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TryPullPrerollCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code try_pull_preroll}
     * @param tryPullPreroll The new value of the field {@code try_pull_preroll}
     */
    public void setTryPullPreroll(TryPullPrerollCallback tryPullPreroll) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("try_pull_preroll"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tryPullPreroll == null ? MemoryAddress.NULL : tryPullPreroll.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TryPullSampleCallback} callback.
     */
    @FunctionalInterface
    public interface TryPullSampleCallback {
    
        @Nullable org.gstreamer.gst.Sample run(org.gstreamer.app.AppSink appsink, org.gstreamer.gst.ClockTime timeout);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appsink, long timeout) {
            var RESULT = run((org.gstreamer.app.AppSink) Interop.register(appsink, org.gstreamer.app.AppSink.fromAddress).marshal(appsink, null), new org.gstreamer.gst.ClockTime(timeout));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TryPullSampleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code try_pull_sample}
     * @param tryPullSample The new value of the field {@code try_pull_sample}
     */
    public void setTryPullSample(TryPullSampleCallback tryPullSample) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("try_pull_sample"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tryPullSample == null ? MemoryAddress.NULL : tryPullSample.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TryPullObjectCallback} callback.
     */
    @FunctionalInterface
    public interface TryPullObjectCallback {
    
        org.gstreamer.gst.MiniObject run(org.gstreamer.app.AppSink appsink, org.gstreamer.gst.ClockTime timeout);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appsink, long timeout) {
            var RESULT = run((org.gstreamer.app.AppSink) Interop.register(appsink, org.gstreamer.app.AppSink.fromAddress).marshal(appsink, null), new org.gstreamer.gst.ClockTime(timeout));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TryPullObjectCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code try_pull_object}
     * @param tryPullObject The new value of the field {@code try_pull_object}
     */
    public void setTryPullObject(TryPullObjectCallback tryPullObject) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("try_pull_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tryPullObject == null ? MemoryAddress.NULL : tryPullObject.toCallback()));
        }
    }
    
    /**
     * Create a AppSinkClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AppSinkClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppSinkClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AppSinkClass(input);
    
    /**
     * A {@link AppSinkClass.Builder} object constructs a {@link AppSinkClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AppSinkClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AppSinkClass struct;
        
        private Builder() {
            struct = AppSinkClass.allocate();
        }
        
        /**
         * Finish building the {@link AppSinkClass} struct.
         * @return A new instance of {@code AppSinkClass} with the fields 
         *         that were set in the Builder object.
         */
        public AppSinkClass build() {
            return struct;
        }
        
        public Builder setBasesinkClass(org.gstreamer.base.BaseSinkClass basesinkClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("basesink_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (basesinkClass == null ? MemoryAddress.NULL : basesinkClass.handle()));
                return this;
            }
        }
        
        public Builder setEos(EosCallback eos) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("eos"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (eos == null ? MemoryAddress.NULL : eos.toCallback()));
                return this;
            }
        }
        
        public Builder setNewPreroll(NewPrerollCallback newPreroll) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("new_preroll"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newPreroll == null ? MemoryAddress.NULL : newPreroll.toCallback()));
                return this;
            }
        }
        
        public Builder setNewSample(NewSampleCallback newSample) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("new_sample"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (newSample == null ? MemoryAddress.NULL : newSample.toCallback()));
                return this;
            }
        }
        
        public Builder setPullPreroll(PullPrerollCallback pullPreroll) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pull_preroll"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pullPreroll == null ? MemoryAddress.NULL : pullPreroll.toCallback()));
                return this;
            }
        }
        
        public Builder setPullSample(PullSampleCallback pullSample) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pull_sample"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pullSample == null ? MemoryAddress.NULL : pullSample.toCallback()));
                return this;
            }
        }
        
        public Builder setTryPullPreroll(TryPullPrerollCallback tryPullPreroll) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("try_pull_preroll"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tryPullPreroll == null ? MemoryAddress.NULL : tryPullPreroll.toCallback()));
                return this;
            }
        }
        
        public Builder setTryPullSample(TryPullSampleCallback tryPullSample) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("try_pull_sample"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tryPullSample == null ? MemoryAddress.NULL : tryPullSample.toCallback()));
                return this;
            }
        }
        
        public Builder setTryPullObject(TryPullObjectCallback tryPullObject) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("try_pull_object"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (tryPullObject == null ? MemoryAddress.NULL : tryPullObject.toCallback()));
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
