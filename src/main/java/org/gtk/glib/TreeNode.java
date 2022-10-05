package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque type which identifies a specific node in a {@link Tree}.
 */
public class TreeNode extends io.github.jwharm.javagi.ResourceBase {

    public TreeNode(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_tree_node_key = Interop.downcallHandle(
        "g_tree_node_key",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the key stored at a particular tree node.
     */
    public java.lang.foreign.MemoryAddress key() {
        try {
            var RESULT = (MemoryAddress) g_tree_node_key.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_node_next = Interop.downcallHandle(
        "g_tree_node_next",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the next in-order node of the tree, or {@code null}
     * if the passed node was already the last one.
     */
    public TreeNode next() {
        try {
            var RESULT = (MemoryAddress) g_tree_node_next.invokeExact(handle());
            return new TreeNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_node_previous = Interop.downcallHandle(
        "g_tree_node_previous",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the previous in-order node of the tree, or {@code null}
     * if the passed node was already the first one.
     */
    public TreeNode previous() {
        try {
            var RESULT = (MemoryAddress) g_tree_node_previous.invokeExact(handle());
            return new TreeNode(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_tree_node_value = Interop.downcallHandle(
        "g_tree_node_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value stored at a particular tree node.
     */
    public java.lang.foreign.MemoryAddress value() {
        try {
            var RESULT = (MemoryAddress) g_tree_node_value.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
