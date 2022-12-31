package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The video filter class structure.
 */
public class VideoFilterClass extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoFilterClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseTransformClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("set_info"),
            Interop.valueLayout.ADDRESS.withName("transform_frame"),
            Interop.valueLayout.ADDRESS.withName("transform_frame_ip"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoFilterClass}
     * @return A new, uninitialized @{link VideoFilterClass}
     */
    public static VideoFilterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoFilterClass newInstance = new VideoFilterClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.BaseTransformClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.base.BaseTransformClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.base.BaseTransformClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface SetInfoCallback {
        boolean run(org.gstreamer.video.VideoFilter filter, org.gstreamer.gst.Caps incaps, org.gstreamer.video.VideoInfo inInfo, org.gstreamer.gst.Caps outcaps, org.gstreamer.video.VideoInfo outInfo);

        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress incaps, MemoryAddress inInfo, MemoryAddress outcaps, MemoryAddress outInfo) {
            var RESULT = run((org.gstreamer.video.VideoFilter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(filter)), org.gstreamer.video.VideoFilter.fromAddress).marshal(filter, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(incaps, Ownership.NONE), org.gstreamer.video.VideoInfo.fromAddress.marshal(inInfo, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(outcaps, Ownership.NONE), org.gstreamer.video.VideoInfo.fromAddress.marshal(outInfo, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetInfoCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_info}
     * @param setInfo The new value of the field {@code set_info}
     */
    public void setSetInfo(SetInfoCallback setInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setInfo == null ? MemoryAddress.NULL : setInfo.toCallback()));
    }
    
    @FunctionalInterface
    public interface TransformFrameCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoFilter filter, org.gstreamer.video.VideoFrame inframe, org.gstreamer.video.VideoFrame outframe);

        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress inframe, MemoryAddress outframe) {
            var RESULT = run((org.gstreamer.video.VideoFilter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(filter)), org.gstreamer.video.VideoFilter.fromAddress).marshal(filter, Ownership.NONE), org.gstreamer.video.VideoFrame.fromAddress.marshal(inframe, Ownership.NONE), org.gstreamer.video.VideoFrame.fromAddress.marshal(outframe, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TransformFrameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_frame}
     * @param transformFrame The new value of the field {@code transform_frame}
     */
    public void setTransformFrame(TransformFrameCallback transformFrame) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform_frame"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformFrame == null ? MemoryAddress.NULL : transformFrame.toCallback()));
    }
    
    @FunctionalInterface
    public interface TransformFrameIpCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoFilter trans, org.gstreamer.video.VideoFrame frame);

        @ApiStatus.Internal default int upcall(MemoryAddress trans, MemoryAddress frame) {
            var RESULT = run((org.gstreamer.video.VideoFilter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trans)), org.gstreamer.video.VideoFilter.fromAddress).marshal(trans, Ownership.NONE), org.gstreamer.video.VideoFrame.fromAddress.marshal(frame, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TransformFrameIpCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_frame_ip}
     * @param transformFrameIp The new value of the field {@code transform_frame_ip}
     */
    public void setTransformFrameIp(TransformFrameIpCallback transformFrameIp) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform_frame_ip"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformFrameIp == null ? MemoryAddress.NULL : transformFrameIp.toCallback()));
    }
    
    /**
     * Create a VideoFilterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoFilterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoFilterClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoFilterClass(input, ownership);
    
    /**
     * A {@link VideoFilterClass.Builder} object constructs a {@link VideoFilterClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoFilterClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoFilterClass struct;
        
        private Builder() {
            struct = VideoFilterClass.allocate();
        }
        
         /**
         * Finish building the {@link VideoFilterClass} struct.
         * @return A new instance of {@code VideoFilterClass} with the fields 
         *         that were set in the Builder object.
         */
        public VideoFilterClass build() {
            return struct;
        }
        
        /**
         * the parent class structure
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.base.BaseTransformClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setSetInfo(SetInfoCallback setInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setInfo == null ? MemoryAddress.NULL : setInfo.toCallback()));
            return this;
        }
        
        public Builder setTransformFrame(TransformFrameCallback transformFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformFrame == null ? MemoryAddress.NULL : transformFrame.toCallback()));
            return this;
        }
        
        public Builder setTransformFrameIp(TransformFrameIpCallback transformFrameIp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_frame_ip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformFrameIp == null ? MemoryAddress.NULL : transformFrameIp.toCallback()));
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
