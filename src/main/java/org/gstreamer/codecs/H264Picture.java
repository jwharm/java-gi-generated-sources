package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class H264Picture extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstH264Picture";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("type"),
            Interop.valueLayout.C_INT.withName("system_frame_number"),
            Interop.valueLayout.C_BYTE.withName("pic_order_cnt_type"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("top_field_order_cnt"),
            Interop.valueLayout.C_INT.withName("bottom_field_order_cnt"),
            Interop.valueLayout.C_INT.withName("pic_order_cnt"),
            Interop.valueLayout.C_INT.withName("pic_order_cnt_msb"),
            Interop.valueLayout.C_INT.withName("pic_order_cnt_lsb"),
            Interop.valueLayout.C_INT.withName("delta_pic_order_cnt_bottom"),
            Interop.valueLayout.C_INT.withName("delta_pic_order_cnt0"),
            Interop.valueLayout.C_INT.withName("delta_pic_order_cnt1"),
            Interop.valueLayout.C_INT.withName("pic_num"),
            Interop.valueLayout.C_INT.withName("long_term_pic_num"),
            Interop.valueLayout.C_INT.withName("frame_num"),
            Interop.valueLayout.C_INT.withName("frame_num_offset"),
            Interop.valueLayout.C_INT.withName("frame_num_wrap"),
            Interop.valueLayout.C_INT.withName("long_term_frame_idx"),
            Interop.valueLayout.C_INT.withName("nal_ref_idc"),
            Interop.valueLayout.C_INT.withName("idr"),
            Interop.valueLayout.C_INT.withName("idr_pic_id"),
            Interop.valueLayout.C_INT.withName("ref"),
            Interop.valueLayout.C_INT.withName("ref_pic"),
            Interop.valueLayout.C_INT.withName("needed_for_output"),
            Interop.valueLayout.C_INT.withName("mem_mgmt_5"),
            Interop.valueLayout.C_INT.withName("nonexisting"),
            Interop.valueLayout.C_INT.withName("field"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("dec_ref_pic_marking"),
            Interop.valueLayout.C_INT.withName("second_field"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("other_field"),
            Interop.valueLayout.C_INT.withName("buffer_flags"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("user_data"),
            Interop.valueLayout.ADDRESS.withName("notify")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link H264Picture}
     * @return A new, uninitialized @{link H264Picture}
     */
    public static H264Picture allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        H264Picture newInstance = new H264Picture(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a H264Picture proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected H264Picture(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, H264Picture> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new H264Picture(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h264_picture_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create new {@link H264Picture}
     */
    public H264Picture() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets private data set on the picture via
     * gst_h264_picture_set_user_data() previously.
     * @return The previously set user_data
     */
    public @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h264_picture_get_user_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Update reference picture type of {@code picture} with {@code reference}
     * @param reference a GstH264PictureReference
     * @param otherField {@code true} if {@code reference} needs to be applied to the
     * other field if any
     */
    public void setReference(org.gstreamer.codecs.H264PictureReference reference, boolean otherField) {
        try {
            DowncallHandles.gst_h264_picture_set_reference.invokeExact(
                    handle(),
                    reference.getValue(),
                    Marshal.booleanToInteger.marshal(otherField, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code user_data} on the picture and the {@link org.gtk.glib.DestroyNotify} that will be called when
     * the picture is freed.
     * <p>
     * If a {@code user_data} was previously set, then the previous set {@code notify} will be called
     * before the {@code user_data} is replaced.
     * @param notify a {@link org.gtk.glib.DestroyNotify}
     */
    public void setUserData(org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_h264_picture_set_user_data.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_h264_picture_new = Interop.downcallHandle(
            "gst_h264_picture_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_h264_picture_get_user_data = Interop.downcallHandle(
            "gst_h264_picture_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_h264_picture_set_reference = Interop.downcallHandle(
            "gst_h264_picture_set_reference",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_h264_picture_set_user_data = Interop.downcallHandle(
            "gst_h264_picture_set_user_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link H264Picture.Builder} object constructs a {@link H264Picture} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link H264Picture.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final H264Picture struct;
        
        private Builder() {
            struct = H264Picture.allocate();
        }
        
         /**
         * Finish building the {@link H264Picture} struct.
         * @return A new instance of {@code H264Picture} with the fields 
         *         that were set in the Builder object.
         */
        public H264Picture build() {
            return struct;
        }
        
        public Builder setParent(org.gstreamer.gst.MiniObject parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Builder setType(java.lang.foreign.MemoryAddress type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : (Addressable) type));
            return this;
        }
        
        public Builder setSystemFrameNumber(int systemFrameNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("system_frame_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), systemFrameNumber);
            return this;
        }
        
        public Builder setPicOrderCntType(byte picOrderCntType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_order_cnt_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), picOrderCntType);
            return this;
        }
        
        public Builder setTopFieldOrderCnt(int topFieldOrderCnt) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("top_field_order_cnt"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), topFieldOrderCnt);
            return this;
        }
        
        public Builder setBottomFieldOrderCnt(int bottomFieldOrderCnt) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("bottom_field_order_cnt"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), bottomFieldOrderCnt);
            return this;
        }
        
        public Builder setPicOrderCnt(int picOrderCnt) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_order_cnt"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), picOrderCnt);
            return this;
        }
        
        public Builder setPicOrderCntMsb(int picOrderCntMsb) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_order_cnt_msb"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), picOrderCntMsb);
            return this;
        }
        
        public Builder setPicOrderCntLsb(int picOrderCntLsb) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_order_cnt_lsb"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), picOrderCntLsb);
            return this;
        }
        
        public Builder setDeltaPicOrderCntBottom(int deltaPicOrderCntBottom) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delta_pic_order_cnt_bottom"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaPicOrderCntBottom);
            return this;
        }
        
        public Builder setDeltaPicOrderCnt0(int deltaPicOrderCnt0) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delta_pic_order_cnt0"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaPicOrderCnt0);
            return this;
        }
        
        public Builder setDeltaPicOrderCnt1(int deltaPicOrderCnt1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delta_pic_order_cnt1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), deltaPicOrderCnt1);
            return this;
        }
        
        public Builder setPicNum(int picNum) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_num"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), picNum);
            return this;
        }
        
        public Builder setLongTermPicNum(int longTermPicNum) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("long_term_pic_num"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), longTermPicNum);
            return this;
        }
        
        public Builder setFrameNum(int frameNum) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frame_num"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameNum);
            return this;
        }
        
        public Builder setFrameNumOffset(int frameNumOffset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frame_num_offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameNumOffset);
            return this;
        }
        
        public Builder setFrameNumWrap(int frameNumWrap) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frame_num_wrap"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), frameNumWrap);
            return this;
        }
        
        public Builder setLongTermFrameIdx(int longTermFrameIdx) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("long_term_frame_idx"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), longTermFrameIdx);
            return this;
        }
        
        public Builder setNalRefIdc(int nalRefIdc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nal_ref_idc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nalRefIdc);
            return this;
        }
        
        public Builder setIdr(boolean idr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("idr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(idr, null).intValue());
            return this;
        }
        
        public Builder setIdrPicId(int idrPicId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("idr_pic_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), idrPicId);
            return this;
        }
        
        public Builder setRef(org.gstreamer.codecs.H264PictureReference ref) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ref == null ? MemoryAddress.NULL : ref.getValue()));
            return this;
        }
        
        public Builder setRefPic(boolean refPic) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_pic"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(refPic, null).intValue());
            return this;
        }
        
        public Builder setNeededForOutput(boolean neededForOutput) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("needed_for_output"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(neededForOutput, null).intValue());
            return this;
        }
        
        public Builder setMemMgmt5(boolean memMgmt5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mem_mgmt_5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(memMgmt5, null).intValue());
            return this;
        }
        
        public Builder setNonexisting(boolean nonexisting) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nonexisting"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(nonexisting, null).intValue());
            return this;
        }
        
        public Builder setField(org.gstreamer.codecs.H264PictureField field) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("field"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (field == null ? MemoryAddress.NULL : field.getValue()));
            return this;
        }
        
        public Builder setDecRefPicMarking(java.lang.foreign.MemoryAddress decRefPicMarking) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dec_ref_pic_marking"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decRefPicMarking == null ? MemoryAddress.NULL : (Addressable) decRefPicMarking));
            return this;
        }
        
        public Builder setSecondField(boolean secondField) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("second_field"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(secondField, null).intValue());
            return this;
        }
        
        public Builder setOtherField(org.gstreamer.codecs.H264Picture otherField) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("other_field"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (otherField == null ? MemoryAddress.NULL : otherField.handle()));
            return this;
        }
        
        public Builder setBufferFlags(org.gstreamer.video.VideoBufferFlags bufferFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (bufferFlags == null ? MemoryAddress.NULL : bufferFlags.getValue()));
            return this;
        }
        
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        public Builder setNotify(org.gtk.glib.DestroyNotify notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
            return this;
        }
    }
}
