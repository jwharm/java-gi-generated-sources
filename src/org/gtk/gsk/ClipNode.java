package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a rectangular clip to its single child node.
 */
public class ClipNode extends RenderNode {

    public ClipNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ClipNode */
    public static ClipNode castFrom(org.gtk.gobject.Object gobject) {
        return new ClipNode(gobject.getReference());
    }
    
    private static Reference constructNew(RenderNode child, org.gtk.graphene.Rect clip) {
        Reference RESULT = References.get(gtk_h.gsk_clip_node_new(child.handle(), clip.handle()), true);
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
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the clip rectangle for {@code node}.
     */
    public org.gtk.graphene.Rect getClip() {
        var RESULT = gtk_h.gsk_clip_node_get_clip(handle());
        return new org.gtk.graphene.Rect(References.get(RESULT, false));
    }
    
}
