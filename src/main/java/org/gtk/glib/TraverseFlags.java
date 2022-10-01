package org.gtk.glib;

/**
 * Specifies which nodes are visited during several of the tree
 * functions, including g_node_traverse() and g_node_find().
 */
public class TraverseFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * only leaf nodes should be visited. This name has
     *                     been introduced in 2.6, for older version use
     *                     {@link TraverseFlags#LEAFS}.
     */
    public static final TraverseFlags LEAVES = new TraverseFlags(1);
    
    /**
     * only non-leaf nodes should be visited. This
     *                         name has been introduced in 2.6, for older
     *                         version use {@link TraverseFlags#NON_LEAFS}.
     */
    public static final TraverseFlags NON_LEAVES = new TraverseFlags(2);
    
    /**
     * all nodes should be visited.
     */
    public static final TraverseFlags ALL = new TraverseFlags(3);
    
    /**
     * a mask of all traverse flags.
     */
    public static final TraverseFlags MASK = new TraverseFlags(3);
    
    /**
     * identical to {@link TraverseFlags#LEAVES}.
     */
    public static final TraverseFlags LEAFS = new TraverseFlags(1);
    
    /**
     * identical to {@link TraverseFlags#NON_LEAVES}.
     */
    public static final TraverseFlags NON_LEAFS = new TraverseFlags(2);
    
    public TraverseFlags(int value) {
        super(value);
    }
    
}
