package org.gtk.glib;

/**
 * Specifies the type of traversal performed by g_tree_traverse(),
 * g_node_traverse() and g_node_find(). The different orders are
 * illustrated here:
 * <ul>
 * <li>In order: A, B, C, D, E, F, G, H, I
 *   ![](Sorted_binary_tree_inorder.svg)
 * <li>Pre order: F, B, A, D, C, E, G, I, H
 *   ![](Sorted_binary_tree_preorder.svg)
 * <li>Post order: A, C, E, D, B, H, I, G, F
 *   ![](Sorted_binary_tree_postorder.svg)
 * <li>Level order: F, B, G, A, D, I, C, E, H
 *   ![](Sorted_binary_tree_breadth-first_traversal.svg)
 */
public class TraverseType extends io.github.jwharm.javagi.Enumeration {

    /**
     * vists a node's left child first, then the node itself,
     *              then its right child. This is the one to use if you
     *              want the output sorted according to the compare
     *              function.
     */
    public static final TraverseType IN_ORDER = new TraverseType(0);
    
    /**
     * visits a node, then its children.
     */
    public static final TraverseType PRE_ORDER = new TraverseType(1);
    
    /**
     * visits the node's children, then the node itself.
     */
    public static final TraverseType POST_ORDER = new TraverseType(2);
    
    /**
     * is not implemented for
     *              [balanced binary trees][glib-Balanced-Binary-Trees].
     *              For [n-ary trees][glib-N-ary-Trees], it
     *              vists the root node first, then its children, then
     *              its grandchildren, and so on. Note that this is less
     *              efficient than the other orders.
     */
    public static final TraverseType LEVEL_ORDER = new TraverseType(3);
    
    public TraverseType(int value) {
        super(value);
    }
    
}
