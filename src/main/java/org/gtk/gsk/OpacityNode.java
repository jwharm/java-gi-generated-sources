package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node controlling the opacity of its single child node.
 */
public class OpacityNode extends RenderNode {

    public OpacityNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to OpacityNode */
    public static OpacityNode castFrom(org.gtk.gobject.Object gobject) {
        return new OpacityNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(RenderNode child, float opacity) {
        Refcounted RESULT = Refcounted.get(gtk_h.gsk_opacity_node_new(child.handle(), opacity), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will drawn the {@code child} with reduced
     * {@code opacity}.
     */
    public OpacityNode(RenderNode child, float opacity) {
        super(constructNew(child, opacity));
    }
    
    /**
     * Gets the child node that is getting opacityed by the given {@code node}.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_opacity_node_get_child(handle());
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the transparency factor for an opacity node.
     */
    public float getOpacity() {
        var RESULT = gtk_h.gsk_opacity_node_get_opacity(handle());
        return RESULT;
    }
    
}
