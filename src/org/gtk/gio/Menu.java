package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GMenu is a simple implementation of #GMenuModel.
 * You populate a #GMenu by adding #GMenuItem instances to it.
 * 
 * There are some convenience functions to allow you to directly
 * add items (avoiding #GMenuItem) for the common cases. To add
 * a regular item, use g_menu_insert(). To add a section, use
 * g_menu_insert_section(). To add a submenu, use
 * g_menu_insert_submenu().
 */
public class Menu extends MenuModel {

    public Menu(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Menu */
    public static Menu castFrom(org.gtk.gobject.Object gobject) {
        return new Menu(gobject.getProxy());
    }
    
    /**
     * Creates a new #GMenu.
     * 
     * The new menu has no items.
     */
    public Menu() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_new(), true));
    }
    
    /**
     * Convenience function for appending a normal menu item to the end of
     * @menu.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * flexible alternative.
     */
    public void append(java.lang.String label, java.lang.String detailedAction) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_append(HANDLE(), Interop.allocateNativeString(label).HANDLE(), Interop.allocateNativeString(detailedAction).HANDLE());
    }
    
    /**
     * Appends @item to the end of @menu.
     * 
     * See g_menu_insert_item() for more information.
     */
    public void appendItem(MenuItem item) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_append_item(HANDLE(), item.HANDLE());
    }
    
    /**
     * Convenience function for appending a section menu item to the end of
     * @menu.  Combine g_menu_item_new_section() and g_menu_insert_item() for a
     * more flexible alternative.
     */
    public void appendSection(java.lang.String label, MenuModel section) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_append_section(HANDLE(), Interop.allocateNativeString(label).HANDLE(), section.HANDLE());
    }
    
    /**
     * Convenience function for appending a submenu menu item to the end of
     * @menu.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for a
     * more flexible alternative.
     */
    public void appendSubmenu(java.lang.String label, MenuModel submenu) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_append_submenu(HANDLE(), Interop.allocateNativeString(label).HANDLE(), submenu.HANDLE());
    }
    
    /**
     * Marks @menu as frozen.
     * 
     * After the menu is frozen, it is an error to attempt to make any
     * changes to it.  In effect this means that the #GMenu API must no
     * longer be used.
     * 
     * This function causes g_menu_model_is_mutable() to begin returning
     * %FALSE, which has some positive performance implications.
     */
    public void freeze() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_freeze(HANDLE());
    }
    
    /**
     * Convenience function for inserting a normal menu item into @menu.
     * Combine g_menu_item_new() and g_menu_insert_item() for a more flexible
     * alternative.
     */
    public void insert(int position, java.lang.String label, java.lang.String detailedAction) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_insert(HANDLE(), position, Interop.allocateNativeString(label).HANDLE(), Interop.allocateNativeString(detailedAction).HANDLE());
    }
    
    /**
     * Inserts @item into @menu.
     * 
     * The "insertion" is actually done by copying all of the attribute and
     * link values of @item and using them to form a new item within @menu.
     * As such, @item itself is not really inserted, but rather, a menu item
     * that is exactly the same as the one presently described by @item.
     * 
     * This means that @item is essentially useless after the insertion
     * occurs.  Any changes you make to it are ignored unless it is inserted
     * again (at which point its updated values will be copied).
     * 
     * You should probably just free @item once you're done.
     * 
     * There are many convenience functions to take care of common cases.
     * See g_menu_insert(), g_menu_insert_section() and
     * g_menu_insert_submenu() as well as "prepend" and "append" variants of
     * each of these functions.
     */
    public void insertItem(int position, MenuItem item) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_insert_item(HANDLE(), position, item.HANDLE());
    }
    
    /**
     * Convenience function for inserting a section menu item into @menu.
     * Combine g_menu_item_new_section() and g_menu_insert_item() for a more
     * flexible alternative.
     */
    public void insertSection(int position, java.lang.String label, MenuModel section) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_insert_section(HANDLE(), position, Interop.allocateNativeString(label).HANDLE(), section.HANDLE());
    }
    
    /**
     * Convenience function for inserting a submenu menu item into @menu.
     * Combine g_menu_item_new_submenu() and g_menu_insert_item() for a more
     * flexible alternative.
     */
    public void insertSubmenu(int position, java.lang.String label, MenuModel submenu) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_insert_submenu(HANDLE(), position, Interop.allocateNativeString(label).HANDLE(), submenu.HANDLE());
    }
    
    /**
     * Convenience function for prepending a normal menu item to the start
     * of @menu.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * flexible alternative.
     */
    public void prepend(java.lang.String label, java.lang.String detailedAction) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_prepend(HANDLE(), Interop.allocateNativeString(label).HANDLE(), Interop.allocateNativeString(detailedAction).HANDLE());
    }
    
    /**
     * Prepends @item to the start of @menu.
     * 
     * See g_menu_insert_item() for more information.
     */
    public void prependItem(MenuItem item) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_prepend_item(HANDLE(), item.HANDLE());
    }
    
    /**
     * Convenience function for prepending a section menu item to the start
     * of @menu.  Combine g_menu_item_new_section() and g_menu_insert_item() for
     * a more flexible alternative.
     */
    public void prependSection(java.lang.String label, MenuModel section) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_prepend_section(HANDLE(), Interop.allocateNativeString(label).HANDLE(), section.HANDLE());
    }
    
    /**
     * Convenience function for prepending a submenu menu item to the start
     * of @menu.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for
     * a more flexible alternative.
     */
    public void prependSubmenu(java.lang.String label, MenuModel submenu) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_prepend_submenu(HANDLE(), Interop.allocateNativeString(label).HANDLE(), submenu.HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_remove(HANDLE(), position);
    }
    
    /**
     * Removes all items in the menu.
     */
    public void removeAll() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_menu_remove_all(HANDLE());
    }
    
}
