package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GstGL namespace.
 */
public final class GstGL {
    
    static {
        System.loadLibrary("gstgl-1.0");
    }
    
    private static boolean javagi$initialized = false;
    
    @ApiStatus.Internal
    public static void javagi$ensureInitialized() {
        if (!javagi$initialized) {
            javagi$initialized = true;
            JavaGITypeRegister.register();
        }
    }
    
    /**
     * An option that can be activated on bufferpools to request OpenGL
     * synchronization metadata on buffers from the pool.
     */
    public static final java.lang.String BUFFER_POOL_OPTION_GL_SYNC_META = "GstBufferPoolOptionGLSyncMeta";
    
    /**
     * String used for {@link GLTextureTarget#_2D} as a {@link org.gstreamer.gst.BufferPool} pool option
     */
    public static final java.lang.String BUFFER_POOL_OPTION_GL_TEXTURE_TARGET_2D = "GstBufferPoolOptionGLTextureTarget2D";
    
    /**
     * String used for {@link GLTextureTarget#EXTERNAL_OES} as a {@link org.gstreamer.gst.BufferPool} pool option
     */
    public static final java.lang.String BUFFER_POOL_OPTION_GL_TEXTURE_TARGET_EXTERNAL_OES = "GstBufferPoolOptionGLTextureTargetExternalOES";
    
    /**
     * String used for {@link GLTextureTarget#RECTANGLE} as a {@link org.gstreamer.gst.BufferPool} pool option
     */
    public static final java.lang.String BUFFER_POOL_OPTION_GL_TEXTURE_TARGET_RECTANGLE = "GstBufferPoolOptionGLTextureTargetRectangle";
    
    /**
     * Name of the caps feature indicating the use of GL buffers
     */
    public static final java.lang.String CAPS_FEATURE_MEMORY_GL_BUFFER = "memory:GLBuffer";
    
    /**
     * Name of the caps feature for indicating the use of {@link GLMemory}
     */
    public static final java.lang.String CAPS_FEATURE_MEMORY_GL_MEMORY = "memory:GLMemory";
    
    /**
     * GL Allocation flag indicating that the implementation should allocate the
     * necessary resources.
     */
    public static final int GL_ALLOCATION_PARAMS_ALLOC_FLAG_ALLOC = 1;
    
    /**
     * GL allocation flag indicating the allocation of a GL buffer.
     */
    public static final int GL_ALLOCATION_PARAMS_ALLOC_FLAG_BUFFER = 16;
    
    /**
     * Values &gt;= than {@code GST_GL_ALLOCATION_PARAMS_ALLOC_FLAG_USER} can be used for
     * user-defined purposes.
     */
    public static final int GL_ALLOCATION_PARAMS_ALLOC_FLAG_USER = 65536;
    
    /**
     * GL allocation flag indicating the allocation of 2D video frames
     */
    public static final int GL_ALLOCATION_PARAMS_ALLOC_FLAG_VIDEO = 8;
    
    /**
     * GL Allocation flag for using the provided GPU handle as storage.
     */
    public static final int GL_ALLOCATION_PARAMS_ALLOC_FLAG_WRAP_GPU_HANDLE = 4;
    
    /**
     * GL Allocation flag for using the provided system memory data as storage.
     */
    public static final int GL_ALLOCATION_PARAMS_ALLOC_FLAG_WRAP_SYSMEM = 2;
    
    /**
     * The name for {@link GLAPI#GLES1} used in various places
     */
    public static final java.lang.String GL_API_GLES1_NAME = "gles1";
    
    /**
     * The name for {@link GLAPI#GLES2} used in various places
     */
    public static final java.lang.String GL_API_GLES2_NAME = "gles2";
    
    /**
     * The name for {@link GLAPI#OPENGL3} used in various places
     */
    public static final java.lang.String GL_API_OPENGL3_NAME = "opengl3";
    
    /**
     * The name for {@link GLAPI#OPENGL} used in various places
     */
    public static final java.lang.String GL_API_OPENGL_NAME = "opengl";
    
    /**
     * The name of the GL buffer allocator
     */
    public static final java.lang.String GL_BASE_MEMORY_ALLOCATOR_NAME = "GLBaseMemory";
    
    /**
     * The name of the GL buffer allocator
     */
    public static final java.lang.String GL_BUFFER_ALLOCATOR_NAME = "GLBuffer";
    
    public static final java.lang.String GL_COLOR_CONVERT_EXT_FORMATS = ", BGR10A2_LE, RGB10A2_LE, P010_10LE, P012_LE, P016_LE, Y212_LE, Y412_LE";
    
