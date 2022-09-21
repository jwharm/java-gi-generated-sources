package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkGLArea} is a widget that allows drawing with OpenGL.
 * <p>
 * <img src="./doc-files/glarea.png" alt="An example GtkGLArea">
 * <p>
 * {@code GtkGLArea} sets up its own {@link org.gtk.gdk.GLContext}, and creates a custom
 * GL framebuffer that the widget will do GL rendering onto. It also ensures
 * that this framebuffer is the default GL rendering target when rendering.
 * <p>
 * In order to draw, you have to connect to the {@code Gtk.GLArea::render}
 * signal, or subclass {@code GtkGLArea} and override the GtkGLAreaClass.render
 * virtual function.
 * <p>
 * The {@code GtkGLArea} widget ensures that the {@code GdkGLContext} is associated with
 * the widget's drawing area, and it is kept updated when the size and
 * position of the drawing area changes.
 * <p>
 * <h2>Drawing with GtkGLArea</h2>
 * <p>
 * The simplest way to draw using OpenGL commands in a {@code GtkGLArea} is to
 * create a widget instance and connect to the {@code Gtk.GLArea::render} signal:
 * <p>
 * The {@code render()} function will be called when the {@code GtkGLArea} is ready
 * for you to draw its content:
 * <p>
 * ``{@code c
 * static gboolean
 * render (GtkGLArea *area, GdkGLContext *context)
 * {
 *   // inside this function it's safe to use GL; the given
 *   // GdkGLContext has been made current to the drawable
 *   // surface used by the }GtkGLArea{@code  and the viewport has
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
 * }`{@code 
 * 
 * If you need to initialize OpenGL state, e.g. buffer objects or
 * shaders, you should use the [signal@Gtk.Widget::realize] signal;
 * you can use the [signal@Gtk.Widget::unrealize] signal to clean up.
 * Since the }GdkGLContext{@code  creation and initialization may fail, you
 * will need to check for errors, using [method@Gtk.GLArea.get_error].
 * 
 * An example of how to safely initialize the GL state is:
 * 
 * }`{@code c
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
 * }`{@code 
 * 
 * If you need to change the options for creating the }GdkGLContext`
 * you should use the {@code Gtk.GLArea::create-context} signal.
 */
public class GLArea extends Widget implements Accessible, Buildable, ConstraintTarget {

    public GLArea(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GLArea */
    public static GLArea castFrom(org.gtk.gobject.Object gobject) {
        return new GLArea(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_gl_area_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkGLArea} widget.
     */
    public GLArea() {
        super(constructNew());
    }
    
    /**
     * Binds buffers to the framebuffer.
     * <p>
     * Ensures that the {@code area} framebuffer object is made the current draw
     * and read target, and that all the required buffers for the {@code area}
     * are created and bound to the framebuffer.
     * <p>
     * This function is automatically called before emitting the
     * {@code Gtk.GLArea::render} signal, and doesn't normally need to be
     * called by application code.
     */
    public void attachBuffers() {
        gtk_h.gtk_gl_area_attach_buffers(handle());
    }
    
    /**
     * Returns whether the area is in auto render mode or not.
     */
    public boolean getAutoRender() {
        var RESULT = gtk_h.gtk_gl_area_get_auto_render(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves the {@code GdkGLContext} used by {@code area}.
     */
    public org.gtk.gdk.GLContext getContext() {
        var RESULT = gtk_h.gtk_gl_area_get_context(handle());
        return new org.gtk.gdk.GLContext(References.get(RESULT, false));
    }
    
    /**
     * Gets the current error set on the {@code area}.
     */
    public org.gtk.glib.Error getError() {
        var RESULT = gtk_h.gtk_gl_area_get_error(handle());
        return new org.gtk.glib.Error(References.get(RESULT, false));
    }
    
    /**
     * Returns whether the area has a depth buffer.
     */
    public boolean getHasDepthBuffer() {
        var RESULT = gtk_h.gtk_gl_area_get_has_depth_buffer(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the area has a stencil buffer.
     */
    public boolean getHasStencilBuffer() {
        var RESULT = gtk_h.gtk_gl_area_get_has_stencil_buffer(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the {@code GtkGLArea} should use OpenGL ES.
     * <p>
     * See {@link GLArea#setUseEs}.
     */
    public boolean getUseEs() {
        var RESULT = gtk_h.gtk_gl_area_get_use_es(handle());
        return (RESULT != 0);
    }
    
    /**
     * Ensures that the {@code GdkGLContext} used by {@code area} is associated with
     * the {@code GtkGLArea}.
     * <p>
     * This function is automatically called before emitting the
     * {@code Gtk.GLArea::render} signal, and doesn't normally need
     * to be called by application code.
     */
    public void makeCurrent() {
        gtk_h.gtk_gl_area_make_current(handle());
    }
    
    /**
     * Marks the currently rendered data (if any) as invalid, and queues
     * a redraw of the widget.
     * <p>
     * This ensures that the {@code Gtk.GLArea::render} signal
     * is emitted during the draw.
     * <p>
     * This is only needed when {@link GLArea#setAutoRender} has
     * been called with a <code>false</code> value. The default behaviour is to
     * emit {@code Gtk.GLArea::render} on each draw.
     */
    public void queueRender() {
        gtk_h.gtk_gl_area_queue_render(handle());
    }
    
    /**
     * Sets whether the {@code GtkGLArea} is in auto render mode.
     * <p>
     * If {@code auto_render} is <code>true</code> the {@code Gtk.GLArea::render} signal will
     * be emitted every time the widget draws. This is the default and is
     * useful if drawing the widget is faster.
     * <p>
     * If {@code auto_render} is <code>false</code> the data from previous rendering is kept
     * around and will be used for drawing the widget the next time,
     * unless the window is resized. In order to force a rendering
     * {@link GLArea#queueRender} must be called. This mode is
     * useful when the scene changes seldom, but takes a long time to redraw.
     */
    public void setAutoRender(boolean autoRender) {
        gtk_h.gtk_gl_area_set_auto_render(handle(), autoRender ? 1 : 0);
    }
    
    /**
     * Sets an error on the area which will be shown instead of the
     * GL rendering.
     * <p>
     * This is useful in the {@code Gtk.GLArea::create-context}
     * signal if GL context creation fails.
     */
    public void setError(org.gtk.glib.Error error) {
        gtk_h.gtk_gl_area_set_error(handle(), error.handle());
    }
    
    /**
     * Sets whether the {@code GtkGLArea} should use a depth buffer.
     * <p>
     * If {@code has_depth_buffer} is <code>true</code> the widget will allocate and
     * enable a depth buffer for the target framebuffer. Otherwise
     * there will be none.
     */
    public void setHasDepthBuffer(boolean hasDepthBuffer) {
        gtk_h.gtk_gl_area_set_has_depth_buffer(handle(), hasDepthBuffer ? 1 : 0);
    }
    
    /**
     * Sets whether the {@code GtkGLArea} should use a stencil buffer.
     * <p>
     * If {@code has_stencil_buffer} is <code>true</code> the widget will allocate and
     * enable a stencil buffer for the target framebuffer. Otherwise
     * there will be none.
     */
    public void setHasStencilBuffer(boolean hasStencilBuffer) {
        gtk_h.gtk_gl_area_set_has_stencil_buffer(handle(), hasStencilBuffer ? 1 : 0);
    }
    
    /**
     * Sets the required version of OpenGL to be used when creating
     * the context for the widget.
     * <p>
     * This function must be called before the area has been realized.
     */
    public void setRequiredVersion(int major, int minor) {
        gtk_h.gtk_gl_area_set_required_version(handle(), major, minor);
    }
    
    /**
     * Sets whether the {@code area} should create an OpenGL or an OpenGL ES context.
     * <p>
     * You should check the capabilities of the {@code GdkGLContext} before drawing
     * with either API.
     */
    public void setUseEs(boolean useEs) {
        gtk_h.gtk_gl_area_set_use_es(handle(), useEs ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface CreateContextHandler {
        void signalReceived(GLArea source);
    }
    
    /**
     * Emitted when the widget is being realized.
     * <p>
     * This allows you to override how the GL context is created.
     * This is useful when you want to reuse an existing GL context,
     * or if you want to try creating different kinds of GL options.
     * <p>
     * If context creation fails then the signal handler can use
     * {@link GLArea#setError} to register a more detailed error
     * of how the construction failed.
     */
    public SignalHandle onCreateContext(CreateContextHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGLAreaCreateContext", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("create-context").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RenderHandler {
        boolean signalReceived(GLArea source, org.gtk.gdk.GLContext context);
    }
    
    /**
     * Emitted every time the contents of the {@code GtkGLArea} should be redrawn.
     * <p>
     * The {@code context} is bound to the {@code area} prior to emitting this function,
     * and the buffers are painted to the window once the emission terminates.
     */
    public SignalHandle onRender(RenderHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGLAreaRender", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("render").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
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
     * <p>
     * This is useful in order to keep GL state up to date with the widget size,
     * like for instance camera properties which may depend on the width/height
     * ratio.
     * <p>
     * The GL context for the area is guaranteed to be current when this signal
     * is emitted.
     * <p>
     * The default handler sets up the GL viewport.
     */
    public SignalHandle onResize(ResizeHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGLAreaResize", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("resize").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
