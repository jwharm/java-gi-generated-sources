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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a GLArea proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected GLArea(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GLArea> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GLArea(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.refSink();
        this.takeOwnership();
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
            DowncallHandles.gtk_gl_area_attach_buffers.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.gtk_gl_area_get_auto_render.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves the {@code GdkGLContext} used by {@code area}.
     * @return the {@code GdkGLContext}
     */
    public @Nullable org.gtk.gdk.GLContext getContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gl_area_get_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.GLContext) Interop.register(RESULT, org.gtk.gdk.GLContext.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the current error set on the {@code area}.
     * @return the {@code GError}
     */
    public @Nullable org.gtk.glib.Error getError() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gl_area_get_error.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Error.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns whether the area has a depth buffer.
     * @return {@code true} if the {@code area} has a depth buffer, {@code false} otherwise
     */
    public boolean getHasDepthBuffer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gl_area_get_has_depth_buffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the area has a stencil buffer.
     * @return {@code true} if the {@code area} has a stencil buffer, {@code false} otherwise
     */
    public boolean getHasStencilBuffer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gl_area_get_has_stencil_buffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves the required version of OpenGL.
     * <p>
     * See {@link GLArea#setRequiredVersion}.
     * @param major return location for the required major version
     * @param minor return location for the required minor version
     */
    public void getRequiredVersion(Out<Integer> major, Out<Integer> minor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment majorPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment minorPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
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
            RESULT = (int) DowncallHandles.gtk_gl_area_get_use_es.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            DowncallHandles.gtk_gl_area_make_current.invokeExact(handle());
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
            DowncallHandles.gtk_gl_area_queue_render.invokeExact(handle());
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
                    Marshal.booleanToInteger.marshal(autoRender, null).intValue());
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
                    Marshal.booleanToInteger.marshal(hasDepthBuffer, null).intValue());
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
                    Marshal.booleanToInteger.marshal(hasStencilBuffer, null).intValue());
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
                    Marshal.booleanToInteger.marshal(useEs, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_gl_area_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code CreateContext} callback.
     */
    @FunctionalInterface
    public interface CreateContext {
    
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
        org.gtk.gdk.GLContext run();
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress sourceGLArea) {
            var RESULT = run();
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateContext.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("create-context", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Render} callback.
     */
    @FunctionalInterface
    public interface Render {
    
        /**
         * Emitted every time the contents of the {@code GtkGLArea} should be redrawn.
         * <p>
         * The {@code context} is bound to the {@code area} prior to emitting this function,
         * and the buffers are painted to the window once the emission terminates.
         */
        boolean run(org.gtk.gdk.GLContext context);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceGLArea, MemoryAddress context) {
            var RESULT = run((org.gtk.gdk.GLContext) Interop.register(context, org.gtk.gdk.GLContext.fromAddress).marshal(context, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Render.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("render", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Resize} callback.
     */
    @FunctionalInterface
    public interface Resize {
    
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
        void run(int width, int height);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceGLArea, int width, int height) {
            run(width, height);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Resize.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("resize", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GLArea.Builder} object constructs a {@link GLArea} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GLArea.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GLArea} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GLArea}.
         * @return A new instance of {@code GLArea} with the properties 
         *         that were set in the Builder object.
         */
        public GLArea build() {
            return (GLArea) org.gtk.gobject.GObject.newWithProperties(
                GLArea.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
        public Builder setAutoRender(boolean autoRender) {
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
        public Builder setContext(org.gtk.gdk.GLContext context) {
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
        public Builder setHasDepthBuffer(boolean hasDepthBuffer) {
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
        public Builder setHasStencilBuffer(boolean hasStencilBuffer) {
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
        public Builder setUseEs(boolean useEs) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_gl_area_get_type != null;
    }
}
