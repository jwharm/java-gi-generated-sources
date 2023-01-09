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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Mpeg2Picture}
     * @return A new, uninitialized @{link Mpeg2Picture}
     */
    public static Mpeg2Picture allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Mpeg2Picture newInstance = new Mpeg2Picture(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Mpeg2Picture proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Mpeg2Picture(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Mpeg2Picture> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Mpeg2Picture(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Gets private data set on the picture via
     * gst_mpeg2_picture_set_user_data() previously.
     * @return The previously set user_data
     */
    public @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_mpeg2_picture_get_user_data.invokeExact(handle());
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
            DowncallHandles.gst_mpeg2_picture_set_user_data.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
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
     * A {@link Mpeg2Picture.Builder} object constructs a {@link Mpeg2Picture} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Mpeg2Picture.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Mpeg2Picture struct;
        
        private Builder() {
            struct = Mpeg2Picture.allocate();
        }
        
        /**
         * Finish building the {@link Mpeg2Picture} struct.
         * @return A new instance of {@code Mpeg2Picture} with the fields 
         *         that were set in the Builder object.
         */
        public Mpeg2Picture build() {
            return struct;
        }
        
        public Builder setParent(org.gstreamer.gst.MiniObject parent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
        
        public Builder setSystemFrameNumber(int systemFrameNumber) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("system_frame_number"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), systemFrameNumber);
                return this;
            }
        }
        
        public Builder setNeededForOutput(boolean neededForOutput) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("needed_for_output"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), Marshal.booleanToInteger.marshal(neededForOutput, null).intValue());
                return this;
            }
        }
        
        public Builder setFirstField(org.gstreamer.codecs.Mpeg2Picture firstField) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("first_field"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (firstField == null ? MemoryAddress.NULL : firstField.handle()));
                return this;
            }
        }
        
        public Builder setBufferFlags(org.gstreamer.video.VideoBufferFlags bufferFlags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("buffer_flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (bufferFlags == null ? MemoryAddress.NULL : bufferFlags.getValue()));
                return this;
            }
        }
        
        public Builder setPicOrderCnt(int picOrderCnt) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pic_order_cnt"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), picOrderCnt);
                return this;
            }
        }
        
        public Builder setTsn(int tsn) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("tsn"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), tsn);
                return this;
            }
        }
        
        public Builder setStructure(java.lang.foreign.MemoryAddress structure) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("structure"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (structure == null ? MemoryAddress.NULL : (Addressable) structure));
                return this;
            }
        }
        
        public Builder setType(java.lang.foreign.MemoryAddress type) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : (Addressable) type));
                return this;
            }
        }
        
        public Builder setUserData(java.lang.foreign.MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
                return this;
            }
        }
        
        public Builder setNotify(org.gtk.glib.DestroyNotify notify) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
                return this;
            }
        }
    }
}
