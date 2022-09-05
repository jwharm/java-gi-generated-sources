package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkGLArea` is a widget that allows drawing with OpenGL.
 * 
 * ![An example GtkGLArea](glarea.png)
 * 
 * `GtkGLArea` sets up its own [class@Gdk.GLContext], and creates a custom
 * GL framebuffer that the widget will do GL rendering onto. It also ensures
 * that this framebuffer is the default GL rendering target when rendering.
 * 
 * In order to draw, you have to connect to the [signal@Gtk.GLArea::render]
 * signal, or subclass `GtkGLArea` and override the GtkGLAreaClass.render
 * virtual function.
 * 
 * The `GtkGLArea` widget ensures that the `GdkGLContext` is associated with
 * the widget's drawing area, and it is kept updated when the size and
 * position of the drawing area changes.
 * 
 * ## Drawing with GtkGLArea
 * 
 * The simplest way to draw using OpenGL commands in a `GtkGLArea` is to
 * create a widget instance and connect to the [signal@Gtk.GLArea::render] signal:
 * 
 * The `render()` function will be called when the `GtkGLArea` is ready
 * for you to draw its content:
 * 
 * ```c
 * static gboolean
 * render (GtkGLArea *area, GdkGLContext *context)
 * {
 *   // inside this function it's safe to use GL; the given
 *   // GdkGLContext has been made current to the drawable
 *   // surface used by the `GtkGLArea` and the viewport has
 *   // already been set to be the size of the allocation
 * 
 *   // we can start by clearing the buffer
 *   glClearColor (0, 0, 0, 0);
 *   glClear (GL_COLOR_BUFFER_BIT);
 * 
 *   // draw your object
 *   // draw_an_object ();
 * 
 *   // we completed our drawing; the draw commands will be
 *   // flushed at the end of the signal emission chain, and
 *   // the buffers will be drawn on the window
 *   return TRUE;
 * }
 * 
 * void setup_glarea (void)
 * {
 *   // create a GtkGLArea instance
 *   GtkWidget *gl_area = gtk_gl_area_new ();
 * 
 *   // connect to the "render" signal
 *   g_signal_connect (gl_area, "render", G_CALLBACK (render), NULL);
 * }
 * ```
 * 
 * If you need to initialize OpenGL state, e.g. buffer objects or
 * shaders, you should use the [signal@Gtk.Widget::realize] signal;
 * you can use the [signal@Gtk.Widget::unrealize] signal to clean up.
 * Since the `GdkGLContext` creation and initialization may fail, you
 * will need to check for errors, using [method@Gtk.GLArea.get_error].
 * 
 * An example of how to safely initialize the GL state is:
 * 
 * ```c
 * static void
 * on_realize (GtkGLarea *area)
 * {
 *   // We need to make the context current if we want to
 *   // call GL API
 *   gtk_gl_area_make_current (area);
 * 
 *   // If there were errors during the initialization or
 *   // when trying to make the context current, this
 *   // function will return a GError for you to catch
 *   if (gtk_gl_area_get_error (area) != NULL)
 *     return;
 * 
 *   // You can also use gtk_gl_area_set_error() in order
 *   // to show eventual initialization errors on the
 *   // GtkGLArea widget itself
 *   GError *internal_error = NULL;
 *   init_buffer_objects (&error);
 *   if (error != NULL)
 *     {
 *       gtk_gl_area_set_error (area, error);
 *       g_error_free (error);
 *       return;
 *     }
 * 
 *   init_shaders (&error);
 *   if (error != NULL)
 *     {
 *       gtk_gl_area_set_error (area, error);
 *       g_error_free (error);
 *       return;
 *     }
 * }
 * ```
 * 
 * If you need to change the options for creating the `GdkGLContext`
 * you should use the [signal@Gtk.GLArea::create-context] signal.
 */
public class GLArea extends Widget implements Accessible, Buildable, ConstraintTarget {

    public GLArea(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to GLArea */
    public static GLArea castFrom(org.gtk.gobject.Object gobject) {
        return new GLArea(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkGLArea` widget.
     */
    public GLArea() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_new(), false));
    }
    
    /**
     * Binds buffers to the framebuffer.
     * 
     * Ensures that the @area framebuffer object is made the current draw
     * and read target, and that all the required buffers for the @area
     * are created and bound to the framebuffer.
     * 
     * This function is automatically called before emitting the
     * [signal@Gtk.GLArea::render] signal, and doesn't normally need to be
     * called by application code.
     */
    public void attachBuffers() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_attach_buffers(HANDLE());
    }
    
    /**
     * Returns whether the area is in auto render mode or not.
     */
    public boolean getAutoRender() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_get_auto_render(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the `GdkGLContext` used by @area.
     */
    public org.gtk.gdk.GLContext getContext() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_get_context(HANDLE());
        return new org.gtk.gdk.GLContext(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the current error set on the @area.
     */
    public org.gtk.glib.Error getError() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_get_error(HANDLE());
        return new org.gtk.glib.Error(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns whether the area has a depth buffer.
     */
    public boolean getHasDepthBuffer() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_get_has_depth_buffer(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the area has a stencil buffer.
     */
    public boolean getHasStencilBuffer() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_get_has_stencil_buffer(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the `GtkGLArea` should use OpenGL ES.
     * 
     * See [method@Gtk.GLArea.set_use_es].
     */
    public boolean getUseEs() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_get_use_es(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Ensures that the `GdkGLContext` used by @area is associated with
     * the `GtkGLArea`.
     * 
     * This function is automatically called before emitting the
     * [signal@Gtk.GLArea::render] signal, and doesn't normally need
     * to be called by application code.
     */
    public void makeCurrent() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_make_current(HANDLE());
    }
    
    /**
     * Marks the currently rendered data (if any) as invalid, and queues
     * a redraw of the widget.
     * 
     * This ensures that the [signal@Gtk.GLArea::render] signal
     * is emitted during the draw.
     * 
     * This is only needed when [method@Gtk.GLArea.set_auto_render] has
     * been called with a %FALSE value. The default behaviour is to
     * emit [signal@Gtk.GLArea::render] on each draw.
     */
    public void queueRender() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_queue_render(HANDLE());
    }
    
    /**
     * Sets whether the `GtkGLArea` is in auto render mode.
     * 
     * If @auto_render is %TRUE the [signal@Gtk.GLArea::render] signal will
     * be emitted every time the widget draws. This is the default and is
     * useful if drawing the widget is faster.
     * 
     * If @auto_render is %FALSE the data from previous rendering is kept
     * around and will be used for drawing the widget the next time,
     * unless the window is resized. In order to force a rendering
     * [method@Gtk.GLArea.queue_render] must be called. This mode is
     * useful when the scene changes seldom, but takes a long time to redraw.
     */
    public void setAutoRender(boolean autoRender) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_set_auto_render(HANDLE(), autoRender ? 1 : 0);
    }
    
    /**
     * Sets an error on the area which will be shown instead of the
     * GL rendering.
     * 
     * This is useful in the [signal@Gtk.GLArea::create-context]
     * signal if GL context creation fails.
     */
    public void setError(org.gtk.glib.Error error) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_set_error(HANDLE(), error.HANDLE());
    }
    
    /**
     * Sets whether the `GtkGLArea` should use a depth buffer.
     * 
     * If @has_depth_buffer is %TRUE the widget will allocate and
     * enable a depth buffer for the target framebuffer. Otherwise
     * there will be none.
     */
    public void setHasDepthBuffer(boolean hasDepthBuffer) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_set_has_depth_buffer(HANDLE(), hasDepthBuffer ? 1 : 0);
    }
    
    /**
     * Sets whether the `GtkGLArea` should use a stencil buffer.
     * 
     * If @has_stencil_buffer is %TRUE the widget will allocate and
     * enable a stencil buffer for the target framebuffer. Otherwise
     * there will be none.
     */
    public void setHasStencilBuffer(boolean hasStencilBuffer) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_set_has_stencil_buffer(HANDLE(), hasStencilBuffer ? 1 : 0);
    }
    
    /**
     * Sets the required version of OpenGL to be used when creating
     * the context for the widget.
     * 
     * This function must be called before the area has been realized.
     */
    public void setRequiredVersion(int major, int minor) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_set_required_version(HANDLE(), major, minor);
    }
    
    /**
     * Sets whether the @area should create an OpenGL or an OpenGL ES context.
     * 
     * You should check the capabilities of the `GdkGLContext` before drawing
     * with either API.
     */
    public void setUseEs(boolean useEs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_gl_area_set_use_es(HANDLE(), useEs ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface CreateContextHandler {
        void signalReceived(GLArea source);
    }
    
    /**
     * Emitted when the widget is being realized.
     * 
     * This allows you to override how the GL context is created.
     * This is useful when you want to reuse an existing GL context,
     * or if you want to try creating different kinds of GL options.
     * 
     * If context creation fails then the signal handler can use
     * [method@Gtk.GLArea.set_error] to register a more detailed error
     * of how the construction failed.
     */
    public void onCreateContext(CreateContextHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGLAreaCreateContext", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("create-context"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RenderHandler {
        boolean signalReceived(GLArea source, org.gtk.gdk.GLContext context);
    }
    
    /**
     * Emitted every time the contents of the `GtkGLArea` should be redrawn.
     * 
     * The @context is bound to the @area prior to emitting this function,
     * and the buffers are painted to the window once the emission terminates.
     */
    public void onRender(RenderHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGLAreaRender", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("render"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ResizeHandler {
        void signalReceived(GLArea source, int width, int height);
    }
    
    /**
     * Emitted once when the widget is realized, and then each time the widget
     * is changed while realized.
     * 
     * This is useful in order to keep GL state up to date with the widget size,
     * like for instance camera properties which may depend on the width/height
     * ratio.
     * 
     * The GL context for the area is guaranteed to be current when this signal
     * is emitted.
     * 
     * The default handler sets up the GL viewport.
     */
    public void onResize(ResizeHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGLAreaResize", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("resize"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
