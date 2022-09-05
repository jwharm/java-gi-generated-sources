package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node that can contain other render nodes.
 */
public class ContainerNode extends RenderNode {

    public ContainerNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ContainerNode */
    public static ContainerNode castFrom(org.gtk.gobject.Object gobject) {
        return new ContainerNode(gobject.getProxy());
    }
    
    /**
     * Creates a new `GskRenderNode` instance for holding the given @children.
     * 
     * The new node will acquire a reference to each of the children.
     */
    public ContainerNode(RenderNode[] children, int nChildren) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_container_node_new(Interop.allocateNativeArray(children), nChildren), true));
    }
    
    /**
     * Gets one of the children of @container.
     */
    public RenderNode getChild(int idx) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_container_node_get_child(HANDLE(), idx);
        return new RenderNode(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Retrieves the number of direct children of @node.
     */
    public int getNChildren() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_container_node_get_n_children(HANDLE());
        return RESULT;
    }
    
}
