package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a blur effect to its single child.
 */
public class BlurNode extends RenderNode {

    public BlurNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BlurNode */
    public static BlurNode castFrom(org.gtk.gobject.Object gobject) {
        return new BlurNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(RenderNode child, float radius) {
        Refcounted RESULT = Refcounted.get(gtk_h.gsk_blur_node_new(child.handle(), radius), true);
        return RESULT;
    }
    
    /**
     * Creates a render node that blurs the child.
     */
    public BlurNode(RenderNode child, float radius) {
        super(constructNew(child, radius));
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} of the blur {@code node}.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_blur_node_get_child(handle());
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the blur radius of the {@code node}.
     */
    public float getRadius() {
        var RESULT = gtk_h.gsk_blur_node_get_radius(handle());
        return RESULT;
    }
    
}
