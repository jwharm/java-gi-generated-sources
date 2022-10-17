package org.gtk.gsk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A render node that can contain other render nodes.
 */
public class ContainerNode extends RenderNode {

    public ContainerNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ContainerNode */
    public static ContainerNode castFrom(org.gtk.gobject.Object gobject) {
        return new ContainerNode(gobject.refcounted());
    }
    
    private static final MethodHandle gsk_container_node_new = Interop.downcallHandle(
        "gsk_container_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@NotNull RenderNode[] children, @NotNull int nChildren) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gsk_container_node_new.invokeExact(Interop.allocateNativeArray(children), nChildren), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GskRenderNode} instance for holding the given {@code children}.
     * <p>
     * The new node will acquire a reference to each of the children.
     */
    public ContainerNode(@NotNull RenderNode[] children, @NotNull int nChildren) {
        super(constructNew(children, nChildren));
    }
    
    private static final MethodHandle gsk_container_node_get_child = Interop.downcallHandle(
        "gsk_container_node_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets one of the children of {@code container}.
     */
    public @NotNull RenderNode getChild(@NotNull int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gsk_container_node_get_child.invokeExact(handle(), idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new RenderNode(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gsk_container_node_get_n_children = Interop.downcallHandle(
        "gsk_container_node_get_n_children",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the number of direct children of {@code node}.
     */
    public int getNChildren() {
        int RESULT;
        try {
            RESULT = (int) gsk_container_node_get_n_children.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
}