    /**
     * The currently supported formats that can be converted
     */
    public static final java.lang.String GL_COLOR_CONVERT_FORMATS = "{ RGBA, RGB, RGBx, BGR, BGRx, BGRA, xRGB, xBGR, ARGB, ABGR, GBRA, GBR, RGBP, BGRP, Y444, I420, YV12, Y42B, Y41B, NV12, NV21, NV16, NV61, YUY2, UYVY, Y210, AYUV, VUYA, Y410, GRAY8, GRAY16_LE, GRAY16_BE, RGB16, BGR16, ARGB64, A420, AV12";
    
    /**
     * The currently supported {@link org.gstreamer.gst.Caps} that can be converted
     */
    public static final java.lang.String GL_COLOR_CONVERT_VIDEO_CAPS = "video/x-raw(";
    
    /**
     * The canonical name of a {@link org.gstreamer.gst.Structure} that contains a configuration for a
     * {@link GLContext}.
     */
    public static final java.lang.String GL_CONFIG_STRUCTURE_NAME = "gst-gl-context-config";
    
    public static final java.lang.String GL_CONTEXT_TYPE_CGL = "gst.gl.context.CGL";
    
    public static final java.lang.String GL_CONTEXT_TYPE_EAGL = "gst.gl.context.EAGL";
    
    public static final java.lang.String GL_CONTEXT_TYPE_EGL = "gst.gl.context.EGL";
    
    public static final java.lang.String GL_CONTEXT_TYPE_GLX = "gst.gl.context.GLX";
    
    public static final java.lang.String GL_CONTEXT_TYPE_WGL = "gst.gl.context.WGL";
    
    /**
     * The name used in {@link org.gstreamer.gst.Context} queries for requesting a {@link GLDisplay}
     */
    public static final java.lang.String GL_DISPLAY_CONTEXT_TYPE = "gst.gl.GLDisplay";
    
    /**
     * The name of the GL memory allocator
     */
    public static final java.lang.String GL_MEMORY_ALLOCATOR_NAME = "GLMemory";
    
    /**
     * The name of the GL Memory PBO allocator
     */
    public static final java.lang.String GL_MEMORY_PBO_ALLOCATOR_NAME = "GLMemoryPBO";
    
    public static final java.lang.String GL_MEMORY_VIDEO_EXT_FORMATS = ", BGR10A2_LE, RGB10A2_LE, P010_10LE, P012_LE, P016_LE, Y212_LE, Y412_LE";
    
    /**
     * List of video formats that are supported by {@link GLMemory}
     */
    public static final java.lang.String GL_MEMORY_VIDEO_FORMATS_STR = "{ RGBA, BGRA, RGBx, BGRx, ARGB, ABGR, xRGB, xBGR, GBRA, GBR, RGBP, BGRP, RGB, BGR, RGB16, BGR16, AYUV, VUYA, Y410, I420, YV12, NV12, NV21, NV16, NV61, YUY2, UYVY, Y210, Y41B, Y42B, Y444, GRAY8, GRAY16_LE, GRAY16_BE, ARGB64, A420, AV12";
    
    /**
     * The name of the GL renderbuffer allocator
     */
    public static final java.lang.String GL_RENDERBUFFER_ALLOCATOR_NAME = "GLRenderbuffer";
    
    /**
     * String used for {@link GLTextureTarget#_2D} in things like caps values
     */
    public static final java.lang.String GL_TEXTURE_TARGET_2D_STR = "2D";
    
    /**
     * String used for {@link GLTextureTarget#EXTERNAL_OES} in things like caps values
     */
    public static final java.lang.String GL_TEXTURE_TARGET_EXTERNAL_OES_STR = "external-oes";
    
    /**
     * String used for {@link GLTextureTarget#RECTANGLE} in things like caps values
     */
    public static final java.lang.String GL_TEXTURE_TARGET_RECTANGLE_STR = "rectangle";
    
    /**
     * Flag indicating that we should map the GL object instead of to system memory.
     * <p>
     * Combining {@code GST_MAP_GL} with {@code GST_MAP_WRITE} has the same semantics as though
     * you are writing to OpenGL. Conversely, combining {@code GST_MAP_GL} with
     * {@code GST_MAP_READ} has the same semantics as though you are reading from OpenGL.
     */
    public static final int MAP_GL = 131072;
    
