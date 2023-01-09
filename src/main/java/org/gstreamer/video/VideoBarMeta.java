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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.Meta.getMemoryLayout().withName("meta"),
            Interop.valueLayout.C_BYTE.withName("field"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("is_letterbox"),
            Interop.valueLayout.C_INT.withName("bar_data1"),
            Interop.valueLayout.C_INT.withName("bar_data2")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoBarMeta}
     * @return A new, uninitialized @{link VideoBarMeta}
     */
    public static VideoBarMeta allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoBarMeta newInstance = new VideoBarMeta(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code meta}
     * @return The value of the field {@code meta}
     */
    public org.gstreamer.gst.Meta getMeta() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("meta"));
        return org.gstreamer.gst.Meta.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code meta}
     * @param meta The new value of the field {@code meta}
     */
    public void setMeta(org.gstreamer.gst.Meta meta) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code field}
     * @return The value of the field {@code field}
     */
    public byte getField() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (byte) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("field"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code field}
     * @param field The new value of the field {@code field}
     */
    public void setField(byte field) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("field"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), field);
        }
    }
    
    /**
     * Get the value of the field {@code is_letterbox}
     * @return The value of the field {@code is_letterbox}
     */
    public boolean getIsLetterbox() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_letterbox"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Change the value of the field {@code is_letterbox}
     * @param isLetterbox The new value of the field {@code is_letterbox}
     */
    public void setIsLetterbox(boolean isLetterbox) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_letterbox"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(isLetterbox, null).intValue());
        }
    }
    
    /**
     * Get the value of the field {@code bar_data1}
     * @return The value of the field {@code bar_data1}
     */
    public int getBarData1() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bar_data1"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code bar_data1}
     * @param barData1 The new value of the field {@code bar_data1}
     */
    public void setBarData1(int barData1) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bar_data1"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), barData1);
        }
    }
    
    /**
     * Get the value of the field {@code bar_data2}
     * @return The value of the field {@code bar_data2}
     */
    public int getBarData2() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bar_data2"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code bar_data2}
     * @param barData2 The new value of the field {@code bar_data2}
     */
    public void setBarData2(int barData2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bar_data2"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), barData2);
        }
    }
    
    /**
     * Create a VideoBarMeta proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoBarMeta(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoBarMeta> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoBarMeta(input);
    
    public static org.gstreamer.gst.MetaInfo getInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_video_bar_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_video_bar_meta_get_info = Interop.downcallHandle(
                "gst_video_bar_meta_get_info",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link VideoBarMeta.Builder} object constructs a {@link VideoBarMeta} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoBarMeta.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoBarMeta struct;
        
        private Builder() {
            struct = VideoBarMeta.allocate();
        }
        
        /**
         * Finish building the {@link VideoBarMeta} struct.
         * @return A new instance of {@code VideoBarMeta} with the fields 
         *         that were set in the Builder object.
         */
        public VideoBarMeta build() {
            return struct;
        }
        
        /**
         * parent {@link org.gstreamer.gst.Meta}
         * @param meta The value for the {@code meta} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMeta(org.gstreamer.gst.Meta meta) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("meta"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()));
                return this;
            }
        }
        
        /**
         * 0 for progressive or field 1 and 1 for field 2
         * @param field The value for the {@code field} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setField(byte field) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("field"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), field);
                return this;
            }
        }
        
        /**
         * if true then bar data specifies letterbox, otherwise pillarbox
         * @param isLetterbox The value for the {@code isLetterbox} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIsLetterbox(boolean isLetterbox) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("is_letterbox"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(isLetterbox, null).intValue());
                return this;
            }
        }
        
        /**
         * If {@code is_letterbox} is true, then the value specifies the
         *      last line of a horizontal letterbox bar area at top of reconstructed frame.
         *      Otherwise, it specifies the last horizontal luminance sample of a vertical pillarbox
         *      bar area at the left side of the reconstructed frame
         * @param barData1 The value for the {@code barData1} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBarData1(int barData1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bar_data1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), barData1);
                return this;
            }
        }
        
        /**
         * If {@code is_letterbox} is true, then the value specifies the
         *      first line of a horizontal letterbox bar area at bottom of reconstructed frame.
         *      Otherwise, it specifies the first horizontal
         *      luminance sample of a vertical pillarbox bar area at the right side of the reconstructed frame.
         * @param barData2 The value for the {@code barData2} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBarData2(int barData2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("bar_data2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), barData2);
                return this;
            }
        }
    }
}
