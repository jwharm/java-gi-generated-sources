package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a rounded rectangle clip to its single child.
 */
public class RoundedClipNode extends RenderNode {

    public RoundedClipNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to RoundedClipNode */
    public static RoundedClipNode castFrom(org.gtk.gobject.Object gobject) {
        return new RoundedClipNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(RenderNode child, RoundedRect clip) {
        Refcounted RESULT = Refcounted.get(gtk_h.gsk_rounded_clip_node_new(child.handle(), clip.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will clip the {@code child} to the area
     * given by {@code clip}.
     */
    public RoundedClipNode(RenderNode child, RoundedRect clip) {
        super(constructNew(child, clip));
    }
    
    /**
     * Gets the child node that is getting clipped by the given {@code node}.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_rounded_clip_node_get_child(handle());
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the rounded rectangle used to clip the contents of the {@code node}.
     */
    public RoundedRect getClip() {
        var RESULT = gtk_h.gsk_rounded_clip_node_get_clip(handle());
        return new RoundedRect(Refcounted.get(RESULT, false));
    }
    
}
