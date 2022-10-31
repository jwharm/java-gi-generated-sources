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
 * </ul>
 * <ul>
 * <li>The {@code Gtk.DrawingArea::resize} signal to take any necessary
 *   actions when the widget changes size.
 * </ul>
 * <ul>
 * <li>Call {@link DrawingArea#setDrawFunc} to handle redrawing the
 *   contents of the widget.
 * </ul>
 * <p>
 * The following code portion demonstrates using a drawing
 * area to display a circle in the normal widget foreground
 * color.
 * <p>
 * <strong>Simple GtkDrawingArea usage</strong><br/>
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
 * offers additional API to integrate with Cairo, like {@link org.gtk.gdk.Gdk#cairoSetSourceRgba}
 * or {@link org.gtk.gdk.Gdk#cairoSetSourcePixbuf}.
 * <p>
 * To receive mouse events on a drawing area, you will need to use
 * event controllers. To receive keyboard events, you will need to set
 * the “can-focus” property on the drawing area, and you should probably
 * draw some user-visible indication that the drawing area is focused.
 * <p>
 * If you need more complex control over your widget, you should consider
 * creating your own {@code GtkWidget} subclass.
 */
public class DrawingArea extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkDrawingArea";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("widget")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code widget}
     * @return The value of the field {@code widget}
     */
    public org.gtk.gtk.Widget widget$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("widget"));
        return new org.gtk.gtk.Widget(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public DrawingArea(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to DrawingArea if its GType is a (or inherits from) "GtkDrawingArea".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "DrawingArea" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkDrawingArea", a ClassCastException will be thrown.
     */
    public static DrawingArea castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkDrawingArea"))) {
            return new DrawingArea(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkDrawingArea");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_drawing_area_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new drawing area.
     */
    public DrawingArea() {
        super(constructNew());
    }
    
    /**
     * Retrieves the content height of the {@code GtkDrawingArea}.
     * @return The height requested for content of the drawing area
     */
    public int getContentHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drawing_area_get_content_height.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the content width of the {@code GtkDrawingArea}.
     * @return The width requested for content of the drawing area
     */
    public int getContentWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_drawing_area_get_content_width.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the desired height of the contents of the drawing area.
     * <p>
     * Note that because widgets may be allocated larger sizes than they
     * requested, it is possible that the actual height passed to your draw
     * function is larger than the height set here. You can use
     * {@link Widget#setValign} to avoid that.
     * <p>
     * If the height is set to 0 (the default), the drawing area may disappear.
     * @param height the height of contents
     */
    public void setContentHeight(int height) {
        try {
            DowncallHandles.gtk_drawing_area_set_content_height.invokeExact(
                    handle(),
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the desired width of the contents of the drawing area.
     * <p>
     * Note that because widgets may be allocated larger sizes than they
     * requested, it is possible that the actual width passed to your draw
     * function is larger than the width set here. You can use
     * {@link Widget#setHalign} to avoid that.
     * <p>
     * If the width is set to 0 (the default), the drawing area may disappear.
     * @param width the width of contents
     */
    public void setContentWidth(int width) {
        try {
            DowncallHandles.gtk_drawing_area_set_content_width.invokeExact(
                    handle(),
                    width);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param drawFunc callback that lets you draw
     *   the drawing area's contents
     */
    public void setDrawFunc(@Nullable org.gtk.gtk.DrawingAreaDrawFunc drawFunc) {
        try {
            DowncallHandles.gtk_drawing_area_set_draw_func.invokeExact(
                    handle(),
                    (Addressable) (drawFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbDrawingAreaDrawFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope())),
                    (Addressable) (drawFunc == null ? MemoryAddress.NULL : Interop.registerCallback(drawFunc)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Resize {
        void signalReceived(DrawingArea source, int width, int height);
    }
    
    /**
     * Emitted once when the widget is realized, and then each time the widget
     * is changed while realized.
     * <p>
     * This is useful in order to keep state up to date with the widget size,
     * like for instance a backing surface.
     */
    public Signal<DrawingArea.Resize> onResize(DrawingArea.Resize handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("resize"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DrawingArea.Callbacks.class, "signalDrawingAreaResize",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<DrawingArea.Resize>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_drawing_area_new = Interop.downcallHandle(
            "gtk_drawing_area_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drawing_area_get_content_height = Interop.downcallHandle(
            "gtk_drawing_area_get_content_height",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drawing_area_get_content_width = Interop.downcallHandle(
            "gtk_drawing_area_get_content_width",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_drawing_area_set_content_height = Interop.downcallHandle(
            "gtk_drawing_area_set_content_height",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_drawing_area_set_content_width = Interop.downcallHandle(
            "gtk_drawing_area_set_content_width",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_drawing_area_set_draw_func = Interop.downcallHandle(
            "gtk_drawing_area_set_draw_func",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalDrawingAreaResize(MemoryAddress source, int width, int height, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (DrawingArea.Resize) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new DrawingArea(Refcounted.get(source)), width, height);
        }
    }
}
