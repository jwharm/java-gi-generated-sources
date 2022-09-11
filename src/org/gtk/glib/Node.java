package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GNode struct represents one node in a [n-ary tree][glib-N-ary-Trees].
 */
public class Node extends io.github.jwharm.javagi.interop.ResourceBase {

    public Node(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Gets the position of the first child of a #GNode
     * which contains the given data.
     */
    public int childIndex(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_node_child_index(handle(), data);
        return RESULT;
    }
    
    /**
     * Gets the position of a #GNode with respect to its siblings.
     * @child must be a child of @node. The first child is numbered 0,
     * the second 1, and so on.
     */
    public int childPosition(Node child) {
        var RESULT = gtk_h.g_node_child_position(handle(), child.handle());
        return RESULT;
    }
    
    /**
     * Calls a function for each of the children of a #GNode. Note that it
     * doesn't descend beneath the child nodes. @func must not do anything
     * that would modify the structure of the tree.
     */
    public void childrenForeach(int flags, NodeForeachFunc func) {
        try {
            int hash = func.hashCode();
            JVMCallbacks.signalRegistry.put(hash, func);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbNodeForeachFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_node_children_foreach(handle(), flags, nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Recursively copies a #GNode (but does not deep-copy the data inside the
     * nodes, see g_node_copy_deep() if you need that).
     */
    public Node copy() {
        var RESULT = gtk_h.g_node_copy(handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Recursively copies a #GNode and its data.
     */
    public void copyDeep(CopyFunc copyFunc) {
        try {
            int hash = copyFunc.hashCode();
            JVMCallbacks.signalRegistry.put(hash, copyFunc);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCopyFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_node_copy_deep(handle(), nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Gets the depth of a #GNode.
     * 
     * If @node is %NULL the depth is 0. The root node has a depth of 1.
     * For the children of the root node the depth is 2. And so on.
     */
    public int depth() {
        var RESULT = gtk_h.g_node_depth(handle());
        return RESULT;
    }
    
    /**
     * Removes @root and its children from the tree, freeing any memory
     * allocated.
     */
    public void destroy() {
        gtk_h.g_node_destroy(handle());
    }
    
    /**
     * Finds a #GNode in a tree.
     */
    public Node find(TraverseType order, int flags, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_node_find(handle(), order.getValue(), flags, data);
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Finds the first child of a #GNode with the given data.
     */
    public Node findChild(int flags, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_node_find_child(handle(), flags, data);
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Gets the first sibling of a #GNode.
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
     * Inserts a #GNode beneath the parent at the given position.
     */
    public Node insert(int position, Node node) {
        var RESULT = gtk_h.g_node_insert(handle(), position, node.handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Inserts a #GNode beneath the parent after the given sibling.
     */
    public Node insertAfter(Node sibling, Node node) {
        var RESULT = gtk_h.g_node_insert_after(handle(), sibling.handle(), node.handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Inserts a #GNode beneath the parent before the given sibling.
     */
    public Node insertBefore(Node sibling, Node node) {
        var RESULT = gtk_h.g_node_insert_before(handle(), sibling.handle(), node.handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Returns %TRUE if @node is an ancestor of @descendant.
     * This is true if node is the parent of @descendant,
     * or if node is the grandparent of @descendant etc.
     */
    public boolean isAncestor(Node descendant) {
        var RESULT = gtk_h.g_node_is_ancestor(handle(), descendant.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the last child of a #GNode.
     */
    public Node lastChild() {
        var RESULT = gtk_h.g_node_last_child(handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Gets the last sibling of a #GNode.
     * This could possibly be the node itself.
     */
    public Node lastSibling() {
        var RESULT = gtk_h.g_node_last_sibling(handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Gets the maximum height of all branches beneath a #GNode.
     * This is the maximum distance from the #GNode to all leaf nodes.
     * 
     * If @root is %NULL, 0 is returned. If @root has no children,
     * 1 is returned. If @root has children, 2 is returned. And so on.
     */
    public int maxHeight() {
        var RESULT = gtk_h.g_node_max_height(handle());
        return RESULT;
    }
    
    /**
     * Gets the number of children of a #GNode.
     */
    public int nChildren() {
        var RESULT = gtk_h.g_node_n_children(handle());
        return RESULT;
    }
    
    /**
     * Gets the number of nodes in a tree.
     */
    public int nNodes(int flags) {
        var RESULT = gtk_h.g_node_n_nodes(handle(), flags);
        return RESULT;
    }
    
    /**
     * Gets a child of a #GNode, using the given index.
     * The first child is at index 0. If the index is
     * too big, %NULL is returned.
     */
    public Node nthChild(int n) {
        var RESULT = gtk_h.g_node_nth_child(handle(), n);
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Inserts a #GNode as the first child of the given parent.
     */
    public Node prepend(Node node) {
        var RESULT = gtk_h.g_node_prepend(handle(), node.handle());
        return new Node(References.get(RESULT, false));
    }
    
    /**
     * Reverses the order of the children of a #GNode.
     * (It doesn't change the order of the grandchildren.)
     */
    public void reverseChildren() {
        gtk_h.g_node_reverse_children(handle());
    }
    
    /**
     * Traverses a tree starting at the given root #GNode.
     * It calls the given function for each node visited.
     * The traversal can be halted at any point by returning %TRUE from @func.
     * @func must not do anything that would modify the structure of the tree.
     */
    public void traverse(TraverseType order, int flags, int maxDepth, NodeTraverseFunc func) {
        try {
            int hash = func.hashCode();
            JVMCallbacks.signalRegistry.put(hash, func);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbNodeTraverseFunc", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_node_traverse(handle(), order.getValue(), flags, maxDepth, nativeSymbol, intSegment);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Unlinks a #GNode from a tree, resulting in two separate trees.
     */
    public void unlink() {
        gtk_h.g_node_unlink(handle());
    }
    
    /**
     * Creates a new #GNode containing the given data.
     * Used to create the first node in a tree.
     */
    public static Node new_(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_node_new(data);
        return new Node(References.get(RESULT, false));
    }
    
}
