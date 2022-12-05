package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Mpeg2Picture extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMpeg2Picture";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
        Interop.valueLayout.C_INT.withName("system_frame_number"),
        Interop.valueLayout.C_INT.withName("needed_for_output"),
        Interop.valueLayout.ADDRESS.withName("first_field"),
        Interop.valueLayout.C_INT.withName("buffer_flags"),
        Interop.valueLayout.C_INT.withName("pic_order_cnt"),
        Interop.valueLayout.C_INT.withName("tsn"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("structure"),
        Interop.valueLayout.ADDRESS.withName("type"),
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
     * Allocate a new {@link Mpeg2Picture}
     * @return A new, uninitialized @{link Mpeg2Picture}
     */
    public static Mpeg2Picture allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Mpeg2Picture newInstance = new Mpeg2Picture(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Mpeg2Picture proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Mpeg2Picture(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpeg2_picture_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create new {@link Mpeg2Picture}
     */
    public Mpeg2Picture() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets private data set on the picture via
     * gst_mpeg2_picture_set_user_data() previously.
     * @return The previously set user_data
     */
    public @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpeg2_picture_get_user_data.invokeExact(
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
            DowncallHandles.gst_mpeg2_picture_set_user_data.invokeExact(
                    handle(),
                    (Addressable) userData,
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_mpeg2_picture_new = Interop.downcallHandle(
            "gst_mpeg2_picture_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpeg2_picture_get_user_data = Interop.downcallHandle(
            "gst_mpeg2_picture_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_mpeg2_picture_set_user_data = Interop.downcallHandle(
            "gst_mpeg2_picture_set_user_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private Mpeg2Picture struct;
        
         /**
         * A {@link Mpeg2Picture.Build} object constructs a {@link Mpeg2Picture} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = Mpeg2Picture.allocate();
        }
        
         /**
         * Finish building the {@link Mpeg2Picture} struct.
         * @return A new instance of {@code Mpeg2Picture} with the fields 
         *         that were set in the Build object.
         */
        public Mpeg2Picture construct() {
            return struct;
        }
        
        public Build setParent(org.gstreamer.gst.MiniObject parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Build setSystemFrameNumber(int systemFrameNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("system_frame_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), systemFrameNumber);
            return this;
        }
        
        public Build setNeededForOutput(boolean neededForOutput) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("needed_for_output"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), neededForOutput ? 1 : 0);
            return this;
        }
        
        public Build setFirstField(org.gstreamer.codecs.Mpeg2Picture firstField) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("first_field"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (firstField == null ? MemoryAddress.NULL : firstField.handle()));
            return this;
        }
        
        public Build setBufferFlags(org.gstreamer.video.VideoBufferFlags bufferFlags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("buffer_flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (bufferFlags == null ? MemoryAddress.NULL : bufferFlags.getValue()));
            return this;
        }
        
        public Build setPicOrderCnt(int picOrderCnt) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pic_order_cnt"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), picOrderCnt);
            return this;
        }
        
        public Build setTsn(int tsn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("tsn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), tsn);
            return this;
        }
        
        public Build setStructure(java.lang.foreign.MemoryAddress structure) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("structure"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (structure == null ? MemoryAddress.NULL : (Addressable) structure));
            return this;
        }
        
        public Build setType(java.lang.foreign.MemoryAddress type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : (Addressable) type));
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
