package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkPopoverMenuBar` presents a horizontal bar of items that pop
 * up popover menus when clicked.
 * 
 * ![An example GtkPopoverMenuBar](menubar.png)
 * 
 * The only way to create instances of `GtkPopoverMenuBar` is
 * from a `GMenuModel`.
 * 
 * # CSS nodes
 * 
 * ```
 * menubar
 * ├── item[.active]
 * ┊   ╰── popover
 * ╰── item
 *     ╰── popover
 * ```
 * 
 * `GtkPopoverMenuBar` has a single CSS node with name menubar, below which
 * each item has its CSS node, and below that the corresponding popover.
 * 
 * The item whose popover is currently open gets the .active
 * style class.
 * 
 * # Accessibility
 * 
 * `GtkPopoverMenuBar` uses the %GTK_ACCESSIBLE_ROLE_MENU_BAR role,
 * the menu items use the %GTK_ACCESSIBLE_ROLE_MENU_ITEM role and
 * the menus use the %GTK_ACCESSIBLE_ROLE_MENU role.
 */
public class PopoverMenuBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public PopoverMenuBar(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PopoverMenuBar */
    public static PopoverMenuBar castFrom(org.gtk.gobject.Object gobject) {
        return new PopoverMenuBar(gobject.getReference());
    }
    
    /**
     * Creates a `GtkPopoverMenuBar` from a `GMenuModel`.
     */
    public PopoverMenuBar(org.gtk.gio.MenuModel model) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_popover_menu_bar_new_from_model(model.HANDLE()), false));
    }
    
    /**
     * Adds a custom widget to a generated menubar.
     * 
     * For this to work, the menu model of @bar must have an
     * item with a `custom` attribute that matches @id.
     */
    public boolean addChild(Widget child, java.lang.String id) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_popover_menu_bar_add_child(HANDLE(), child.HANDLE(), Interop.allocateNativeString(id).HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the model from which the contents of @bar are taken.
     */
    public org.gtk.gio.MenuModel getMenuModel() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_popover_menu_bar_get_menu_model(HANDLE());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Removes a widget that has previously been added with
     * gtk_popover_menu_bar_add_child().
     */
    public boolean removeChild(Widget child) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_popover_menu_bar_remove_child(HANDLE(), child.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Sets a menu model from which @bar should take
     * its contents.
     */
    public void setMenuModel(org.gtk.gio.MenuModel model) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_popover_menu_bar_set_menu_model(HANDLE(), model.HANDLE());
    }
    
}
