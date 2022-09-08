package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a `GskTransform` to its single child node.
 */
public class TransformNode extends RenderNode {

    public TransformNode(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TransformNode */
    public static TransformNode castFrom(org.gtk.gobject.Object gobject) {
        return new TransformNode(gobject.getReference());
    }
    
    /**
     * Creates a `GskRenderNode` that will transform the given @child
     * with the given @transform.
     */
    public TransformNode(RenderNode child, Transform transform) {
        super(References.get(gtk_h.gsk_transform_node_new(child.handle(), transform.handle()), true));
    }
    
    /**
     * Gets the child node that is getting transformed by the given @node.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_transform_node_get_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the `GskTransform` used by the @node.
     */
    public Transform getTransform() {
        var RESULT = gtk_h.gsk_transform_node_get_transform(handle());
        return new Transform(References.get(RESULT, false));
    }
    
}
