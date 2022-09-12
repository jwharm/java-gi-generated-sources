package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node drawing one or more shadows behind its single child node.
 */
public class ShadowNode extends RenderNode {

    public ShadowNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ShadowNode */
    public static ShadowNode castFrom(org.gtk.gobject.Object gobject) {
        return new ShadowNode(gobject.getReference());
    }
    
    private static Reference constructNew(RenderNode child, Shadow[] shadows, long nShadows) {
        Reference RESULT = References.get(gtk_h.gsk_shadow_node_new(child.handle(), Interop.allocateNativeArray(shadows).handle(), nShadows), true);
        return RESULT;
    }
    
    /**
     * Creates a `GskRenderNode` that will draw a @child with the given
     * @shadows below it.
     */
    public ShadowNode(RenderNode child, Shadow[] shadows, long nShadows) {
        super(constructNew(child, shadows, nShadows));
    }
    
    /**
     * Retrieves the child `GskRenderNode` of the shadow @node.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_shadow_node_get_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the number of shadows in the @node.
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
        return new Shadow(References.get(RESULT, false));
    }
    
}
