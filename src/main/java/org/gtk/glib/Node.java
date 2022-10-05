package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link Node} struct represents one node in a [n-ary tree][glib-N-ary-Trees].
 */
public class Node extends io.github.jwharm.javagi.ResourceBase {

    public Node(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_node_child_index = Interop.downcallHandle(
        "g_node_child_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the position of the first child of a {@link Node}
     * which contains the given data.
     */
    public int childIndex(java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (int) g_node_child_index.invokeExact(handle(), data);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_child_position = Interop.downcallHandle(
        "g_node_child_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the position of a {@link Node} with respect to its siblings.
     * {@code child} must be a child of {@code node}. The first child is numbered 0,
     * the second 1, and so on.
     */
    public int childPosition(Node child) {
        try {
            var RESULT = (int) g_node_child_position.invokeExact(handle(), child.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_children_foreach = Interop.downcallHandle(
        "g_node_children_foreach",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls a function for each of the children of a {@link Node}. Note that it
     * doesn't descend beneath the child nodes. {@code func} must not do anything
     * that would modify the structure of the tree.
     */
    public void childrenForeach(TraverseFlags flags, NodeForeachFunc func) {
        try {
            g_node_children_foreach.invokeExact(handle(), flags.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbNodeForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_copy = Interop.downcallHandle(
        "g_node_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Recursively copies a {@link Node} (but does not deep-copy the data inside the
     * nodes, see g_node_copy_deep() if you need that).
     */
    public Node copy() {
        try {
            var RESULT = (MemoryAddress) g_node_copy.invokeExact(handle());
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_copy_deep = Interop.downcallHandle(
        "g_node_copy_deep",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Recursively copies a {@link Node} and its data.
     */
    public Node copyDeep(CopyFunc copyFunc) {
        try {
            var RESULT = (MemoryAddress) g_node_copy_deep.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(copyFunc.hashCode(), copyFunc)));
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_depth = Interop.downcallHandle(
        "g_node_depth",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the depth of a {@link Node}.
     * <p>
     * If {@code node} is {@code null} the depth is 0. The root node has a depth of 1.
     * For the children of the root node the depth is 2. And so on.
     */
    public int depth() {
        try {
            var RESULT = (int) g_node_depth.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_destroy = Interop.downcallHandle(
        "g_node_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code root} and its children from the tree, freeing any memory
     * allocated.
     */
    public void destroy() {
        try {
            g_node_destroy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_find = Interop.downcallHandle(
        "g_node_find",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds a {@link Node} in a tree.
     */
    public Node find(TraverseType order, TraverseFlags flags, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_node_find.invokeExact(handle(), order.getValue(), flags.getValue(), data);
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_find_child = Interop.downcallHandle(
        "g_node_find_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the first child of a {@link Node} with the given data.
     */
    public Node findChild(TraverseFlags flags, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_node_find_child.invokeExact(handle(), flags.getValue(), data);
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_first_sibling = Interop.downcallHandle(
        "g_node_first_sibling",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the first sibling of a {@link Node}.
     * This could possibly be the node itself.
     */
    public Node firstSibling() {
        try {
            var RESULT = (MemoryAddress) g_node_first_sibling.invokeExact(handle());
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_get_root = Interop.downcallHandle(
        "g_node_get_root",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the root of a tree.
     */
    public Node getRoot() {
        try {
            var RESULT = (MemoryAddress) g_node_get_root.invokeExact(handle());
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_insert = Interop.downcallHandle(
        "g_node_insert",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a {@link Node} beneath the parent at the given position.
     */
    public Node insert(int position, Node node) {
        try {
            var RESULT = (MemoryAddress) g_node_insert.invokeExact(handle(), position, node.handle());
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_insert_after = Interop.downcallHandle(
        "g_node_insert_after",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a {@link Node} beneath the parent after the given sibling.
     */
    public Node insertAfter(Node sibling, Node node) {
        try {
            var RESULT = (MemoryAddress) g_node_insert_after.invokeExact(handle(), sibling.handle(), node.handle());
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_insert_before = Interop.downcallHandle(
        "g_node_insert_before",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a {@link Node} beneath the parent before the given sibling.
     */
    public Node insertBefore(Node sibling, Node node) {
        try {
            var RESULT = (MemoryAddress) g_node_insert_before.invokeExact(handle(), sibling.handle(), node.handle());
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_is_ancestor = Interop.downcallHandle(
        "g_node_is_ancestor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if {@code node} is an ancestor of {@code descendant}.
     * This is true if node is the parent of {@code descendant},
     * or if node is the grandparent of {@code descendant} etc.
     */
    public boolean isAncestor(Node descendant) {
        try {
            var RESULT = (int) g_node_is_ancestor.invokeExact(handle(), descendant.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_last_child = Interop.downcallHandle(
        "g_node_last_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the last child of a {@link Node}.
     */
    public Node lastChild() {
        try {
            var RESULT = (MemoryAddress) g_node_last_child.invokeExact(handle());
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_last_sibling = Interop.downcallHandle(
        "g_node_last_sibling",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the last sibling of a {@link Node}.
     * This could possibly be the node itself.
     */
    public Node lastSibling() {
        try {
            var RESULT = (MemoryAddress) g_node_last_sibling.invokeExact(handle());
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_max_height = Interop.downcallHandle(
        "g_node_max_height",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the maximum height of all branches beneath a {@link Node}.
     * This is the maximum distance from the {@link Node} to all leaf nodes.
     * <p>
     * If {@code root} is {@code null}, 0 is returned. If {@code root} has no children,
     * 1 is returned. If {@code root} has children, 2 is returned. And so on.
     */
    public int maxHeight() {
        try {
            var RESULT = (int) g_node_max_height.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_n_children = Interop.downcallHandle(
        "g_node_n_children",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of children of a {@link Node}.
     */
    public int nChildren() {
        try {
            var RESULT = (int) g_node_n_children.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_n_nodes = Interop.downcallHandle(
        "g_node_n_nodes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the number of nodes in a tree.
     */
    public int nNodes(TraverseFlags flags) {
        try {
            var RESULT = (int) g_node_n_nodes.invokeExact(handle(), flags.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_nth_child = Interop.downcallHandle(
        "g_node_nth_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets a child of a {@link Node}, using the given index.
     * The first child is at index 0. If the index is
     * too big, {@code null} is returned.
     */
    public Node nthChild(int n) {
        try {
            var RESULT = (MemoryAddress) g_node_nth_child.invokeExact(handle(), n);
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_prepend = Interop.downcallHandle(
        "g_node_prepend",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts a {@link Node} as the first child of the given parent.
     */
    public Node prepend(Node node) {
        try {
            var RESULT = (MemoryAddress) g_node_prepend.invokeExact(handle(), node.handle());
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_reverse_children = Interop.downcallHandle(
        "g_node_reverse_children",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Reverses the order of the children of a {@link Node}.
     * (It doesn't change the order of the grandchildren.)
     */
    public void reverseChildren() {
        try {
            g_node_reverse_children.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_traverse = Interop.downcallHandle(
        "g_node_traverse",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Traverses a tree starting at the given root {@link Node}.
     * It calls the given function for each node visited.
     * The traversal can be halted at any point by returning {@code true} from {@code func}.
     * {@code func} must not do anything that would modify the structure of the tree.
     */
    public void traverse(TraverseType order, TraverseFlags flags, int maxDepth, NodeTraverseFunc func) {
        try {
            g_node_traverse.invokeExact(handle(), order.getValue(), flags.getValue(), maxDepth, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbNodeTraverseFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_unlink = Interop.downcallHandle(
        "g_node_unlink",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Unlinks a {@link Node} from a tree, resulting in two separate trees.
     */
    public void unlink() {
        try {
            g_node_unlink.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_node_new = Interop.downcallHandle(
        "g_node_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@link Node} containing the given data.
     * Used to create the first node in a tree.
     */
    public static Node new_(java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (MemoryAddress) g_node_new.invokeExact(data);
            return new Node(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
