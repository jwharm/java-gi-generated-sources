package org.gtk.gsk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A render node controlling the color matrix of its single child node.
 */
public class ColorMatrixNode extends RenderNode {

    public ColorMatrixNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ColorMatrixNode */
    public static ColorMatrixNode castFrom(org.gtk.gobject.Object gobject) {
        return new ColorMatrixNode(gobject.refcounted());
    }
    
    private static Refcounted constructNew(RenderNode child, org.gtk.graphene.Matrix colorMatrix, org.gtk.graphene.Vec4 colorOffset) {
        Refcounted RESULT = Refcounted.get(gtk_h.gsk_color_matrix_node_new(child.handle(), colorMatrix.handle(), colorOffset.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will drawn the {@code child} with
     * {@code color_matrix}.
     * <p>
     * In particular, the node will transform the operation
     * <p>
     *     pixel = color_matrix * pixel + color_offset
     * <p>
     * for every pixel.
     */
    public ColorMatrixNode(RenderNode child, org.gtk.graphene.Matrix colorMatrix, org.gtk.graphene.Vec4 colorOffset) {
        super(constructNew(child, colorMatrix, colorOffset));
    }
    
    /**
     * Gets the child node that is getting its colors modified by the given {@code node}.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_color_matrix_node_get_child(handle());
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the color matrix used by the {@code node}.
     */
    public org.gtk.graphene.Matrix getColorMatrix() {
        var RESULT = gtk_h.gsk_color_matrix_node_get_color_matrix(handle());
        return new org.gtk.graphene.Matrix(Refcounted.get(RESULT, false));
    }
    
    /**
     * Retrieves the color offset used by the {@code node}.
     */
    public org.gtk.graphene.Vec4 getColorOffset() {
        var RESULT = gtk_h.gsk_color_matrix_node_get_color_offset(handle());
        return new org.gtk.graphene.Vec4(Refcounted.get(RESULT, false));
    }
    
}
