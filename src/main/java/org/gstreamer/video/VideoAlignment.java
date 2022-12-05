package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra alignment parameters for the memory of video buffers. This
 * structure is usually used to configure the bufferpool if it supports the
 * {@code GST_BUFFER_POOL_OPTION_VIDEO_ALIGNMENT}.
 */
public class VideoAlignment extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAlignment";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("padding_top"),
        Interop.valueLayout.C_INT.withName("padding_bottom"),
        Interop.valueLayout.C_INT.withName("padding_left"),
        Interop.valueLayout.C_INT.withName("padding_right"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_INT).withName("stride_align")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoAlignment}
     * @return A new, uninitialized @{link VideoAlignment}
     */
    public static VideoAlignment allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoAlignment newInstance = new VideoAlignment(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code padding_top}
     * @return The value of the field {@code padding_top}
     */
    public int paddingTop$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("padding_top"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code padding_top}
     * @param paddingTop The new value of the field {@code padding_top}
     */
    public void paddingTop$set(int paddingTop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("padding_top"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), paddingTop);
    }
    
    /**
     * Get the value of the field {@code padding_bottom}
     * @return The value of the field {@code padding_bottom}
     */
    public int paddingBottom$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("padding_bottom"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code padding_bottom}
     * @param paddingBottom The new value of the field {@code padding_bottom}
     */
    public void paddingBottom$set(int paddingBottom) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("padding_bottom"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), paddingBottom);
    }
    
    /**
     * Get the value of the field {@code padding_left}
     * @return The value of the field {@code padding_left}
     */
    public int paddingLeft$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("padding_left"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code padding_left}
     * @param paddingLeft The new value of the field {@code padding_left}
     */
    public void paddingLeft$set(int paddingLeft) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("padding_left"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), paddingLeft);
    }
    
    /**
     * Get the value of the field {@code padding_right}
     * @return The value of the field {@code padding_right}
     */
    public int paddingRight$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("padding_right"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code padding_right}
     * @param paddingRight The new value of the field {@code padding_right}
     */
    public void paddingRight$set(int paddingRight) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("padding_right"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), paddingRight);
    }
    
    /**
     * Create a VideoAlignment proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoAlignment(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Set {@code align} to its default values with no padding and no alignment.
     */
    public void reset() {
        try {
            DowncallHandles.gst_video_alignment_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_alignment_reset = Interop.downcallHandle(
            "gst_video_alignment_reset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoAlignment struct;
        
         /**
         * A {@link VideoAlignment.Build} object constructs a {@link VideoAlignment} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoAlignment.allocate();
        }
        
         /**
         * Finish building the {@link VideoAlignment} struct.
         * @return A new instance of {@code VideoAlignment} with the fields 
         *         that were set in the Build object.
         */
        public VideoAlignment construct() {
            return struct;
        }
        
        /**
         * extra pixels on the top
         * @param paddingTop The value for the {@code paddingTop} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPaddingTop(int paddingTop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding_top"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), paddingTop);
            return this;
        }
        
        /**
         * extra pixels on the bottom
         * @param paddingBottom The value for the {@code paddingBottom} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPaddingBottom(int paddingBottom) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding_bottom"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), paddingBottom);
            return this;
        }
        
        /**
         * extra pixels on the left side
         * @param paddingLeft The value for the {@code paddingLeft} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPaddingLeft(int paddingLeft) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding_left"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), paddingLeft);
            return this;
        }
        
        /**
         * extra pixels on the right side
         * @param paddingRight The value for the {@code paddingRight} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPaddingRight(int paddingRight) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding_right"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), paddingRight);
            return this;
        }
        
        /**
         * array with extra alignment requirements for the strides
         * @param strideAlign The value for the {@code strideAlign} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStrideAlign(int[] strideAlign) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stride_align"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (strideAlign == null ? MemoryAddress.NULL : Interop.allocateNativeArray(strideAlign, false)));
            return this;
        }
    }
}
