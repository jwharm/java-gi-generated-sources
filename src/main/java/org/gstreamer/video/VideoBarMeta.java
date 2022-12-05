package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Bar data should be included in video user data
 * whenever the rectangular picture area containing useful information
 * does not extend to the full height or width of the coded frame
 * and AFD alone is insufficient to describe the extent of the image.
 * <p>
 * Note: either vertical or horizontal bars are specified, but not both.
 * <p>
 * For more details, see:
 * <p>
 * https://www.atsc.org/wp-content/uploads/2015/03/a_53-Part-4-2009.pdf
 * <p>
 * and SMPTE ST2016-1
 * @version 1.18
 */
public class VideoBarMeta extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoBarMeta";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
        Interop.valueLayout.C_BYTE.withName("field"),
        MemoryLayout.paddingLayout(24),
        Interop.valueLayout.C_INT.withName("is_letterbox"),
        Interop.valueLayout.C_INT.withName("bar_data1"),
        Interop.valueLayout.C_INT.withName("bar_data2")
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
     * Allocate a new {@link VideoBarMeta}
     * @return A new, uninitialized @{link VideoBarMeta}
     */
    public static VideoBarMeta allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoBarMeta newInstance = new VideoBarMeta(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public org.gstreamer.gst.Meta meta$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return new org.gstreamer.gst.Meta(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code field}
     * @return The value of the field {@code field}
     */
    public byte field$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("field"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code field}
     * @param field The new value of the field {@code field}
     */
    public void field$set(byte field) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("field"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), field);
    }
    
    /**
     * Get the value of the field {@code is_letterbox}
     * @return The value of the field {@code is_letterbox}
     */
    public boolean isLetterbox$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_letterbox"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code is_letterbox}
     * @param isLetterbox The new value of the field {@code is_letterbox}
     */
    public void isLetterbox$set(boolean isLetterbox) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_letterbox"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), isLetterbox ? 1 : 0);
    }
    
    /**
     * Get the value of the field {@code bar_data1}
     * @return The value of the field {@code bar_data1}
     */
    public int barData1$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bar_data1"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bar_data1}
     * @param barData1 The new value of the field {@code bar_data1}
     */
    public void barData1$set(int barData1) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bar_data1"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), barData1);
    }
    
    /**
     * Get the value of the field {@code bar_data2}
     * @return The value of the field {@code bar_data2}
     */
    public int barData2$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bar_data2"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code bar_data2}
     * @param barData2 The new value of the field {@code bar_data2}
     */
    public void barData2$set(int barData2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("bar_data2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), barData2);
    }
    
    /**
     * Create a VideoBarMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VideoBarMeta(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    public static @NotNull org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_bar_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.MetaInfo(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_bar_meta_get_info = Interop.downcallHandle(
            "gst_video_bar_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VideoBarMeta struct;
        
         /**
         * A {@link VideoBarMeta.Build} object constructs a {@link VideoBarMeta} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VideoBarMeta.allocate();
        }
        
         /**
         * Finish building the {@link VideoBarMeta} struct.
         * @return A new instance of {@code VideoBarMeta} with the fields 
         *         that were set in the Build object.
         */
        public VideoBarMeta construct() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Meta}
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMeta(org.gstreamer.gst.Meta meta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
            return this;
        }
        
        /**
         * 0 for progressive or field 1 and 1 for field 2
         * @param field The value for the {@code field} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setField(byte field) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("field"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), field);
            return this;
        }
        
        /**
         * if true then bar data specifies letterbox, otherwise pillarbox
         * @param isLetterbox The value for the {@code isLetterbox} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setIsLetterbox(boolean isLetterbox) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_letterbox"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), isLetterbox ? 1 : 0);
            return this;
        }
        
        /**
         * If {@code is_letterbox} is true, then the value specifies the
         *      last line of a horizontal letterbox bar area at top of reconstructed frame.
         *      Otherwise, it specifies the last horizontal luminance sample of a vertical pillarbox
         *      bar area at the left side of the reconstructed frame
         * @param barData1 The value for the {@code barData1} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBarData1(int barData1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bar_data1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), barData1);
            return this;
        }
        
        /**
         * If {@code is_letterbox} is true, then the value specifies the
         *      first line of a horizontal letterbox bar area at bottom of reconstructed frame.
         *      Otherwise, it specifies the first horizontal
         *      luminance sample of a vertical pillarbox bar area at the right side of the reconstructed frame.
         * @param barData2 The value for the {@code barData2} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBarData2(int barData2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bar_data2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), barData2);
            return this;
        }
    }
}
