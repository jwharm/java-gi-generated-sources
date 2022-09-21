package org.gtk.gtk;

/**
 * The sizing method the column uses to determine its width.  Please note
 * that {@link TreeViewColumnSizing#AUTOSIZE} are inefficient for large views, and
 * can make columns appear choppy.
 */
public enum TreeViewColumnSizing {

    /**
     * Columns only get bigger in reaction to changes in the model
     */
    GROW_ONLY,
    
    /**
     * Columns resize to be the optimal size every time the model changes.
     */
    AUTOSIZE,
    
    /**
     * Columns are a fixed numbers of pixels wide.
     */
    FIXED;
    
    public static TreeViewColumnSizing fromValue(int value) {
        return switch(value) {
            case 0 -> GROW_ONLY;
            case 1 -> AUTOSIZE;
            case 2 -> FIXED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case GROW_ONLY -> 0;
            case AUTOSIZE -> 1;
            case FIXED -> 2;
        };
    }

}
