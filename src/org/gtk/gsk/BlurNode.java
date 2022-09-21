package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a blur effect to its single child.
 */
public class BlurNode extends RenderNode {

    public BlurNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to BlurNode */
    public static BlurNode castFrom(org.gtk.gobject.Object gobject) {
        return new BlurNode(gobject.getReference());
    }
    
    private static Reference constructNew(RenderNode child, float radius) {
        Reference RESULT = References.get(gtk_h.gsk_blur_node_new(child.handle(), radius), true);
        return RESULT;
    }
    
    /**
     * Creates a render node that blurs the child.
     */
    public BlurNode(RenderNode child, float radius) {
        super(constructNew(child, radius));
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} of the blur {@code node}.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_blur_node_get_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the blur radius of the {@code node}.
     */
    public float getRadius() {
        var RESULT = gtk_h.gsk_blur_node_get_radius(handle());
        return RESULT;
    }
    
}
