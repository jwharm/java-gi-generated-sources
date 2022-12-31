package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra buffer metadata for performing an affine transformation using a 4x4
 * matrix. The transformation matrix can be composed with
 * gst_video_affine_transformation_meta_apply_matrix().
 * <p>
 * The vertices operated on are all in the range 0 to 1, not in
 * Normalized Device Coordinates (-1 to +1). Transforming points in this space
 * are assumed to have an origin at (0.5, 0.5, 0.5) in a left-handed coordinate
 * system with the x-axis moving horizontally (positive values to the right),
 * the y-axis moving vertically (positive values up the screen) and the z-axis
 * perpendicular to the screen (positive values into the screen).
 * @version 1.8
 */
public class VideoAffineTransformationMeta extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAffineTransformationMeta";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
            MemoryLayout.sequenceLayout(16, Interop.valueLayout.C_FLOAT).withName("matrix")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoAffineTransformationMeta}
     * @return A new, uninitialized @{link VideoAffineTransformationMeta}
     */
    public static VideoAffineTransformationMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoAffineTransformationMeta newInstance = new VideoAffineTransformationMeta(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public org.gstreamer.gst.Meta getMeta() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return org.gstreamer.gst.Meta.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code meta}
     * @param meta The new value of the field {@code meta}
     */
    public void setMeta(org.gstreamer.gst.Meta meta) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("meta"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
    }
    
    /**
     * Get the value of the field {@code matrix}
     * @return The value of the field {@code matrix}
     */
    public float[] getMatrix() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("matrix"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return MemorySegment.ofAddress(RESULT, 16, Interop.getScope()).toArray(Interop.valueLayout.C_FLOAT);
    }
    
    /**
     * Change the value of the field {@code matrix}
     * @param matrix The new value of the field {@code matrix}
     */
    public void setMatrix(float[] matrix) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("matrix"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (matrix == null ? MemoryAddress.NULL : Interop.allocateNativeArray(matrix, false)));
    }
    
    /**
     * Create a VideoAffineTransformationMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoAffineTransformationMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoAffineTransformationMeta> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoAffineTransformationMeta(input, ownership);
    
    /**
     * Apply a transformation using the given 4x4 transformation matrix.
     * Performs the multiplication, meta-&gt;matrix X matrix.
     * @param matrix a 4x4 transformation matrix to be applied
     */
    public void applyMatrix(float[] matrix) {
        try {
            DowncallHandles.gst_video_affine_transformation_meta_apply_matrix.invokeExact(
                    handle(),
                    Interop.allocateNativeArray(matrix, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_affine_transformation_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_affine_transformation_meta_apply_matrix = Interop.downcallHandle(
            "gst_video_affine_transformation_meta_apply_matrix",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_video_affine_transformation_meta_get_info = Interop.downcallHandle(
            "gst_video_affine_transformation_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link VideoAffineTransformationMeta.Builder} object constructs a {@link VideoAffineTransformationMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoAffineTransformationMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoAffineTransformationMeta struct;
        
        private Builder() {
            struct = VideoAffineTransformationMeta.allocate();
        }
        
         /**
         * Finish building the {@link VideoAffineTransformationMeta} struct.
         * @return A new instance of {@code VideoAffineTransformationMeta} with the fields 
         *         that were set in the Builder object.
         */
        public VideoAffineTransformationMeta build() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Meta}
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMeta(org.gstreamer.gst.Meta meta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
            return this;
        }
        
        /**
         * the column-major 4x4 transformation matrix
         * @param matrix The value for the {@code matrix} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMatrix(float[] matrix) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("matrix"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (matrix == null ? MemoryAddress.NULL : Interop.allocateNativeArray(matrix, false)));
            return this;
        }
    }
}
