package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node drawing one or more shadows behind its single child node.
 */
public class ShadowNode extends RenderNode {

    public ShadowNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ShadowNode */
    public static ShadowNode castFrom(org.gtk.gobject.Object gobject) {
        return new ShadowNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(RenderNode child, Shadow[] shadows, long nShadows) {
        Refcounted RESULT = Refcounted.get(gtk_h.gsk_shadow_node_new(child.handle(), Interop.allocateNativeArray(shadows).handle(), nShadows), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will draw a {@code child} with the given
     * {@code shadows} below it.
     */
    public ShadowNode(RenderNode child, Shadow[] shadows, long nShadows) {
        super(constructNew(child, shadows, nShadows));
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} of the shadow {@code node}.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_shadow_node_get_child(handle());
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the number of shadows in the {@code node}.
     */
    public long getNShadows() {
        var RESULT = gtk_h.gsk_shadow_node_get_n_shadows(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the shadow data at the given index @i.
     */
    public Shadow getShadow(long i) {
        var RESULT = gtk_h.gsk_shadow_node_get_shadow(handle(), i);
        return new Shadow(Refcounted.get(RESULT, false));
    }
    
}
