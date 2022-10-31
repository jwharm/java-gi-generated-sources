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
    
    public PopoverMenuFlags(int value) {
        super(value);
    }
}
