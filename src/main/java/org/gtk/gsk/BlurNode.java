package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node applying a blur effect to its single child.
 */
public class BlurNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskBlurNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a BlurNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected BlurNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, BlurNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new BlurNode(input);
    
    private static MemoryAddress constructNew(org.gtk.gsk.RenderNode child, float radius) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_blur_node_new.invokeExact(
                    child.handle(),
                    radius);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a render node that blurs the child.
     * @param child the child node to blur
     * @param radius the blur radius. Must be positive
     */
    public BlurNode(org.gtk.gsk.RenderNode child, float radius) {
        super(constructNew(child, radius));
        this.takeOwnership();
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} of the blur {@code node}.
     * @return the blurred child node
     */
    public org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_blur_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the blur radius of the {@code node}.
     * @return the blur radius
     */
    public float getRadius() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gsk_blur_node_get_radius.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_blur_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_blur_node_new = Interop.downcallHandle(
                "gsk_blur_node_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle gsk_blur_node_get_child = Interop.downcallHandle(
                "gsk_blur_node_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_blur_node_get_radius = Interop.downcallHandle(
                "gsk_blur_node_get_radius",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_blur_node_get_type = Interop.downcallHandle(
                "gsk_blur_node_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_blur_node_get_type != null;
    }
}
