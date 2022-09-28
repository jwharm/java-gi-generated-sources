package org.gtk.gtk;

/**
 * Used to indicate which grid lines to draw in a tree view.
 */
public class TreeViewGridLines {

    /**
     * No grid lines.
     */
    public static final TreeViewGridLines NONE = new TreeViewGridLines(0);
    
    /**
     * Horizontal grid lines.
     */
    public static final TreeViewGridLines HORIZONTAL = new TreeViewGridLines(1);
    
    /**
     * Vertical grid lines.
     */
    public static final TreeViewGridLines VERTICAL = new TreeViewGridLines(2);
    
    /**
     * Horizontal and vertical grid lines.
     */
    public static final TreeViewGridLines BOTH = new TreeViewGridLines(3);
    
    private int value;
    
    public TreeViewGridLines(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TreeViewGridLines[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
