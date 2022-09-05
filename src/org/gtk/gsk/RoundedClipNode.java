package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a rounded rectangle clip to its single child.
 */
public class RoundedClipNode extends RenderNode {

    public RoundedClipNode(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to RoundedClipNode */
    public static RoundedClipNode castFrom(org.gtk.gobject.Object gobject) {
        return new RoundedClipNode(gobject.getProxy());
    }
    
    /**
     * Creates a `GskRenderNode` that will clip the @child to the area
     * given by @clip.
     */
    public RoundedClipNode(RenderNode child, RoundedRect clip) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_clip_node_new(child.HANDLE(), clip.HANDLE()), false));
    }
    
    /**
     * Gets the child node that is getting clipped by the given @node.
     */
    public RenderNode getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_clip_node_get_child(HANDLE());
        return new RenderNode(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Retrieves the rounded rectangle used to clip the contents of the @node.
     */
    public RoundedRect getClip() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_rounded_clip_node_get_clip(HANDLE());
        return new RoundedRect(ProxyFactory.get(RESULT, false));
    }
    
}
