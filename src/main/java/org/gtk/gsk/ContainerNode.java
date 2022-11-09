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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ContainerNode(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ContainerNode if its GType is a (or inherits from) "GskContainerNode".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ContainerNode" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GskContainerNode", a ClassCastException will be thrown.
     */
    public static ContainerNode castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GskContainerNode"))) {
            return new ContainerNode(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GskContainerNode");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gsk.RenderNode[] children, int nChildren) {
        java.util.Objects.requireNonNull(children, "Parameter 'children' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_container_node_new.invokeExact(
                    Interop.allocateNativeArray(children, false),
                    nChildren);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GskRenderNode} instance for holding the given {@code children}.
     * <p>
     * The new node will acquire a reference to each of the children.
     * @param children The children of the node
     * @param nChildren Number of children in the {@code children} array
     */
    public ContainerNode(@NotNull org.gtk.gsk.RenderNode[] children, int nChildren) {
        super(constructNew(children, nChildren), Ownership.FULL);
    }
    
    /**
     * Gets one of the children of {@code container}.
     * @param idx the position of the child to get
     * @return the {@code idx}'th child of {@code container}
     */
    public @NotNull org.gtk.gsk.RenderNode getChild(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gsk_container_node_get_child.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gsk.RenderNode(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the number of direct children of {@code node}.
     * @return the number of children of the {@code GskRenderNode}
     */
    public int getNChildren() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gsk_container_node_get_n_children.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gsk_container_node_new = Interop.downcallHandle(
            "gsk_container_node_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gsk_container_node_get_child = Interop.downcallHandle(
            "gsk_container_node_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gsk_container_node_get_n_children = Interop.downcallHandle(
            "gsk_container_node_get_n_children",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
