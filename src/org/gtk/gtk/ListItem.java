package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkListItem} is used by list widgets to represent items in a {@code GListModel}.
 * <p>
 * The {@code GtkListItem}s are managed by the list widget (with its factory)
 * and cannot be created by applications, but they need to be populated
 * by application code. This is done by calling {@link ListItem#setChild}.
 * <p>
 * {@code GtkListItem}s exist in 2 stages:
 * <p>
 * 1. The unbound stage where the listitem is not currently connected to
 *    an item in the list. In that case, the {@code Gtk.ListItem:item}
 *    property is set to {@code null}.
 * <p>
 * 2. The bound stage where the listitem references an item from the list.
 *    The {@code Gtk.ListItem:item} property is not {@code null}.
 */
public class ListItem extends org.gtk.gobject.Object {

    public ListItem(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ListItem */
    public static ListItem castFrom(org.gtk.gobject.Object gobject) {
        return new ListItem(gobject.getReference());
    }
    
    /**
     * Checks if a list item has been set to be activatable via
     * gtk_list_item_set_activatable().
     */
    public boolean getActivatable() {
        var RESULT = gtk_h.gtk_list_item_get_activatable(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the child previously set via gtk_list_item_set_child() or
     * {@code null} if none was set.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_list_item_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the model item that associated with {@code self}.
     * <p>
     * If {@code self} is unbound, this function returns {@code null}.
     */
    public org.gtk.gobject.Object getItem() {
        var RESULT = gtk_h.gtk_list_item_get_item(handle());
        return new org.gtk.gobject.Object(References.get(RESULT, false));
    }
    
    /**
     * Gets the position in the model that {@code self} currently displays.
     * <p>
     * If {@code self} is unbound, {@code GTK_INVALID_LIST_POSITION} is returned.
     */
    public int getPosition() {
        var RESULT = gtk_h.gtk_list_item_get_position(handle());
        return RESULT;
    }
    
    /**
     * Checks if a list item has been set to be selectable via
     * gtk_list_item_set_selectable().
     * <p>
     * Do not confuse this function with {@link ListItem#getSelected}.
     */
    public boolean getSelectable() {
        var RESULT = gtk_h.gtk_list_item_get_selectable(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks if the item is displayed as selected.
     * <p>
     * The selected state is maintained by the liste widget and its model
     * and cannot be set otherwise.
     */
    public boolean getSelected() {
        var RESULT = gtk_h.gtk_list_item_get_selected(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets {@code self} to be activatable.
     * <p>
     * If an item is activatable, double-clicking on the item, using
     * the Return key or calling gtk_widget_activate() will activate
     * the item. Activating instructs the containing view to handle
     * activation. {@code GtkListView} for example will be emitting the
     * {@code Gtk.ListView::activate} signal.
     * <p>
     * By default, list items are activatable.
     */
    public void setActivatable(boolean activatable) {
        gtk_h.gtk_list_item_set_activatable(handle(), activatable ? 1 : 0);
    }
    
    /**
     * Sets the child to be used for this listitem.
     * <p>
     * This function is typically called by applications when
     * setting up a listitem so that the widget can be reused when
     * binding it multiple times.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_list_item_set_child(handle(), child.handle());
    }
    
    /**
     * Sets {@code self} to be selectable.
     * <p>
     * If an item is selectable, clicking on the item or using the keyboard
     * will try to select or unselect the item. If this succeeds is up to
     * the model to determine, as it is managing the selected state.
     * <p>
     * Note that this means that making an item non-selectable has no
     * influence on the selected state at all. A non-selectable item
     * may still be selected.
     * <p>
     * By default, list items are selectable. When rebinding them to
     * a new item, they will also be reset to be selectable by GTK.
     */
    public void setSelectable(boolean selectable) {
        gtk_h.gtk_list_item_set_selectable(handle(), selectable ? 1 : 0);
    }
    
}
