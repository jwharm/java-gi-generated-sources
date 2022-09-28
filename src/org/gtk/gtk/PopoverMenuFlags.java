package org.gtk.gtk;

/**
 * Flags that affect how popover menus are created from
 * a menu model.
 */
public class PopoverMenuFlags extends io.github.jwharm.javagi.Bitfield {

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
