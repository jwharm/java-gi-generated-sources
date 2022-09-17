package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkGLArea</code> is a widget that allows drawing with OpenGL.
 * <p>
 * !{@link [An example GtkGLArea]}(glarea.png)
 * <p><code>GtkGLArea</code> sets up its own {@link org.gtk.gdk.GLContext}, and creates a custom
 * GL framebuffer that the widget will do GL rendering onto. It also ensures
 * that this framebuffer is the default GL rendering target when rendering.
 * <p>
 * In order to draw, you have to connect to the {@link [signal@Gtk.GLArea::render] (ref=signal)}
 * signal, or subclass <code>GtkGLArea</code> and override the GtkGLAreaClass.render
 * virtual function.
 * <p>
 * The <code>GtkGLArea</code> widget ensures that the <code>GdkGLContext</code> is associated with
 * the widget&#39;s drawing area, and it is kept updated when the size and
 * position of the drawing area changes.
 * <p>
 * <h2>Drawing with GtkGLArea</h2>
 * <p>
 * The simplest way to draw using OpenGL commands in a <code>GtkGLArea</code> is to
 * create a widget instance and connect to the {@link [signal@Gtk.GLArea::render] (ref=signal)} signal:
 * <p>
 * The <code>render()</code> function will be called when the <code>GtkGLArea</code> is ready
 * for you to draw its content:
 * <p><pre>c
 * static gboolean
 * render (GtkGLArea *area, GdkGLContext *context)
 * {
 *   // inside this function it&#39;s safe to use GL; the given
 *   // GdkGLContext has been made current to the drawable
 *   // surface used by the <code>GtkGLArea</code> and the viewport has
 *   // already been set to be the size of the allocation
 * <p>
 *   // we can start by clearing the buffer
 *   glClearColor (0, 0, 0, 0);
 *   glClear (GL_COLOR_BUFFER_BIT);
 * <p>
 *   // draw your object
 *   // draw_an_object ();
 * <p>
 *   // we completed our drawing; the draw commands will be
 *   // flushed at the end of the signal emission chain, and
 *   // the buffers will be drawn on the window
 *   return TRUE;
 * }
 * <p>
 * void setup_glarea (void)
 * {
 *   // create a GtkGLArea instance
 *   GtkWidget *gl_area = gtk_gl_area_new ();
 * <p>
 *   // connect to the &#34;render&#34; signal
 *   g_signal_connect (gl_area, &#34;render&#34;, G_CALLBACK (render), NULL);
 * }
 * </pre>
 * <p>
 * If you need to initialize OpenGL state, e.g. buffer objects or
 * shaders, you should use the {@link [signal@Gtk.Widget::realize] (ref=signal)} signal;
 * you can use the {@link [signal@Gtk.Widget::unrealize] (ref=signal)} signal to clean up.
 * Since the <code>GdkGLContext</code> creation and initialization may fail, you
 * will need to check for errors, using {@link org.gtk.gtk.GLArea#getError}.
 * <p>
 * An example of how to safely initialize the GL state is:
 * <p><pre>c
 * static void
 * on_realize (GtkGLarea *area)
 * {
 *   // We need to make the context current if we want to
 *   // call GL API
 *   gtk_gl_area_make_current (area);
 * <p>
 *   // If there were errors during the initialization or
 *   // when trying to make the context current, this
 *   // function will return a GError for you to catch
 *   if (gtk_gl_area_get_error (area) != NULL)
 *     return;
 * <p>
 *   // You can also use gtk_gl_area_set_error() in order
 *   // to show eventual initialization errors on the
 *   // GtkGLArea widget itself
 *   GError *internal_error = NULL;
 *   init_buffer_objects (&#38;error);
 *   if (error != NULL)
 *     {
 *       gtk_gl_area_set_error (area, error);
 *       g_error_free (error);
 *       return;
 *     }
 * <p>
 *   init_shaders (&#38;error);
 *   if (error != NULL)
 *     {
 *       gtk_gl_area_set_error (area, error);
 *       g_error_free (error);
 *       return;
 *     }
 * }
 * </pre>
 * <p>
 * If you need to change the options for creating the <code>GdkGLContext</code>
 * you should use the {@link [signal@Gtk.GLArea::create-context] (ref=signal)} signal.
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
     * Creates a new <code>GtkGLArea</code> widget.
     */
    public GLArea() {
        super(constructNew());
    }
    
    /**
     * Binds buffers to the framebuffer.
     * 
     * Ensures that the @area framebuffer object is made the current draw
     * and read target, and that all the required buffers for the @area
     * are created and bound to the framebuffer.
     * 
     * This function is automatically called before emitting the
     * {@link [signal@Gtk.GLArea::render] (ref=signal)} signal, and doesn&#39;t normally need to be
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
     * Retrieves the <code>GdkGLContext</code> used by @area.
     */
    public org.gtk.gdk.GLContext getContext() {
        var RESULT = gtk_h.gtk_gl_area_get_context(handle());
        return new org.gtk.gdk.GLContext(References.get(RESULT, false));
    }
    
    /**
     * Gets the current error set on the @area.
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
     * Returns whether the <code>GtkGLArea</code> should use OpenGL ES.
     * 
     * See {@link org.gtk.gtk.GLArea#setUseEs}.
     */
    public boolean getUseEs() {
        var RESULT = gtk_h.gtk_gl_area_get_use_es(handle());
        return (RESULT != 0);
    }
    
    /**
     * Ensures that the <code>GdkGLContext</code> used by @area is associated with
     * the <code>GtkGLArea</code>.
     * 
     * This function is automatically called before emitting the
     * {@link [signal@Gtk.GLArea::render] (ref=signal)} signal, and doesn&#39;t normally need
     * to be called by application code.
     */
    public void makeCurrent() {
        gtk_h.gtk_gl_area_make_current(handle());
    }
    
    /**
     * Marks the currently rendered data (if any) as invalid, and queues
     * a redraw of the widget.
     * 
     * This ensures that the {@link [signal@Gtk.GLArea::render] (ref=signal)} signal
     * is emitted during the draw.
     * 
     * This is only needed when {@link org.gtk.gtk.GLArea#setAutoRender} has
     * been called with a <code>false</code> value. The default behaviour is to
     * emit {@link [signal@Gtk.GLArea::render] (ref=signal)} on each draw.
     */
    public void queueRender() {
        gtk_h.gtk_gl_area_queue_render(handle());
    }
    
    /**
     * Sets whether the <code>GtkGLArea</code> is in auto render mode.
     * 
     * If @auto_render is <code>true</code> the {@link [signal@Gtk.GLArea::render] (ref=signal)} signal will
     * be emitted every time the widget draws. This is the default and is
     * useful if drawing the widget is faster.
     * 
     * If @auto_render is <code>false</code> the data from previous rendering is kept
     * around and will be used for drawing the widget the next time,
     * unless the window is resized. In order to force a rendering
     * {@link org.gtk.gtk.GLArea#queueRender} must be called. This mode is
     * useful when the scene changes seldom, but takes a long time to redraw.
     */
    public void setAutoRender(boolean autoRender) {
        gtk_h.gtk_gl_area_set_auto_render(handle(), autoRender ? 1 : 0);
    }
    
    /**
     * Sets an error on the area which will be shown instead of the
     * GL rendering.
     * 
     * This is useful in the {@link [signal@Gtk.GLArea::create-context] (ref=signal)}
     * signal if GL context creation fails.
     */
    public void setError(org.gtk.glib.Error error) {
        gtk_h.gtk_gl_area_set_error(handle(), error.handle());
    }
    
    /**
     * Sets whether the <code>GtkGLArea</code> should use a depth buffer.
     * 
     * If @has_depth_buffer is <code>true</code> the widget will allocate and
     * enable a depth buffer for the target framebuffer. Otherwise
     * there will be none.
     */
    public void setHasDepthBuffer(boolean hasDepthBuffer) {
        gtk_h.gtk_gl_area_set_has_depth_buffer(handle(), hasDepthBuffer ? 1 : 0);
    }
    
    /**
     * Sets whether the <code>GtkGLArea</code> should use a stencil buffer.
     * 
     * If @has_stencil_buffer is <code>true</code> the widget will allocate and
     * enable a stencil buffer for the target framebuffer. Otherwise
     * there will be none.
     */
    public void setHasStencilBuffer(boolean hasStencilBuffer) {
        gtk_h.gtk_gl_area_set_has_stencil_buffer(handle(), hasStencilBuffer ? 1 : 0);
    }
    
    /**
     * Sets the required version of OpenGL to be used when creating
     * the context for the widget.
     * 
     * This function must be called before the area has been realized.
     */
    public void setRequiredVersion(int major, int minor) {
        gtk_h.gtk_gl_area_set_required_version(handle(), major, minor);
    }
    
    /**
     * Sets whether the @area should create an OpenGL or an OpenGL ES context.
     * <p>
     * You should check the capabilities of the <code>GdkGLContext</code> before drawing
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
     * 
     * This allows you to override how the GL context is created.
     * This is useful when you want to reuse an existing GL context,
     * or if you want to try creating different kinds of GL options.
     * 
     * If context creation fails then the signal handler can use
     * {@link org.gtk.gtk.GLArea#setError} to register a more detailed error
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
     * Emitted every time the contents of the <code>GtkGLArea</code> should be redrawn.
     * 
     * The @context is bound to the @area prior to emitting this function,
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
