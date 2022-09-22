package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node applying a {@code GskTransform} to its single child node.
 */
public class TransformNode extends RenderNode {

    public TransformNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TransformNode */
    public static TransformNode castFrom(org.gtk.gobject.Object gobject) {
        return new TransformNode(gobject.getReference());
    }
    
    private static Reference constructNew(RenderNode child, Transform transform) {
        Reference RESULT = References.get(gtk_h.gsk_transform_node_new(child.handle(), transform.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will transform the given {@code child}
     * with the given {@code transform}.
     */
    public TransformNode(RenderNode child, Transform transform) {
        super(constructNew(child, transform));
    }
    
    /**
     * Gets the child node that is getting transformed by the given {@code node}.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_transform_node_get_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the {@code GskTransform} used by the {@code node}.
     */
    public Transform getTransform() {
        var RESULT = gtk_h.gsk_transform_node_get_transform(handle());
        return new Transform(References.get(RESULT, false));
    }
    
}
