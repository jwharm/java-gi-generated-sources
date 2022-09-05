package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node controlling the opacity of its single child node.
 */
public class OpacityNode extends RenderNode {

    public OpacityNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to OpacityNode */
    public static OpacityNode castFrom(org.gtk.gobject.Object gobject) {
        return new OpacityNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that will drawn the @child with reduced
     * @opacity.
     */
    public OpacityNode(RenderNode child, float opacity) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_opacity_node_new(child.HANDLE(), opacity), true));
    }
    
    /**
     * Gets the child node that is getting opacityed by the given @node.
     */
    public RenderNode getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_opacity_node_get_child(HANDLE());
        return new RenderNode(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Gets the transparency factor for an opacity node.
     */
    public float getOpacity() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_opacity_node_get_opacity(HANDLE());
        return RESULT;
    }
    
}
