package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a border.
 */
public class BorderNode extends RenderNode {

    public BorderNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BorderNode */
    public static BorderNode castFrom(org.gtk.gobject.Object gobject) {
        return new BorderNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(RoundedRect outline, float[] borderWidth, org.gtk.gdk.RGBA[] borderColor) {
        Refcounted RESULT = Refcounted.get(gtk_h.gsk_border_node_new(outline.handle(), Interop.allocateNativeArray(borderWidth).handle(), Interop.allocateNativeArray(borderColor).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will stroke a border rectangle inside the
     * given {@code outline}.
     * <p>
     * The 4 sides of the border can have different widths and colors.
     */
    public BorderNode(RoundedRect outline, float[] borderWidth, org.gtk.gdk.RGBA[] borderColor) {
        super(constructNew(outline, borderWidth, borderColor));
    }
    
    /**
     * Retrieves the colors of the border.
     */
    public org.gtk.gdk.RGBA getColors() {
        var RESULT = gtk_h.gsk_border_node_get_colors(handle());
        return new org.gtk.gdk.RGBA(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the outline of the border.
     */
    public RoundedRect getOutline() {
        var RESULT = gtk_h.gsk_border_node_get_outline(handle());
        return new RoundedRect(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the stroke widths of the border.
     */
    public PointerIterator<Float> getWidths() {
        var RESULT = gtk_h.gsk_border_node_get_widths(handle());
        return new PointerFloat(RESULT).iterator();
    }
    
}
