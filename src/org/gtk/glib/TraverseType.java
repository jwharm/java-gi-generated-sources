package org.gtk.glib;

/**
 * Specifies the type of traversal performed by g_tree_traverse(),
 * g_node_traverse() and g_node_find(). The different orders are
 * illustrated here:
 * - In order: A, B, C, D, E, F, G, H, I
 *   !{@link []}(Sorted_binary_tree_inorder.svg)
 * - Pre order: F, B, A, D, C, E, G, I, H
 *   !{@link []}(Sorted_binary_tree_preorder.svg)
 * - Post order: A, C, E, D, B, H, I, G, F
 *   !{@link []}(Sorted_binary_tree_postorder.svg)
 * - Level order: F, B, G, A, D, I, C, E, H
 *   !{@link []}(Sorted_binary_tree_breadth-first_traversal.svg)
 */
public enum TraverseType {

    /**
     * vists a node&<code>#39</code> s left child first, then the node itself,
     *              then its right child. This is the one to use if you
     *              want the output sorted according to the compare
     *              function.
     */
    IN_ORDER,
    
    /**
     * visits a node, then its children.
     */
    PRE_ORDER,
    
    /**
     * visits the node&<code>#39</code> s children, then the node itself.
     */
    POST_ORDER,
    
    /**
     * is not implemented for
     *              {@link [balanced binary trees]}{@link [glib-Balanced-Binary-Trees]}.
     *              For {@link [n-ary trees]}{@link [glib-N-ary-Trees]}, it
     *              vists the root node first, then its children, then
     *              its grandchildren, and so on. Note that this is less
     *              efficient than the other orders.
     */
    LEVEL_ORDER;
    
    public static TraverseType fromValue(int value) {
        return switch(value) {
            case 0 -> IN_ORDER;
            case 1 -> PRE_ORDER;
            case 2 -> POST_ORDER;
            case 3 -> LEVEL_ORDER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case IN_ORDER -> 0;
            case PRE_ORDER -> 1;
            case POST_ORDER -> 2;
            case LEVEL_ORDER -> 3;
        };
    }

}
