package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gsk_color_matrix_node_new = Interop.downcallHandle(
        "gsk_color_matrix_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull RenderNode child, @NotNull org.gtk.graphene.Matrix colorMatrix, @NotNull org.gtk.graphene.Vec4 colorOffset) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_color_matrix_node_new.invokeExact(child.handle(), colorMatrix.handle(), colorOffset.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public ColorMatrixNode(@NotNull RenderNode child, @NotNull org.gtk.graphene.Matrix colorMatrix, @NotNull org.gtk.graphene.Vec4 colorOffset) {
        super(constructNew(child, colorMatrix, colorOffset));
    }
    
    private static final MethodHandle gsk_color_matrix_node_get_child = Interop.downcallHandle(
        "gsk_color_matrix_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child node that is getting its colors modified by the given {@code node}.
     */
    public @NotNull RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_color_matrix_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_color_matrix_node_get_color_matrix = Interop.downcallHandle(
        "gsk_color_matrix_node_get_color_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the color matrix used by the {@code node}.
     */
    public @NotNull org.gtk.graphene.Matrix getColorMatrix() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_color_matrix_node_get_color_matrix.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_color_matrix_node_get_color_offset = Interop.downcallHandle(
        "gsk_color_matrix_node_get_color_offset",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the color offset used by the {@code node}.
     */
    public @NotNull org.gtk.graphene.Vec4 getColorOffset() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_color_matrix_node_get_color_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(Refcounted.get(RESULT, false));
    }
    
}
