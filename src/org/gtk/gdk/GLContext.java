package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GdkGLContext` is an object representing a platform-specific
 * OpenGL draw context.
 * 
 * `GdkGLContext`s are created for a surface using
 * [method@Gdk.Surface.create_gl_context], and the context will match
 * the characteristics of the surface.
 * 
 * A `GdkGLContext` is not tied to any particular normal framebuffer.
 * For instance, it cannot draw to the surface back buffer. The GDK
 * repaint system is in full control of the painting to that. Instead,
 * you can create render buffers or textures and use [func@cairo_draw_from_gl]
 * in the draw function of your widget to draw them. Then GDK will handle
 * the integration of your rendering with that of other widgets.
 * 
 * Support for `GdkGLContext` is platform-specific and context creation
 * can fail, returning %NULL context.
 * 
 * A `GdkGLContext` has to be made "current" in order to start using
 * it, otherwise any OpenGL call will be ignored.
 * 
 * ## Creating a new OpenGL context
 * 
 * In order to create a new `GdkGLContext` instance you need a `GdkSurface`,
 * which you typically get during the realize call of a widget.
 * 
 * A `GdkGLContext` is not realized until either [method@Gdk.GLContext.make_current]
 * or [method@Gdk.GLContext.realize] is called. It is possible to specify
 * details of the GL context like the OpenGL version to be used, or whether
 * the GL context should have extra state validation enabled after calling
 * [method@Gdk.Surface.create_gl_context] by calling [method@Gdk.GLContext.realize].
 * If the realization fails you have the option to change the settings of
 * the `GdkGLContext` and try again.
 * 
 * ## Using a GdkGLContext
 * 
 * You will need to make the `GdkGLContext` the current context before issuing
 * OpenGL calls; the system sends OpenGL commands to whichever context is current.
 * It is possible to have multiple contexts, so you always need to ensure that
 * the one which you want to draw with is the current one before issuing commands:
 * 
 * ```c
 * gdk_gl_context_make_current (context);
 * ```
 * 
 * You can now perform your drawing using OpenGL commands.
 * 
 * You can check which `GdkGLContext` is the current one by using
 * [func@Gdk.GLContext.get_current]; you can also unset any `GdkGLContext`
 * that is currently set by calling [func@Gdk.GLContext.clear_current].
 */
public class GLContext extends DrawContext {

    public GLContext(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GLContext */
    public static GLContext castFrom(org.gtk.gobject.Object gobject) {
        return new GLContext(gobject.getReference());
    }
    
    /**
     * Gets the allowed APIs set via gdk_gl_context_set_allowed_apis().
     */
    public int getAllowedApis() {
        var RESULT = gtk_h.gdk_gl_context_get_allowed_apis(handle());
        return RESULT;
    }
    
    /**
     * Gets the API currently in use.
     * 
     * If the renderer has not been realized yet, 0 is returned.
     */
    public int getApi() {
        var RESULT = gtk_h.gdk_gl_context_get_api(handle());
        return RESULT;
    }
    
    /**
     * Retrieves whether the context is doing extra validations and runtime checking.
     * 
     * See [method@Gdk.GLContext.set_debug_enabled].
     */
    public boolean getDebugEnabled() {
        var RESULT = gtk_h.gdk_gl_context_get_debug_enabled(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the display the @context is created for
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_gl_context_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Retrieves whether the context is forward-compatible.
     * 
     * See [method@Gdk.GLContext.set_forward_compatible].
     */
    public boolean getForwardCompatible() {
        var RESULT = gtk_h.gdk_gl_context_get_forward_compatible(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the surface used by the @context.
     */
    public Surface getSurface() {
        var RESULT = gtk_h.gdk_gl_context_get_surface(handle());
        return new Surface(References.get(RESULT, false));
    }
    
    /**
     * Checks whether the @context is using an OpenGL or OpenGL ES profile.
     */
    public boolean getUseEs() {
        var RESULT = gtk_h.gdk_gl_context_get_use_es(handle());
        return (RESULT != 0);
    }
    
    /**
     * Whether the `GdkGLContext` is in legacy mode or not.
     * 
     * The `GdkGLContext` must be realized before calling this function.
     * 
     * When realizing a GL context, GDK will try to use the OpenGL 3.2 core
     * profile; this profile removes all the OpenGL API that was deprecated
     * prior to the 3.2 version of the specification. If the realization is
     * successful, this function will return %FALSE.
     * 
     * If the underlying OpenGL implementation does not support core profiles,
     * GDK will fall back to a pre-3.2 compatibility profile, and this function
     * will return %TRUE.
     * 
     * You can use the value returned by this function to decide which kind
     * of OpenGL API to use, or whether to do extension discovery, or what
     * kind of shader programs to load.
     */
    public boolean isLegacy() {
        var RESULT = gtk_h.gdk_gl_context_is_legacy(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the two GL contexts can share resources.
     * 
     * When they can, the texture IDs from @other can be used in @self. This
     * is particularly useful when passing `GdkGLTexture` objects between
     * different contexts.
     * 
     * Contexts created for the same display with the same properties will
     * always be compatible, even if they are created for different surfaces.
     * For other contexts it depends on the GL backend.
     * 
     * Both contexts must be realized for this check to succeed. If either one
     * is not, this function will return %FALSE.
     */
    public boolean isShared(GLContext other) {
        var RESULT = gtk_h.gdk_gl_context_is_shared(handle(), other.handle());
        return (RESULT != 0);
    }
    
    /**
     * Makes the @context the current one.
     */
    public void makeCurrent() {
        gtk_h.gdk_gl_context_make_current(handle());
    }
    
    /**
     * Realizes the given `GdkGLContext`.
     * 
     * It is safe to call this function on a realized `GdkGLContext`.
     */
    public boolean realize() throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.gdk_gl_context_realize(handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Sets the allowed APIs. When gdk_gl_context_realize() is called, only the
     * allowed APIs will be tried. If you set this to 0, realizing will always fail.
     * 
     * If you set it on a realized context, the property will not have any effect.
     * It is only relevant during gdk_gl_context_realize().
     * 
     * By default, all APIs are allowed.
     */
    public void setAllowedApis(int apis) {
        gtk_h.gdk_gl_context_set_allowed_apis(handle(), apis);
    }
    
    /**
     * Sets whether the `GdkGLContext` should perform extra validations and
     * runtime checking.
     * 
     * This is useful during development, but has additional overhead.
     * 
     * The `GdkGLContext` must not be realized or made current prior to
     * calling this function.
     */
    public void setDebugEnabled(boolean enabled) {
        gtk_h.gdk_gl_context_set_debug_enabled(handle(), enabled ? 1 : 0);
    }
    
    /**
     * Sets whether the `GdkGLContext` should be forward-compatible.
     * 
     * Forward-compatible contexts must not support OpenGL functionality that
     * has been marked as deprecated in the requested version; non-forward
     * compatible contexts, on the other hand, must support both deprecated and
     * non deprecated functionality.
     * 
     * The `GdkGLContext` must not be realized or made current prior to calling
     * this function.
     */
    public void setForwardCompatible(boolean compatible) {
        gtk_h.gdk_gl_context_set_forward_compatible(handle(), compatible ? 1 : 0);
    }
    
    /**
     * Sets the major and minor version of OpenGL to request.
     * 
     * Setting @major and @minor to zero will use the default values.
     * 
     * The `GdkGLContext` must not be realized or made current prior to calling
     * this function.
     */
    public void setRequiredVersion(int major, int minor) {
        gtk_h.gdk_gl_context_set_required_version(handle(), major, minor);
    }
    
    /**
     * Requests that GDK create an OpenGL ES context instead of an OpenGL one.
     * 
     * Not all platforms support OpenGL ES.
     * 
     * The @context must not have been realized.
     * 
     * By default, GDK will attempt to automatically detect whether the
     * underlying GL implementation is OpenGL or OpenGL ES once the @context
     * is realized.
     * 
     * You should check the return value of [method@Gdk.GLContext.get_use_es]
     * after calling [method@Gdk.GLContext.realize] to decide whether to use
     * the OpenGL or OpenGL ES API, extensions, or shaders.
     */
    public void setUseEs(int useEs) {
        gtk_h.gdk_gl_context_set_use_es(handle(), useEs);
    }
    
    /**
     * Clears the current `GdkGLContext`.
     * 
     * Any OpenGL call after this function returns will be ignored
     * until [method@Gdk.GLContext.make_current] is called.
     */
    public static void clearCurrent() {
        gtk_h.gdk_gl_context_clear_current();
    }
    
    /**
     * Retrieves the current `GdkGLContext`.
     */
    public static GLContext getCurrent() {
        var RESULT = gtk_h.gdk_gl_context_get_current();
        return new GLContext(References.get(RESULT, false));
    }
    
}
