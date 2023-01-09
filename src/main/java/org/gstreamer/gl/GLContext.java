package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link GLContext} wraps an OpenGL context object in a uniform API.  As a result
 * of the limitation on OpenGL context, this object is not thread safe unless
 * specified and must only be activated in a single thread.
 * <p>
 * Environment variables:
 * <ul>
 * <li>{@code GST_GL_API}: select which OpenGL API to create and OpenGL context for.
 *                 Depending on the platform, the available values are
 *                 'opengl', 'opengl3' (core profile), and 'gles2'.  See the
 *                 the {@link GLAPI} enumeration for more details.
 * <li>{@code GST_GL_PLATFORM}: select which OpenGL platform to create an OpenGL
 *                      context with.  Depending on the platform and the
 *                      dependencies available build-time, the available values
 *                      are, 'glx', 'egl', 'cgl', 'wgl', and 'eagl'
 * <li>{@code GST_GL_CONFIG}: select the configuration used for creating the OpenGL
 *                    context and OpenGL surface.  Written out as a GstStructure
 *                    that has been serialized to string.  e.g.
 *                    {@code GST_GL_CONFIG="gst-gl-context-config,red-size=8,green-size=8,blue-size=8,alpha-size=8,depth-size=16"}.
 *                    Not all platforms will support the same level of
 *                    functionality.
 * </ul>
 */
