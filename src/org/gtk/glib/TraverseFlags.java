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
    
    private int value;
    
    public TraverseFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TraverseFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public TraverseFlags combined(TraverseFlags mask) {
        return new TraverseFlags(this.getValue() | mask.getValue());
    }
    
    public static TraverseFlags combined(TraverseFlags mask, TraverseFlags... masks) {
        int value = mask.getValue();
        for (TraverseFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TraverseFlags(value);
    }
    
}
