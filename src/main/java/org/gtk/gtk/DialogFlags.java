package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used to influence dialog construction.
 */
public class DialogFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkDialogFlags";
    
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
    
    /**
     * Create a new DialogFlags with the provided value
     */
    public DialogFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DialogFlags or(DialogFlags... masks) {
        int value = this.getValue();
        for (DialogFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DialogFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DialogFlags combined(DialogFlags mask, DialogFlags... masks) {
        int value = mask.getValue();
        for (DialogFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DialogFlags(value);
    }
}
