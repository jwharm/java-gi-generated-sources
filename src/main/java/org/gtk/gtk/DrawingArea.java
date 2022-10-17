package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkDrawingArea} is a widget that allows drawing with cairo.
 * <p>
 * <img src="./doc-files/drawingarea.png" alt="An example GtkDrawingArea">
 * <p>
 * It’s essentially a blank widget; you can draw on it. After
 * creating a drawing area, the application may want to connect to:
 * <ul>
 * <li>The {@code Gtk.Widget::realize} signal to take any necessary actions
 *   when the widget is instantiated on a particular display.
 *   (Create GDK resources in response to this signal.)
 * <li>The {@code Gtk.DrawingArea::resize} signal to take any necessary
 *   actions when the widget changes size.
 * <li>Call {@link DrawingArea#setDrawFunc} to handle redrawing the
 *   contents of the widget.
 * </ul>
 * <p>
 * The following code portion demonstrates using a drawing
 * area to display a circle in the normal widget foreground
 * color.
 * 
 * <h2>Simple GtkDrawingArea usage</h2>
 * <pre>{@code c
 * static void
 * draw_function (GtkDrawingArea *area,
 *                cairo_t        *cr,
 *                int             width,
 *                int             height,
 *                gpointer        data)
 * {
 *   GdkRGBA color;
 *   GtkStyleContext *context;
 * 
 *   context = gtk_widget_get_style_context (GTK_WIDGET (area));
 * 
 *   cairo_arc (cr,
 *              width / 2.0, height / 2.0,
 *              MIN (width, height) / 2.0,
 *              0, 2 * G_PI);
 * 
 *   gtk_style_context_get_color (context,
 *                                &color);
 *   gdk_cairo_set_source_rgba (cr, &color);
 * 
 *   cairo_fill (cr);
 * }
 * 
 * int
 * main (int argc, char **argv)
 * {
 *   gtk_init ();
 * 
 *   GtkWidget *area = gtk_drawing_area_new ();
 *   gtk_drawing_area_set_content_width (GTK_DRAWING_AREA (area), 100);
 *   gtk_drawing_area_set_content_height (GTK_DRAWING_AREA (area), 100);
 *   gtk_drawing_area_set_draw_func (GTK_DRAWING_AREA (area),
 *                                   draw_function,
 *                                   NULL, NULL);
 *   return 0;
 * }
 * }</pre>
 * <p>
 * The draw function is normally called when a drawing area first comes
 * onscreen, or when it’s covered by another window and then uncovered.
 * You can also force a redraw by adding to the “damage region” of the
 * drawing area’s window using {@link Widget#queueDraw}.
 * This will cause the drawing area to call the draw function again.
 * <p>
 * The available routines for drawing are documented in the
 * <a href="https://www.cairographics.org/manual/">Cairo documentation</a>; GDK
 * offers additional API to integrate with Cairo, like {@link Gdk#cairoSetSourceRgba}
 * or {@link Gdk#cairoSetSourcePixbuf}.
 * <p>
 * To receive mouse events on a drawing area, you will need to use
 * event controllers. To receive keyboard events, you will need to set
 * the “can-focus” property on the drawing area, and you should probably
 * draw some user-visible indication that the drawing area is focused.
 * <p>
 * If you need more complex control over your widget, you should consider
 * creating your own {@code GtkWidget} subclass.
 */
public class DrawingArea extends Widget implements Accessible, Buildable, ConstraintTarget {

    public DrawingArea(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DrawingArea */
    public static DrawingArea castFrom(org.gtk.gobject.Object gobject) {
        return new DrawingArea(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_drawing_area_new = Interop.downcallHandle(
        "gtk_drawing_area_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_drawing_area_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new drawing area.
     */
    public DrawingArea() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_drawing_area_get_content_height = Interop.downcallHandle(
        "gtk_drawing_area_get_content_height",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the content height of the {@code GtkDrawingArea}.
     */
    public int getContentHeight() {
        int RESULT;
        try {
            RESULT = (int) gtk_drawing_area_get_content_height.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_drawing_area_get_content_width = Interop.downcallHandle(
        "gtk_drawing_area_get_content_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the content width of the {@code GtkDrawingArea}.
     */
    public int getContentWidth() {
        int RESULT;
        try {
            RESULT = (int) gtk_drawing_area_get_content_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_drawing_area_set_content_height = Interop.downcallHandle(
        "gtk_drawing_area_set_content_height",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the desired height of the contents of the drawing area.
     * <p>
     * Note that because widgets may be allocated larger sizes than they
     * requested, it is possible that the actual height passed to your draw
     * function is larger than the height set here. You can use
     * {@link Widget#setValign} to avoid that.
     * <p>
     * If the height is set to 0 (the default), the drawing area may disappear.
     */
    public @NotNull void setContentHeight(@NotNull int height) {
        try {
            gtk_drawing_area_set_content_height.invokeExact(handle(), height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_drawing_area_set_content_width = Interop.downcallHandle(
        "gtk_drawing_area_set_content_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the desired width of the contents of the drawing area.
     * <p>
     * Note that because widgets may be allocated larger sizes than they
     * requested, it is possible that the actual width passed to your draw
     * function is larger than the width set here. You can use
     * {@link Widget#setHalign} to avoid that.
     * <p>
     * If the width is set to 0 (the default), the drawing area may disappear.
     */
    public @NotNull void setContentWidth(@NotNull int width) {
        try {
            gtk_drawing_area_set_content_width.invokeExact(handle(), width);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_drawing_area_set_draw_func = Interop.downcallHandle(
        "gtk_drawing_area_set_draw_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Setting a draw function is the main thing you want to do when using
     * a drawing area.
     * <p>
     * The draw function is called whenever GTK needs to draw the contents
     * of the drawing area to the screen.
     * <p>
     * The draw function will be called during the drawing stage of GTK.
     * In the drawing stage it is not allowed to change properties of any
     * GTK widgets or call any functions that would cause any properties
     * to be changed. You should restrict yourself exclusively to drawing
     * your contents in the draw function.
     * <p>
     * If what you are drawing does change, call {@link Widget#queueDraw}
     * on the drawing area. This will cause a redraw and will call {@code draw_func} again.
     */
    public @NotNull void setDrawFunc(@Nullable DrawingAreaDrawFunc drawFunc) {
        try {
            gtk_drawing_area_set_draw_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbDrawingAreaDrawFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(drawFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ResizeHandler {
        void signalReceived(DrawingArea source, @NotNull int width, @NotNull int height);
    }
    
    /**
     * Emitted once when the widget is realized, and then each time the widget
     * is changed while realized.
     * <p>
     * This is useful in order to keep state up to date with the widget size,
     * like for instance a backing surface.
     */
    public SignalHandle onResize(ResizeHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("resize"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DrawingArea.Callbacks.class, "signalDrawingAreaResize",
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
    
        public static void signalDrawingAreaResize(MemoryAddress source, int width, int height, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DrawingArea.ResizeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DrawingArea(Refcounted.get(source)), width, height);
        }
        
    }
}
