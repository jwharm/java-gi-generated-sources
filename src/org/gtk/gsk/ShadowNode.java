package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node drawing one or more shadows behind its single child node.
 */
public class ShadowNode extends RenderNode {

    public ShadowNode(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ShadowNode */
    public static ShadowNode castFrom(org.gtk.gobject.Object gobject) {
        return new ShadowNode(gobject.getReference());
    }
    
    /**
     * Creates a `GskRenderNode` that will draw a @child with the given
     * @shadows below it.
     */
    public ShadowNode(RenderNode child, Shadow[] shadows, long nShadows) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_shadow_node_new(child.HANDLE(), Interop.allocateNativeArray(shadows), nShadows), true));
    }
    
    /**
     * Retrieves the child `GskRenderNode` of the shadow @node.
     */
    public RenderNode getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_shadow_node_get_child(HANDLE());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the number of shadows in the @node.
     */
    public long getNShadows() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_shadow_node_get_n_shadows(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the shadow data at the given index @i.
     */
    public Shadow getShadow(long i) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_shadow_node_get_shadow(HANDLE(), i);
        return new Shadow(References.get(RESULT, false));
    }
    
}
