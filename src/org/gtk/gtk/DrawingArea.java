package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkDrawingArea` is a widget that allows drawing with cairo.
 * 
 * ![An example GtkDrawingArea](drawingarea.png)
 * 
 * It’s essentially a blank widget; you can draw on it. After
 * creating a drawing area, the application may want to connect to:
 * 
 * - The [signal@Gtk.Widget::realize] signal to take any necessary actions
 *   when the widget is instantiated on a particular display.
 *   (Create GDK resources in response to this signal.)
 * 
 * - The [signal@Gtk.DrawingArea::resize] signal to take any necessary
 *   actions when the widget changes size.
 * 
 * - Call [method@Gtk.DrawingArea.set_draw_func] to handle redrawing the
 *   contents of the widget.
 * 
 * The following code portion demonstrates using a drawing
 * area to display a circle in the normal widget foreground
 * color.
 * 
 * ## Simple GtkDrawingArea usage
 * 
 * ```c
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
 * ```
 * 
 * The draw function is normally called when a drawing area first comes
 * onscreen, or when it’s covered by another window and then uncovered.
 * You can also force a redraw by adding to the “damage region” of the
 * drawing area’s window using [method@Gtk.Widget.queue_draw].
 * This will cause the drawing area to call the draw function again.
 * 
 * The available routines for drawing are documented in the
 * [Cairo documentation](https://www.cairographics.org/manual/); GDK
 * offers additional API to integrate with Cairo, like [func@Gdk.cairo_set_source_rgba]
 * or [func@Gdk.cairo_set_source_pixbuf].
 * 
 * To receive mouse events on a drawing area, you will need to use
 * event controllers. To receive keyboard events, you will need to set
 * the “can-focus” property on the drawing area, and you should probably
 * draw some user-visible indication that the drawing area is focused.
 * 
 * If you need more complex control over your widget, you should consider
 * creating your own `GtkWidget` subclass.
 */
public class DrawingArea extends Widget implements Accessible, Buildable, ConstraintTarget {

    public DrawingArea(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DrawingArea */
    public static DrawingArea castFrom(org.gtk.gobject.Object gobject) {
        return new DrawingArea(gobject.getReference());
    }
    
    /**
     * Creates a new drawing area.
     */
    public DrawingArea() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drawing_area_new(), false));
    }
    
    /**
     * Retrieves the content height of the `GtkDrawingArea`.
     */
    public int getContentHeight() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drawing_area_get_content_height(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the content width of the `GtkDrawingArea`.
     */
    public int getContentWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drawing_area_get_content_width(HANDLE());
        return RESULT;
    }
    
    /**
     * Sets the desired height of the contents of the drawing area.
     * 
     * Note that because widgets may be allocated larger sizes than they
     * requested, it is possible that the actual height passed to your draw
     * function is larger than the height set here. You can use
     * [method@Gtk.Widget.set_valign] to avoid that.
     * 
     * If the height is set to 0 (the default), the drawing area may disappear.
     */
    public void setContentHeight(int height) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drawing_area_set_content_height(HANDLE(), height);
    }
    
    /**
     * Sets the desired width of the contents of the drawing area.
     * 
     * Note that because widgets may be allocated larger sizes than they
     * requested, it is possible that the actual width passed to your draw
     * function is larger than the width set here. You can use
     * [method@Gtk.Widget.set_halign] to avoid that.
     * 
     * If the width is set to 0 (the default), the drawing area may disappear.
     */
    public void setContentWidth(int width) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_drawing_area_set_content_width(HANDLE(), width);
    }
    
    @FunctionalInterface
    public interface ResizeHandler {
        void signalReceived(DrawingArea source, int width, int height);
    }
    
    /**
     * Emitted once when the widget is realized, and then each time the widget
     * is changed while realized.
     * 
     * This is useful in order to keep state up to date with the widget size,
     * like for instance a backing surface.
     */
    public void onResize(ResizeHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDrawingAreaResize", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("resize").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
