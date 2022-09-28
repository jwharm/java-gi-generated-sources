package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node repeating its single child node.
 */
public class RepeatNode extends RenderNode {

    public RepeatNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to RepeatNode */
    public static RepeatNode castFrom(org.gtk.gobject.Object gobject) {
        return new RepeatNode(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.graphene.Rect bounds, RenderNode child, org.gtk.graphene.Rect childBounds) {
        Reference RESULT = References.get(gtk_h.gsk_repeat_node_new(bounds.handle(), child.handle(), childBounds.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will repeat the drawing of {@code child} across
     * the given {@code bounds}.
     */
    public RepeatNode(org.gtk.graphene.Rect bounds, RenderNode child, org.gtk.graphene.Rect childBounds) {
        super(constructNew(bounds, child, childBounds));
    }
    
    /**
     * Retrieves the child of {@code node}.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_repeat_node_get_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the bounding rectangle of the child of {@code node}.
     */
    public org.gtk.graphene.Rect getChildBounds() {
        var RESULT = gtk_h.gsk_repeat_node_get_child_bounds(handle());
        return new org.gtk.graphene.Rect(References.get(RESULT, false));
    }
    
}
