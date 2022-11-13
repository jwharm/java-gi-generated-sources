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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ColorMatrixNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ColorMatrixNode if its GType is a (or inherits from) "GskColorMatrixNode".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ColorMatrixNode} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskColorMatrixNode", a ClassCastException will be thrown.
     */
    public static ColorMatrixNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskColorMatrixNode"))) {
            return new ColorMatrixNode(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskColorMatrixNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gsk.RenderNode child, @NotNull org.gtk.graphene.Matrix colorMatrix, @NotNull org.gtk.graphene.Vec4 colorOffset) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(colorMatrix, "Parameter 'colorMatrix' must not be null");
        java.util.Objects.requireNonNull(colorOffset, "Parameter 'colorOffset' must not be null");
        Addressable RESULT;
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
    public ColorMatrixNode(@NotNull org.gtk.gsk.RenderNode child, @NotNull org.gtk.graphene.Matrix colorMatrix, @NotNull org.gtk.graphene.Vec4 colorOffset) {
        super(constructNew(child, colorMatrix, colorOffset), Ownership.FULL);
    }
    
    /**
     * Gets the child node that is getting its colors modified by the given {@code node}.
     * @return The child that is getting its colors modified
     */
    public @NotNull org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_color_matrix_node_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the color matrix used by the {@code node}.
     * @return a 4x4 color matrix
     */
    public @NotNull org.gtk.graphene.Matrix getColorMatrix() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_color_matrix_node_get_color_matrix.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Matrix(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the color offset used by the {@code node}.
     * @return a color vector
     */
    public @NotNull org.gtk.graphene.Vec4 getColorOffset() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_color_matrix_node_get_color_offset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.graphene.Vec4(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_color_matrix_node_new = Interop.downcallHandle(
            "gsk_color_matrix_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_color_matrix_node_get_child = Interop.downcallHandle(
            "gsk_color_matrix_node_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_color_matrix_node_get_color_matrix = Interop.downcallHandle(
            "gsk_color_matrix_node_get_color_matrix",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_color_matrix_node_get_color_offset = Interop.downcallHandle(
            "gsk_color_matrix_node_get_color_offset",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
