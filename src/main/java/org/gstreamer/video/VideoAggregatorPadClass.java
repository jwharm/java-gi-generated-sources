package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VideoAggregatorPadClass extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorPadClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.AggregatorPadClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("update_conversion_info"),
            Interop.valueLayout.ADDRESS.withName("prepare_frame"),
            Interop.valueLayout.ADDRESS.withName("clean_frame"),
            Interop.valueLayout.ADDRESS.withName("prepare_frame_start"),
            Interop.valueLayout.ADDRESS.withName("prepare_frame_finish"),
            MemoryLayout.sequenceLayout(18, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoAggregatorPadClass}
     * @return A new, uninitialized @{link VideoAggregatorPadClass}
     */
    public static VideoAggregatorPadClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoAggregatorPadClass newInstance = new VideoAggregatorPadClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.AggregatorPadClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.base.AggregatorPadClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.base.AggregatorPadClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UpdateConversionInfoCallback} callback.
     */
    @FunctionalInterface
    public interface UpdateConversionInfoCallback {
    
        void run(org.gstreamer.video.VideoAggregatorPad pad);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pad) {
            run((org.gstreamer.video.VideoAggregatorPad) Interop.register(pad, org.gstreamer.video.VideoAggregatorPad.fromAddress).marshal(pad, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UpdateConversionInfoCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code update_conversion_info}
     * @param updateConversionInfo The new value of the field {@code update_conversion_info}
     */
    public void setUpdateConversionInfo(UpdateConversionInfoCallback updateConversionInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_conversion_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateConversionInfo == null ? MemoryAddress.NULL : updateConversionInfo.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PrepareFrameCallback} callback.
     */
    @FunctionalInterface
    public interface PrepareFrameCallback {
    
        boolean run(org.gstreamer.video.VideoAggregatorPad pad, org.gstreamer.video.VideoAggregator videoaggregator, org.gstreamer.gst.Buffer buffer, org.gstreamer.video.VideoFrame preparedFrame);
        
        @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress videoaggregator, MemoryAddress buffer, MemoryAddress preparedFrame) {
            var RESULT = run((org.gstreamer.video.VideoAggregatorPad) Interop.register(pad, org.gstreamer.video.VideoAggregatorPad.fromAddress).marshal(pad, null), (org.gstreamer.video.VideoAggregator) Interop.register(videoaggregator, org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null), org.gstreamer.video.VideoFrame.fromAddress.marshal(preparedFrame, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrepareFrameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_frame}
     * @param prepareFrame The new value of the field {@code prepare_frame}
     */
    public void setPrepareFrame(PrepareFrameCallback prepareFrame) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepareFrame == null ? MemoryAddress.NULL : prepareFrame.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CleanFrameCallback} callback.
     */
    @FunctionalInterface
    public interface CleanFrameCallback {
    
        void run(org.gstreamer.video.VideoAggregatorPad pad, org.gstreamer.video.VideoAggregator videoaggregator, org.gstreamer.video.VideoFrame preparedFrame);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pad, MemoryAddress videoaggregator, MemoryAddress preparedFrame) {
            run((org.gstreamer.video.VideoAggregatorPad) Interop.register(pad, org.gstreamer.video.VideoAggregatorPad.fromAddress).marshal(pad, null), (org.gstreamer.video.VideoAggregator) Interop.register(videoaggregator, org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, null), org.gstreamer.video.VideoFrame.fromAddress.marshal(preparedFrame, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CleanFrameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code clean_frame}
     * @param cleanFrame The new value of the field {@code clean_frame}
     */
    public void setCleanFrame(CleanFrameCallback cleanFrame) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clean_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cleanFrame == null ? MemoryAddress.NULL : cleanFrame.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PrepareFrameStartCallback} callback.
     */
    @FunctionalInterface
    public interface PrepareFrameStartCallback {
    
        void run(org.gstreamer.video.VideoAggregatorPad pad, org.gstreamer.video.VideoAggregator videoaggregator, org.gstreamer.gst.Buffer buffer, org.gstreamer.video.VideoFrame preparedFrame);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pad, MemoryAddress videoaggregator, MemoryAddress buffer, MemoryAddress preparedFrame) {
            run((org.gstreamer.video.VideoAggregatorPad) Interop.register(pad, org.gstreamer.video.VideoAggregatorPad.fromAddress).marshal(pad, null), (org.gstreamer.video.VideoAggregator) Interop.register(videoaggregator, org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null), org.gstreamer.video.VideoFrame.fromAddress.marshal(preparedFrame, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrepareFrameStartCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_frame_start}
     * @param prepareFrameStart The new value of the field {@code prepare_frame_start}
     */
    public void setPrepareFrameStart(PrepareFrameStartCallback prepareFrameStart) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepareFrameStart == null ? MemoryAddress.NULL : prepareFrameStart.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PrepareFrameFinishCallback} callback.
     */
    @FunctionalInterface
    public interface PrepareFrameFinishCallback {
    
        void run(org.gstreamer.video.VideoAggregatorPad pad, org.gstreamer.video.VideoAggregator videoaggregator, org.gstreamer.video.VideoFrame preparedFrame);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pad, MemoryAddress videoaggregator, MemoryAddress preparedFrame) {
            run((org.gstreamer.video.VideoAggregatorPad) Interop.register(pad, org.gstreamer.video.VideoAggregatorPad.fromAddress).marshal(pad, null), (org.gstreamer.video.VideoAggregator) Interop.register(videoaggregator, org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, null), org.gstreamer.video.VideoFrame.fromAddress.marshal(preparedFrame, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PrepareFrameFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_frame_finish}
     * @param prepareFrameFinish The new value of the field {@code prepare_frame_finish}
     */
    public void setPrepareFrameFinish(PrepareFrameFinishCallback prepareFrameFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepareFrameFinish == null ? MemoryAddress.NULL : prepareFrameFinish.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code _gst_reserved}
     * @return The value of the field {@code _gst_reserved}
     */
    public java.lang.foreign.MemoryAddress[] getGstReserved() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Interop.getAddressArrayFrom(RESULT, 18);
        }
    }
    
    /**
     * Change the value of the field {@code _gst_reserved}
     * @param GstReserved The new value of the field {@code _gst_reserved}
     */
    public void setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
        }
    }
    
    /**
     * Create a VideoAggregatorPadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoAggregatorPadClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoAggregatorPadClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoAggregatorPadClass(input);
    
    /**
     * A {@link VideoAggregatorPadClass.Builder} object constructs a {@link VideoAggregatorPadClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoAggregatorPadClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoAggregatorPadClass struct;
        
        private Builder() {
            struct = VideoAggregatorPadClass.allocate();
        }
        
        /**
         * Finish building the {@link VideoAggregatorPadClass} struct.
         * @return A new instance of {@code VideoAggregatorPadClass} with the fields 
         *         that were set in the Builder object.
         */
        public VideoAggregatorPadClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.base.AggregatorPadClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setUpdateConversionInfo(UpdateConversionInfoCallback updateConversionInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("update_conversion_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateConversionInfo == null ? MemoryAddress.NULL : updateConversionInfo.toCallback()));
                return this;
            }
        }
        
        public Builder setPrepareFrame(PrepareFrameCallback prepareFrame) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepareFrame == null ? MemoryAddress.NULL : prepareFrame.toCallback()));
                return this;
            }
        }
        
        public Builder setCleanFrame(CleanFrameCallback cleanFrame) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("clean_frame"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cleanFrame == null ? MemoryAddress.NULL : cleanFrame.toCallback()));
                return this;
            }
        }
        
        public Builder setPrepareFrameStart(PrepareFrameStartCallback prepareFrameStart) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame_start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepareFrameStart == null ? MemoryAddress.NULL : prepareFrameStart.toCallback()));
                return this;
            }
        }
        
        public Builder setPrepareFrameFinish(PrepareFrameFinishCallback prepareFrameFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (prepareFrameFinish == null ? MemoryAddress.NULL : prepareFrameFinish.toCallback()));
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
