package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VideoAggregatorClass extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.AggregatorClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("update_caps"),
            Interop.valueLayout.ADDRESS.withName("aggregate_frames"),
            Interop.valueLayout.ADDRESS.withName("create_output_buffer"),
            Interop.valueLayout.ADDRESS.withName("find_best_format"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoAggregatorClass}
     * @return A new, uninitialized @{link VideoAggregatorClass}
     */
    public static VideoAggregatorClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoAggregatorClass newInstance = new VideoAggregatorClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code UpdateCapsCallback} callback.
     */
    @FunctionalInterface
    public interface UpdateCapsCallback {
    
        org.gstreamer.gst.Caps run(org.gstreamer.video.VideoAggregator videoaggregator, org.gstreamer.gst.Caps caps);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress videoaggregator, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.video.VideoAggregator) Interop.register(videoaggregator, org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, null), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UpdateCapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code update_caps}
     * @param updateCaps The new value of the field {@code update_caps}
     */
    public void setUpdateCaps(UpdateCapsCallback updateCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateCaps == null ? MemoryAddress.NULL : updateCaps.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AggregateFramesCallback} callback.
     */
    @FunctionalInterface
    public interface AggregateFramesCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoAggregator videoaggregator, org.gstreamer.gst.Buffer outbuffer);
        
        @ApiStatus.Internal default int upcall(MemoryAddress videoaggregator, MemoryAddress outbuffer) {
            var RESULT = run((org.gstreamer.video.VideoAggregator) Interop.register(videoaggregator, org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, null), org.gstreamer.gst.Buffer.fromAddress.marshal(outbuffer, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AggregateFramesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code aggregate_frames}
     * @param aggregateFrames The new value of the field {@code aggregate_frames}
     */
    public void setAggregateFrames(AggregateFramesCallback aggregateFrames) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("aggregate_frames"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (aggregateFrames == null ? MemoryAddress.NULL : aggregateFrames.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateOutputBufferCallback} callback.
     */
    @FunctionalInterface
    public interface CreateOutputBufferCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoAggregator videoaggregator, PointerProxy<org.gstreamer.gst.Buffer> outbuffer);
        
        @ApiStatus.Internal default int upcall(MemoryAddress videoaggregator, MemoryAddress outbuffer) {
            var RESULT = run((org.gstreamer.video.VideoAggregator) Interop.register(videoaggregator, org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, null), new PointerProxy<org.gstreamer.gst.Buffer>(outbuffer, org.gstreamer.gst.Buffer.fromAddress));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateOutputBufferCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_output_buffer}
     * @param createOutputBuffer The new value of the field {@code create_output_buffer}
     */
    public void setCreateOutputBuffer(CreateOutputBufferCallback createOutputBuffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_output_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createOutputBuffer == null ? MemoryAddress.NULL : createOutputBuffer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FindBestFormatCallback} callback.
     */
    @FunctionalInterface
    public interface FindBestFormatCallback {
    
        void run(org.gstreamer.video.VideoAggregator vagg, org.gstreamer.gst.Caps downstreamCaps, org.gstreamer.video.VideoInfo bestInfo, PointerBoolean atLeastOneAlpha);
        
        @ApiStatus.Internal default void upcall(MemoryAddress vagg, MemoryAddress downstreamCaps, MemoryAddress bestInfo, MemoryAddress atLeastOneAlpha) {
            run((org.gstreamer.video.VideoAggregator) Interop.register(vagg, org.gstreamer.video.VideoAggregator.fromAddress).marshal(vagg, null), org.gstreamer.gst.Caps.fromAddress.marshal(downstreamCaps, null), org.gstreamer.video.VideoInfo.fromAddress.marshal(bestInfo, null), new PointerBoolean(atLeastOneAlpha));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FindBestFormatCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code find_best_format}
     * @param findBestFormat The new value of the field {@code find_best_format}
     */
    public void setFindBestFormat(FindBestFormatCallback findBestFormat) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_best_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (findBestFormat == null ? MemoryAddress.NULL : findBestFormat.toCallback()));
        }
    }
    
    /**
     * Create a VideoAggregatorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoAggregatorClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoAggregatorClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoAggregatorClass(input);
    
    /**
     * A {@link VideoAggregatorClass.Builder} object constructs a {@link VideoAggregatorClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoAggregatorClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoAggregatorClass struct;
        
        private Builder() {
            struct = VideoAggregatorClass.allocate();
        }
        
        /**
         * Finish building the {@link VideoAggregatorClass} struct.
         * @return A new instance of {@code VideoAggregatorClass} with the fields 
         *         that were set in the Builder object.
         */
        public VideoAggregatorClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.base.AggregatorClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setUpdateCaps(UpdateCapsCallback updateCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("update_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateCaps == null ? MemoryAddress.NULL : updateCaps.toCallback()));
                return this;
            }
        }
        
        public Builder setAggregateFrames(AggregateFramesCallback aggregateFrames) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("aggregate_frames"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (aggregateFrames == null ? MemoryAddress.NULL : aggregateFrames.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateOutputBuffer(CreateOutputBufferCallback createOutputBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_output_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createOutputBuffer == null ? MemoryAddress.NULL : createOutputBuffer.toCallback()));
                return this;
            }
        }
        
        public Builder setFindBestFormat(FindBestFormatCallback findBestFormat) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("find_best_format"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (findBestFormat == null ? MemoryAddress.NULL : findBestFormat.toCallback()));
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
