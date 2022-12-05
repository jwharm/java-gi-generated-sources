package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstGLEGL namespace.
 */
public final class GstGLEGL {
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    public static final java.lang.String GL_DISPLAY_EGL_NAME = "gst.gl.display.egl";
    
    /**
     * The name of the GL Memory EGL allocator
     */
    public static final java.lang.String GL_MEMORY_EGL_ALLOCATOR_NAME = "GLMemoryEGL";
    
    public static @NotNull java.lang.String eglGetErrorString(int err) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_egl_get_error_string.invokeExact(
                    err);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
    public static @NotNull org.gstreamer.gl.egl.EGLImage eglImageFromDmabuf(@NotNull org.gstreamer.gl.GLContext context, int dmabuf, @NotNull org.gstreamer.video.VideoInfo inInfo, int plane, long offset) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(inInfo, "Parameter 'inInfo' must not be null");
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
        return new org.gstreamer.gl.egl.EGLImage(RESULT, Ownership.FULL);
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
    public static @NotNull org.gstreamer.gl.egl.EGLImage eglImageFromDmabufDirect(@NotNull org.gstreamer.gl.GLContext context, PointerInteger fd, PointerLong offset, @NotNull org.gstreamer.video.VideoInfo inInfo) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(fd, "Parameter 'fd' must not be null");
        java.util.Objects.requireNonNull(offset, "Parameter 'offset' must not be null");
        java.util.Objects.requireNonNull(inInfo, "Parameter 'inInfo' must not be null");
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
        return new org.gstreamer.gl.egl.EGLImage(RESULT, Ownership.FULL);
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
    public static @NotNull org.gstreamer.gl.egl.EGLImage eglImageFromDmabufDirectTarget(@NotNull org.gstreamer.gl.GLContext context, PointerInteger fd, PointerLong offset, @NotNull org.gstreamer.video.VideoInfo inInfo, @NotNull org.gstreamer.gl.GLTextureTarget target) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(fd, "Parameter 'fd' must not be null");
        java.util.Objects.requireNonNull(offset, "Parameter 'offset' must not be null");
        java.util.Objects.requireNonNull(inInfo, "Parameter 'inInfo' must not be null");
        java.util.Objects.requireNonNull(target, "Parameter 'target' must not be null");
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
        return new org.gstreamer.gl.egl.EGLImage(RESULT, Ownership.FULL);
    }
    
    public static @NotNull org.gstreamer.gl.egl.EGLImage eglImageFromTexture(@NotNull org.gstreamer.gl.GLContext context, @NotNull org.gstreamer.gl.GLMemory glMem, PointerLong attribs) {
        java.util.Objects.requireNonNull(context, "Parameter 'context' must not be null");
        java.util.Objects.requireNonNull(glMem, "Parameter 'glMem' must not be null");
        java.util.Objects.requireNonNull(attribs, "Parameter 'attribs' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_egl_image_from_texture.invokeExact(
                    context.handle(),
                    glMem.handle(),
                    attribs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.egl.EGLImage(RESULT, Ownership.FULL);
    }
    
    /**
     * Initializes the GL Memory allocator. It is safe to call this function
     * multiple times.  This must be called before any other GstGLMemoryEGL operation.
     */
    public static void glMemoryEglInitOnce() {
        try {
            DowncallHandles.gst_gl_memory_egl_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static boolean isGlMemoryEgl(@NotNull org.gstreamer.gst.Memory mem) {
        java.util.Objects.requireNonNull(mem, "Parameter 'mem' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_is_gl_memory_egl.invokeExact(
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_egl_get_error_string = Interop.downcallHandle(
            "gst_egl_get_error_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
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
        
        private static final MethodHandle gst_gl_memory_egl_init_once = Interop.downcallHandle(
            "gst_gl_memory_egl_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_is_gl_memory_egl = Interop.downcallHandle(
            "gst_is_gl_memory_egl",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
        
        public static void cbEGLImageDestroyNotify(MemoryAddress image, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EGLImageDestroyNotify) Interop.signalRegistry.get(HASH);
            HANDLER.onEGLImageDestroyNotify(new org.gstreamer.gl.egl.EGLImage(image, Ownership.NONE));
        }
    }
}
