package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a border.
 */
public class BorderNode extends RenderNode {

    public BorderNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BorderNode */
    public static BorderNode castFrom(org.gtk.gobject.Object gobject) {
        return new BorderNode(gobject.getReference());
    }
    
    private static Reference constructNew(RoundedRect outline, float[] borderWidth, org.gtk.gdk.RGBA[] borderColor) {
        Reference RESULT = References.get(gtk_h.gsk_border_node_new(outline.handle(), new MemorySegmentReference(Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, borderWidth)).handle(), Interop.allocateNativeArray(borderColor).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a <code>GskRenderNode</code> that will stroke a border rectangle inside the
     * given @outline.
     * 
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
        return new org.gtk.gdk.RGBA(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the outline of the border.
     */
    public RoundedRect getOutline() {
        var RESULT = gtk_h.gsk_border_node_get_outline(handle());
        return new RoundedRect(References.get(RESULT, false));
    }
    
}
