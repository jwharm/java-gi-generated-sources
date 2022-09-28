package org.gtk.gtk;

/**
 * Used to indicate which grid lines to draw in a tree view.
 */
public class TreeViewGridLines extends io.github.jwharm.javagi.Enumeration {

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
    
    public TreeViewGridLines(int value) {
        super(value);
    }
    
}