    public static org.gstreamer.gl.GLSyncMeta bufferAddGlSyncMeta(org.gstreamer.gl.GLContext context, org.gstreamer.gst.Buffer buffer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_gl_sync_meta.invokeExact(
                    context.handle(),
                    buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    public static org.gstreamer.gl.GLSyncMeta bufferAddGlSyncMetaFull(org.gstreamer.gl.GLContext context, org.gstreamer.gst.Buffer buffer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_gl_sync_meta_full.invokeExact(
                    context.handle(),
                    buffer.handle(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLSyncMeta.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    public static org.gstreamer.gl.GLAllocationParams bufferPoolConfigGetGlAllocationParams(org.gstreamer.gst.Structure config) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_pool_config_get_gl_allocation_params.invokeExact(
                    config.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLAllocationParams.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Sets {@code params} on {@code config}
     * @param config a buffer pool config
     * @param params a {@link GLAllocationParams}
     */
    public static void bufferPoolConfigSetGlAllocationParams(org.gstreamer.gst.Structure config, org.gstreamer.gl.GLAllocationParams params) {
        try {
            DowncallHandles.gst_buffer_pool_config_set_gl_allocation_params.invokeExact(
                    config.handle(),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static boolean contextGetGlDisplay(org.gstreamer.gst.Context context, Out<org.gstreamer.gl.GLDisplay> display) {
        MemorySegment displayPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_context_get_gl_display.invokeExact(
                    context.handle(),
                    (Addressable) displayPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        display.set((org.gstreamer.gl.GLDisplay) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.gl.GLDisplay.fromAddress).marshal(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets {@code display} on {@code context}
     * @param context a {@link org.gstreamer.gst.Context}
     * @param display resulting {@link GLDisplay}
     */
    public static void contextSetGlDisplay(org.gstreamer.gst.Context context, org.gstreamer.gl.GLDisplay display) {
        try {
            DowncallHandles.gst_context_set_gl_display.invokeExact(
                    context.handle(),
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static org.gstreamer.gl.GLAPI glApiFromString(java.lang.String apiS) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_api_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(apiS, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLAPI(RESULT);
    }
    
    public static java.lang.String glApiToString(org.gstreamer.gl.GLAPI api) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_api_to_string.invokeExact(
                    api.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Free with gst_gl_async_debug_free()
     * @return a new {@link GLAsyncDebug}
     */
    public static org.gstreamer.gl.GLAsyncDebug glAsyncDebugNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_async_debug_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLAsyncDebug.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    public static org.gstreamer.gl.GLBaseMemory glBaseMemoryAlloc(org.gstreamer.gl.GLBaseMemoryAllocator allocator, org.gstreamer.gl.GLAllocationParams params) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_base_memory_alloc.invokeExact(
                    allocator.handle(),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLBaseMemory.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public static org.gtk.glib.Quark glBaseMemoryErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_base_memory_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Initializes the GL Base Memory allocator. It is safe to call this function
     * multiple times.  This must be called before any other GstGLBaseMemory operation.
     */
    public static void glBaseMemoryInitOnce() {
        try {
            DowncallHandles.gst_gl_base_memory_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes the GL Buffer allocator. It is safe to call this function
     * multiple times.  This must be called before any other {@link GLBuffer} operation.
     */
    public static void glBufferInitOnce() {
        try {
            DowncallHandles.gst_gl_buffer_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static boolean glCheckExtension(java.lang.String name, java.lang.String ext) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_check_extension.invokeExact(
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(ext, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static @Nullable java.lang.String glConfigCaveatToString(org.gstreamer.gl.GLConfigCaveat caveat) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_config_caveat_to_string.invokeExact(
                    caveat.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public static @Nullable java.lang.String glConfigSurfaceTypeToString(org.gstreamer.gl.GLConfigSurfaceType surfaceType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_config_surface_type_to_string.invokeExact(
                    surfaceType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public static org.gtk.glib.Quark glContextErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static void glElementPropagateDisplayContext(org.gstreamer.gst.Element element, org.gstreamer.gl.GLDisplay display) {
        try {
            DowncallHandles.gst_gl_element_propagate_display_context.invokeExact(
                    element.handle(),
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Perform the steps necessary for retrieving a {@link GLDisplay} and (optionally)
     * an application provided {@link GLContext} from the surrounding elements or from
     * the application using the {@link org.gstreamer.gst.Context} mechanism.
     * <p>
     * If the contents of {@code display_ptr} or {@code other_context_ptr} are not {@code null}, then no
     * {@link org.gstreamer.gst.Context} query is necessary for {@link GLDisplay} or {@link GLContext} retrieval
     * or is performed.
     * <p>
     * This performs {@link org.gstreamer.gst.Context} queries (if necessary) for a winsys display
     * connection with {@code GST_GL_DISPLAY_CONTEXT_TYPE}, "gst.x11.display.handle", and
     * "GstWaylandDisplayHandleContextType" stopping after the first successful
     * retrieval.
     * <p>
     * This also performs a {@link org.gstreamer.gst.Context} query (if necessary) for an optional
     * application provided {@link GLContext} using the name "gst.gl.app_context".
     * The returned {@link GLContext} will be shared with a GStreamer created OpenGL context.
     * @param element the {@link org.gstreamer.gst.Element} running the query
     * @param displayPtr the resulting {@link GLDisplay}
     * @param otherContextPtr the resulting {@link GLContext}
     * @return whether a {@link GLDisplay} exists in {@code display_ptr}
     */
    public static boolean glEnsureElementData(org.gstreamer.gst.Element element, Out<org.gstreamer.gl.GLDisplay> displayPtr, Out<org.gstreamer.gl.GLContext> otherContextPtr) {
        MemorySegment displayPtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment otherContextPtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_ensure_element_data.invokeExact(
                    element.handle(),
                    (Addressable) displayPtrPOINTER.address(),
                    (Addressable) otherContextPtrPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        displayPtr.set((org.gstreamer.gl.GLDisplay) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(displayPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.gl.GLDisplay.fromAddress).marshal(displayPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        otherContextPtr.set((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(otherContextPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.gl.GLContext.fromAddress).marshal(otherContextPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static org.gstreamer.gl.GLFormat glFormatFromVideoInfo(org.gstreamer.gl.GLContext context, org.gstreamer.video.VideoInfo vinfo, int plane) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_format_from_video_info.invokeExact(
                    context.handle(),
                    vinfo.handle(),
                    plane);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLFormat.of(RESULT);
    }
    
    public static boolean glFormatIsSupported(org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLFormat format) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_format_is_supported.invokeExact(
                    context.handle(),
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the unsized format and type from {@code format} for usage in glReadPixels,
     * glTex{Sub}Image<em>, glTexImage</em> and similar functions.
     * @param format the sized internal {@link GLFormat}
     * @param unsizedFormat location for the resulting unsized {@link GLFormat}
     * @param glType location for the resulting GL type
     */
    public static void glFormatTypeFromSizedGlFormat(org.gstreamer.gl.GLFormat format, Out<org.gstreamer.gl.GLFormat> unsizedFormat, Out<Integer> glType) {
        MemorySegment unsizedFormatPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment glTypePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gst_gl_format_type_from_sized_gl_format.invokeExact(
                    format.getValue(),
                    (Addressable) unsizedFormatPOINTER.address(),
                    (Addressable) glTypePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        unsizedFormat.set(org.gstreamer.gl.GLFormat.of(unsizedFormatPOINTER.get(Interop.valueLayout.C_INT, 0)));
        glType.set(glTypePOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    public static int glFormatTypeNBytes(int format, int type) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_format_type_n_bytes.invokeExact(
                    format,
                    type);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the stored 4x4 affine transformation matrix stored in {@code meta} in
     * NDC coordinates. if {@code meta} is NULL, an identity matrix is returned.
     * <p>
     * NDC is a left-handed coordinate system
     * <ul>
     * <li>x - [-1, 1] - +ve X moves right
     * <li>y - [-1, 1] - +ve Y moves up
     * <li>z - [-1, 1] - +ve Z moves into
     * </ul>
     * @param meta a {@link org.gstreamer.video.VideoAffineTransformationMeta}
     * @param matrix result of the 4x4 matrix
     */
    public static void glGetAffineTransformationMetaAsNdc(@Nullable org.gstreamer.video.VideoAffineTransformationMeta meta, Out<float[]> matrix) {
        MemorySegment matrixPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_gl_get_affine_transformation_meta_as_ndc.invokeExact(
                    (Addressable) (meta == null ? MemoryAddress.NULL : meta.handle()),
                    (Addressable) matrixPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        matrix.set(MemorySegment.ofAddress(matrixPOINTER.get(Interop.valueLayout.ADDRESS, 0), 16 * Interop.valueLayout.C_FLOAT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_FLOAT));
    }
    
    /**
     * Retrieve the size in bytes of a video plane of data with a certain alignment
     * @param info a {@link org.gstreamer.video.VideoInfo}
     * @param align a {@link org.gstreamer.video.VideoAlignment} or {@code null}
     * @param plane plane number in {@code info} to retrieve the data size of
     */
    public static long glGetPlaneDataSize(org.gstreamer.video.VideoInfo info, org.gstreamer.video.VideoAlignment align, int plane) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_get_plane_data_size.invokeExact(
                    info.handle(),
                    align.handle(),
                    plane);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static long glGetPlaneStart(org.gstreamer.video.VideoInfo info, org.gstreamer.video.VideoAlignment valign, int plane) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_get_plane_start.invokeExact(
                    info.handle(),
                    valign.handle(),
                    plane);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static boolean glHandleContextQuery(org.gstreamer.gst.Element element, org.gstreamer.gst.Query query, @Nullable org.gstreamer.gl.GLDisplay display, @Nullable org.gstreamer.gl.GLContext context, @Nullable org.gstreamer.gl.GLContext otherContext) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_handle_context_query.invokeExact(
                    element.handle(),
                    query.handle(),
                    (Addressable) (display == null ? MemoryAddress.NULL : display.handle()),
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()),
                    (Addressable) (otherContext == null ? MemoryAddress.NULL : otherContext.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Helper function for implementing {@link org.gstreamer.gst.ElementClass}.set_context() in
     * OpenGL capable elements.
     * <p>
     * Retrieve's the {@link GLDisplay} or {@link GLContext} in {@code context} and places the
     * result in {@code display} or {@code other_context} respectively.
     * @param element a {@link org.gstreamer.gst.Element}
     * @param context a {@link org.gstreamer.gst.Context}
     * @param display location of a {@link GLDisplay}
     * @param otherContext location of a {@link GLContext}
     * @return whether the {@code display} or {@code other_context} could be set successfully
     */
    public static boolean glHandleSetContext(org.gstreamer.gst.Element element, org.gstreamer.gst.Context context, Out<org.gstreamer.gl.GLDisplay> display, Out<org.gstreamer.gl.GLContext> otherContext) {
        MemorySegment displayPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemorySegment otherContextPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_handle_set_context.invokeExact(
                    element.handle(),
                    context.handle(),
                    (Addressable) displayPOINTER.address(),
                    (Addressable) otherContextPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        display.set((org.gstreamer.gl.GLDisplay) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.gl.GLDisplay.fromAddress).marshal(displayPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        otherContext.set((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(otherContextPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.gl.GLContext.fromAddress).marshal(otherContextPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Inserts a marker into a GL debug stream.  Requires the 'gldebugmarker'
     * debug category to be at least {@link org.gstreamer.gst.DebugLevel#FIXME}.
     * @param context a {@link GLContext}
     * @param format a printf-style format string
     * @param varargs arguments form {@code format}
     */
    public static void glInsertDebugMarker(org.gstreamer.gl.GLContext context, java.lang.String format, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_gl_insert_debug_marker.invokeExact(
                    context.handle(),
                    Marshal.stringToAddress.marshal(format, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes the GL Base Texture allocator. It is safe to call this function
     * multiple times.  This must be called before any other GstGLMemory operation.
     */
    public static void glMemoryInitOnce() {
        try {
            DowncallHandles.gst_gl_memory_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void glMemoryPboInitOnce() {
        try {
            DowncallHandles.gst_gl_memory_pbo_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static boolean glMemorySetupBuffer(org.gstreamer.gl.GLMemoryAllocator allocator, org.gstreamer.gst.Buffer buffer, org.gstreamer.gl.GLVideoAllocationParams params, @Nullable org.gstreamer.gl.GLFormat[] texFormats, java.lang.foreign.MemoryAddress[] wrappedData, long nWrappedPointers) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_memory_setup_buffer.invokeExact(
                    allocator.handle(),
                    buffer.handle(),
                    params.handle(),
                    (Addressable) (texFormats == null ? MemoryAddress.NULL : Interop.allocateNativeArray(Enumeration.getValues(texFormats), false)),
                    Interop.allocateNativeArray(wrappedData, false),
                    nWrappedPointers);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Multiplies two 4x4 matrices, {@code a} and {@code b}, and stores the result, a
     * 2-dimensional array of {@code gfloat}, in {@code result}.
     * @param a a 2-dimensional 4x4 array of {@code gfloat}
     * @param b another 2-dimensional 4x4 array of {@code gfloat}
     * @param result the result of the multiplication
     */
    public static void glMultiplyMatrix4(float[] a, float[] b, Out<float[]> result) {
        MemorySegment resultPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        try {
            DowncallHandles.gst_gl_multiply_matrix4.invokeExact(
                    Interop.allocateNativeArray(a, false),
                    Interop.allocateNativeArray(b, false),
                    (Addressable) resultPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        result.set(MemorySegment.ofAddress(resultPOINTER.get(Interop.valueLayout.ADDRESS, 0), 16 * Interop.valueLayout.C_FLOAT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_FLOAT));
    }
    
    public static org.gstreamer.gl.GLPlatform glPlatformFromString(java.lang.String platformS) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_platform_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(platformS, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLPlatform(RESULT);
    }
    
    public static java.lang.String glPlatformToString(org.gstreamer.gl.GLPlatform platform) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_platform_to_string.invokeExact(
                    platform.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Performs a GST_QUERY_CONTEXT query of type "gst.gl.local_context" on all
     * {@code GstPads} in {@code element} of {@code direction} for the local OpenGL context used by
     * GStreamer elements.
     * @param element a {@link org.gstreamer.gst.Element} to query from
     * @param direction the {@link org.gstreamer.gst.PadDirection} to query
     * @param contextPtr location containing the current and/or resulting
     *                      {@link GLContext}
     * @return whether {@code context_ptr} contains a {@link GLContext}
     */
    public static boolean glQueryLocalGlContext(org.gstreamer.gst.Element element, org.gstreamer.gst.PadDirection direction, Out<org.gstreamer.gl.GLContext> contextPtr) {
        MemorySegment contextPtrPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_query_local_gl_context.invokeExact(
                    element.handle(),
                    direction.getValue(),
                    (Addressable) contextPtrPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        contextPtr.set((org.gstreamer.gl.GLContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(contextPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0))), org.gstreamer.gl.GLContext.fromAddress).marshal(contextPtrPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Free with gst_gl_query_free()
     * @param context a {@link GLContext}
     * @param queryType the {@link GLQueryType} to create
     * @return a new {@link GLQuery}
     */
    public static org.gstreamer.gl.GLQuery glQueryNew(org.gstreamer.gl.GLContext context, org.gstreamer.gl.GLQueryType queryType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_query_new.invokeExact(
                    context.handle(),
                    queryType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLQuery.fromAddress.marshal(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Initializes the GL Base Texture allocator. It is safe to call this function
     * multiple times.  This must be called before any other GstGLRenderbuffer operation.
     */
    public static void glRenderbufferInitOnce() {
        try {
            DowncallHandles.gst_gl_renderbuffer_init_once.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the 4x4 affine transformation matrix stored in {@code meta} from the
     * NDC coordinates in {@code matrix}.
     * @param meta a {@link org.gstreamer.video.VideoAffineTransformationMeta}
     * @param matrix a 4x4 matrix
     */
    public static void glSetAffineTransformationMetaFromNdc(org.gstreamer.video.VideoAffineTransformationMeta meta, float[] matrix) {
        try {
            DowncallHandles.gst_gl_set_affine_transformation_meta_from_ndc.invokeExact(
                    meta.handle(),
                    Interop.allocateNativeArray(matrix, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static int glSizedGlFormatFromGlFormatType(org.gstreamer.gl.GLContext context, int format, int type) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_sized_gl_format_from_gl_format_type.invokeExact(
                    context.handle(),
                    format,
                    type);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static org.gtk.glib.Type glStereoDownmixModeGetType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_stereo_downmix_mode_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static org.gtk.glib.Type glSyncMetaApiGetType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_sync_meta_api_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    public static org.gstreamer.gst.MetaInfo glSyncMetaGetInfo() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_sync_meta_get_info.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.MetaInfo.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    public static org.gstreamer.gl.GLTextureTarget glTextureTargetFromGl(int target) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_texture_target_from_gl.invokeExact(
                    target);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLTextureTarget.of(RESULT);
    }
    
    public static org.gstreamer.gl.GLTextureTarget glTextureTargetFromString(java.lang.String str) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_texture_target_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(str, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLTextureTarget.of(RESULT);
    }
    
    public static java.lang.String glTextureTargetToBufferPoolOption(org.gstreamer.gl.GLTextureTarget target) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_texture_target_to_buffer_pool_option.invokeExact(
                    target.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public static int glTextureTargetToGl(org.gstreamer.gl.GLTextureTarget target) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_texture_target_to_gl.invokeExact(
                    target.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public static java.lang.String glTextureTargetToString(org.gstreamer.gl.GLTextureTarget target) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_texture_target_to_string.invokeExact(
                    target.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * See gst_gl_value_set_texture_target_from_mask() for what entails a mask
     * @param value an initialized {@link org.gtk.gobject.Value} of type G_TYPE_STRING
     * @return the mask of {@link GLTextureTarget}'s in {@code value} or
     *     {@link GLTextureTarget#NONE} on failure
     */
    public static org.gstreamer.gl.GLTextureTarget glValueGetTextureTargetMask(org.gtk.gobject.Value value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_value_get_texture_target_mask.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLTextureTarget.of(RESULT);
    }
    
    public static boolean glValueSetTextureTarget(org.gtk.gobject.Value value, org.gstreamer.gl.GLTextureTarget target) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_value_set_texture_target.invokeExact(
                    value.handle(),
                    target.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * A mask is a bitwise OR of (1 &lt;&lt; target) where target is a valid
     * {@link GLTextureTarget}
     * @param value an uninitialized {@link org.gtk.gobject.Value}
     * @param targetMask a bitwise mask of {@link GLTextureTarget}'s
     * @return whether the {@code target_mask} could be set on {@code value}
     */
    public static boolean glValueSetTextureTargetFromMask(org.gtk.gobject.Value value, org.gstreamer.gl.GLTextureTarget targetMask) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_value_set_texture_target_from_mask.invokeExact(
                    value.handle(),
                    targetMask.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static org.gstreamer.gl.GLSLVersion glVersionToGlslVersion(org.gstreamer.gl.GLAPI glApi, int maj, int min) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_version_to_glsl_version.invokeExact(
                    glApi.getValue(),
                    maj,
                    min);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLSLVersion.of(RESULT);
    }
    
    public static org.gtk.glib.Quark glWindowErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_window_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static org.gtk.glib.Quark glslErrorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    public static org.gstreamer.gl.GLSLProfile glslProfileFromString(java.lang.String string) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_profile_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLSLProfile(RESULT);
    }
    
    public static @Nullable java.lang.String glslProfileToString(org.gstreamer.gl.GLSLProfile profile) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_profile_to_string.invokeExact(
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Note: this function first searches the first 1 kilobytes for a {@code #version}
     * preprocessor directive and then executes gst_glsl_version_profile_from_string().
     * @param s string to search for a valid {@code #version} string
     * @param version resulting {@link GLSLVersion}
     * @param profile resulting {@link GLSLProfile}
     * @return TRUE if a valid {@code #version} string was found, FALSE otherwise
     */
    public static boolean glslStringGetVersionProfile(java.lang.String s, Out<org.gstreamer.gl.GLSLVersion> version, Out<org.gstreamer.gl.GLSLProfile> profile) {
        MemorySegment versionPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment profilePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_string_get_version_profile.invokeExact(
                    Marshal.stringToAddress.marshal(s, null),
                    (Addressable) versionPOINTER.address(),
                    (Addressable) profilePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        version.set(org.gstreamer.gl.GLSLVersion.of(versionPOINTER.get(Interop.valueLayout.C_INT, 0)));
        profile.set(new org.gstreamer.gl.GLSLProfile(profilePOINTER.get(Interop.valueLayout.C_INT, 0)));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static org.gstreamer.gl.GLSLVersion glslVersionFromString(java.lang.String string) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_version_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(string, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gl.GLSLVersion.of(RESULT);
    }
    
    /**
     * Note: this function expects either a {@code #version} GLSL preprocesser directive
     * or a valid GLSL version and/or profile.
     * @param string a valid GLSL {@code #version} string
     * @param versionRet resulting {@link GLSLVersion}
     * @param profileRet resulting {@link GLSLVersion}
     * @return TRUE if a valid {@code #version} string was found, FALSE otherwise
     */
    public static boolean glslVersionProfileFromString(java.lang.String string, Out<org.gstreamer.gl.GLSLVersion> versionRet, Out<org.gstreamer.gl.GLSLProfile> profileRet) {
        MemorySegment versionRetPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment profileRetPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_glsl_version_profile_from_string.invokeExact(
                    Marshal.stringToAddress.marshal(string, null),
                    (Addressable) versionRetPOINTER.address(),
                    (Addressable) profileRetPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        versionRet.set(org.gstreamer.gl.GLSLVersion.of(versionRetPOINTER.get(Interop.valueLayout.C_INT, 0)));
        profileRet.set(new org.gstreamer.gl.GLSLProfile(profileRetPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static java.lang.String glslVersionProfileToString(org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_version_profile_to_string.invokeExact(
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public static @Nullable java.lang.String glslVersionToString(org.gstreamer.gl.GLSLVersion version) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_glsl_version_to_string.invokeExact(
                    version.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    public static boolean isGlBaseMemory(org.gstreamer.gst.Memory mem) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_is_gl_base_memory.invokeExact(
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static boolean isGlBuffer(org.gstreamer.gst.Memory mem) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_is_gl_buffer.invokeExact(
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static boolean isGlMemory(org.gstreamer.gst.Memory mem) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_is_gl_memory.invokeExact(
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static boolean isGlMemoryPbo(org.gstreamer.gst.Memory mem) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_is_gl_memory_pbo.invokeExact(
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public static boolean isGlRenderbuffer(org.gstreamer.gst.Memory mem) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_is_gl_renderbuffer.invokeExact(
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_buffer_add_gl_sync_meta = Interop.downcallHandle(
            "gst_buffer_add_gl_sync_meta",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_add_gl_sync_meta_full = Interop.downcallHandle(
            "gst_buffer_add_gl_sync_meta_full",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_config_get_gl_allocation_params = Interop.downcallHandle(
            "gst_buffer_pool_config_get_gl_allocation_params",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_buffer_pool_config_set_gl_allocation_params = Interop.downcallHandle(
            "gst_buffer_pool_config_set_gl_allocation_params",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_get_gl_display = Interop.downcallHandle(
            "gst_context_get_gl_display",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_context_set_gl_display = Interop.downcallHandle(
            "gst_context_set_gl_display",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_api_from_string = Interop.downcallHandle(
            "gst_gl_api_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_api_to_string = Interop.downcallHandle(
            "gst_gl_api_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_async_debug_new = Interop.downcallHandle(
            "gst_gl_async_debug_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_base_memory_alloc = Interop.downcallHandle(
            "gst_gl_base_memory_alloc",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_base_memory_error_quark = Interop.downcallHandle(
            "gst_gl_base_memory_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_base_memory_init_once = Interop.downcallHandle(
            "gst_gl_base_memory_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_gl_buffer_init_once = Interop.downcallHandle(
            "gst_gl_buffer_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_gl_check_extension = Interop.downcallHandle(
            "gst_gl_check_extension",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_config_caveat_to_string = Interop.downcallHandle(
            "gst_gl_config_caveat_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_config_surface_type_to_string = Interop.downcallHandle(
            "gst_gl_config_surface_type_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_context_error_quark = Interop.downcallHandle(
            "gst_gl_context_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_element_propagate_display_context = Interop.downcallHandle(
            "gst_gl_element_propagate_display_context",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_ensure_element_data = Interop.downcallHandle(
            "gst_gl_ensure_element_data",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_format_from_video_info = Interop.downcallHandle(
            "gst_gl_format_from_video_info",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_format_is_supported = Interop.downcallHandle(
            "gst_gl_format_is_supported",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_format_type_from_sized_gl_format = Interop.downcallHandle(
            "gst_gl_format_type_from_sized_gl_format",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_format_type_n_bytes = Interop.downcallHandle(
            "gst_gl_format_type_n_bytes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_get_affine_transformation_meta_as_ndc = Interop.downcallHandle(
            "gst_gl_get_affine_transformation_meta_as_ndc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_get_plane_data_size = Interop.downcallHandle(
            "gst_gl_get_plane_data_size",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_get_plane_start = Interop.downcallHandle(
            "gst_gl_get_plane_start",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_handle_context_query = Interop.downcallHandle(
            "gst_gl_handle_context_query",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_handle_set_context = Interop.downcallHandle(
            "gst_gl_handle_set_context",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_insert_debug_marker = Interop.downcallHandle(
            "gst_gl_insert_debug_marker",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_gl_memory_init_once = Interop.downcallHandle(
            "gst_gl_memory_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_gl_memory_pbo_init_once = Interop.downcallHandle(
            "gst_gl_memory_pbo_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_gl_memory_setup_buffer = Interop.downcallHandle(
            "gst_gl_memory_setup_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_gl_multiply_matrix4 = Interop.downcallHandle(
            "gst_gl_multiply_matrix4",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_platform_from_string = Interop.downcallHandle(
            "gst_gl_platform_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_platform_to_string = Interop.downcallHandle(
            "gst_gl_platform_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_query_local_gl_context = Interop.downcallHandle(
            "gst_gl_query_local_gl_context",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_query_new = Interop.downcallHandle(
            "gst_gl_query_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_renderbuffer_init_once = Interop.downcallHandle(
            "gst_gl_renderbuffer_init_once",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle gst_gl_set_affine_transformation_meta_from_ndc = Interop.downcallHandle(
            "gst_gl_set_affine_transformation_meta_from_ndc",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_sized_gl_format_from_gl_format_type = Interop.downcallHandle(
            "gst_gl_sized_gl_format_from_gl_format_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_stereo_downmix_mode_get_type = Interop.downcallHandle(
            "gst_gl_stereo_downmix_mode_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_gl_sync_meta_api_get_type = Interop.downcallHandle(
            "gst_gl_sync_meta_api_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_gl_sync_meta_get_info = Interop.downcallHandle(
            "gst_gl_sync_meta_get_info",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_texture_target_from_gl = Interop.downcallHandle(
            "gst_gl_texture_target_from_gl",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_texture_target_from_string = Interop.downcallHandle(
            "gst_gl_texture_target_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_texture_target_to_buffer_pool_option = Interop.downcallHandle(
            "gst_gl_texture_target_to_buffer_pool_option",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_texture_target_to_gl = Interop.downcallHandle(
            "gst_gl_texture_target_to_gl",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_texture_target_to_string = Interop.downcallHandle(
            "gst_gl_texture_target_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_value_get_texture_target_mask = Interop.downcallHandle(
            "gst_gl_value_get_texture_target_mask",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_gl_value_set_texture_target = Interop.downcallHandle(
            "gst_gl_value_set_texture_target",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_value_set_texture_target_from_mask = Interop.downcallHandle(
            "gst_gl_value_set_texture_target_from_mask",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_version_to_glsl_version = Interop.downcallHandle(
            "gst_gl_version_to_glsl_version",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_gl_window_error_quark = Interop.downcallHandle(
            "gst_gl_window_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_glsl_error_quark = Interop.downcallHandle(
            "gst_glsl_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_glsl_profile_from_string = Interop.downcallHandle(
            "gst_glsl_profile_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_glsl_profile_to_string = Interop.downcallHandle(
            "gst_glsl_profile_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_glsl_string_get_version_profile = Interop.downcallHandle(
            "gst_glsl_string_get_version_profile",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_glsl_version_from_string = Interop.downcallHandle(
            "gst_glsl_version_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_glsl_version_profile_from_string = Interop.downcallHandle(
            "gst_glsl_version_profile_from_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_glsl_version_profile_to_string = Interop.downcallHandle(
            "gst_glsl_version_profile_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_glsl_version_to_string = Interop.downcallHandle(
            "gst_glsl_version_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_is_gl_base_memory = Interop.downcallHandle(
            "gst_is_gl_base_memory",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_is_gl_buffer = Interop.downcallHandle(
            "gst_is_gl_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_is_gl_memory = Interop.downcallHandle(
            "gst_is_gl_memory",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_is_gl_memory_pbo = Interop.downcallHandle(
            "gst_is_gl_memory_pbo",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_is_gl_renderbuffer = Interop.downcallHandle(
            "gst_is_gl_renderbuffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
}
