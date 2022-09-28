package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link Node} struct represents one node in a [n-ary tree][glib-N-ary-Trees].
 */
public class Node extends io.github.jwharm.javagi.ResourceBase {

    public Node(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public Node() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GNode.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Gets the position of the first child of a {@link Node}
     * which contains the given data.
     */
    public int childIndex(java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_node_child_index(handle(), data);
        return RESULT;
    }
    
    /**
     * Gets the position of a {@link Node} with respect to its siblings.
     * {@code child} must be a child of {@code node}. The first child is numbered 0,
     * the second 1, and so on.
     */
    public int childPosition(Node child) {
        var RESULT = gtk_h.g_node_child_position(handle(), child.handle());
        return RESULT;
    }
    
    /**
     * Calls a function for each of the children of a {@link Node}. Note that it
     * doesn't descend beneath the child nodes. {@code func} must not do anything
     * that would modify the structure of the tree.
     */
    public void childrenForeach(TraverseFlags flags, NodeForeachFunc func) {
        try {
            gtk_h.g_node_children_foreach(handle(), flags.getValue(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbNodeForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Recursively copies a {@link Node} (but does not deep-copy the data inside the
     * nodes, see g_node_copy_deep() if you need that).
     */
    public Node copy() {
        var RESULT = gtk_h.g_node_copy(handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Recursively copies a {@link Node} and its data.
     */
    public Node copyDeep(CopyFunc copyFunc) {
        try {
            var RESULT = gtk_h.g_node_copy_deep(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbCopyFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(copyFunc.hashCode(), copyFunc)));
            return new Node(References.get(RESULT, false));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets the depth of a {@link Node}.
     * <p>
     * If {@code node} is {@code null} the depth is 0. The root node has a depth of 1.
     * For the children of the root node the depth is 2. And so on.
     */
    public int depth() {
        var RESULT = gtk_h.g_node_depth(handle());
        return RESULT;
    }
    
    /**
     * Removes {@code root} and its children from the tree, freeing any memory
     * allocated.
     */
    public void destroy() {
        gtk_h.g_node_destroy(handle());
    }
    
    /**
     * Finds a {@link Node} in a tree.
     */
    public Node find(TraverseType order, TraverseFlags flags, java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_node_find(handle(), order.getValue(), flags.getValue(), data);
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Finds the first child of a {@link Node} with the given data.
     */
    public Node findChild(TraverseFlags flags, java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_node_find_child(handle(), flags.getValue(), data);
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Gets the first sibling of a {@link Node}.
     * This could possibly be the node itself.
     */
    public Node firstSibling() {
        var RESULT = gtk_h.g_node_first_sibling(handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Gets the root of a tree.
     */
    public Node getRoot() {
        var RESULT = gtk_h.g_node_get_root(handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Inserts a {@link Node} beneath the parent at the given position.
     */
    public Node insert(int position, Node node) {
        var RESULT = gtk_h.g_node_insert(handle(), position, node.handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Inserts a {@link Node} beneath the parent after the given sibling.
     */
    public Node insertAfter(Node sibling, Node node) {
        var RESULT = gtk_h.g_node_insert_after(handle(), sibling.handle(), node.handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Inserts a {@link Node} beneath the parent before the given sibling.
     */
    public Node insertBefore(Node sibling, Node node) {
        var RESULT = gtk_h.g_node_insert_before(handle(), sibling.handle(), node.handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Returns {@code true} if {@code node} is an ancestor of {@code descendant}.
     * This is true if node is the parent of {@code descendant},
     * or if node is the grandparent of {@code descendant} etc.
     */
    public boolean isAncestor(Node descendant) {
        var RESULT = gtk_h.g_node_is_ancestor(handle(), descendant.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the last child of a {@link Node}.
     */
    public Node lastChild() {
        var RESULT = gtk_h.g_node_last_child(handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Gets the last sibling of a {@link Node}.
     * This could possibly be the node itself.
     */
    public Node lastSibling() {
        var RESULT = gtk_h.g_node_last_sibling(handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Gets the maximum height of all branches beneath a {@link Node}.
     * This is the maximum distance from the {@link Node} to all leaf nodes.
     * <p>
     * If {@code root} is {@code null}, 0 is returned. If {@code root} has no children,
     * 1 is returned. If {@code root} has children, 2 is returned. And so on.
     */
    public int maxHeight() {
        var RESULT = gtk_h.g_node_max_height(handle());
        return RESULT;
    }
    
    /**
     * Gets the number of children of a {@link Node}.
     */
    public int nChildren() {
        var RESULT = gtk_h.g_node_n_children(handle());
        return RESULT;
    }
    
    /**
     * Gets the number of nodes in a tree.
     */
    public int nNodes(TraverseFlags flags) {
        var RESULT = gtk_h.g_node_n_nodes(handle(), flags.getValue());
        return RESULT;
    }
    
    /**
     * Gets a child of a {@link Node}, using the given index.
     * The first child is at index 0. If the index is
     * too big, {@code null} is returned.
     */
    public Node nthChild(int n) {
        var RESULT = gtk_h.g_node_nth_child(handle(), n);
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Inserts a {@link Node} as the first child of the given parent.
     */
    public Node prepend(Node node) {
        var RESULT = gtk_h.g_node_prepend(handle(), node.handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Reverses the order of the children of a {@link Node}.
     * (It doesn't change the order of the grandchildren.)
     */
    public void reverseChildren() {
        gtk_h.g_node_reverse_children(handle());
    }
    
    /**
     * Traverses a tree starting at the given root {@link Node}.
     * It calls the given function for each node visited.
     * The traversal can be halted at any point by returning {@code true} from {@code func}.
     * {@code func} must not do anything that would modify the structure of the tree.
     */
    public void traverse(TraverseType order, TraverseFlags flags, int maxDepth, NodeTraverseFunc func) {
        try {
            gtk_h.g_node_traverse(handle(), order.getValue(), flags.getValue(), maxDepth, 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GLib.class, "__cbNodeTraverseFunc",
                            MethodType.methodType(boolean.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)));
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Unlinks a {@link Node} from a tree, resulting in two separate trees.
     */
    public void unlink() {
        gtk_h.g_node_unlink(handle());
    }
    
    /**
     * Creates a new {@link Node} containing the given data.
     * Used to create the first node in a tree.
     */
    public static Node new_(java.lang.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_node_new(data);
        return new Node(References.get(RESULT, false));
    }
    
}
