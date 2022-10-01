package org.gtk.gtk;

/**
 * An enum for determining where a dropped row goes.
 */
public class TreeViewDropPosition extends io.github.jwharm.javagi.Enumeration {

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
    
    public TreeViewDropPosition(int value) {
        super(value);
    }
    
}
