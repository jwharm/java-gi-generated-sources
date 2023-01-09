package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node drawing one or more shadows behind its single child node.
 */
public class ShadowNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskShadowNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ShadowNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ShadowNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ShadowNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ShadowNode(input);
    
    private static MemoryAddress constructNew(org.gtk.gsk.RenderNode child, org.gtk.gsk.Shadow[] shadows, long nShadows) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gsk_shadow_node_new.invokeExact(
                        child.handle(),
                        Interop.allocateNativeArray(shadows, org.gtk.gsk.Shadow.getMemoryLayout(), false, SCOPE),
                        nShadows);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a {@code GskRenderNode} that will draw a {@code child} with the given
     * {@code shadows} below it.
     * @param child The node to draw
     * @param shadows The shadows to apply
     * @param nShadows number of entries in the {@code shadows} array
     */
    public ShadowNode(org.gtk.gsk.RenderNode child, org.gtk.gsk.Shadow[] shadows, long nShadows) {
        super(constructNew(child, shadows, nShadows));
        this.takeOwnership();
    }
    
    /**
     * Retrieves the child {@code GskRenderNode} of the shadow {@code node}.
     * @return the child render node
     */
    public org.gtk.gsk.RenderNode getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_shadow_node_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the number of shadows in the {@code node}.
     * @return the number of shadows.
     */
    public long getNShadows() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_shadow_node_get_n_shadows.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the shadow data at the given index {@code i}.
     * @param i the given index
     * @return the shadow data
     */
    public org.gtk.gsk.Shadow getShadow(long i) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_shadow_node_get_shadow.invokeExact(
                    handle(),
                    i);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gsk.Shadow.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gsk_shadow_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_shadow_node_new = Interop.downcallHandle(
                "gsk_shadow_node_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gsk_shadow_node_get_child = Interop.downcallHandle(
                "gsk_shadow_node_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_shadow_node_get_n_shadows = Interop.downcallHandle(
                "gsk_shadow_node_get_n_shadows",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_shadow_node_get_shadow = Interop.downcallHandle(
                "gsk_shadow_node_get_shadow",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gsk_shadow_node_get_type = Interop.downcallHandle(
                "gsk_shadow_node_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_shadow_node_get_type != null;
    }
}
