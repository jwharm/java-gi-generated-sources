package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class H265Picture extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstH265Picture";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("type"),
            Interop.valueLayout.C_LONG.withName("pts"),
            Interop.valueLayout.C_INT.withName("system_frame_number"),
            Interop.valueLayout.C_INT.withName("pic_order_cnt"),
            Interop.valueLayout.C_INT.withName("pic_order_cnt_msb"),
            Interop.valueLayout.C_INT.withName("pic_order_cnt_lsb"),
            Interop.valueLayout.C_INT.withName("pic_latency_cnt"),
            Interop.valueLayout.C_INT.withName("output_flag"),
            Interop.valueLayout.C_INT.withName("NoRaslOutputFlag"),
            Interop.valueLayout.C_INT.withName("NoOutputOfPriorPicsFlag"),
            Interop.valueLayout.C_INT.withName("RapPicFlag"),
            Interop.valueLayout.C_INT.withName("IntraPicFlag"),
            Interop.valueLayout.C_INT.withName("ref"),
            Interop.valueLayout.C_INT.withName("long_term"),
            Interop.valueLayout.C_INT.withName("needed_for_output"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("pic_struct"),
            Interop.valueLayout.C_BYTE.withName("source_scan_type"),
            Interop.valueLayout.C_BYTE.withName("duplicate_flag"),
            MemoryLayout.paddingLayout(16),
            Interop.valueLayout.C_INT.withName("buffer_flags"),
            Interop.valueLayout.ADDRESS.withName("user_data"),
            Interop.valueLayout.ADDRESS.withName("notify")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link H265Picture}
     * @return A new, uninitialized @{link H265Picture}
     */
    public static H265Picture allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        H265Picture newInstance = new H265Picture(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a H265Picture proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected H265Picture(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, H265Picture> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new H265Picture(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h265_picture_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create new {@link H265Picture}
     */
    public H265Picture() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets private data set on the picture via
     * gst_h265_picture_set_user_data() previously.
     * @return The previously set user_data
     */
    public @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_h265_picture_get_user_data.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
            DowncallHandles.gst_h265_picture_set_user_data.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_h265_picture_new = Interop.downcallHandle(
            "gst_h265_picture_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_h265_picture_get_user_data = Interop.downcallHandle(
            "gst_h265_picture_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_h265_picture_set_user_data = Interop.downcallHandle(
            "gst_h265_picture_set_user_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link H265Picture.Builder} object constructs a {@link H265Picture} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link H265Picture.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final H265Picture struct;
        
        private Builder() {
            struct = H265Picture.allocate();
        }
        
         /**
         * Finish building the {@link H265Picture} struct.
         * @return A new instance of {@code H265Picture} with the fields 
         *         that were set in the Builder object.
         */
        public H265Picture build() {
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
        
        public Builder setPts(org.gstreamer.gst.ClockTime pts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pts == null ? MemoryAddress.NULL : pts.getValue().longValue()));
            return this;
        }
        
        public Builder setSystemFrameNumber(int systemFrameNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("system_frame_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), systemFrameNumber);
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
        
        public Builder setPicLatencyCnt(int picLatencyCnt) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_latency_cnt"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), picLatencyCnt);
            return this;
        }
        
        public Builder setOutputFlag(boolean outputFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("output_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(outputFlag, null).intValue());
            return this;
        }
        
        public Builder setNoRaslOutputFlag(boolean NoRaslOutputFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("NoRaslOutputFlag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(NoRaslOutputFlag, null).intValue());
            return this;
        }
        
        public Builder setNoOutputOfPriorPicsFlag(boolean NoOutputOfPriorPicsFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("NoOutputOfPriorPicsFlag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(NoOutputOfPriorPicsFlag, null).intValue());
            return this;
        }
        
        public Builder setRapPicFlag(boolean RapPicFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("RapPicFlag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(RapPicFlag, null).intValue());
            return this;
        }
        
        public Builder setIntraPicFlag(boolean IntraPicFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("IntraPicFlag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(IntraPicFlag, null).intValue());
            return this;
        }
        
        public Builder setRef(boolean ref) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(ref, null).intValue());
            return this;
        }
        
        public Builder setLongTerm(boolean longTerm) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("long_term"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(longTerm, null).intValue());
            return this;
        }
        
        public Builder setNeededForOutput(boolean neededForOutput) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("needed_for_output"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), Marshal.booleanToInteger.marshal(neededForOutput, null).intValue());
            return this;
        }
        
        public Builder setPicStruct(java.lang.foreign.MemoryAddress picStruct) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_struct"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (picStruct == null ? MemoryAddress.NULL : (Addressable) picStruct));
            return this;
        }
        
        public Builder setSourceScanType(byte sourceScanType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source_scan_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), sourceScanType);
            return this;
        }
        
        public Builder setDuplicateFlag(byte duplicateFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duplicate_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), duplicateFlag);
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
