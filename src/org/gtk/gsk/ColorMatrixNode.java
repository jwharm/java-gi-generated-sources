package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node controlling the color matrix of its single child node.
 */
public class ColorMatrixNode extends RenderNode {

    public ColorMatrixNode(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ColorMatrixNode */
    public static ColorMatrixNode castFrom(org.gtk.gobject.Object gobject) {
        return new ColorMatrixNode(gobject.getReference());
    }
    
    /**
     * Creates a `GskRenderNode` that will drawn the @child with
     * @color_matrix.
     * 
     * In particular, the node will transform the operation
     * 
     *     pixel = color_matrix * pixel + color_offset
     * 
     * for every pixel.
     */
    public ColorMatrixNode(RenderNode child, org.gtk.graphene.Matrix colorMatrix, org.gtk.graphene.Vec4 colorOffset) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_color_matrix_node_new(child.HANDLE(), colorMatrix.HANDLE(), colorOffset.HANDLE()), true));
    }
    
    /**
     * Gets the child node that is getting its colors modified by the given @node.
     */
    public RenderNode getChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_color_matrix_node_get_child(HANDLE());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the color matrix used by the @node.
     */
    public org.gtk.graphene.Matrix getColorMatrix() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_color_matrix_node_get_color_matrix(HANDLE());
        return new org.gtk.graphene.Matrix(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the color offset used by the @node.
     */
    public org.gtk.graphene.Vec4 getColorOffset() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gsk_color_matrix_node_get_color_offset(HANDLE());
        return new org.gtk.graphene.Vec4(References.get(RESULT, false));
    }
    
}
