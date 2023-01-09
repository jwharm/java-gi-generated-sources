package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node controlling the color matrix of its single child node.
 */
public class ColorMatrixNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskColorMatrixNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ColorMatrixNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ColorMatrixNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ColorMatrixNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ColorMatrixNode(input);
    
    private static MemoryAddress constructNew(org.gtk.gsk.RenderNode child, org.gtk.graphene.Matrix colorMatrix, org.gtk.graphene.Vec4 colorOffset) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_color_matrix_node_new.invokeExact(
                    child.handle(),
                    colorMatrix.handle(),
                    colorOffset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param child The node to draw
     * @param colorMatrix The matrix to apply
     * @param colorOffset Values to add to the color
     */
    public ColorMatrixNode(org.gtk.gsk.RenderNode child, org.gtk.graphene.Matrix colorMatrix, org.gtk.graphene.Vec4 colorOffset) {
        super(constructNew(child, colorMatrix, colorOffset));
        this.takeOwnership();
    }
    
    /**
     * Gets the child node that is getting its colors modified by the given {@code node}.
     * @return The child that is getting its colors modified
     */
    public org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_color_matrix_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the color matrix used by the {@code node}.
     * @return a 4x4 color matrix
     */
    public org.gtk.graphene.Matrix getColorMatrix() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_color_matrix_node_get_color_matrix.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Matrix.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the color offset used by the {@code node}.
     * @return a color vector
     */
    public org.gtk.graphene.Vec4 getColorOffset() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_color_matrix_node_get_color_offset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.graphene.Vec4.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_color_matrix_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_color_matrix_node_new = Interop.downcallHandle(
                "gsk_color_matrix_node_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_color_matrix_node_get_child = Interop.downcallHandle(
                "gsk_color_matrix_node_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_color_matrix_node_get_color_matrix = Interop.downcallHandle(
                "gsk_color_matrix_node_get_color_matrix",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_color_matrix_node_get_color_offset = Interop.downcallHandle(
                "gsk_color_matrix_node_get_color_offset",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_color_matrix_node_get_type = Interop.downcallHandle(
                "gsk_color_matrix_node_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_color_matrix_node_get_type != null;
    }
}
