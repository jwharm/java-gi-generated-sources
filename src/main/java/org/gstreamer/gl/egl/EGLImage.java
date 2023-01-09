package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link EGLImage} represents and holds an {@code EGLImage} handle.
 * <p>
 * A {@link EGLImage} can be created from a dmabuf with gst_egl_image_from_dmabuf(),
 * or gst_egl_image_from_dmabuf_direct(), or {@link GLMemoryEGL} provides a
 * {@link org.gstreamer.gst.Allocator} to allocate {@code EGLImage}'s bound to and OpenGL texture.
 */
public class EGLImage extends Struct {
    
    static {
        GstGLEGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstEGLImage";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.MiniObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("context"),
            Interop.valueLayout.ADDRESS.withName("image"),
            Interop.valueLayout.C_INT.withName("format"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("destroy_data"),
            Interop.valueLayout.ADDRESS.withName("destroy_notify"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link EGLImage}
     * @return A new, uninitialized @{link EGLImage}
     */
    public static EGLImage allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        EGLImage newInstance = new EGLImage(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a EGLImage proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected EGLImage(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, EGLImage> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new EGLImage(input);
    
    private static MemoryAddress constructNewWrapped(org.gstreamer.gl.GLContext context, @Nullable java.lang.foreign.MemoryAddress image, org.gstreamer.gl.GLFormat format, org.gstreamer.gl.egl.EGLImageDestroyNotify userDataDestroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_egl_image_new_wrapped.invokeExact(
                    context.handle(),
                    (Addressable) (image == null ? MemoryAddress.NULL : (Addressable) image),
                    format.getValue(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) userDataDestroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    public static EGLImage newWrapped(org.gstreamer.gl.GLContext context, @Nullable java.lang.foreign.MemoryAddress image, org.gstreamer.gl.GLFormat format, org.gstreamer.gl.egl.EGLImageDestroyNotify userDataDestroy) {
        var RESULT = constructNewWrapped(context, image, format, userDataDestroy);
        var OBJECT = org.gstreamer.gl.egl.EGLImage.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public boolean exportDmabuf(PointerInteger fd, PointerInteger stride, PointerLong offset) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_egl_image_export_dmabuf.invokeExact(
                    handle(),
                    fd.handle(),
                    stride.handle(),
                    offset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public @Nullable java.lang.foreign.MemoryAddress getImage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_egl_image_get_image.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates an EGL image that imports the dmabuf FD. The dmabuf data
     * is passed as RGBA data. Shaders later take this "RGBA" data and
     * convert it from its true format (described by in_info) to actual
     * RGBA output. For example, with I420, three EGL images are created,
     * one for each plane, each EGL image with a single-channel R format.
     * With NV12, two EGL images are created, one with R format, one
     * with RG format etc.
     * @param context a {@link org.gstreamer.gl.GLContext} (must be an EGL context)
     * @param dmabuf the DMA-Buf file descriptor
     * @param inInfo the {@link org.gstreamer.video.VideoInfo} in {@code dmabuf}
     * @param plane the plane in {@code in_info} to create and {@link EGLImage} for
     * @param offset the byte-offset in the data
     * @return a {@link EGLImage} wrapping {@code dmabuf} or {@code null} on failure
     */
    public static org.gstreamer.gl.egl.EGLImage fromDmabuf(org.gstreamer.gl.GLContext context, int dmabuf, org.gstreamer.video.VideoInfo inInfo, int plane, long offset) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_egl_image_from_dmabuf.invokeExact(
                    context.handle(),
                    dmabuf,
                    inInfo.handle(),
                    plane,
                    offset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gl.egl.EGLImage.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates an EGL image that imports the dmabuf FD. The dmabuf data
     * is passed directly as the format described in in_info. This is
     * useful if the hardware is capable of performing color space conversions
     * internally. The appropriate DRM format is picked, and the EGL image
     * is created with this DRM format.
     * <p>
     * Another notable difference to gst_egl_image_from_dmabuf()
     * is that this function creates one EGL image for all planes, not one for
     * a single plane.
     * @param context a {@link org.gstreamer.gl.GLContext} (must be an EGL context)
     * @param fd Array of DMABuf file descriptors
     * @param offset Array of offsets, relative to the DMABuf
     * @param inInfo the {@link org.gstreamer.video.VideoInfo}
     * @return a {@link EGLImage} wrapping {@code dmabuf} or {@code null} on failure
     */
    public static org.gstreamer.gl.egl.EGLImage fromDmabufDirect(org.gstreamer.gl.GLContext context, PointerInteger fd, PointerLong offset, org.gstreamer.video.VideoInfo inInfo) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_egl_image_from_dmabuf_direct.invokeExact(
                    context.handle(),
                    fd.handle(),
                    offset.handle(),
                    inInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gl.egl.EGLImage.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates an EGL image that imports the dmabuf FD. The dmabuf data
     * is passed directly as the format described in in_info. This is
     * useful if the hardware is capable of performing color space conversions
     * internally. The appropriate DRM format is picked, and the EGL image
     * is created with this DRM format.
     * <p>
     * Another notable difference to gst_egl_image_from_dmabuf()
     * is that this function creates one EGL image for all planes, not one for
     * a single plane.
     * @param context a {@link org.gstreamer.gl.GLContext} (must be an EGL context)
     * @param fd Array of DMABuf file descriptors
     * @param offset Array of offsets, relative to the DMABuf
     * @param inInfo the {@link org.gstreamer.video.VideoInfo}
     * @param target GL texture target this GstEGLImage is intended for
     * @return a {@link EGLImage} wrapping {@code dmabuf} or {@code null} on failure
     */
    public static org.gstreamer.gl.egl.EGLImage fromDmabufDirectTarget(org.gstreamer.gl.GLContext context, PointerInteger fd, PointerLong offset, org.gstreamer.video.VideoInfo inInfo, org.gstreamer.gl.GLTextureTarget target) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_egl_image_from_dmabuf_direct_target.invokeExact(
                    context.handle(),
                    fd.handle(),
                    offset.handle(),
                    inInfo.handle(),
                    target.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gl.egl.EGLImage.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public static org.gstreamer.gl.egl.EGLImage fromTexture(org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLMemory glMem, PointerLong attribs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_egl_image_from_texture.invokeExact(
                    context.handle(),
                    glMem.handle(),
                    attribs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gl.egl.EGLImage.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_egl_image_new_wrapped = Interop.downcallHandle(
                "gst_egl_image_new_wrapped",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_egl_image_export_dmabuf = Interop.downcallHandle(
                "gst_egl_image_export_dmabuf",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_egl_image_get_image = Interop.downcallHandle(
                "gst_egl_image_get_image",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_egl_image_from_dmabuf = Interop.downcallHandle(
                "gst_egl_image_from_dmabuf",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_egl_image_from_dmabuf_direct = Interop.downcallHandle(
                "gst_egl_image_from_dmabuf_direct",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_egl_image_from_dmabuf_direct_target = Interop.downcallHandle(
                "gst_egl_image_from_dmabuf_direct_target",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_egl_image_from_texture = Interop.downcallHandle(
                "gst_egl_image_from_texture",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link EGLImage.Builder} object constructs a {@link EGLImage} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link EGLImage.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final EGLImage struct;
        
        private Builder() {
            struct = EGLImage.allocate();
        }
        
        /**
         * Finish building the {@link EGLImage} struct.
         * @return A new instance of {@code EGLImage} with the fields 
         *         that were set in the Builder object.
         */
        public EGLImage build() {
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
        
        public Builder setContext(org.gstreamer.gl.GLContext context) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("context"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (context == null ? MemoryAddress.NULL : context.handle()));
                return this;
            }
        }
        
        public Builder setImage(java.lang.foreign.MemoryAddress image) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("image"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (image == null ? MemoryAddress.NULL : (Addressable) image));
                return this;
            }
        }
        
        public Builder setFormat(org.gstreamer.gl.GLFormat format) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("format"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (format == null ? MemoryAddress.NULL : format.getValue()));
                return this;
            }
        }
        
        public Builder setDestroyData(java.lang.foreign.MemoryAddress destroyData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("destroy_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (destroyData == null ? MemoryAddress.NULL : (Addressable) destroyData));
                return this;
            }
        }
        
        public Builder setDestroyNotify(org.gstreamer.gl.egl.EGLImageDestroyNotify destroyNotify) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("destroy_notify"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (destroyNotify == null ? MemoryAddress.NULL : (Addressable) destroyNotify.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] Padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (Padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Padding, false, SCOPE)));
                return this;
            }
        }
    }
}
