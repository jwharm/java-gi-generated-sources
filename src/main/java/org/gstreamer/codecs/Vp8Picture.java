package org.gstreamer.codecs;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Vp8Picture extends Struct {
    
    static {
        GstCodecs.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVp8Picture";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.C_LONG.withName("pts"),
            Interop.valueLayout.C_INT.withName("system_frame_number"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("frame_hdr"),
            Interop.valueLayout.ADDRESS.withName("data"),
            Interop.valueLayout.C_LONG.withName("size"),
            Interop.valueLayout.ADDRESS.withName("user_data"),
            Interop.valueLayout.ADDRESS.withName("notify")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Vp8Picture}
     * @return A new, uninitialized @{link Vp8Picture}
     */
    public static Vp8Picture allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Vp8Picture newInstance = new Vp8Picture(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gstreamer.gst.MiniObject getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gstreamer.gst.MiniObject.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gstreamer.gst.MiniObject parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
    }
    
    /**
     * Get the value of the field {@code pts}
     * @return The value of the field {@code pts}
     */
    public org.gstreamer.gst.ClockTime getPts() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pts"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Change the value of the field {@code pts}
     * @param pts The new value of the field {@code pts}
     */
    public void setPts(org.gstreamer.gst.ClockTime pts) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pts"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pts == null ? MemoryAddress.NULL : pts.getValue().longValue()));
    }
    
    /**
     * Get the value of the field {@code system_frame_number}
     * @return The value of the field {@code system_frame_number}
     */
    public int getSystemFrameNumber() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("system_frame_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code system_frame_number}
     * @param systemFrameNumber The new value of the field {@code system_frame_number}
     */
    public void setSystemFrameNumber(int systemFrameNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("system_frame_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), systemFrameNumber);
    }
    
    /**
     * Get the value of the field {@code frame_hdr}
     * @return The value of the field {@code frame_hdr}
     */
    public java.lang.foreign.MemoryAddress getFrameHdr() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_hdr"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code frame_hdr}
     * @param frameHdr The new value of the field {@code frame_hdr}
     */
    public void setFrameHdr(java.lang.foreign.MemoryAddress frameHdr) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("frame_hdr"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (frameHdr == null ? MemoryAddress.NULL : (Addressable) frameHdr));
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public PointerByte getData() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void setData(PointerByte data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
    }
    
    /**
     * Get the value of the field {@code size}
     * @return The value of the field {@code size}
     */
    public long getSize() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code size}
     * @param size The new value of the field {@code size}
     */
    public void setSize(long size) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
    }
    
    /**
     * Get the value of the field {@code user_data}
     * @return The value of the field {@code user_data}
     */
    public java.lang.foreign.MemoryAddress getUserData_() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code user_data}
     * @param userData The new value of the field {@code user_data}
     */
    public void setUserData_(java.lang.foreign.MemoryAddress userData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("user_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (userData == null ? MemoryAddress.NULL : (Addressable) userData));
    }
    
    /**
     * Get the value of the field {@code notify}
     * @return The value of the field {@code notify}
     */
    public org.gtk.glib.DestroyNotify getNotify() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("notify"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Change the value of the field {@code notify}
     * @param notify The new value of the field {@code notify}
     */
    public void setNotify(org.gtk.glib.DestroyNotify notify) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("notify"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
    }
    
    /**
     * Create a Vp8Picture proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Vp8Picture(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Vp8Picture> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Vp8Picture(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vp8_picture_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create new {@link Vp8Picture}
     */
    public Vp8Picture() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets private data set on the picture via
     * gst_vp8_picture_set_user_data() previously.
     * @return The previously set user_data
     */
    public @Nullable java.lang.foreign.MemoryAddress getUserData() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_vp8_picture_get_user_data.invokeExact(
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
            DowncallHandles.gst_vp8_picture_set_user_data.invokeExact(
                    handle(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) notify.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_vp8_picture_new = Interop.downcallHandle(
            "gst_vp8_picture_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vp8_picture_get_user_data = Interop.downcallHandle(
            "gst_vp8_picture_get_user_data",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_vp8_picture_set_user_data = Interop.downcallHandle(
            "gst_vp8_picture_set_user_data",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link Vp8Picture.Builder} object constructs a {@link Vp8Picture} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Vp8Picture.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Vp8Picture struct;
        
        private Builder() {
            struct = Vp8Picture.allocate();
        }
        
         /**
         * Finish building the {@link Vp8Picture} struct.
         * @return A new instance of {@code Vp8Picture} with the fields 
         *         that were set in the Builder object.
         */
        public Vp8Picture build() {
            return struct;
        }
        
        public Builder setParent(org.gstreamer.gst.MiniObject parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
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
        
        public Builder setFrameHdr(java.lang.foreign.MemoryAddress frameHdr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("frame_hdr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (frameHdr == null ? MemoryAddress.NULL : (Addressable) frameHdr));
            return this;
        }
        
        public Builder setData(PointerByte data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : data.handle()));
            return this;
        }
        
        public Builder setSize(long size) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), size);
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
