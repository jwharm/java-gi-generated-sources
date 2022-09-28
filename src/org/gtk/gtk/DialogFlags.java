package org.gtk.gtk;

/**
 * Flags used to influence dialog construction.
 */
public class DialogFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * Make the constructed dialog modal
     */
    public static final DialogFlags MODAL = new DialogFlags(1);
    
    /**
     * Destroy the dialog when its parent is destroyed
     */
    public static final DialogFlags DESTROY_WITH_PARENT = new DialogFlags(2);
    
    /**
     * Create dialog with actions in header
     *   bar instead of action area
     */
    public static final DialogFlags USE_HEADER_BAR = new DialogFlags(4);
    
    public DialogFlags(int value) {
        super(value);
    }
    
}
