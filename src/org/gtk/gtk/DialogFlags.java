package org.gtk.gtk;

/**
 * Flags used to influence dialog construction.
 */
public class DialogFlags {

    /**
     * Make the constructed dialog modal
     */
    public static final int MODAL = 1;
    
    /**
     * Destroy the dialog when its parent is destroyed
     */
    public static final int DESTROY_WITH_PARENT = 2;
    
    /**
     * Create dialog with actions in header
     *   bar instead of action area
     */
    public static final int USE_HEADER_BAR = 4;
    
}
