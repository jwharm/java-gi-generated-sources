package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkDrawingArea</code> is a widget that allows drawing with cairo.
 * <p>
 * !{@link [An example GtkDrawingArea]}(drawingarea.png)
 * <p>
 * It&<code>#8217</code> s essentially a blank widget; you can draw on it. After
 * creating a drawing area, the application may want to connect to:
 * <p>
 * <li>The {@link [signal@Gtk.Widget::realize] (ref=signal)} signal to take any necessary actions
 *   when the widget is instantiated on a particular display.
 *   (Create GDK resources in response to this signal.)
 * <p>
 * <li>The {@link [signal@Gtk.DrawingArea::resize] (ref=signal)} signal to take any necessary
 *   actions when the widget changes size.
 * <p>
 * <li>Call {@link org.gtk.gtk.DrawingArea<code>#setDrawFunc</code>  to handle redrawing the
 *   contents of the widget.
 * <p>
 * The following code portion demonstrates using a drawing
 * area to display a circle in the normal widget foreground
 * color.
 * <p>
 * <h2>Simple GtkDrawingArea usage</h2>
 * <p><pre>c
 * static void
 * draw_function (GtkDrawingArea *area,
 *                cairo_t        *cr,
 *                int             width,
 *                int             height,
 *                gpointer        data)
 * {
 *   GdkRGBA color;
 *   GtkStyleContext *context;
 * <p>
 *   context = gtk_widget_get_style_context (GTK_WIDGET (area));
 * <p>
 *   cairo_arc (cr,
 *              width / 2.0, height / 2.0,
 *              MIN (width, height) / 2.0,
 *              0, 2 * G_PI);
 * <p>
 *   gtk_style_context_get_color (context,
 *                                &<code>#38</code> color);
 *   gdk_cairo_set_source_rgba (cr, &<code>#38</code> color);
 * <p>
 *   cairo_fill (cr);
 * }
 * <p>
 * int
 * main (int argc, char **argv)
 * {
 *   gtk_init ();
 * <p>
 *   GtkWidget *area = gtk_drawing_area_new ();
 *   gtk_drawing_area_set_content_width (GTK_DRAWING_AREA (area), 100);
 *   gtk_drawing_area_set_content_height (GTK_DRAWING_AREA (area), 100);
 *   gtk_drawing_area_set_draw_func (GTK_DRAWING_AREA (area),
 *                                   draw_function,
 *                                   NULL, NULL);
 *   return 0;
 * }
 * </pre>
 * <p>
 * The draw function is normally called when a drawing area first comes
 * onscreen, or when it&<code>#8217</code> s covered by another window and then uncovered.
 * You can also force a redraw by adding to the &<code>#8220</code> damage region&<code>#8221</code>  of the
 * drawing area&<code>#8217</code> s window using {@link org.gtk.gtk.Widget<code>#queueDraw</code> .
 * This will cause the drawing area to call the draw function again.
 * <p>
 * The available routines for drawing are documented in the
 * {@link [Cairo documentation]}(https://www.cairographics.org/manual/); GDK
 * offers additional API to integrate with Cairo, like {@link Gdk<code>#cairoSetSourceRgba</code> 
 * or {@link Gdk<code>#cairoSetSourcePixbuf</code> .
 * <p>
 * To receive mouse events on a drawing area, you will need to use
 * event controllers. To receive keyboard events, you will need to set
 * the &<code>#8220</code> can-focus&<code>#8221</code>  property on the drawing area, and you should probably
 * draw some user-visible indication that the drawing area is focused.
 * <p>
 * If you need more complex control over your widget, you should consider
 * creating your own <code>GtkWidget</code> subclass.
 */
public class DrawingArea extends Widget implements Accessible, Buildable, ConstraintTarget {

    public DrawingArea(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DrawingArea */
    public static DrawingArea castFrom(org.gtk.gobject.Object gobject) {
        return new DrawingArea(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_drawing_area_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new drawing area.
     */
    public DrawingArea() {
        super(constructNew());
    }
    
    /**
     * Retrieves the content height of the <code>GtkDrawingArea</code>.
     */
    public int getContentHeight() {
        var RESULT = gtk_h.gtk_drawing_area_get_content_height(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the content width of the <code>GtkDrawingArea</code>.
     */
    public int getContentWidth() {
        var RESULT = gtk_h.gtk_drawing_area_get_content_width(handle());
        return RESULT;
    }
    
    /**
     * Sets the desired height of the contents of the drawing area.
     * 
     * Note that because widgets may be allocated larger sizes than they
     * requested, it is possible that the actual height passed to your draw
     * function is larger than the height set here. You can use
     * {@link org.gtk.gtk.Widget<code>#setValign</code>  to avoid that.
     * 
     * If the height is set to 0 (the default), the drawing area may disappear.
     */
    public void setContentHeight(int height) {
        gtk_h.gtk_drawing_area_set_content_height(handle(), height);
    }
    
    /**
     * Sets the desired width of the contents of the drawing area.
     * 
     * Note that because widgets may be allocated larger sizes than they
     * requested, it is possible that the actual width passed to your draw
     * function is larger than the width set here. You can use
     * {@link org.gtk.gtk.Widget<code>#setHalign</code>  to avoid that.
     * 
     * If the width is set to 0 (the default), the drawing area may disappear.
     */
    public void setContentWidth(int width) {
        gtk_h.gtk_drawing_area_set_content_width(handle(), width);
    }
    
    /**
     * Setting a draw function is the main thing you want to do when using
     * a drawing area.
     * 
     * The draw function is called whenever GTK needs to draw the contents
     * of the drawing area to the screen.
     * 
     * The draw function will be called during the drawing stage of GTK.
     * In the drawing stage it is not allowed to change properties of any
     * GTK widgets or call any functions that would cause any properties
     * to be changed. You should restrict yourself exclusively to drawing
     * your contents in the draw function.
     * 
     * If what you are drawing does change, call {@link org.gtk.gtk.Widget<code>#queueDraw</code> 
     * on the drawing area. This will cause a redraw and will call @draw_func again.
     */
    public void setDrawFunc(DrawingAreaDrawFunc drawFunc) {
        try {
            gtk_h.gtk_drawing_area_set_draw_func(handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbDrawingAreaDrawFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(drawFunc.hashCode(), drawFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
    public SignalHandle onResize(ResizeHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalDrawingAreaResize", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("resize").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
