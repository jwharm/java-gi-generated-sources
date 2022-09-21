package org.gtk.glib;

/**
 * Specifies which nodes are visited during several of the tree
 * functions, including g_node_traverse() and g_node_find().
 */
public class TraverseFlags {

    /**
     * only leaf nodes should be visited. This name has
     *                     been introduced in 2.6, for older version use
     *                     {@link TraverseFlags#LEAFS}.
     */
    public static final int LEAVES = 1;
    
    /**
     * only non-leaf nodes should be visited. This
     *                         name has been introduced in 2.6, for older
     *                         version use {@link TraverseFlags#NON_LEAFS}.
     */
    public static final int NON_LEAVES = 2;
    
    /**
     * all nodes should be visited.
     */
    public static final int ALL = 3;
    
    /**
     * a mask of all traverse flags.
     */
    public static final int MASK = 3;
    
    /**
     * identical to {@link TraverseFlags#LEAVES}.
     */
    public static final int LEAFS = 1;
    
    /**
     * identical to {@link TraverseFlags#NON_LEAVES}.
     */
    public static final int NON_LEAFS = 2;
    
}
