package org.gtk.gdk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Base class for objects implementing different rendering methods.
 * <p><code>GdkDrawContext</code> is the base object used by contexts implementing different
 * rendering methods, such as {@link org.gtk.gdk.CairoContext} or {@link org.gtk.gdk.GLContext}.
 * It provides shared functionality between those contexts.
 * <p>
 * You will always interact with one of those subclasses.
 * <p>
 * A <code>GdkDrawContext</code> is always associated with a single toplevel surface.
 */
public class DrawContext extends org.gtk.gobject.Object {

    public DrawContext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to DrawContext */
    public static DrawContext castFrom(org.gtk.gobject.Object gobject) {
        return new DrawContext(gobject.getReference());
    }
    
    /**
     * Indicates that you are beginning the process of redrawing @region
     * on the @context&<code>#39</code> s surface.
     * 
     * Calling this function begins a drawing operation using @context on the
     * surface that @context was created from. The actual requirements and
     * guarantees for the drawing operation vary for different implementations
     * of drawing, so a {@link org.gtk.gdk.CairoContext} and a {@link org.gtk.gdk.GLContext}
     * need to be treated differently.
     * 
     * A call to this function is a requirement for drawing and must be
     * followed by a call to {@link org.gtk.gdk.DrawContext<code>#endFrame</code> , which will
     * complete the drawing operation and ensure the contents become visible
     * on screen.
     * 
     * Note that the @region passed to this function is the minimum region that
     * needs to be drawn and depending on implementation, windowing system and
     * hardware in use, it might be necessary to draw a larger region. Drawing
     * implementation must use {@link org.gtk.gdk.DrawContext<code>#getFrameRegion</code>  to
     * query the region that must be drawn.
     * 
     * When using GTK, the widget system automatically places calls to
     * gdk_draw_context_begin_frame() and gdk_draw_context_end_frame() via the
     * use of {@link org.gtk.gsk.Renderer}s, so application code does not need to call
     * these functions explicitly.
     */
    public void beginFrame(org.cairographics.Region region) {
        gtk_h.gdk_draw_context_begin_frame(handle(), region.handle());
    }
    
    /**
     * Ends a drawing operation started with gdk_draw_context_begin_frame().
     * <p>
     * This makes the drawing available on screen.
     * See {@link org.gtk.gdk.DrawContext<code>#beginFrame</code>  for more details about drawing.
     * <p>
     * When using a {@link org.gtk.gdk.GLContext}, this function may call <code>glFlush()</code>
     * implicitly before returning; it is not recommended to call <code>glFlush()</code>
     * explicitly before calling this function.
     */
    public void endFrame() {
        gtk_h.gdk_draw_context_end_frame(handle());
    }
    
    /**
     * Retrieves the <code>GdkDisplay</code> the @context is created for
     */
    public Display getDisplay() {
        var RESULT = gtk_h.gdk_draw_context_get_display(handle());
        return new Display(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the region that is currently being repainted.
     * 
     * After a call to {@link org.gtk.gdk.DrawContext<code>#beginFrame</code>  this function will
     * return a union of the region passed to that function and the area of the
     * surface that the @context determined needs to be repainted.
     * 
     * If @context is not in between calls to {@link org.gtk.gdk.DrawContext<code>#beginFrame</code> 
     * and {@link org.gtk.gdk.DrawContext<code>#endFrame</code> , <code>null</code> will be returned.
     */
    public org.cairographics.Region getFrameRegion() {
        var RESULT = gtk_h.gdk_draw_context_get_frame_region(handle());
        return new org.cairographics.Region(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the surface that @context is bound to.
     */
    public Surface getSurface() {
        var RESULT = gtk_h.gdk_draw_context_get_surface(handle());
        return new Surface(References.get(RESULT, false));
    }
    
    /**
     * Returns <code>true</code> if @context is in the process of drawing to its surface.
     * 
     * This is the case between calls to {@link org.gtk.gdk.DrawContext<code>#beginFrame</code> 
     * and {@link org.gtk.gdk.DrawContext<code>#endFrame</code> . In this situation, drawing commands
     * may be effecting the contents of the @context&<code>#39</code> s surface.
     */
    public boolean isInFrame() {
        var RESULT = gtk_h.gdk_draw_context_is_in_frame(handle());
        return (RESULT != 0);
    }
    
}
