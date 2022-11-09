package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node applying a blending function between its two child nodes.
 */
public class BlendNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskBlendNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a BlendNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BlendNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to BlendNode if its GType is a (or inherits from) "GskBlendNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "BlendNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskBlendNode", a ClassCastException will be thrown.
     */
    public static BlendNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskBlendNode"))) {
            return new BlendNode(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskBlendNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gsk.RenderNode bottom, @NotNull org.gtk.gsk.RenderNode top, @NotNull org.gtk.gsk.BlendMode blendMode) {
        java.util.Objects.requireNonNull(bottom, "Parameter 'bottom' must not be null");
        java.util.Objects.requireNonNull(top, "Parameter 'top' must not be null");
        java.util.Objects.requireNonNull(blendMode, "Parameter 'blendMode' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_blend_node_new.invokeExact(
                    bottom.handle(),
                    top.handle(),
                    blendMode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GskRenderNode} that will use {@code blend_mode} to blend the {@code top}
     * node onto the {@code bottom} node.
     * @param bottom The bottom node to be drawn
     * @param top The node to be blended onto the {@code bottom} node
     * @param blendMode The blend mode to use
     */
    public BlendNode(@NotNull org.gtk.gsk.RenderNode bottom, @NotNull org.gtk.gsk.RenderNode top, @NotNull org.gtk.gsk.BlendMode blendMode) {
        super(constructNew(bottom, top, blendMode), Ownership.FULL);
    }
    
    /**
     * Retrieves the blend mode used by {@code node}.
     * @return the blend mode
     */
    public @NotNull org.gtk.gsk.BlendMode getBlendMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_blend_node_get_blend_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.BlendMode(RESULT);
    }
    
    /**
     * Retrieves the bottom {@code GskRenderNode} child of the {@code node}.
     * @return the bottom child node
     */
    public @NotNull org.gtk.gsk.RenderNode getBottomChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_blend_node_get_bottom_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the top {@code GskRenderNode} child of the {@code node}.
     * @return the top child node
     */
    public @NotNull org.gtk.gsk.RenderNode getTopChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_blend_node_get_top_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_blend_node_new = Interop.downcallHandle(
            "gsk_blend_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gsk_blend_node_get_blend_mode = Interop.downcallHandle(
            "gsk_blend_node_get_blend_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_blend_node_get_bottom_child = Interop.downcallHandle(
            "gsk_blend_node_get_bottom_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gsk_blend_node_get_top_child = Interop.downcallHandle(
            "gsk_blend_node_get_top_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
