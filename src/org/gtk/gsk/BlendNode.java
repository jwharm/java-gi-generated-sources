package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a blending function between its two child nodes.
 */
public class BlendNode extends RenderNode {

    public BlendNode(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BlendNode */
    public static BlendNode castFrom(org.gtk.gobject.Object gobject) {
        return new BlendNode(gobject.getReference());
    }
    
    /**
     * Creates a `GskRenderNode` that will use @blend_mode to blend the @top
     * node onto the @bottom node.
     */
    public BlendNode(RenderNode bottom, RenderNode top, BlendMode blendMode) {
        super(References.get(gtk_h.gsk_blend_node_new(bottom.handle(), top.handle(), blendMode.getValue()), true));
    }
    
    /**
     * Retrieves the blend mode used by @node.
     */
    public BlendMode getBlendMode() {
        var RESULT = gtk_h.gsk_blend_node_get_blend_mode(handle());
        return BlendMode.fromValue(RESULT);
    }
    
    /**
     * Retrieves the bottom `GskRenderNode` child of the @node.
     */
    public RenderNode getBottomChild() {
        var RESULT = gtk_h.gsk_blend_node_get_bottom_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the top `GskRenderNode` child of the @node.
     */
    public RenderNode getTopChild() {
        var RESULT = gtk_h.gsk_blend_node_get_top_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
}
