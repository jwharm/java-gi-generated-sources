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
 * <p>
 * <strong>Drawing with GtkGLArea</strong><br/>
 * The simplest way to draw using OpenGL commands in a {@code GtkGLArea} is to
 * create a widget instance and connect to the {@code Gtk.GLArea::render} signal:
 * <p>
 * The {@code render()} function will be called when the {@code GtkGLArea} is ready
 * for you to draw its content:
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
public class GLArea extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGLArea";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
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
     * Create a GLArea proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GLArea(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GLArea if its GType is a (or inherits from) "GtkGLArea".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GLArea} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGLArea", a ClassCastException will be thrown.
     */
    public static GLArea castFrom(org.gtk.gobject.Object gobject) {
            return new GLArea(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gl_area_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkGLArea} widget.
     */
    public GLArea() {
        super(constructNew(), Ownership.NONE);
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
        try {
            DowncallHandles.gtk_gl_area_attach_buffers.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns whether the area is in auto render mode or not.
     * @return {@code true} if the {@code area} is auto rendering, {@code false} otherwise
     */
    public boolean getAutoRender() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gl_area_get_auto_render.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the {@code GdkGLContext} used by {@code area}.
     * @return the {@code GdkGLContext}
     */
    public @Nullable org.gtk.gdk.GLContext getContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gl_area_get_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.GLContext(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the current error set on the {@code area}.
     * @return the {@code GError}
     */
    public @Nullable org.gtk.glib.Error getError() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gl_area_get_error.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Error(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns whether the area has a depth buffer.
     * @return {@code true} if the {@code area} has a depth buffer, {@code false} otherwise
     */
    public boolean getHasDepthBuffer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gl_area_get_has_depth_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the area has a stencil buffer.
     * @return {@code true} if the {@code area} has a stencil buffer, {@code false} otherwise
     */
    public boolean getHasStencilBuffer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gl_area_get_has_stencil_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Retrieves the required version of OpenGL.
     * <p>
     * See {@link GLArea#setRequiredVersion}.
     * @param major return location for the required major version
     * @param minor return location for the required minor version
     */
    public void getRequiredVersion(Out<Integer> major, Out<Integer> minor) {
        java.util.Objects.requireNonNull(major, "Parameter 'major' must not be null");
        MemorySegment majorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(minor, "Parameter 'minor' must not be null");
        MemorySegment minorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_gl_area_get_required_version.invokeExact(
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
     * Returns whether the {@code GtkGLArea} should use OpenGL ES.
     * <p>
     * See {@link GLArea#setUseEs}.
     * @return {@code true} if the {@code GtkGLArea} should create an OpenGL ES context
     *   and {@code false} otherwise
     */
    public boolean getUseEs() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gl_area_get_use_es.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
        try {
            DowncallHandles.gtk_gl_area_make_current.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
    public void queueRender() {
        try {
            DowncallHandles.gtk_gl_area_queue_render.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param autoRender a boolean
     */
    public void setAutoRender(boolean autoRender) {
        try {
            DowncallHandles.gtk_gl_area_set_auto_render.invokeExact(
                    handle(),
                    autoRender ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets an error on the area which will be shown instead of the
     * GL rendering.
     * <p>
     * This is useful in the {@code Gtk.GLArea::create-context}
     * signal if GL context creation fails.
     * @param error a new {@code GError}, or {@code null} to unset the error
     */
    public void setError(@Nullable org.gtk.glib.Error error) {
        try {
            DowncallHandles.gtk_gl_area_set_error.invokeExact(
                    handle(),
                    (Addressable) (error == null ? MemoryAddress.NULL : error.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code GtkGLArea} should use a depth buffer.
     * <p>
     * If {@code has_depth_buffer} is {@code true} the widget will allocate and
     * enable a depth buffer for the target framebuffer. Otherwise
     * there will be none.
     * @param hasDepthBuffer {@code true} to add a depth buffer
     */
    public void setHasDepthBuffer(boolean hasDepthBuffer) {
        try {
            DowncallHandles.gtk_gl_area_set_has_depth_buffer.invokeExact(
                    handle(),
                    hasDepthBuffer ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code GtkGLArea} should use a stencil buffer.
     * <p>
     * If {@code has_stencil_buffer} is {@code true} the widget will allocate and
     * enable a stencil buffer for the target framebuffer. Otherwise
     * there will be none.
     * @param hasStencilBuffer {@code true} to add a stencil buffer
     */
    public void setHasStencilBuffer(boolean hasStencilBuffer) {
        try {
            DowncallHandles.gtk_gl_area_set_has_stencil_buffer.invokeExact(
                    handle(),
                    hasStencilBuffer ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the required version of OpenGL to be used when creating
     * the context for the widget.
     * <p>
     * This function must be called before the area has been realized.
     * @param major the major version
     * @param minor the minor version
     */
    public void setRequiredVersion(int major, int minor) {
        try {
            DowncallHandles.gtk_gl_area_set_required_version.invokeExact(
                    handle(),
                    major,
                    minor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code area} should create an OpenGL or an OpenGL ES context.
     * <p>
     * You should check the capabilities of the {@code GdkGLContext} before drawing
     * with either API.
     * @param useEs whether to use OpenGL or OpenGL ES
     */
    public void setUseEs(boolean useEs) {
        try {
            DowncallHandles.gtk_gl_area_set_use_es.invokeExact(
                    handle(),
                    useEs ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gtk_gl_area_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface CreateContext {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GLArea.CreateContext> onCreateContext(GLArea.CreateContext handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("create-context"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GLArea.Callbacks.class, "signalGLAreaCreateContext",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GLArea.CreateContext>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Render {
        boolean signalReceived(GLArea source, @NotNull org.gtk.gdk.GLContext context);
    }
    
    /**
     * Emitted every time the contents of the {@code GtkGLArea} should be redrawn.
     * <p>
     * The {@code context} is bound to the {@code area} prior to emitting this function,
     * and the buffers are painted to the window once the emission terminates.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GLArea.Render> onRender(GLArea.Render handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("render"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GLArea.Callbacks.class, "signalGLAreaRender",
                        MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GLArea.Render>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Resize {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GLArea.Resize> onResize(GLArea.Resize handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("resize"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GLArea.Callbacks.class, "signalGLAreaResize",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GLArea.Resize>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link GLArea.Build} object constructs a {@link GLArea} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GLArea} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLArea} using {@link GLArea#castFrom}.
         * @return A new instance of {@code GLArea} with the properties 
         *         that were set in the Build object.
         */
        public GLArea construct() {
            return GLArea.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GLArea.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * If set to {@code true} the ::render signal will be emitted every time
         * the widget draws.
         * <p>
         * This is the default and is useful if drawing the widget is faster.
         * <p>
         * If set to {@code false} the data from previous rendering is kept around and will
         * be used for drawing the widget the next time, unless the window is resized.
         * In order to force a rendering {@link GLArea#queueRender} must be called.
         * This mode is useful when the scene changes seldom, but takes a long time
         * to redraw.
         * @param autoRender The value for the {@code auto-render} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAutoRender(boolean autoRender) {
            names.add("auto-render");
            values.add(org.gtk.gobject.Value.create(autoRender));
            return this;
        }
        
        /**
         * The {@code GdkGLContext} used by the {@code GtkGLArea} widget.
         * <p>
         * The {@code GtkGLArea} widget is responsible for creating the {@code GdkGLContext}
         * instance. If you need to render with other kinds of buffers (stencil,
         * depth, etc), use render buffers.
         * @param context The value for the {@code context} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setContext(org.gtk.gdk.GLContext context) {
            names.add("context");
            values.add(org.gtk.gobject.Value.create(context));
            return this;
        }
        
        /**
         * If set to {@code true} the widget will allocate and enable a depth buffer for the
         * target framebuffer.
         * <p>
         * Setting this property will enable GL's depth testing as a side effect. If
         * you don't need depth testing, you should call {@code glDisable(GL_DEPTH_TEST)}
         * in your {@code GtkGLArea::render} handler.
         * @param hasDepthBuffer The value for the {@code has-depth-buffer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHasDepthBuffer(boolean hasDepthBuffer) {
            names.add("has-depth-buffer");
            values.add(org.gtk.gobject.Value.create(hasDepthBuffer));
            return this;
        }
        
        /**
         * If set to {@code true} the widget will allocate and enable a stencil buffer for the
         * target framebuffer.
         * @param hasStencilBuffer The value for the {@code has-stencil-buffer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHasStencilBuffer(boolean hasStencilBuffer) {
            names.add("has-stencil-buffer");
            values.add(org.gtk.gobject.Value.create(hasStencilBuffer));
            return this;
        }
        
        /**
         * If set to {@code true} the widget will try to create a {@code GdkGLContext} using
         * OpenGL ES instead of OpenGL.
         * @param useEs The value for the {@code use-es} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUseEs(boolean useEs) {
            names.add("use-es");
            values.add(org.gtk.gobject.Value.create(useEs));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gl_area_new = Interop.downcallHandle(
            "gtk_gl_area_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gl_area_attach_buffers = Interop.downcallHandle(
            "gtk_gl_area_attach_buffers",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gl_area_get_auto_render = Interop.downcallHandle(
            "gtk_gl_area_get_auto_render",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gl_area_get_context = Interop.downcallHandle(
            "gtk_gl_area_get_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gl_area_get_error = Interop.downcallHandle(
            "gtk_gl_area_get_error",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gl_area_get_has_depth_buffer = Interop.downcallHandle(
            "gtk_gl_area_get_has_depth_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gl_area_get_has_stencil_buffer = Interop.downcallHandle(
            "gtk_gl_area_get_has_stencil_buffer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gl_area_get_required_version = Interop.downcallHandle(
            "gtk_gl_area_get_required_version",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gl_area_get_use_es = Interop.downcallHandle(
            "gtk_gl_area_get_use_es",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gl_area_make_current = Interop.downcallHandle(
            "gtk_gl_area_make_current",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gl_area_queue_render = Interop.downcallHandle(
            "gtk_gl_area_queue_render",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gl_area_set_auto_render = Interop.downcallHandle(
            "gtk_gl_area_set_auto_render",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_gl_area_set_error = Interop.downcallHandle(
            "gtk_gl_area_set_error",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gl_area_set_has_depth_buffer = Interop.downcallHandle(
            "gtk_gl_area_set_has_depth_buffer",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_gl_area_set_has_stencil_buffer = Interop.downcallHandle(
            "gtk_gl_area_set_has_stencil_buffer",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_gl_area_set_required_version = Interop.downcallHandle(
            "gtk_gl_area_set_required_version",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_gl_area_set_use_es = Interop.downcallHandle(
            "gtk_gl_area_set_use_es",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_gl_area_get_type = Interop.downcallHandle(
            "gtk_gl_area_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalGLAreaCreateContext(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GLArea.CreateContext) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GLArea(source, Ownership.NONE));
        }
        
        public static boolean signalGLAreaRender(MemoryAddress source, MemoryAddress context, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GLArea.Render) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new GLArea(source, Ownership.NONE), new org.gtk.gdk.GLContext(context, Ownership.NONE));
        }
        
        public static void signalGLAreaResize(MemoryAddress source, int width, int height, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GLArea.Resize) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GLArea(source, Ownership.NONE), width, height);
        }
    }
}
