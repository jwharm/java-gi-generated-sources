package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node that can contain other render nodes.
 */
public class ContainerNode extends RenderNode {

    public ContainerNode(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ContainerNode */
    public static ContainerNode castFrom(org.gtk.gobject.Object gobject) {
        return new ContainerNode(gobject.getReference());
    }
    
    /**
     * Creates a new `GskRenderNode` instance for holding the given @children.
     * 
     * The new node will acquire a reference to each of the children.
     */
    public ContainerNode(RenderNode[] children, int nChildren) {
        super(References.get(gtk_h.gsk_container_node_new(Interop.allocateNativeArray(children), nChildren), true));
    }
    
    /**
     * Gets one of the children of @container.
     */
    public RenderNode getChild(int idx) {
        var RESULT = gtk_h.gsk_container_node_get_child(handle(), idx);
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the number of direct children of @node.
     */
    public int getNChildren() {
        var RESULT = gtk_h.gsk_container_node_get_n_children(handle());
        return RESULT;
    }
    
}
