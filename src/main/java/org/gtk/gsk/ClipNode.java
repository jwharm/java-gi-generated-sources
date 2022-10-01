package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a rectangular clip to its single child node.
 */
public class ClipNode extends RenderNode {

    public ClipNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ClipNode */
    public static ClipNode castFrom(org.gtk.gobject.Object gobject) {
        return new ClipNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(RenderNode child, org.gtk.graphene.Rect clip) {
        Refcounted RESULT = Refcounted.get(gtk_h.gsk_clip_node_new(child.handle(), clip.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will clip the {@code child} to the area
     * given by {@code clip}.
     */
    public ClipNode(RenderNode child, org.gtk.graphene.Rect clip) {
        super(constructNew(child, clip));
    }
    
    /**
     * Gets the child node that is getting clipped by the given {@code node}.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_clip_node_get_child(handle());
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the clip rectangle for {@code node}.
     */
    public org.gtk.graphene.Rect getClip() {
        var RESULT = gtk_h.gsk_clip_node_get_clip(handle());
        return new org.gtk.graphene.Rect(Refcounted.get(RESULT, false));
    }
    
}
