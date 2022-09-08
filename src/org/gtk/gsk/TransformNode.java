package org.gtk.gsk;

import org.gtk.gobject.*;
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
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_transform_node_new(child.HANDLE(), transform.HANDLE()), true));
    }
    
    /**
     * Gets the child node that is getting transformed by the given @node.
     */
    public RenderNode getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_transform_node_get_child(HANDLE());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the `GskTransform` used by the @node.
     */
    public Transform getTransform() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_transform_node_get_transform(HANDLE());
        return new Transform(References.get(RESULT, false));
    }
    
}
