package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node controlling the opacity of its single child node.
 */
public class OpacityNode extends RenderNode {

    public OpacityNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to OpacityNode */
    public static OpacityNode castFrom(org.gtk.gobject.Object gobject) {
        return new OpacityNode(gobject.getReference());
    }
    
    private static Reference constructNew(RenderNode child, float opacity) {
        Reference RESULT = References.get(gtk_h.gsk_opacity_node_new(child.handle(), opacity), true);
        return RESULT;
    }
    
    /**
     * Creates a <code>GskRenderNode</code> that will drawn the @child with reduced
     * @opacity.
     */
    public OpacityNode(RenderNode child, float opacity) {
        super(constructNew(child, opacity));
    }
    
    /**
     * Gets the child node that is getting opacityed by the given @node.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_opacity_node_get_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Gets the transparency factor for an opacity node.
     */
    public float getOpacity() {
        var RESULT = gtk_h.gsk_opacity_node_get_opacity(handle());
        return RESULT;
    }
    
}
