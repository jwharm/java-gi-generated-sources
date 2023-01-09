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
     */
    protected BlendNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BlendNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BlendNode(input);
    
    private static MemoryAddress constructNew(org.gtk.gsk.RenderNode bottom, org.gtk.gsk.RenderNode top, org.gtk.gsk.BlendMode blendMode) {
        MemoryAddress RESULT;
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
    public BlendNode(org.gtk.gsk.RenderNode bottom, org.gtk.gsk.RenderNode top, org.gtk.gsk.BlendMode blendMode) {
        super(constructNew(bottom, top, blendMode));
        this.takeOwnership();
    }
    
    /**
     * Retrieves the blend mode used by {@code node}.
     * @return the blend mode
     */
    public org.gtk.gsk.BlendMode getBlendMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_blend_node_get_blend_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.BlendMode.of(RESULT);
    }
    
    /**
     * Retrieves the bottom {@code GskRenderNode} child of the {@code node}.
     * @return the bottom child node
     */
    public org.gtk.gsk.RenderNode getBottomChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_blend_node_get_bottom_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the top {@code GskRenderNode} child of the {@code node}.
     * @return the top child node
     */
    public org.gtk.gsk.RenderNode getTopChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_blend_node_get_top_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_blend_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_blend_node_new = Interop.downcallHandle(
                "gsk_blend_node_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gsk_blend_node_get_blend_mode = Interop.downcallHandle(
                "gsk_blend_node_get_blend_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_blend_node_get_bottom_child = Interop.downcallHandle(
                "gsk_blend_node_get_bottom_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_blend_node_get_top_child = Interop.downcallHandle(
                "gsk_blend_node_get_top_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_blend_node_get_type = Interop.downcallHandle(
                "gsk_blend_node_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_blend_node_get_type != null;
    }
}
