package org.gtk.gtk;

/**
 * The sizing method the column uses to determine its width.  Please note
 * that {@link TreeViewColumnSizing#AUTOSIZE} are inefficient for large views, and
 * can make columns appear choppy.
 */
public class TreeViewColumnSizing extends io.github.jwharm.javagi.Enumeration {

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
    
    public TreeViewColumnSizing(int value) {
        super(value);
    }
    
}
