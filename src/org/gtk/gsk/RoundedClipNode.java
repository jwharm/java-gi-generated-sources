package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a rounded rectangle clip to its single child.
 */
public class RoundedClipNode extends RenderNode {

    public RoundedClipNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to RoundedClipNode */
    public static RoundedClipNode castFrom(org.gtk.gobject.Object gobject) {
        return new RoundedClipNode(gobject.getReference());
    }
    
    private static Reference constructNew(RenderNode child, RoundedRect clip) {
        Reference RESULT = References.get(gtk_h.gsk_rounded_clip_node_new(child.handle(), clip.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a <code>GskRenderNode</code> that will clip the @child to the area
     * given by @clip.
     */
    public RoundedClipNode(RenderNode child, RoundedRect clip) {
        super(constructNew(child, clip));
    }
    
    /**
     * Gets the child node that is getting clipped by the given @node.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_rounded_clip_node_get_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the rounded rectangle used to clip the contents of the @node.
     */
    public RoundedRect getClip() {
        var RESULT = gtk_h.gsk_rounded_clip_node_get_clip(handle());
        return new RoundedRect(References.get(RESULT, false));
    }
    
}
