package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of traversal performed by g_tree_traverse(),
 * g_node_traverse() and g_node_find(). The different orders are
 * illustrated here:
 * <ul>
 * <li>In order: A, B, C, D, E, F, G, H, I
 *   <img src="./doc-files/Sorted_binary_tree_inorder.svg" alt="">
 * <li>Pre order: F, B, A, D, C, E, G, I, H
 *   <img src="./doc-files/Sorted_binary_tree_preorder.svg" alt="">
 * <li>Post order: A, C, E, D, B, H, I, G, F
 *   <img src="./doc-files/Sorted_binary_tree_postorder.svg" alt="">
 * <li>Level order: F, B, G, A, D, I, C, E, H
 *   <img src="./doc-files/Sorted_binary_tree_breadth-first_traversal.svg" alt="">
 * </ul>
 */
public class TraverseType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GTraverseType";
    
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
