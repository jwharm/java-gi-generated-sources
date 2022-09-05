package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a rectangular clip to its single child node.
 */
public class ClipNode extends RenderNode {

    public ClipNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ClipNode */
    public static ClipNode castFrom(org.gtk.gobject.Object gobject) {
        return new ClipNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that will clip the @child to the area
     * given by @clip.
     */
    public ClipNode(RenderNode child, org.gtk.graphene.Rect clip) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_clip_node_new(child.HANDLE(), clip.HANDLE()), true));
    }
    
    /**
     * Gets the child node that is getting clipped by the given @node.
     */
    public RenderNode getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_clip_node_get_child(HANDLE());
        return new RenderNode(ProxyFactory.getProxy(RESULT, false));
    }
    
    /**
     * Retrieves the clip rectangle for @node.
     */
    public org.gtk.graphene.Rect getClip() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_clip_node_get_clip(HANDLE());
        return new org.gtk.graphene.Rect(ProxyFactory.getProxy(RESULT, false));
    }
    
}
