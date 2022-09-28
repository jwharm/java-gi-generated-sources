package org.gtk.gtk;

/**
 * An enum for determining where a dropped row goes.
 */
public class TreeViewDropPosition {

    /**
     * dropped row is inserted before
     */
    public static final TreeViewDropPosition BEFORE = new TreeViewDropPosition(0);
    
    /**
     * dropped row is inserted after
     */
    public static final TreeViewDropPosition AFTER = new TreeViewDropPosition(1);
    
    /**
     * dropped row becomes a child or is inserted before
     */
    public static final TreeViewDropPosition INTO_OR_BEFORE = new TreeViewDropPosition(2);
    
    /**
     * dropped row becomes a child or is inserted after
     */
    public static final TreeViewDropPosition INTO_OR_AFTER = new TreeViewDropPosition(3);
    
    private int value;
    
    public TreeViewDropPosition(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TreeViewDropPosition[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
