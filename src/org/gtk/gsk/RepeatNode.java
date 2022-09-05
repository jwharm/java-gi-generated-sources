package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node repeating its single child node.
 */
public class RepeatNode extends RenderNode {

    public RepeatNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to RepeatNode */
    public static RepeatNode castFrom(org.gtk.gobject.Object gobject) {
        return new RepeatNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that will repeat the drawing of @child across
     * the given @bounds.
     */
    public RepeatNode(org.gtk.graphene.Rect bounds, RenderNode child, org.gtk.graphene.Rect childBounds) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_repeat_node_new(bounds.HANDLE(), child.HANDLE(), childBounds.HANDLE()), true));
    }
    
    /**
     * Retrieves the child of @node.
     */
    public RenderNode getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_repeat_node_get_child(HANDLE());
        return new RenderNode(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Retrieves the bounding rectangle of the child of @node.
     */
    public org.gtk.graphene.Rect getChildBounds() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_repeat_node_get_child_bounds(HANDLE());
        return new org.gtk.graphene.Rect(ProxyFactory.get(RESULT, false));
    }
    
}
