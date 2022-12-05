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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    @ApiStatus.Internal
    public H265Picture(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
     * @param userData private data
     * @param notify a {@link org.gtk.glib.DestroyNotify}
     */
    public void setUserData(@Nullable java.lang.foreign.MemoryAddress userData, @NotNull org.gtk.glib.DestroyNotify notify) {
        try {
            DowncallHandles.gst_h265_picture_set_user_data.invokeExact(
                    handle(),
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private H265Picture struct;
        
         /**
         * A {@link H265Picture.Build} object constructs a {@link H265Picture} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = H265Picture.allocate();
        }
        
         /**
         * Finish building the {@link H265Picture} struct.
         * @return A new instance of {@code H265Picture} with the fields 
         *         that were set in the Build object.
         */
        public H265Picture construct() {
            return struct;
        }
        
        public Build setParent(org.gstreamer.gst.MiniObject parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Build setType(java.lang.foreign.MemoryAddress type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : (Addressable) type));
            return this;
        }
        
        public Build setPts(org.gstreamer.gst.ClockTime pts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pts == null ? MemoryAddress.NULL : pts.getValue().longValue()));
            return this;
        }
        
        public Build setSystemFrameNumber(int systemFrameNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("system_frame_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), systemFrameNumber);
            return this;
        }
        
        public Build setPicOrderCnt(int picOrderCnt) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_order_cnt"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), picOrderCnt);
            return this;
        }
        
        public Build setPicOrderCntMsb(int picOrderCntMsb) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_order_cnt_msb"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), picOrderCntMsb);
            return this;
        }
        
        public Build setPicOrderCntLsb(int picOrderCntLsb) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_order_cnt_lsb"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), picOrderCntLsb);
            return this;
        }
        
        public Build setPicLatencyCnt(int picLatencyCnt) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_latency_cnt"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), picLatencyCnt);
            return this;
        }
        
        public Build setOutputFlag(boolean outputFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("output_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), outputFlag ? 1 : 0);
            return this;
        }
        
        public Build setNoRaslOutputFlag(boolean NoRaslOutputFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("NoRaslOutputFlag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), NoRaslOutputFlag ? 1 : 0);
            return this;
        }
        
        public Build setNoOutputOfPriorPicsFlag(boolean NoOutputOfPriorPicsFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("NoOutputOfPriorPicsFlag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), NoOutputOfPriorPicsFlag ? 1 : 0);
            return this;
        }
        
        public Build setRapPicFlag(boolean RapPicFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("RapPicFlag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), RapPicFlag ? 1 : 0);
            return this;
        }
        
        public Build setIntraPicFlag(boolean IntraPicFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("IntraPicFlag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), IntraPicFlag ? 1 : 0);
            return this;
        }
        
        public Build setRef(boolean ref) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ref ? 1 : 0);
            return this;
        }
        
        public Build setLongTerm(boolean longTerm) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("long_term"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), longTerm ? 1 : 0);
            return this;
        }
        
        public Build setNeededForOutput(boolean neededForOutput) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("needed_for_output"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), neededForOutput ? 1 : 0);
            return this;
        }
        
        public Build setPicStruct(java.lang.foreign.MemoryAddress picStruct) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_struct"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (picStruct == null ? MemoryAddress.NULL : (Addressable) picStruct));
            return this;
        }
        
        public Build setSourceScanType(byte sourceScanType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("source_scan_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), sourceScanType);
            return this;
        }
        
        public Build setDuplicateFlag(byte duplicateFlag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duplicate_flag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), duplicateFlag);
            return this;
        }
        
        public Build setBufferFlags(org.gstreamer.video.VideoBufferFlags bufferFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (bufferFlags == null ? MemoryAddress.NULL : bufferFlags.getValue()));
            return this;
        }
        
        public Build setUserData(java.lang.foreign.MemoryAddress userData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
            return this;
        }
        
        public Build setNotify(java.lang.foreign.MemoryAddress notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : notify));
            return this;
        }
    }
}
