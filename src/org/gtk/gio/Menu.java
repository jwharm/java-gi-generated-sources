package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * {@link org.gtk.gio.Menu} is a simple implementation of {@link org.gtk.gio.MenuModel} 
 * You populate a {@link org.gtk.gio.Menu} by adding {@link org.gtk.gio.MenuItem} instances to it.
 * 
 * There are some convenience functions to allow you to directly
 * add items (avoiding {@link org.gtk.gio.MenuItem}  for the common cases. To add
 * a regular item, use g_menu_insert(). To add a section, use
 * g_menu_insert_section(). To add a submenu, use
 * g_menu_insert_submenu().
 */
public class Menu extends MenuModel {

    public Menu(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Menu */
    public static Menu castFrom(org.gtk.gobject.Object gobject) {
        return new Menu(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_menu_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@link org.gtk.gio.Menu} 
     * 
     * The new menu has no items.
     */
    public Menu() {
        super(constructNew());
    }
    
    /**
     * Convenience function for appending a normal menu item to the end of
     * @menu.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * flexible alternative.
     */
    public void append(java.lang.String label, java.lang.String detailedAction) {
        gtk_h.g_menu_append(handle(), Interop.allocateNativeString(label).handle(), Interop.allocateNativeString(detailedAction).handle());
    }
    
    /**
     * Appends @item to the end of @menu.
     * 
     * See g_menu_insert_item() for more information.
     */
    public void appendItem(MenuItem item) {
        gtk_h.g_menu_append_item(handle(), item.handle());
    }
    
    /**
     * Convenience function for appending a section menu item to the end of
     * @menu.  Combine g_menu_item_new_section() and g_menu_insert_item() for a
     * more flexible alternative.
     */
    public void appendSection(java.lang.String label, MenuModel section) {
        gtk_h.g_menu_append_section(handle(), Interop.allocateNativeString(label).handle(), section.handle());
    }
    
    /**
     * Convenience function for appending a submenu menu item to the end of
     * @menu.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for a
     * more flexible alternative.
     */
    public void appendSubmenu(java.lang.String label, MenuModel submenu) {
        gtk_h.g_menu_append_submenu(handle(), Interop.allocateNativeString(label).handle(), submenu.handle());
    }
    
    /**
     * Marks @menu as frozen.
     * 
     * After the menu is frozen, it is an error to attempt to make any
     * changes to it.  In effect this means that the {@link org.gtk.gio.Menu} API must no
     * longer be used.
     * 
     * This function causes g_menu_model_is_mutable() to begin returning
     * <code>false</code>  which has some positive performance implications.
     */
    public void freeze() {
        gtk_h.g_menu_freeze(handle());
    }
    
    /**
     * Convenience function for inserting a normal menu item into @menu.
     * Combine g_menu_item_new() and g_menu_insert_item() for a more flexible
     * alternative.
     */
    public void insert(int position, java.lang.String label, java.lang.String detailedAction) {
        gtk_h.g_menu_insert(handle(), position, Interop.allocateNativeString(label).handle(), Interop.allocateNativeString(detailedAction).handle());
    }
    
    /**
     * Inserts @item into @menu.
     * 
     * The &<code>#34</code> insertion&<code>#34</code>  is actually done by copying all of the attribute and
     * link values of @item and using them to form a new item within @menu.
     * As such, @item itself is not really inserted, but rather, a menu item
     * that is exactly the same as the one presently described by @item.
     * 
     * This means that @item is essentially useless after the insertion
     * occurs.  Any changes you make to it are ignored unless it is inserted
     * again (at which point its updated values will be copied).
     * 
     * You should probably just free @item once you&<code>#39</code> re done.
     * 
     * There are many convenience functions to take care of common cases.
     * See g_menu_insert(), g_menu_insert_section() and
     * g_menu_insert_submenu() as well as &<code>#34</code> prepend&<code>#34</code>  and &<code>#34</code> append&<code>#34</code>  variants of
     * each of these functions.
     */
    public void insertItem(int position, MenuItem item) {
        gtk_h.g_menu_insert_item(handle(), position, item.handle());
    }
    
    /**
     * Convenience function for inserting a section menu item into @menu.
     * Combine g_menu_item_new_section() and g_menu_insert_item() for a more
     * flexible alternative.
     */
    public void insertSection(int position, java.lang.String label, MenuModel section) {
        gtk_h.g_menu_insert_section(handle(), position, Interop.allocateNativeString(label).handle(), section.handle());
    }
    
    /**
     * Convenience function for inserting a submenu menu item into @menu.
     * Combine g_menu_item_new_submenu() and g_menu_insert_item() for a more
     * flexible alternative.
     */
    public void insertSubmenu(int position, java.lang.String label, MenuModel submenu) {
        gtk_h.g_menu_insert_submenu(handle(), position, Interop.allocateNativeString(label).handle(), submenu.handle());
    }
    
    /**
     * Convenience function for prepending a normal menu item to the start
     * of @menu.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * flexible alternative.
     */
    public void prepend(java.lang.String label, java.lang.String detailedAction) {
        gtk_h.g_menu_prepend(handle(), Interop.allocateNativeString(label).handle(), Interop.allocateNativeString(detailedAction).handle());
    }
    
    /**
     * Prepends @item to the start of @menu.
     * 
     * See g_menu_insert_item() for more information.
     */
    public void prependItem(MenuItem item) {
        gtk_h.g_menu_prepend_item(handle(), item.handle());
    }
    
    /**
     * Convenience function for prepending a section menu item to the start
     * of @menu.  Combine g_menu_item_new_section() and g_menu_insert_item() for
     * a more flexible alternative.
     */
    public void prependSection(java.lang.String label, MenuModel section) {
        gtk_h.g_menu_prepend_section(handle(), Interop.allocateNativeString(label).handle(), section.handle());
    }
    
    /**
     * Convenience function for prepending a submenu menu item to the start
     * of @menu.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for
     * a more flexible alternative.
     */
    public void prependSubmenu(java.lang.String label, MenuModel submenu) {
        gtk_h.g_menu_prepend_submenu(handle(), Interop.allocateNativeString(label).handle(), submenu.handle());
    }
    
    /**
     * Removes an item from the menu.
     * 
     * @position gives the index of the item to remove.
     * 
     * It is an error if position is not in range the range from 0 to one
     * less than the number of items in the menu.
     * 
     * It is not possible to remove items by identity since items are added
     * to the menu simply by copying their links and attributes (ie:
     * identity of the item itself is not preserved).
     */
    public void remove(int position) {
        gtk_h.g_menu_remove(handle(), position);
    }
    
    /**
     * Removes all items in the menu.
     */
    public void removeAll() {
        gtk_h.g_menu_remove_all(handle());
    }
    
}
