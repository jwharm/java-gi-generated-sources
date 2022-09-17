package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkPopoverMenuBar</code> presents a horizontal bar of items that pop
 * up popover menus when clicked.
 * <p>
 * !{@link [An example GtkPopoverMenuBar]}(menubar.png)
 * <p>
 * The only way to create instances of <code>GtkPopoverMenuBar</code> is
 * from a <code>GMenuModel</code>.
 * <p>
 * <h1>SS nodes</h1>
 * <p><pre>
 * menubar
 * &#9500;&#9472;&#9472; item{@link [.active]}
 * &#9482;   &#9584;&#9472;&#9472; popover
 * &#9584;&#9472;&#9472; item
 *     &#9584;&#9472;&#9472; popover
 * </pre>
 * <p><code>GtkPopoverMenuBar</code> has a single CSS node with name menubar, below which
 * each item has its CSS node, and below that the corresponding popover.
 * <p>
 * The item whose popover is currently open gets the .active
 * style class.
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkPopoverMenuBar</code> uses the {@link org.gtk.gtk.AccessibleRole#MENU_BAR} role,
 * the menu items use the {@link org.gtk.gtk.AccessibleRole#MENU_ITEM} role and
 * the menus use the {@link org.gtk.gtk.AccessibleRole#MENU} role.
 */
public class PopoverMenuBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public PopoverMenuBar(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PopoverMenuBar */
    public static PopoverMenuBar castFrom(org.gtk.gobject.Object gobject) {
        return new PopoverMenuBar(gobject.getReference());
    }
    
    private static Reference constructNewFromModel(org.gtk.gio.MenuModel model) {
        Reference RESULT = References.get(gtk_h.gtk_popover_menu_bar_new_from_model(model.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a <code>GtkPopoverMenuBar</code> from a <code>GMenuModel</code>.
     */
    public static PopoverMenuBar newFromModel(org.gtk.gio.MenuModel model) {
        return new PopoverMenuBar(constructNewFromModel(model));
    }
    
    /**
     * Adds a custom widget to a generated menubar.
     * <p>
     * For this to work, the menu model of @bar must have an
     * item with a <code>custom</code> attribute that matches @id.
     */
    public boolean addChild(Widget child, java.lang.String id) {
        var RESULT = gtk_h.gtk_popover_menu_bar_add_child(handle(), child.handle(), Interop.allocateNativeString(id).handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the model from which the contents of @bar are taken.
     */
    public org.gtk.gio.MenuModel getMenuModel() {
        var RESULT = gtk_h.gtk_popover_menu_bar_get_menu_model(handle());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Removes a widget that has previously been added with
     * gtk_popover_menu_bar_add_child().
     */
    public boolean removeChild(Widget child) {
        var RESULT = gtk_h.gtk_popover_menu_bar_remove_child(handle(), child.handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets a menu model from which @bar should take
     * its contents.
     */
    public void setMenuModel(org.gtk.gio.MenuModel model) {
        gtk_h.gtk_popover_menu_bar_set_menu_model(handle(), model.handle());
    }
    
}
