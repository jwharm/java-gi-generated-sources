package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * 
 * <h2>Drawing with GtkGLArea</h2>
 * The simplest way to draw using OpenGL commands in a {@code GtkGLArea} is to
 * create a widget instance and connect to the {@code Gtk.GLArea::render} signal:
 * <p>
 * The {@code render()} function will be called when the {@code GtkGLArea} is ready
 * for you to draw its content:
 * 
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * If you need to initialize OpenGL state, e.g. buffer objects or
 * shaders, you should use the {@code Gtk.Widget::realize} signal;
 * you can use the {@code Gtk.Widget::unrealize} signal to clean up.
 * Since the {@code GdkGLContext} creation and initialization may fail, you
 * will need to check for errors, using {@link GLArea#getError}.
 * <p>
 * An example of how to safely initialize the GL state is:
 * 
 * <pre>{@code c
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
 * }</pre>
 * <p>
 * If you need to change the options for creating the {@code GdkGLContext}
 * you should use the {@code Gtk.GLArea::create-context} signal.
 */
public class GLArea extends Widget implements Accessible, Buildable, ConstraintTarget {

    public GLArea(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GLArea */
    public static GLArea castFrom(org.gtk.gobject.Object gobject) {
        return new GLArea(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_gl_area_new = Interop.downcallHandle(
        "gtk_gl_area_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_gl_area_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkGLArea} widget.
     */
    public GLArea() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_gl_area_attach_buffers = Interop.downcallHandle(
        "gtk_gl_area_attach_buffers",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void attachBuffers() {
        try {
            gtk_gl_area_attach_buffers.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_gl_area_get_auto_render = Interop.downcallHandle(
        "gtk_gl_area_get_auto_render",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the area is in auto render mode or not.
     */
    public boolean getAutoRender() {
        int RESULT;
        try {
            RESULT = (int) gtk_gl_area_get_auto_render.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_gl_area_get_context = Interop.downcallHandle(
        "gtk_gl_area_get_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code GdkGLContext} used by {@code area}.
     */
    public @Nullable org.gtk.gdk.GLContext getContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_gl_area_get_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.GLContext(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_gl_area_get_error = Interop.downcallHandle(
        "gtk_gl_area_get_error",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current error set on the {@code area}.
     */
    public @Nullable org.gtk.glib.Error getError() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_gl_area_get_error.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Error(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_gl_area_get_has_depth_buffer = Interop.downcallHandle(
        "gtk_gl_area_get_has_depth_buffer",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the area has a depth buffer.
     */
    public boolean getHasDepthBuffer() {
        int RESULT;
        try {
            RESULT = (int) gtk_gl_area_get_has_depth_buffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_gl_area_get_has_stencil_buffer = Interop.downcallHandle(
        "gtk_gl_area_get_has_stencil_buffer",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the area has a stencil buffer.
     */
    public boolean getHasStencilBuffer() {
        int RESULT;
        try {
            RESULT = (int) gtk_gl_area_get_has_stencil_buffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_gl_area_get_required_version = Interop.downcallHandle(
        "gtk_gl_area_get_required_version",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the required version of OpenGL.
     * <p>
     * See {@link GLArea#setRequiredVersion}.
     */
    public @NotNull void getRequiredVersion(@NotNull Out<Integer> major, @NotNull Out<Integer> minor) {
        MemorySegment majorPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment minorPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            gtk_gl_area_get_required_version.invokeExact(handle(), (Addressable) majorPOINTER.address(), (Addressable) minorPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        major.set(majorPOINTER.get(ValueLayout.JAVA_INT, 0));
        minor.set(minorPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    private static final MethodHandle gtk_gl_area_get_use_es = Interop.downcallHandle(
        "gtk_gl_area_get_use_es",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code GtkGLArea} should use OpenGL ES.
     * <p>
     * See {@link GLArea#setUseEs}.
     */
    public boolean getUseEs() {
        int RESULT;
        try {
            RESULT = (int) gtk_gl_area_get_use_es.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_gl_area_make_current = Interop.downcallHandle(
        "gtk_gl_area_make_current",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Ensures that the {@code GdkGLContext} used by {@code area} is associated with
     * the {@code GtkGLArea}.
     * <p>
     * This function is automatically called before emitting the
     * {@code Gtk.GLArea::render} signal, and doesn't normally need
     * to be called by application code.
     */
    public @NotNull void makeCurrent() {
        try {
            gtk_gl_area_make_current.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_gl_area_queue_render = Interop.downcallHandle(
        "gtk_gl_area_queue_render",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Marks the currently rendered data (if any) as invalid, and queues
     * a redraw of the widget.
     * <p>
     * This ensures that the {@code Gtk.GLArea::render} signal
     * is emitted during the draw.
     * <p>
     * This is only needed when {@link GLArea#setAutoRender} has
     * been called with a {@code false} value. The default behaviour is to
     * emit {@code Gtk.GLArea::render} on each draw.
     */
    public @NotNull void queueRender() {
        try {
            gtk_gl_area_queue_render.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_gl_area_set_auto_render = Interop.downcallHandle(
        "gtk_gl_area_set_auto_render",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code GtkGLArea} is in auto render mode.
     * <p>
     * If {@code auto_render} is {@code true} the {@code Gtk.GLArea::render} signal will
     * be emitted every time the widget draws. This is the default and is
     * useful if drawing the widget is faster.
     * <p>
     * If {@code auto_render} is {@code false} the data from previous rendering is kept
     * around and will be used for drawing the widget the next time,
     * unless the window is resized. In order to force a rendering
     * {@link GLArea#queueRender} must be called. This mode is
     * useful when the scene changes seldom, but takes a long time to redraw.
     */
    public @NotNull void setAutoRender(@NotNull boolean autoRender) {
        try {
            gtk_gl_area_set_auto_render.invokeExact(handle(), autoRender ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_gl_area_set_error = Interop.downcallHandle(
        "gtk_gl_area_set_error",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets an error on the area which will be shown instead of the
     * GL rendering.
     * <p>
     * This is useful in the {@code Gtk.GLArea::create-context}
     * signal if GL context creation fails.
     */
    public @NotNull void setError(@Nullable org.gtk.glib.Error error) {
        try {
            gtk_gl_area_set_error.invokeExact(handle(), error.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_gl_area_set_has_depth_buffer = Interop.downcallHandle(
        "gtk_gl_area_set_has_depth_buffer",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code GtkGLArea} should use a depth buffer.
     * <p>
     * If {@code has_depth_buffer} is {@code true} the widget will allocate and
     * enable a depth buffer for the target framebuffer. Otherwise
     * there will be none.
     */
    public @NotNull void setHasDepthBuffer(@NotNull boolean hasDepthBuffer) {
        try {
            gtk_gl_area_set_has_depth_buffer.invokeExact(handle(), hasDepthBuffer ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_gl_area_set_has_stencil_buffer = Interop.downcallHandle(
        "gtk_gl_area_set_has_stencil_buffer",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code GtkGLArea} should use a stencil buffer.
     * <p>
     * If {@code has_stencil_buffer} is {@code true} the widget will allocate and
     * enable a stencil buffer for the target framebuffer. Otherwise
     * there will be none.
     */
    public @NotNull void setHasStencilBuffer(@NotNull boolean hasStencilBuffer) {
        try {
            gtk_gl_area_set_has_stencil_buffer.invokeExact(handle(), hasStencilBuffer ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_gl_area_set_required_version = Interop.downcallHandle(
        "gtk_gl_area_set_required_version",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the required version of OpenGL to be used when creating
     * the context for the widget.
     * <p>
     * This function must be called before the area has been realized.
     */
    public @NotNull void setRequiredVersion(@NotNull int major, @NotNull int minor) {
        try {
            gtk_gl_area_set_required_version.invokeExact(handle(), major, minor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_gl_area_set_use_es = Interop.downcallHandle(
        "gtk_gl_area_set_use_es",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code area} should create an OpenGL or an OpenGL ES context.
     * <p>
     * You should check the capabilities of the {@code GdkGLContext} before drawing
     * with either API.
     */
    public @NotNull void setUseEs(@NotNull boolean useEs) {
        try {
            gtk_gl_area_set_use_es.invokeExact(handle(), useEs ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("create-context"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GLArea.Callbacks.class, "signalGLAreaCreateContext",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RenderHandler {
        boolean signalReceived(GLArea source, @NotNull org.gtk.gdk.GLContext context);
    }
    
    /**
     * Emitted every time the contents of the {@code GtkGLArea} should be redrawn.
     * <p>
     * The {@code context} is bound to the {@code area} prior to emitting this function,
     * and the buffers are painted to the window once the emission terminates.
     */
    public SignalHandle onRender(RenderHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("render"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GLArea.Callbacks.class, "signalGLAreaRender",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ResizeHandler {
        void signalReceived(GLArea source, @NotNull int width, @NotNull int height);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("resize"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GLArea.Callbacks.class, "signalGLAreaResize",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalGLAreaCreateContext(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GLArea.CreateContextHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GLArea(Refcounted.get(source)));
        }
        
        public static boolean signalGLAreaRender(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GLArea.RenderHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new GLArea(Refcounted.get(source)), new org.gtk.gdk.GLContext(Refcounted.get(context, false)));
        }
        
        public static void signalGLAreaResize(MemoryAddress source, int width, int height, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GLArea.ResizeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GLArea(Refcounted.get(source)), width, height);
        }
        
    }
}
