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
public class GLContext extends org.gstreamer.gst.Object {
    
    static {
        GstGL.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstGLContext";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("parent"),
        Interop.valueLayout.ADDRESS.withName("display"),
        Interop.valueLayout.ADDRESS.withName("window"),
        Interop.valueLayout.ADDRESS.withName("gl_vtable"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a GLContext proxy instance for the provided memory address.
     * <p>
     * Because GLContext is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLContext(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to GLContext if its GType is a (or inherits from) "GstGLContext".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLContext} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstGLContext", a ClassCastException will be thrown.
     */
    public static GLContext castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GLContext.getType())) {
            return new GLContext(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstGLContext");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gstreamer.gl.GLDisplay display) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_new.invokeExact(
                    display.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link GLContext} with the specified {@code display}
     * @param display a {@link GLDisplay}
     */
    public GLContext(@NotNull org.gstreamer.gl.GLDisplay display) {
        super(constructNew(display), Ownership.NONE);
    }
    
    private static Addressable constructNewWrapped(@NotNull org.gstreamer.gl.GLDisplay display, long handle, @NotNull org.gstreamer.gl.GLPlatform contextType, @NotNull org.gstreamer.gl.GLAPI availableApis) {
        java.util.Objects.requireNonNull(display, "Parameter 'display' must not be null");
        java.util.Objects.requireNonNull(contextType, "Parameter 'contextType' must not be null");
        java.util.Objects.requireNonNull(availableApis, "Parameter 'availableApis' must not be null");
        Addressable RESULT;
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
    public static GLContext newWrapped(@NotNull org.gstreamer.gl.GLDisplay display, long handle, @NotNull org.gstreamer.gl.GLPlatform contextType, @NotNull org.gstreamer.gl.GLAPI availableApis) {
        return new GLContext(constructNewWrapped(display, handle, contextType, availableApis), Ownership.FULL);
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
                    activate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Note: This will always fail for two wrapped {@link GLContext}'s
     * @param otherContext another {@link GLContext}
     * @return whether {@code context} and {@code other_context} are able to share OpenGL
     *      resources.
     */
    public boolean canShare(@NotNull org.gstreamer.gl.GLContext otherContext) {
        java.util.Objects.requireNonNull(otherContext, "Parameter 'otherContext' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_can_share.invokeExact(
                    handle(),
                    otherContext.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean checkFeature(@NotNull java.lang.String feature) {
        java.util.Objects.requireNonNull(feature, "Parameter 'feature' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_check_feature.invokeExact(
                    handle(),
                    Interop.allocateNativeString(feature));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
        return RESULT != 0;
    }
    
    public boolean checkGlVersion(@NotNull org.gstreamer.gl.GLAPI api, int maj, int min) {
        java.util.Objects.requireNonNull(api, "Parameter 'api' must not be null");
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
        return RESULT != 0;
    }
    
    /**
     * Unbind the current framebuffer
     */
    public void clearFramebuffer() {
        try {
            DowncallHandles.gst_gl_context_clear_framebuffer.invokeExact(
                    handle());
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
            DowncallHandles.gst_gl_context_clear_shader.invokeExact(
                    handle());
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
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
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
        return RESULT != 0;
    }
    
    /**
     * Destroys an OpenGL context.
     * <p>
     * Should only be called after gst_gl_context_create() has been successfully
     * called for this context.
     */
    public void destroy() {
        try {
            DowncallHandles.gst_gl_context_destroy.invokeExact(
                    handle());
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
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_fill_info.invokeExact(
                    handle(),
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT != 0;
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
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_config.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Structure(RESULT, Ownership.FULL);
    }
    
    public @NotNull org.gstreamer.gl.GLDisplay getDisplay() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_display.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLDisplay(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the currently enabled OpenGL api.
     * <p>
     * The currently available API may be limited by the {@link GLDisplay} in use and/or
     * the {@link GLWindow} chosen.
     * @return the available OpenGL api
     */
    public @NotNull org.gstreamer.gl.GLAPI getGlApi() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_get_gl_api.invokeExact(
                    handle());
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
            RESULT = (long) DowncallHandles.gst_gl_context_get_gl_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the OpenGL platform that used by {@code context}.
     * @return The platform specific backing OpenGL context
     */
    public @NotNull org.gstreamer.gl.GLPlatform getGlPlatform() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_get_gl_platform.invokeExact(
                    handle());
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
        java.util.Objects.requireNonNull(major, "Parameter 'major' must not be null");
        MemorySegment majorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(minor, "Parameter 'minor' must not be null");
        MemorySegment minorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
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
    
    /**
     * Returns the OpenGL version implemented by {@code context}.  See
     * gst_gl_context_get_gl_api() for retrieving the OpenGL api implemented by
     * {@code context}.
     * @param maj resulting major version
     * @param min resulting minor version
     */
    public void getGlVersion(Out<Integer> maj, Out<Integer> min) {
        java.util.Objects.requireNonNull(maj, "Parameter 'maj' must not be null");
        MemorySegment majPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(min, "Parameter 'min' must not be null");
        MemorySegment minPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
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
    public @Nullable java.lang.foreign.MemoryAddress getProcAddress(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_proc_address.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @NotNull org.gtk.glib.Thread getThread() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_thread.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Thread(RESULT, Ownership.FULL);
    }
    
    public @Nullable org.gstreamer.gl.GLWindow getWindow() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_window.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLWindow(RESULT, Ownership.FULL);
    }
    
    public boolean isShared() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_is_shared.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
        return RESULT != 0;
    }
    
    /**
     * Will internally set {@code context} as shared with {@code share}
     * @param share another {@link GLContext}
     */
    public void setSharedWith(@NotNull org.gstreamer.gl.GLContext share) {
        java.util.Objects.requireNonNull(share, "Parameter 'share' must not be null");
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
    public boolean setWindow(@NotNull org.gstreamer.gl.GLWindow window) {
        java.util.Objects.requireNonNull(window, "Parameter 'window' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_set_window.invokeExact(
                    handle(),
                    window.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        window.yieldOwnership();
        return RESULT != 0;
    }
    
    public boolean supportsGlslProfileVersion(@NotNull org.gstreamer.gl.GLSLVersion version, @NotNull org.gstreamer.gl.GLSLProfile profile) {
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_supports_glsl_profile_version.invokeExact(
                    handle(),
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public boolean supportsPrecision(@NotNull org.gstreamer.gl.GLSLVersion version, @NotNull org.gstreamer.gl.GLSLProfile profile) {
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_supports_precision.invokeExact(
                    handle(),
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public boolean supportsPrecisionHighp(@NotNull org.gstreamer.gl.GLSLVersion version, @NotNull org.gstreamer.gl.GLSLProfile profile) {
        java.util.Objects.requireNonNull(version, "Parameter 'version' must not be null");
        java.util.Objects.requireNonNull(profile, "Parameter 'profile' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_supports_precision_highp.invokeExact(
                    handle(),
                    version.getValue(),
                    profile.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Swap the front and back buffers on the window attached to {@code context}.
     * This will display the frame on the next refresh cycle.
     */
    public void swapBuffers() {
        try {
            DowncallHandles.gst_gl_context_swap_buffers.invokeExact(
                    handle());
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
    public void threadAdd(@NotNull org.gstreamer.gl.GLContextThreadFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.gst_gl_context_thread_add.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GstGL.Callbacks.class, "cbGLContextThreadFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static @Nullable java.lang.foreign.MemoryAddress defaultGetProcAddress(@NotNull org.gstreamer.gl.GLAPI glApi, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(glApi, "Parameter 'glApi' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_default_get_proc_address.invokeExact(
                    glApi.getValue(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * See also gst_gl_context_activate().
     * @return the {@link GLContext} active in the current thread or {@code null}
     */
    public static @NotNull org.gstreamer.gl.GLContext getCurrent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_current.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gl.GLContext(RESULT, Ownership.NONE);
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
    public static @NotNull org.gstreamer.gl.GLAPI getCurrentGlApi(@NotNull org.gstreamer.gl.GLPlatform platform, Out<Integer> major, Out<Integer> minor) {
        java.util.Objects.requireNonNull(platform, "Parameter 'platform' must not be null");
        java.util.Objects.requireNonNull(major, "Parameter 'major' must not be null");
        MemorySegment majorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(minor, "Parameter 'minor' must not be null");
        MemorySegment minorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_gl_context_get_current_gl_api.invokeExact(
                    platform.getValue(),
                    (Addressable) majorPOINTER.address(),
                    (Addressable) minorPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        major.set(majorPOINTER.get(Interop.valueLayout.C_INT, 0));
        minor.set(minorPOINTER.get(Interop.valueLayout.C_INT, 0));
        return new org.gstreamer.gl.GLAPI(RESULT);
    }
    
    public static long getCurrentGlContext(@NotNull org.gstreamer.gl.GLPlatform contextType) {
        java.util.Objects.requireNonNull(contextType, "Parameter 'contextType' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_gl_context_get_current_gl_context.invokeExact(
                    contextType.getValue());
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
    public static @Nullable java.lang.foreign.MemoryAddress getProcAddressWithPlatform(@NotNull org.gstreamer.gl.GLPlatform contextType, @NotNull org.gstreamer.gl.GLAPI glApi, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(contextType, "Parameter 'contextType' must not be null");
        java.util.Objects.requireNonNull(glApi, "Parameter 'glApi' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_gl_context_get_proc_address_with_platform.invokeExact(
                    contextType.getValue(),
                    glApi.getValue(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link GLContext.Build} object constructs a {@link GLContext} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLContext} using {@link GLContext#castFrom}.
         * @return A new instance of {@code GLContext} with the properties 
         *         that were set in the Build object.
         */
        public GLContext construct() {
            return GLContext.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLContext.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
