package org.gtk.gsk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A render node controlling the color matrix of its single child node.
 */
public class ColorMatrixNode extends RenderNode {

    public ColorMatrixNode(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ColorMatrixNode */
    public static ColorMatrixNode castFrom(org.gtk.gobject.Object gobject) {
        return new ColorMatrixNode(gobject.getReference());
    }
    
    private static Reference constructNew(RenderNode child, org.gtk.graphene.Matrix colorMatrix, org.gtk.graphene.Vec4 colorOffset) {
        Reference RESULT = References.get(gtk_h.gsk_color_matrix_node_new(child.handle(), colorMatrix.handle(), colorOffset.handle()), true);
        return RESULT;
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
        super(constructNew(child, colorMatrix, colorOffset));
    }
    
    /**
     * Gets the child node that is getting its colors modified by the given @node.
     */
    public RenderNode getChild() {
        var RESULT = gtk_h.gsk_color_matrix_node_get_child(handle());
        return new RenderNode(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the color matrix used by the @node.
     */
    public org.gtk.graphene.Matrix getColorMatrix() {
        var RESULT = gtk_h.gsk_color_matrix_node_get_color_matrix(handle());
        return new org.gtk.graphene.Matrix(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the color offset used by the @node.
     */
    public org.gtk.graphene.Vec4 getColorOffset() {
        var RESULT = gtk_h.gsk_color_matrix_node_get_color_offset(handle());
        return new org.gtk.graphene.Vec4(References.get(RESULT, false));
    }
    
}
