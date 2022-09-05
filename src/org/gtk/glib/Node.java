package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GNode struct represents one node in a [n-ary tree][glib-N-ary-Trees].
 */
public class Node extends io.github.jwharm.javagi.interop.ResourceBase {

    public Node(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Gets the position of the first child of a #GNode
     * which contains the given data.
     */
    public int childIndex(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_child_index(HANDLE(), data);
        return RESULT;
    }
    
    /**
     * Gets the position of a #GNode with respect to its siblings.
     * @child must be a child of @node. The first child is numbered 0,
     * the second 1, and so on.
     */
    public int childPosition(Node child) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_child_position(HANDLE(), child.HANDLE());
        return RESULT;
    }
    
    /**
     * Recursively copies a #GNode (but does not deep-copy the data inside the
     * nodes, see g_node_copy_deep() if you need that).
     */
    public Node copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_copy(HANDLE());
        return new Node(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the depth of a #GNode.
     * 
     * If @node is %NULL the depth is 0. The root node has a depth of 1.
     * For the children of the root node the depth is 2. And so on.
     */
    public int depth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_depth(HANDLE());
        return RESULT;
    }
    
    /**
     * Removes @root and its children from the tree, freeing any memory
     * allocated.
     */
    public void destroy() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_destroy(HANDLE());
    }
    
    /**
     * Finds a #GNode in a tree.
     */
    public Node find(TraverseType order, int flags, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_find(HANDLE(), order.getValue(), flags, data);
        return new Node(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Finds the first child of a #GNode with the given data.
     */
    public Node findChild(int flags, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_find_child(HANDLE(), flags, data);
        return new Node(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the first sibling of a #GNode.
     * This could possibly be the node itself.
     */
    public Node firstSibling() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_first_sibling(HANDLE());
        return new Node(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the root of a tree.
     */
    public Node getRoot() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_get_root(HANDLE());
        return new Node(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Inserts a #GNode beneath the parent at the given position.
     */
    public Node insert(int position, Node node) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_insert(HANDLE(), position, node.HANDLE());
        return new Node(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Inserts a #GNode beneath the parent after the given sibling.
     */
    public Node insertAfter(Node sibling, Node node) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_insert_after(HANDLE(), sibling.HANDLE(), node.HANDLE());
        return new Node(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Inserts a #GNode beneath the parent before the given sibling.
     */
    public Node insertBefore(Node sibling, Node node) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_insert_before(HANDLE(), sibling.HANDLE(), node.HANDLE());
        return new Node(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns %TRUE if @node is an ancestor of @descendant.
     * This is true if node is the parent of @descendant,
     * or if node is the grandparent of @descendant etc.
     */
    public boolean isAncestor(Node descendant) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_is_ancestor(HANDLE(), descendant.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the last child of a #GNode.
     */
    public Node lastChild() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_last_child(HANDLE());
        return new Node(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the last sibling of a #GNode.
     * This could possibly be the node itself.
     */
    public Node lastSibling() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_last_sibling(HANDLE());
        return new Node(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the maximum height of all branches beneath a #GNode.
     * This is the maximum distance from the #GNode to all leaf nodes.
     * 
     * If @root is %NULL, 0 is returned. If @root has no children,
     * 1 is returned. If @root has children, 2 is returned. And so on.
     */
    public int maxHeight() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_max_height(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the number of children of a #GNode.
     */
    public int nChildren() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_n_children(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the number of nodes in a tree.
     */
    public int nNodes(int flags) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_n_nodes(HANDLE(), flags);
        return RESULT;
    }
    
    /**
     * Gets a child of a #GNode, using the given index.
     * The first child is at index 0. If the index is
     * too big, %NULL is returned.
     */
    public Node nthChild(int n) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_nth_child(HANDLE(), n);
        return new Node(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Inserts a #GNode as the first child of the given parent.
     */
    public Node prepend(Node node) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_prepend(HANDLE(), node.HANDLE());
        return new Node(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Reverses the order of the children of a #GNode.
     * (It doesn't change the order of the grandchildren.)
     */
    public void reverseChildren() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_reverse_children(HANDLE());
    }
    
    /**
     * Unlinks a #GNode from a tree, resulting in two separate trees.
     */
    public void unlink() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_node_unlink(HANDLE());
    }
    
}
