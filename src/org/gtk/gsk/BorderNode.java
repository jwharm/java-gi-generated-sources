package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node for a border.
 */
public class BorderNode extends RenderNode {

    public BorderNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to BorderNode */
    public static BorderNode castFrom(org.gtk.gobject.Object gobject) {
        return new BorderNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that will stroke a border rectangle inside the
     * given @outline.
     * 
     * The 4 sides of the border can have different widths and colors.
     */
    public BorderNode(RoundedRect outline, float[] borderWidth, org.gtk.gdk.RGBA[] borderColor) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_border_node_new(outline.HANDLE(), Interop.getAllocator().allocateArray(ValueLayout.JAVA_FLOAT, borderWidth), Interop.allocateNativeArray(borderColor)), true));
    }
    
    /**
     * Retrieves the colors of the border.
     */
    public org.gtk.gdk.RGBA getColors() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_border_node_get_colors(HANDLE());
        return new org.gtk.gdk.RGBA(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Retrieves the outline of the border.
     */
    public RoundedRect getOutline() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_border_node_get_outline(HANDLE());
        return new RoundedRect(ProxyFactory.get(RESULT, false));
    }
    
}
