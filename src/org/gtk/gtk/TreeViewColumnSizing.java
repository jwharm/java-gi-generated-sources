package org.gtk.gtk;

/**
 * The sizing method the column uses to determine its width.  Please note
 * that {@link TreeViewColumnSizing#AUTOSIZE} are inefficient for large views, and
 * can make columns appear choppy.
 */
public class TreeViewColumnSizing {

    /**
     * Columns only get bigger in reaction to changes in the model
     */
    public static final TreeViewColumnSizing GROW_ONLY = new TreeViewColumnSizing(0);
    
    /**
     * Columns resize to be the optimal size every time the model changes.
     */
    public static final TreeViewColumnSizing AUTOSIZE = new TreeViewColumnSizing(1);
    
    /**
     * Columns are a fixed numbers of pixels wide.
     */
    public static final TreeViewColumnSizing FIXED = new TreeViewColumnSizing(2);
    
    private int value;
    
    public TreeViewColumnSizing(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TreeViewColumnSizing[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
