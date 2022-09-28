package org.gtk.gtk;

/**
 * These flags indicate various properties of a {@code GtkTreeModel}.
 * <p>
 * They are returned by {@link TreeModel#getFlags}, and must be
 * static for the lifetime of the object. A more complete description
 * of {@link TreeModelFlags#ITERS_PERSIST} can be found in the overview of
 * this section.
 */
public class TreeModelFlags {

    /**
     * iterators survive all signals
     *   emitted by the tree
     */
    public static final TreeModelFlags ITERS_PERSIST = new TreeModelFlags(1);
    
    /**
     * the model is a list only, and never
     *   has children
     */
    public static final TreeModelFlags LIST_ONLY = new TreeModelFlags(2);
    
    private int value;
    
    public TreeModelFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TreeModelFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public TreeModelFlags combined(TreeModelFlags mask) {
        return new TreeModelFlags(this.getValue() | mask.getValue());
    }
    
    public static TreeModelFlags combined(TreeModelFlags mask, TreeModelFlags... masks) {
        int value = mask.getValue();
        for (TreeModelFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TreeModelFlags(value);
    }
    
}