public class GLContext extends org.gstreamer.gst.GstObject {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLContext";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("display"),
            Interop.valueLayout.ADDRESS.withName("window"),
            Interop.valueLayout.ADDRESS.withName("gl_vtable"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLContext(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLContext> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLContext(input);
    
    private static MemoryAddress constructNew(org.gstreamer.gl.GLDisplay display) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_new.invokeExact(display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link GLContext} with the specified {@code display}
     * @param display a {@link GLDisplay}
     */
    public GLContext(org.gstreamer.gl.GLDisplay display) {
        super(constructNew(display));
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWrapped(org.gstreamer.gl.GLDisplay display, long handle, org.gstreamer.gl.GLPlatform contextType, org.gstreamer.gl.GLAPI availableApis) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_new_wrapped.invokeExact(
                    display.handle(),
                    handle,
                    contextType.getValue(),
                    availableApis.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Wraps an existing OpenGL context into a {@link GLContext}.
     * <p>
     * Note: The caller is responsible for ensuring that the OpenGL context
     * represented by {@code handle} stays alive while the returned {@link GLContext} is
     * active.
     * <p>
     * {@code context_type} must not be {@link GLPlatform#NONE} or {@link GLPlatform#ANY}
     * <p>
     * {@code available_apis} must not be {@link GLAPI#NONE} or {@link GLAPI#ANY}
     * @param display a {@link GLDisplay}
     * @param handle the OpenGL context to wrap
     * @param contextType a {@link GLPlatform} specifying the type of context in {@code handle}
     * @param availableApis a {@link GLAPI} containing the available OpenGL apis in {@code handle}
     * @return a {@link GLContext} wrapping {@code handle}
     */
    public static GLContext newWrapped(org.gstreamer.gl.GLDisplay display, long handle, org.gstreamer.gl.GLPlatform contextType, org.gstreamer.gl.GLAPI availableApis) {
        var RESULT = constructNewWrapped(display, handle, contextType, availableApis);
        var OBJECT = (org.gstreamer.gl.GLContext) Interop.register(RESULT, org.gstreamer.gl.GLContext.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * (De)activate the OpenGL context represented by this {@code context}.
     * <p>
     * In OpenGL terms, calls eglMakeCurrent or similar with this context and the
     * currently set window.  See gst_gl_context_set_window() for details.
     * @param activate {@code true} to activate, {@code false} to deactivate
     * @return Whether the activation succeeded
     */
    public boolean activate(boolean activate) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_activate.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(activate, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Note: This will always fail for two wrapped {@link GLContext}'s
     * @param otherContext another {@link GLContext}
     * @return whether {@code context} and {@code other_context} are able to share OpenGL
     *      resources.
     */
    public boolean canShare(org.gstreamer.gl.GLContext otherContext) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_can_share.invokeExact(
                    handle(),
                    otherContext.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check for an OpenGL {@code feature} being supported.
     * <p>
     * Note: Most features require that the context be created before it is
     * possible to determine their existence and so will fail if that is not the
     * case.
     * @param feature a platform specific feature
     * @return Whether {@code feature} is supported by {@code context}
     */
    public boolean checkFeature(java.lang.String feature) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_gl_context_check_feature.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(feature, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Must be called with {@code context} current.
     * @param fboTarget the GL value of the framebuffer target, GL_FRAMEBUFFER,
     *              GL_READ_FRAMEBUFFER, GL_DRAW_FRAMEBUFFER
     * @return whether whether the current framebuffer is complete
     */
    public boolean checkFramebufferStatus(int fboTarget) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_check_framebuffer_status.invokeExact(
                    handle(),
                    fboTarget);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean checkGlVersion(org.gstreamer.gl.GLAPI api, int maj, int min) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_check_gl_version.invokeExact(
                    handle(),
                    api.getValue(),
                    maj,
                    min);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Unbind the current framebuffer
     */
    public void clearFramebuffer() {
        try {
            DowncallHandles.gst_gl_context_clear_framebuffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Clear's the currently set shader from the GL state machine.
     * <p>
     * Note: must be called in the GL thread.
     */
    public void clearShader() {
        try {
            DowncallHandles.gst_gl_context_clear_shader.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates an OpenGL context with the specified {@code other_context} as a context
     * to share shareable OpenGL objects with.  See the OpenGL specification for
     * what is shared between OpenGL contexts.
     * <p>
     * Since 1.20, the configuration can be overriden with the environment variable
     * {@code GST_GL_CONFIG} which is a stringified {@link org.gstreamer.gst.Structure} as would be returned
     * from gst_gl_context_get_config().  If {@code GST_GL_CONFIG} is not set, then the
     * config will be chosen from {@code other_context} by calling
     * gst_gl_context_get_config() on {@code other_context}.  Otherwise, a default
     * configuration is used.
     * <p>
     * Calling gst_gl_context_request_config()) before calling
     * gst_gl_context_create() will override the config from {@code other_context} but
     * will not override the {@code GST_GL_CONFIG} environment variable.
     * <p>
     * If an error occurs, and {@code error} is not {@code null}, then {@code error} will contain
     * details of the error and {@code false} will be returned.
     * <p>
     * Should only be called once.
     * @param otherContext a {@link GLContext} to share OpenGL objects with
     * @return whether the context could successfully be created
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean create(@Nullable org.gstreamer.gl.GLContext otherContext) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_gl_context_create.invokeExact(
                        handle(),
                        (Addressable) (otherContext == null ? MemoryAddress.NULL : otherContext.handle()),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Destroys an OpenGL context.
     * <p>
     * Should only be called after gst_gl_context_create() has been successfully
     * called for this context.
     */
    public void destroy() {
        try {
            DowncallHandles.gst_gl_context_destroy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Fills {@code context}'s info (version, extensions, vtable, etc) from the GL
     * context in the current thread.  Typically used with wrapped contexts to
     * allow wrapped contexts to be used as regular {@link GLContext}'s.
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean fillInfo() throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_gl_context_fill_info.invokeExact(handle(),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Retrieve the OpenGL configuration for this context.  The context must
     * have been successfully created for this function to return a valid value.
     * <p>
     * Not all implementations currently support retrieving the config and will
     * return {@code null} when not supported.
     * @return the configuration chosen for this OpenGL context.
     */
    public @Nullable org.gstreamer.gst.Structure getConfig() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_config.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public org.gstreamer.gl.GLDisplay getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_display.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gl.GLDisplay) Interop.register(RESULT, org.gstreamer.gl.GLDisplay.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the currently enabled OpenGL api.
     * <p>
     * The currently available API may be limited by the {@link GLDisplay} in use and/or
     * the {@link GLWindow} chosen.
     * @return the available OpenGL api
     */
    public org.gstreamer.gl.GLAPI getGlApi() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_get_gl_api.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLAPI(RESULT);
    }
    
    /**
     * Gets the backing OpenGL context used by {@code context}.
     * @return The platform specific backing OpenGL context
     */
    public long getGlContext() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_context_get_gl_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the OpenGL platform that used by {@code context}.
     * @return The platform specific backing OpenGL context
     */
    public org.gstreamer.gl.GLPlatform getGlPlatform() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_get_gl_platform.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLPlatform(RESULT);
    }
    
    /**
     * Get the version of the OpenGL platform (GLX, EGL, etc) used.  Only valid
     * after a call to gst_gl_context_create().
     * @param major return for the major version
     * @param minor return for the minor version
     */
    public void getGlPlatformVersion(Out<Integer> major, Out<Integer> minor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment majorPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment minorPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_gl_context_get_gl_platform_version.invokeExact(
                        handle(),
                        (Addressable) majorPOINTER.address(),
                        (Addressable) minorPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    major.set(majorPOINTER.get(Interop.valueLayout.C_INT, 0));
                    minor.set(minorPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Returns the OpenGL version implemented by {@code context}.  See
     * gst_gl_context_get_gl_api() for retrieving the OpenGL api implemented by
     * {@code context}.
     * @param maj resulting major version
     * @param min resulting minor version
     */
    public void getGlVersion(Out<Integer> maj, Out<Integer> min) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment majPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment minPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_gl_context_get_gl_version.invokeExact(
                        handle(),
                        (Addressable) majPOINTER.address(),
                        (Addressable) minPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    maj.set(majPOINTER.get(Interop.valueLayout.C_INT, 0));
                    min.set(minPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Get a function pointer to a specified opengl function, {@code name}.  If the the
     * specific function does not exist, NULL is returned instead.
     * <p>
     * Platform specific functions (names starting 'egl', 'glX', 'wgl', etc) can also
     * be retrieved using this method.
     * <p>
     * Note: This function may return valid function pointers that may not be valid
     * to call in {@code context}.  The caller is responsible for ensuring that the
     * returned function is a valid function to call in {@code context} by either checking
     * the OpenGL API and version or for an appropriate OpenGL extension.
     * <p>
     * Note: On success, you need to cast the returned function pointer to the
     * correct type to be able to call it correctly.  On 32-bit Windows, this will
     * include the {@code GSTGLAPI} identifier to use the correct calling convention.
     * e.g.
     * <pre>{@code <!-- language="C" -->
     * void (GSTGLAPI *PFN_glGetIntegerv) (GLenum name, GLint * ret)
     * }</pre>
     * @param name an opengl function name
     * @return a function pointer or {@code null}
     */
    public @Nullable java.lang.foreign.MemoryAddress getProcAddress(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_proc_address.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    public org.gtk.glib.Thread getThread() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_thread.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Thread.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public @Nullable org.gstreamer.gl.GLWindow getWindow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_window.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.gstreamer.gl.GLWindow) Interop.register(RESULT, org.gstreamer.gl.GLWindow.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    public boolean isShared() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_is_shared.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the OpenGL configuration for this context.  The context must not
     * have been created for this function to succeed.  Setting a {@code null}
     * {@code config} has the affect of removing any specific configuration request.
     * <p>
     * Not all implementations currently support retrieving the config and this
     * function will return FALSE when not supported.
     * <p>
     * Note that calling this function may cause a subsequent
     * gst_gl_context_create() to fail if {@code config} could not be matched with
     * the platform-specific configuration.
     * <p>
     * Note that the actual config used may be differ from the requested values.
     * @param glConfig a configuration structure for
     *             configuring the OpenGL context
     * @return whether {@code gl_config} could be successfully set on {@code context}
     */
    public boolean requestConfig(@Nullable org.gstreamer.gst.Structure glConfig) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_request_config.invokeExact(
                    handle(),
                    (Addressable) (glConfig == null ? MemoryAddress.NULL : glConfig.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        glConfig.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Will internally set {@code context} as shared with {@code share}
     * @param share another {@link GLContext}
     */
    public void setSharedWith(org.gstreamer.gl.GLContext share) {
        try {
            DowncallHandles.gst_gl_context_set_shared_with.invokeExact(
                    handle(),
                    share.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set's the current window on {@code context} to {@code window}.  The window can only be
     * changed before gst_gl_context_create() has been called and the {@code window} is not
     * already running.
     * @param window a {@link GLWindow}
     * @return Whether the window was successfully updated
     */
    public boolean setWindow(org.gstreamer.gl.GLWindow window) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_set_window.invokeExact(
                    handle(),
                    window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        window.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean supportsGlslProfileVersion(org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_supports_glsl_profile_version.invokeExact(
                    handle(),
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean supportsPrecision(org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_supports_precision.invokeExact(
                    handle(),
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    public boolean supportsPrecisionHighp(org.gstreamer.gl.GLSLVersion version, org.gstreamer.gl.GLSLProfile profile) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_supports_precision_highp.invokeExact(
                    handle(),
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Swap the front and back buffers on the window attached to {@code context}.
     * This will display the frame on the next refresh cycle.
     */
    public void swapBuffers() {
        try {
            DowncallHandles.gst_gl_context_swap_buffers.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Execute {@code func} in the OpenGL thread of {@code context} with {@code data}
     * <p>
     * MT-safe
     * @param func a {@link GLContextThreadFunc}
     */
    public void threadAdd(org.gstreamer.gl.GLContextThreadFunc func) {
        try {
            DowncallHandles.gst_gl_context_thread_add.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A default implementation of the various GetProcAddress functions that looks
     * for {@code name} in the OpenGL shared libraries or in the current process.
     * <p>
     * See also: gst_gl_context_get_proc_address()
     * @param glApi a {@link GLAPI}
     * @param name then function to get the address of
     * @return an address pointing to {@code name} or {@code null}
     */
    public static @Nullable java.lang.foreign.MemoryAddress defaultGetProcAddress(org.gstreamer.gl.GLAPI glApi, java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_default_get_proc_address.invokeExact(
                        glApi.getValue(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * See also gst_gl_context_activate().
     * @return the {@link GLContext} active in the current thread or {@code null}
     */
    public static org.gstreamer.gl.GLContext getCurrent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_current.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gl.GLContext) Interop.register(RESULT, org.gstreamer.gl.GLContext.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * If an error occurs, {@code major} and {@code minor} are not modified and {@link GLAPI#NONE} is
     * returned.
     * @param platform the {@link GLPlatform} to retrieve the API for
     * @param major the major version
     * @param minor the minor version
     * @return The version supported by the OpenGL context current in the calling
     *          thread or {@link GLAPI#NONE}
     */
    public static org.gstreamer.gl.GLAPI getCurrentGlApi(org.gstreamer.gl.GLPlatform platform, Out<Integer> major, Out<Integer> minor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment majorPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment minorPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_gl_context_get_current_gl_api.invokeExact(
                        platform.getValue(),
                        (Addressable) (major == null ? MemoryAddress.NULL : (Addressable) majorPOINTER.address()),
                        (Addressable) (minor == null ? MemoryAddress.NULL : (Addressable) minorPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (major != null) major.set(majorPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (minor != null) minor.set(minorPOINTER.get(Interop.valueLayout.C_INT, 0));
            return new org.gstreamer.gl.GLAPI(RESULT);
        }
    }
    
    public static long getCurrentGlContext(org.gstreamer.gl.GLPlatform contextType) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_context_get_current_gl_context.invokeExact(contextType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Attempts to use the {@code context_type} specific GetProcAddress implementations
     * to retrieve {@code name}.
     * <p>
     * See also gst_gl_context_get_proc_address().
     * @param contextType a {@link GLPlatform}
     * @param glApi a {@link GLAPI}
     * @param name the name of the function to retrieve
     * @return a function pointer for {@code name}, or {@code null}
     */
    public static @Nullable java.lang.foreign.MemoryAddress getProcAddressWithPlatform(org.gstreamer.gl.GLPlatform contextType, org.gstreamer.gl.GLAPI glApi, java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_proc_address_with_platform.invokeExact(
                        contextType.getValue(),
                        glApi.getValue(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * A {@link GLContext.Builder} object constructs a {@link GLContext} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLContext.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLContext}.
         * @return A new instance of {@code GLContext} with the properties 
         *         that were set in the Builder object.
         */
        public GLContext build() {
            return (GLContext) org.gtk.gobject.GObject.newWithProperties(
                GLContext.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_gl_context_new = Interop.downcallHandle(
                "gst_gl_context_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_new_wrapped = Interop.downcallHandle(
                "gst_gl_context_new_wrapped",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_context_activate = Interop.downcallHandle(
                "gst_gl_context_activate",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_context_can_share = Interop.downcallHandle(
                "gst_gl_context_can_share",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_check_feature = Interop.downcallHandle(
                "gst_gl_context_check_feature",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_check_framebuffer_status = Interop.downcallHandle(
                "gst_gl_context_check_framebuffer_status",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_context_check_gl_version = Interop.downcallHandle(
                "gst_gl_context_check_gl_version",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_context_clear_framebuffer = Interop.downcallHandle(
                "gst_gl_context_clear_framebuffer",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_clear_shader = Interop.downcallHandle(
                "gst_gl_context_clear_shader",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_create = Interop.downcallHandle(
                "gst_gl_context_create",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_destroy = Interop.downcallHandle(
                "gst_gl_context_destroy",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_fill_info = Interop.downcallHandle(
                "gst_gl_context_fill_info",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_config = Interop.downcallHandle(
                "gst_gl_context_get_config",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_display = Interop.downcallHandle(
                "gst_gl_context_get_display",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_gl_api = Interop.downcallHandle(
                "gst_gl_context_get_gl_api",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_gl_context = Interop.downcallHandle(
                "gst_gl_context_get_gl_context",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_gl_platform = Interop.downcallHandle(
                "gst_gl_context_get_gl_platform",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_gl_platform_version = Interop.downcallHandle(
                "gst_gl_context_get_gl_platform_version",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_gl_version = Interop.downcallHandle(
                "gst_gl_context_get_gl_version",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_proc_address = Interop.downcallHandle(
                "gst_gl_context_get_proc_address",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_thread = Interop.downcallHandle(
                "gst_gl_context_get_thread",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_window = Interop.downcallHandle(
                "gst_gl_context_get_window",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_is_shared = Interop.downcallHandle(
                "gst_gl_context_is_shared",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_request_config = Interop.downcallHandle(
                "gst_gl_context_request_config",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_set_shared_with = Interop.downcallHandle(
                "gst_gl_context_set_shared_with",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_set_window = Interop.downcallHandle(
                "gst_gl_context_set_window",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_supports_glsl_profile_version = Interop.downcallHandle(
                "gst_gl_context_supports_glsl_profile_version",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_context_supports_precision = Interop.downcallHandle(
                "gst_gl_context_supports_precision",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_context_supports_precision_highp = Interop.downcallHandle(
                "gst_gl_context_supports_precision_highp",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_context_swap_buffers = Interop.downcallHandle(
                "gst_gl_context_swap_buffers",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_thread_add = Interop.downcallHandle(
                "gst_gl_context_thread_add",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_type = Interop.downcallHandle(
                "gst_gl_context_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_gl_context_default_get_proc_address = Interop.downcallHandle(
                "gst_gl_context_default_get_proc_address",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_current = Interop.downcallHandle(
                "gst_gl_context_get_current",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_current_gl_api = Interop.downcallHandle(
                "gst_gl_context_get_current_gl_api",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_current_gl_context = Interop.downcallHandle(
                "gst_gl_context_get_current_gl_context",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_gl_context_get_proc_address_with_platform = Interop.downcallHandle(
                "gst_gl_context_get_proc_address_with_platform",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_gl_context_get_type != null;
    }
}
