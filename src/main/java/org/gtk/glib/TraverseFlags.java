package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies which nodes are visited during several of the tree
 * functions, including g_node_traverse() and g_node_find().
 */
public class TraverseFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GTraverseFlags";
    
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
    
    /**
     * Create a new TraverseFlags with the provided value
     */
    public TraverseFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TraverseFlags or(TraverseFlags... masks) {
        int value = this.getValue();
        for (TraverseFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TraverseFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TraverseFlags combined(TraverseFlags mask, TraverseFlags... masks) {
        int value = mask.getValue();
        for (TraverseFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TraverseFlags(value);
    }
}
