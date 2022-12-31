package org.gstreamer.gl.egl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstGLEGL namespace.
 */
public final class GstGLEGL {
    
    private static boolean javagi$initialized = false;
    
    @ApiStatus.Internal
    public static void javagi$ensureInitialized() {
        if (!javagi$initialized) {
            javagi$initialized = true;
            JavaGITypeRegister.register();
        }
    }
    
    public static final java.lang.String GL_DISPLAY_EGL_NAME = "gst.gl.display.egl";
    
    /**
     * The name of the GL Memory EGL allocator
     */
    public static final java.lang.String GL_MEMORY_EGL_ALLOCATOR_NAME = "GLMemoryEGL";
    
    public static java.lang.String eglGetErrorString(int err) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_egl_get_error_string.invokeExact(
                    err);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
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
    public static org.gstreamer.gl.egl.EGLImage eglImageFromDmabuf(org.gstreamer.gl.GLContext context, int dmabuf, org.gstreamer.video.VideoInfo inInfo, int plane, long offset) {
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
        return org.gstreamer.gl.egl.EGLImage.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public static org.gstreamer.gl.egl.EGLImage eglImageFromDmabufDirect(org.gstreamer.gl.GLContext context, PointerInteger fd, PointerLong offset, org.gstreamer.video.VideoInfo inInfo) {
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
        return org.gstreamer.gl.egl.EGLImage.fromAddress.marshal(RESULT, Ownership.FULL);
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
    public static org.gstreamer.gl.egl.EGLImage eglImageFromDmabufDirectTarget(org.gstreamer.gl.GLContext context, PointerInteger fd, PointerLong offset, org.gstreamer.video.VideoInfo inInfo, org.gstreamer.gl.GLTextureTarget target) {
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
        return org.gstreamer.gl.egl.EGLImage.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public static org.gstreamer.gl.egl.EGLImage eglImageFromTexture(org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLMemory glMem, PointerLong attribs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_egl_image_from_texture.invokeExact(
                    context.handle(),
                    glMem.handle(),
                    attribs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.egl.EGLImage.fromAddress.marshal(RESULT, Ownership.FULL);
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
    
    public static boolean isGlMemoryEgl(org.gstreamer.gst.Memory mem) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_is_gl_memory_egl.invokeExact(
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    }
}
