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
public enum TraverseType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * vists a node's left child first, then the node itself,
     *              then its right child. This is the one to use if you
     *              want the output sorted according to the compare
     *              function.
     */
    IN_ORDER(0),
    
    /**
     * visits a node, then its children.
     */
    PRE_ORDER(1),
    
    /**
     * visits the node's children, then the node itself.
     */
    POST_ORDER(2),
    
    /**
     * is not implemented for
     *              [balanced binary trees][glib-Balanced-Binary-Trees].
     *              For [n-ary trees][glib-N-ary-Trees], it
     *              vists the root node first, then its children, then
     *              its grandchildren, and so on. Note that this is less
     *              efficient than the other orders.
     */
    LEVEL_ORDER(3);
    
    private static final java.lang.String C_TYPE_NAME = "GTraverseType";
    
    private final int value;
    
    /**
     * Create a new TraverseType for the provided value
     * @param numeric value the enum value
     */
    TraverseType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new TraverseType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TraverseType of(int value) {
        return switch (value) {
            case 0 -> IN_ORDER;
            case 1 -> PRE_ORDER;
            case 2 -> POST_ORDER;
            case 3 -> LEVEL_ORDER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
