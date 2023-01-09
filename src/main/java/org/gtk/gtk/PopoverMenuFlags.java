package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that affect how popover menus are created from
 * a menu model.
 */
public class PopoverMenuFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkPopoverMenuFlags";
    
    /**
     * Create submenus as nested
     *    popovers. Without this flag, submenus are created as
     *    sliding pages that replace the main menu.
     */
    public static final PopoverMenuFlags NESTED = new PopoverMenuFlags(1);
    
    /**
     * Create a new PopoverMenuFlags with the provided value
     */
    public PopoverMenuFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public PopoverMenuFlags or(PopoverMenuFlags... masks) {
        int value = this.getValue();
        for (PopoverMenuFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PopoverMenuFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static PopoverMenuFlags combined(PopoverMenuFlags mask, PopoverMenuFlags... masks) {
        int value = mask.getValue();
        for (PopoverMenuFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PopoverMenuFlags(value);
    }
}
