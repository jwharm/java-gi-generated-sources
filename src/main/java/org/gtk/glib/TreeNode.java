package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque type which identifies a specific node in a {@link Tree}.
 * @version 2.68
 */
public class TreeNode extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTreeNode";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TreeNode}
     * @return A new, uninitialized @{link TreeNode}
     */
    public static TreeNode allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TreeNode newInstance = new TreeNode(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TreeNode proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TreeNode(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeNode> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TreeNode(input);
    
    /**
     * Gets the key stored at a particular tree node.
     * @return the key at the node.
     */
    public @Nullable java.lang.foreign.MemoryAddress key() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_node_key.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the next in-order node of the tree, or {@code null}
     * if the passed node was already the last one.
     * @return the next node in the tree
     */
    public @Nullable org.gtk.glib.TreeNode next() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_node_next.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TreeNode.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the previous in-order node of the tree, or {@code null}
     * if the passed node was already the first one.
     * @return the previous node in the tree
     */
    public @Nullable org.gtk.glib.TreeNode previous() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_node_previous.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.TreeNode.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the value stored at a particular tree node.
     * @return the value at the node.
     */
    public @Nullable java.lang.foreign.MemoryAddress value() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_tree_node_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_tree_node_key = Interop.downcallHandle(
                "g_tree_node_key",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_node_next = Interop.downcallHandle(
                "g_tree_node_next",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_node_previous = Interop.downcallHandle(
                "g_tree_node_previous",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_tree_node_value = Interop.downcallHandle(
                "g_tree_node_value",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
