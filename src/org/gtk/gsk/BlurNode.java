package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a blur effect to its single child.
 */
public class BlurNode extends RenderNode {

    public BlurNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to BlurNode */
    public static BlurNode castFrom(org.gtk.gobject.Object gobject) {
        return new BlurNode(gobject.getProxy());
    }
    
    /**
     * Creates a render node that blurs the child.
     */
    public BlurNode(RenderNode child, float radius) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_blur_node_new(child.HANDLE(), radius), true));
    }
    
    /**
     * Retrieves the child `GskRenderNode` of the blur @node.
     */
    public RenderNode getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_blur_node_get_child(HANDLE());
        return new RenderNode(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Retrieves the blur radius of the @node.
     */
    public float getRadius() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_blur_node_get_radius(HANDLE());
        return RESULT;
    }
    
}
