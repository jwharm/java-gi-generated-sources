package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkListItem</code> is used by list widgets to represent items in a <code>GListModel</code>.
 * <p>
 * The <code>GtkListItem</code>s are managed by the list widget (with its factory)
 * and cannot be created by applications, but they need to be populated
 * by application code. This is done by calling {@link org.gtk.gtk.ListItem#setChild}.
 * <p><code>GtkListItem</code>s exist in 2 stages:
 * 
 * 1. The unbound stage where the listitem is not currently connected to
 *    an item in the list. In that case, the {@link [property@Gtk.ListItem:item] (ref=property)}
 *    property is set to <code>NULL.
 * 
 * 2.</code> The bound stage where the listitem references an item from the list.
 *    The {@link [property@Gtk.ListItem:item] (ref=property)} property is not The bound stage where the listitem references an item from the list.
 *    The {@link [property@Gtk.ListItem:item] (ref=property)} property is not %NULL.
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
        return (RESULT != 0);
    }
    
    /**
     * Gets the child previously set via gtk_list_item_set_child() or
     * <code>null</code> if none was set.
     */
    public Widget getChild() {
        var RESULT = gtk_h.gtk_list_item_get_child(handle());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the model item that associated with @self.
     * 
     * If @self is unbound, this function returns 
     *             
     *           
     *         
     *       
     *       
     *         
     *         Gets the model item that associated with @self.
     * 
     * If @self is unbound, this function returns %NULL.
     */
    public org.gtk.gobject.Object getItem() {
        var RESULT = gtk_h.gtk_list_item_get_item(handle());
        return new org.gtk.gobject.Object(References.get(RESULT, false));
    }
    
    /**
     * Gets the position in the model that @self currently displays.
     * 
     * If @self is unbound, <code>GTK_INVALID_LIST_POSITION</code> is returned.
     */
    public int getPosition() {
        var RESULT = gtk_h.gtk_list_item_get_position(handle());
        return RESULT;
    }
    
    /**
     * Checks if a list item has been set to be selectable via
     * gtk_list_item_set_selectable().
     * 
     * Do not confuse this function with {@link org.gtk.gtk.ListItem#getSelected}.
     */
    public boolean getSelectable() {
        var RESULT = gtk_h.gtk_list_item_get_selectable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks if the item is displayed as selected.
     * 
     * The selected state is maintained by the liste widget and its model
     * and cannot be set otherwise.
     */
    public boolean getSelected() {
        var RESULT = gtk_h.gtk_list_item_get_selected(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets @self to be activatable.
     * <p>
     * If an item is activatable, double-clicking on the item, using
     * the Return key or calling gtk_widget_activate() will activate
     * the item. Activating instructs the containing view to handle
     * activation. <code>GtkListView</code> for example will be emitting the
     * {@link [signal@Gtk.ListView::activate] (ref=signal)} signal.
     * 
     * By default, list items are activatable.
     */
    public void setActivatable(boolean activatable) {
        gtk_h.gtk_list_item_set_activatable(handle(), activatable ? 1 : 0);
    }
    
    /**
     * Sets the child to be used for this listitem.
     * 
     * This function is typically called by applications when
     * setting up a listitem so that the widget can be reused when
     * binding it multiple times.
     */
    public void setChild(Widget child) {
        gtk_h.gtk_list_item_set_child(handle(), child.handle());
    }
    
    /**
     * Sets @self to be selectable.
     * 
     * If an item is selectable, clicking on the item or using the keyboard
     * will try to select or unselect the item. If this succeeds is up to
     * the model to determine, as it is managing the selected state.
     * 
     * Note that this means that making an item non-selectable has no
     * influence on the selected state at all. A non-selectable item
     * may still be selected.
     * 
     * By default, list items are selectable. When rebinding them to
     * a new item, they will also be reset to be selectable by GTK.
     */
    public void setSelectable(boolean selectable) {
        gtk_h.gtk_list_item_set_selectable(handle(), selectable ? 1 : 0);
    }
    
}
