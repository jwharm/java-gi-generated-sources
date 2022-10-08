package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GdkGLContext} is an object representing a platform-specific
 * OpenGL draw context.
 * <p>
 * {@code GdkGLContext}s are created for a surface using
 * {@link Surface#createGlContext}, and the context will match
 * the characteristics of the surface.
 * <p>
 * A {@code GdkGLContext} is not tied to any particular normal framebuffer.
 * For instance, it cannot draw to the surface back buffer. The GDK
 * repaint system is in full control of the painting to that. Instead,
 * you can create render buffers or textures and use {@link cairo_draw_from_gl#null}
 * in the draw function of your widget to draw them. Then GDK will handle
 * the integration of your rendering with that of other widgets.
 * <p>
 * Support for {@code GdkGLContext} is platform-specific and context creation
 * can fail, returning {@code null} context.
 * <p>
 * A {@code GdkGLContext} has to be made "current" in order to start using
 * it, otherwise any OpenGL call will be ignored.
 * <p>
 * <h2>Creating a new OpenGL context</h2>
 * <p>
 * In order to create a new {@code GdkGLContext} instance you need a {@code GdkSurface},
 * which you typically get during the realize call of a widget.
 * <p>
 * A {@code GdkGLContext} is not realized until either {@link GLContext#makeCurrent}
 * or {@link GLContext#realize} is called. It is possible to specify
 * details of the GL context like the OpenGL version to be used, or whether
 * the GL context should have extra state validation enabled after calling
 * {@code Gdk.GLContext.realize}.
 * If the realization fails you have the option to change the settings of
 * the {@code GdkGLContext} and try again.
 * <p>
 * <h2>Using a GdkGLContext</h2>
 * <p>
 * You will need to make the {@code GdkGLContext} the current context before issuing
 * OpenGL calls; the system sends OpenGL commands to whichever context is current.
 * It is possible to have multiple contexts, so you always need to ensure that
 * the one which you want to draw with is the current one before issuing commands:
 * <p>
 * <pre>{@code c
 * gdk_gl_context_make_current (context);
 * }</pre>
 * <p>
 * You can now perform your drawing using OpenGL commands.
 * <p>
 * You can check which {@code GdkGLContext} is the current one by using
 * {@link Gdk#GLContext}; you can also unset any {@code GdkGLContext}
 * that is currently set by calling {@link Gdk#GLContext}.
 */
public class GLContext extends DrawContext {

    public GLContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GLContext */
    public static GLContext castFrom(org.gtk.gobject.Object gobject) {
        return new GLContext(gobject.refcounted());
    }
    
    static final MethodHandle gdk_gl_context_get_allowed_apis = Interop.downcallHandle(
        "gdk_gl_context_get_allowed_apis",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the allowed APIs set via gdk_gl_context_set_allowed_apis().
     */
    public GLAPI getAllowedApis() {
        try {
            var RESULT = (int) gdk_gl_context_get_allowed_apis.invokeExact(handle());
            return new GLAPI(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_get_api = Interop.downcallHandle(
        "gdk_gl_context_get_api",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the API currently in use.
     * <p>
     * If the renderer has not been realized yet, 0 is returned.
     */
    public GLAPI getApi() {
        try {
            var RESULT = (int) gdk_gl_context_get_api.invokeExact(handle());
            return new GLAPI(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_get_debug_enabled = Interop.downcallHandle(
        "gdk_gl_context_get_debug_enabled",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves whether the context is doing extra validations and runtime checking.
     * <p>
     * See {@link GLContext#setDebugEnabled}.
     */
    public boolean getDebugEnabled() {
        try {
            var RESULT = (int) gdk_gl_context_get_debug_enabled.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_get_display = Interop.downcallHandle(
        "gdk_gl_context_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the display the {@code context} is created for
     */
    public Display getDisplay() {
        try {
            var RESULT = (MemoryAddress) gdk_gl_context_get_display.invokeExact(handle());
            return new Display(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_get_forward_compatible = Interop.downcallHandle(
        "gdk_gl_context_get_forward_compatible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves whether the context is forward-compatible.
     * <p>
     * See {@link GLContext#setForwardCompatible}.
     */
    public boolean getForwardCompatible() {
        try {
            var RESULT = (int) gdk_gl_context_get_forward_compatible.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_get_required_version = Interop.downcallHandle(
        "gdk_gl_context_get_required_version",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves required OpenGL version.
     * <p>
     * See {@link GLContext#setRequiredVersion}.
     */
    public void getRequiredVersion(PointerInteger major, PointerInteger minor) {
        try {
            gdk_gl_context_get_required_version.invokeExact(handle(), major.handle(), minor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_get_surface = Interop.downcallHandle(
        "gdk_gl_context_get_surface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the surface used by the {@code context}.
     */
    public Surface getSurface() {
        try {
            var RESULT = (MemoryAddress) gdk_gl_context_get_surface.invokeExact(handle());
            return new Surface(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_get_use_es = Interop.downcallHandle(
        "gdk_gl_context_get_use_es",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the {@code context} is using an OpenGL or OpenGL ES profile.
     */
    public boolean getUseEs() {
        try {
            var RESULT = (int) gdk_gl_context_get_use_es.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_get_version = Interop.downcallHandle(
        "gdk_gl_context_get_version",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the OpenGL version of the {@code context}.
     * <p>
     * The {@code context} must be realized prior to calling this function.
     */
    public void getVersion(PointerInteger major, PointerInteger minor) {
        try {
            gdk_gl_context_get_version.invokeExact(handle(), major.handle(), minor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_is_legacy = Interop.downcallHandle(
        "gdk_gl_context_is_legacy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Whether the {@code GdkGLContext} is in legacy mode or not.
     * <p>
     * The {@code GdkGLContext} must be realized before calling this function.
     * <p>
     * When realizing a GL context, GDK will try to use the OpenGL 3.2 core
     * profile; this profile removes all the OpenGL API that was deprecated
     * prior to the 3.2 version of the specification. If the realization is
     * successful, this function will return {@code false}.
     * <p>
     * If the underlying OpenGL implementation does not support core profiles,
     * GDK will fall back to a pre-3.2 compatibility profile, and this function
     * will return {@code true}.
     * <p>
     * You can use the value returned by this function to decide which kind
     * of OpenGL API to use, or whether to do extension discovery, or what
     * kind of shader programs to load.
     */
    public boolean isLegacy() {
        try {
            var RESULT = (int) gdk_gl_context_is_legacy.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_is_shared = Interop.downcallHandle(
        "gdk_gl_context_is_shared",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if the two GL contexts can share resources.
     * <p>
     * When they can, the texture IDs from {@code other} can be used in {@code self}. This
     * is particularly useful when passing {@code GdkGLTexture} objects between
     * different contexts.
     * <p>
     * Contexts created for the same display with the same properties will
     * always be compatible, even if they are created for different surfaces.
     * For other contexts it depends on the GL backend.
     * <p>
     * Both contexts must be realized for this check to succeed. If either one
     * is not, this function will return {@code false}.
     */
    public boolean isShared(GLContext other) {
        try {
            var RESULT = (int) gdk_gl_context_is_shared.invokeExact(handle(), other.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_make_current = Interop.downcallHandle(
        "gdk_gl_context_make_current",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Makes the {@code context} the current one.
     */
    public void makeCurrent() {
        try {
            gdk_gl_context_make_current.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_realize = Interop.downcallHandle(
        "gdk_gl_context_realize",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Realizes the given {@code GdkGLContext}.
     * <p>
     * It is safe to call this function on a realized {@code GdkGLContext}.
     */
    public boolean realize() throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) gdk_gl_context_realize.invokeExact(handle(), (Addressable) GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_set_allowed_apis = Interop.downcallHandle(
        "gdk_gl_context_set_allowed_apis",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the allowed APIs. When gdk_gl_context_realize() is called, only the
     * allowed APIs will be tried. If you set this to 0, realizing will always fail.
     * <p>
     * If you set it on a realized context, the property will not have any effect.
     * It is only relevant during gdk_gl_context_realize().
     * <p>
     * By default, all APIs are allowed.
     */
    public void setAllowedApis(GLAPI apis) {
        try {
            gdk_gl_context_set_allowed_apis.invokeExact(handle(), apis.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_set_debug_enabled = Interop.downcallHandle(
        "gdk_gl_context_set_debug_enabled",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code GdkGLContext} should perform extra validations and
     * runtime checking.
     * <p>
     * This is useful during development, but has additional overhead.
     * <p>
     * The {@code GdkGLContext} must not be realized or made current prior to
     * calling this function.
     */
    public void setDebugEnabled(boolean enabled) {
        try {
            gdk_gl_context_set_debug_enabled.invokeExact(handle(), enabled ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_set_forward_compatible = Interop.downcallHandle(
        "gdk_gl_context_set_forward_compatible",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code GdkGLContext} should be forward-compatible.
     * <p>
     * Forward-compatible contexts must not support OpenGL functionality that
     * has been marked as deprecated in the requested version; non-forward
     * compatible contexts, on the other hand, must support both deprecated and
     * non deprecated functionality.
     * <p>
     * The {@code GdkGLContext} must not be realized or made current prior to calling
     * this function.
     */
    public void setForwardCompatible(boolean compatible) {
        try {
            gdk_gl_context_set_forward_compatible.invokeExact(handle(), compatible ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_set_required_version = Interop.downcallHandle(
        "gdk_gl_context_set_required_version",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the major and minor version of OpenGL to request.
     * <p>
     * Setting {@code major} and {@code minor} to zero will use the default values.
     * <p>
     * The {@code GdkGLContext} must not be realized or made current prior to calling
     * this function.
     */
    public void setRequiredVersion(int major, int minor) {
        try {
            gdk_gl_context_set_required_version.invokeExact(handle(), major, minor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_set_use_es = Interop.downcallHandle(
        "gdk_gl_context_set_use_es",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Requests that GDK create an OpenGL ES context instead of an OpenGL one.
     * <p>
     * Not all platforms support OpenGL ES.
     * <p>
     * The {@code context} must not have been realized.
     * <p>
     * By default, GDK will attempt to automatically detect whether the
     * underlying GL implementation is OpenGL or OpenGL ES once the {@code context}
     * is realized.
     * <p>
     * You should check the return value of {@link GLContext#getUseEs}
     * after calling {@link GLContext#realize} to decide whether to use
     * the OpenGL or OpenGL ES API, extensions, or shaders.
     */
    public void setUseEs(int useEs) {
        try {
            gdk_gl_context_set_use_es.invokeExact(handle(), useEs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_clear_current = Interop.downcallHandle(
        "gdk_gl_context_clear_current",
        FunctionDescriptor.ofVoid()
    );
    
    /**
     * Clears the current {@code GdkGLContext}.
     * <p>
     * Any OpenGL call after this function returns will be ignored
     * until {@link GLContext#makeCurrent} is called.
     */
    public static void clearCurrent() {
        try {
            gdk_gl_context_clear_current.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gdk_gl_context_get_current = Interop.downcallHandle(
        "gdk_gl_context_get_current",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the current {@code GdkGLContext}.
     */
    public static GLContext getCurrent() {
        try {
            var RESULT = (MemoryAddress) gdk_gl_context_get_current.invokeExact();
            return new GLContext(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
