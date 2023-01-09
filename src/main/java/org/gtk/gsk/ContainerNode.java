package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node that can contain other render nodes.
 */
public class ContainerNode extends org.gtk.gsk.RenderNode {
    
    static {
        Gsk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GskContainerNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ContainerNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ContainerNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ContainerNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ContainerNode(input);
    
    private static MemoryAddress constructNew(org.gtk.gsk.RenderNode[] children, int nChildren) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gsk_container_node_new.invokeExact(
                        Interop.allocateNativeArray(children, false, SCOPE),
                        nChildren);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a new {@code GskRenderNode} instance for holding the given {@code children}.
     * <p>
     * The new node will acquire a reference to each of the children.
     * @param children The children of the node
     * @param nChildren Number of children in the {@code children} array
     */
    public ContainerNode(org.gtk.gsk.RenderNode[] children, int nChildren) {
        super(constructNew(children, nChildren));
        this.takeOwnership();
    }
    
    /**
     * Gets one of the children of {@code container}.
     * @param idx the position of the child to get
     * @return the {@code idx}'th child of {@code container}
     */
    public org.gtk.gsk.RenderNode getChild(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_container_node_get_child.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gsk.RenderNode) Interop.register(RESULT, org.gtk.gsk.RenderNode.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the number of direct children of {@code node}.
     * @return the number of children of the {@code GskRenderNode}
     */
    public int getNChildren() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_container_node_get_n_children.invokeExact(handle());
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
            RESULT = (long) DowncallHandles.gsk_container_node_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_container_node_new = Interop.downcallHandle(
                "gsk_container_node_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gsk_container_node_get_child = Interop.downcallHandle(
                "gsk_container_node_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gsk_container_node_get_n_children = Interop.downcallHandle(
                "gsk_container_node_get_n_children",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gsk_container_node_get_type = Interop.downcallHandle(
                "gsk_container_node_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gsk_container_node_get_type != null;
    }
}
