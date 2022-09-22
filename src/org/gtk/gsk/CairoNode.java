package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a Cairo surface.
 */
public class CairoNode extends RenderNode {

    public CairoNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CairoNode */
    public static CairoNode castFrom(org.gtk.gobject.Object gobject) {
        return new CairoNode(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.graphene.Rect bounds) {
        Reference RESULT = References.get(gtk_h.gsk_cairo_node_new(bounds.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will render a cairo surface
     * into the area given by {@code bounds}.
     * <p>
     * You can draw to the cairo surface using {@link CairoNode#getDrawContext}.
     */
    public CairoNode(org.gtk.graphene.Rect bounds) {
        super(constructNew(bounds));
    }
    
    /**
     * Creates a Cairo context for drawing using the surface associated
     * to the render node.
     * <p>
     * If no surface exists yet, a surface will be created optimized for
     * rendering to {@code renderer}.
     */
    public org.cairographics.Context getDrawContext() {
        var RESULT = gtk_h.gsk_cairo_node_get_draw_context(handle());
        return new org.cairographics.Context(References.get(RESULT, true));
    }
    
    /**
     * Retrieves the Cairo surface used by the render node.
     */
    public org.cairographics.Surface getSurface() {
        var RESULT = gtk_h.gsk_cairo_node_get_surface(handle());
        return new org.cairographics.Surface(References.get(RESULT, false));
    }
    
}
