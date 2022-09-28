package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a blending function between its two child nodes.
 */
public class BlendNode extends RenderNode {

    public BlendNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BlendNode */
    public static BlendNode castFrom(org.gtk.gobject.Object gobject) {
        return new BlendNode(gobject.getReference());
    }
    
    private static Reference constructNew(RenderNode bottom, RenderNode top, BlendMode blendMode) {
        Reference RESULT = References.get(gtk_h.gsk_blend_node_new(bottom.handle(), top.handle(), blendMode.getValue()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will use {@code blend_mode} to blend the {@code top}
     * node onto the {@code bottom} node.
     */
    public BlendNode(RenderNode bottom, RenderNode top, BlendMode blendMode) {
        super(constructNew(bottom, top, blendMode));
    }
    
    /**
     * Retrieves the blend mode used by {@code node}.
     */
    public BlendMode getBlendMode() {
        var RESULT = gtk_h.gsk_blend_node_get_blend_mode(handle());
        return new BlendMode(RESULT);
    }
    
    /**
     * Retrieves the bottom {@code GskRenderNode} child of the {@code node}.
     */
    public RenderNode getBottomChild() {
        var RESULT = gtk_h.gsk_blend_node_get_bottom_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the top {@code GskRenderNode} child of the {@code node}.
     */
    public RenderNode getTopChild() {
        var RESULT = gtk_h.gsk_blend_node_get_top_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
}
