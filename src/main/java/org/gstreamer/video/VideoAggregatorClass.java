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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoAggregatorClass newInstance = new VideoAggregatorClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface UpdateCapsCallback {
        org.gstreamer.gst.Caps run(org.gstreamer.video.VideoAggregator videoaggregator, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress videoaggregator, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.video.VideoAggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(videoaggregator)), org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UpdateCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code update_caps}
     * @param updateCaps The new value of the field {@code update_caps}
     */
    public void setUpdateCaps(UpdateCapsCallback updateCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("update_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateCaps == null ? MemoryAddress.NULL : updateCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface AggregateFramesCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoAggregator videoaggregator, org.gstreamer.gst.Buffer outbuffer);

        @ApiStatus.Internal default int upcall(MemoryAddress videoaggregator, MemoryAddress outbuffer) {
            var RESULT = run((org.gstreamer.video.VideoAggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(videoaggregator)), org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(outbuffer, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AggregateFramesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code aggregate_frames}
     * @param aggregateFrames The new value of the field {@code aggregate_frames}
     */
    public void setAggregateFrames(AggregateFramesCallback aggregateFrames) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("aggregate_frames"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (aggregateFrames == null ? MemoryAddress.NULL : aggregateFrames.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateOutputBufferCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoAggregator videoaggregator, PointerProxy<org.gstreamer.gst.Buffer> outbuffer);

        @ApiStatus.Internal default int upcall(MemoryAddress videoaggregator, MemoryAddress outbuffer) {
            var RESULT = run((org.gstreamer.video.VideoAggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(videoaggregator)), org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, Ownership.NONE), new PointerProxy<org.gstreamer.gst.Buffer>(outbuffer, org.gstreamer.gst.Buffer.fromAddress));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateOutputBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_output_buffer}
     * @param createOutputBuffer The new value of the field {@code create_output_buffer}
     */
    public void setCreateOutputBuffer(CreateOutputBufferCallback createOutputBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_output_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createOutputBuffer == null ? MemoryAddress.NULL : createOutputBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface FindBestFormatCallback {
        void run(org.gstreamer.video.VideoAggregator vagg, org.gstreamer.gst.Caps downstreamCaps, org.gstreamer.video.VideoInfo bestInfo, PointerBoolean atLeastOneAlpha);

        @ApiStatus.Internal default void upcall(MemoryAddress vagg, MemoryAddress downstreamCaps, MemoryAddress bestInfo, MemoryAddress atLeastOneAlpha) {
            run((org.gstreamer.video.VideoAggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(vagg)), org.gstreamer.video.VideoAggregator.fromAddress).marshal(vagg, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(downstreamCaps, Ownership.NONE), org.gstreamer.video.VideoInfo.fromAddress.marshal(bestInfo, Ownership.NONE), new PointerBoolean(atLeastOneAlpha));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FindBestFormatCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code find_best_format}
     * @param findBestFormat The new value of the field {@code find_best_format}
     */
    public void setFindBestFormat(FindBestFormatCallback findBestFormat) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("find_best_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (findBestFormat == null ? MemoryAddress.NULL : findBestFormat.toCallback()));
    }
    
    /**
     * Create a VideoAggregatorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoAggregatorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoAggregatorClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoAggregatorClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setUpdateCaps(UpdateCapsCallback updateCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateCaps == null ? MemoryAddress.NULL : updateCaps.toCallback()));
            return this;
        }
        
        public Builder setAggregateFrames(AggregateFramesCallback aggregateFrames) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("aggregate_frames"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (aggregateFrames == null ? MemoryAddress.NULL : aggregateFrames.toCallback()));
            return this;
        }
        
        public Builder setCreateOutputBuffer(CreateOutputBufferCallback createOutputBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_output_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createOutputBuffer == null ? MemoryAddress.NULL : createOutputBuffer.toCallback()));
            return this;
        }
        
        public Builder setFindBestFormat(FindBestFormatCallback findBestFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_best_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (findBestFormat == null ? MemoryAddress.NULL : findBestFormat.toCallback()));
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
