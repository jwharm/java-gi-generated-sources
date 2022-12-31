package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Menu} is a simple implementation of {@link MenuModel}.
 * You populate a {@link Menu} by adding {@link MenuItem} instances to it.
 * <p>
 * There are some convenience functions to allow you to directly
 * add items (avoiding {@link MenuItem}) for the common cases. To add
 * a regular item, use g_menu_insert(). To add a section, use
 * g_menu_insert_section(). To add a submenu, use
 * g_menu_insert_submenu().
 * @version 2.32
 */
public class Menu extends org.gtk.gio.MenuModel {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMenu";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Menu proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Menu(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Menu> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Menu(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_menu_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Menu}.
     * <p>
     * The new menu has no items.
     */
    public Menu() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Convenience function for appending a normal menu item to the end of
     * {@code menu}.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * flexible alternative.
     * @param label the section label, or {@code null}
     * @param detailedAction the detailed action string, or {@code null}
     */
    public void append(@Nullable java.lang.String label, @Nullable java.lang.String detailedAction) {
        try {
            DowncallHandles.g_menu_append.invokeExact(
                    handle(),
                    (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)),
                    (Addressable) (detailedAction == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(detailedAction, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends {@code item} to the end of {@code menu}.
     * <p>
     * See g_menu_insert_item() for more information.
     * @param item a {@link MenuItem} to append
     */
    public void appendItem(org.gtk.gio.MenuItem item) {
        try {
            DowncallHandles.g_menu_append_item.invokeExact(
                    handle(),
                    item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience function for appending a section menu item to the end of
     * {@code menu}.  Combine g_menu_item_new_section() and g_menu_insert_item() for a
     * more flexible alternative.
     * @param label the section label, or {@code null}
     * @param section a {@link MenuModel} with the items of the section
     */
    public void appendSection(@Nullable java.lang.String label, org.gtk.gio.MenuModel section) {
        try {
            DowncallHandles.g_menu_append_section.invokeExact(
                    handle(),
                    (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)),
                    section.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience function for appending a submenu menu item to the end of
     * {@code menu}.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for a
     * more flexible alternative.
     * @param label the section label, or {@code null}
     * @param submenu a {@link MenuModel} with the items of the submenu
     */
    public void appendSubmenu(@Nullable java.lang.String label, org.gtk.gio.MenuModel submenu) {
        try {
            DowncallHandles.g_menu_append_submenu.invokeExact(
                    handle(),
                    (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)),
                    submenu.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Marks {@code menu} as frozen.
     * <p>
     * After the menu is frozen, it is an error to attempt to make any
     * changes to it.  In effect this means that the {@link Menu} API must no
     * longer be used.
     * <p>
     * This function causes g_menu_model_is_mutable() to begin returning
     * {@code false}, which has some positive performance implications.
     */
    public void freeze() {
        try {
            DowncallHandles.g_menu_freeze.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience function for inserting a normal menu item into {@code menu}.
     * Combine g_menu_item_new() and g_menu_insert_item() for a more flexible
     * alternative.
     * @param position the position at which to insert the item
     * @param label the section label, or {@code null}
     * @param detailedAction the detailed action string, or {@code null}
     */
    public void insert(int position, @Nullable java.lang.String label, @Nullable java.lang.String detailedAction) {
        try {
            DowncallHandles.g_menu_insert.invokeExact(
                    handle(),
                    position,
                    (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)),
                    (Addressable) (detailedAction == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(detailedAction, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code item} into {@code menu}.
     * <p>
     * The "insertion" is actually done by copying all of the attribute and
     * link values of {@code item} and using them to form a new item within {@code menu}.
     * As such, {@code item} itself is not really inserted, but rather, a menu item
     * that is exactly the same as the one presently described by {@code item}.
     * <p>
     * This means that {@code item} is essentially useless after the insertion
     * occurs.  Any changes you make to it are ignored unless it is inserted
     * again (at which point its updated values will be copied).
     * <p>
     * You should probably just free {@code item} once you're done.
     * <p>
     * There are many convenience functions to take care of common cases.
     * See g_menu_insert(), g_menu_insert_section() and
     * g_menu_insert_submenu() as well as "prepend" and "append" variants of
     * each of these functions.
     * @param position the position at which to insert the item
     * @param item the {@link MenuItem} to insert
     */
    public void insertItem(int position, org.gtk.gio.MenuItem item) {
        try {
            DowncallHandles.g_menu_insert_item.invokeExact(
                    handle(),
                    position,
                    item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience function for inserting a section menu item into {@code menu}.
     * Combine g_menu_item_new_section() and g_menu_insert_item() for a more
     * flexible alternative.
     * @param position the position at which to insert the item
     * @param label the section label, or {@code null}
     * @param section a {@link MenuModel} with the items of the section
     */
    public void insertSection(int position, @Nullable java.lang.String label, org.gtk.gio.MenuModel section) {
        try {
            DowncallHandles.g_menu_insert_section.invokeExact(
                    handle(),
                    position,
                    (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)),
                    section.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience function for inserting a submenu menu item into {@code menu}.
     * Combine g_menu_item_new_submenu() and g_menu_insert_item() for a more
     * flexible alternative.
     * @param position the position at which to insert the item
     * @param label the section label, or {@code null}
     * @param submenu a {@link MenuModel} with the items of the submenu
     */
    public void insertSubmenu(int position, @Nullable java.lang.String label, org.gtk.gio.MenuModel submenu) {
        try {
            DowncallHandles.g_menu_insert_submenu.invokeExact(
                    handle(),
                    position,
                    (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)),
                    submenu.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience function for prepending a normal menu item to the start
     * of {@code menu}.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * flexible alternative.
     * @param label the section label, or {@code null}
     * @param detailedAction the detailed action string, or {@code null}
     */
    public void prepend(@Nullable java.lang.String label, @Nullable java.lang.String detailedAction) {
        try {
            DowncallHandles.g_menu_prepend.invokeExact(
                    handle(),
                    (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)),
                    (Addressable) (detailedAction == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(detailedAction, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepends {@code item} to the start of {@code menu}.
     * <p>
     * See g_menu_insert_item() for more information.
     * @param item a {@link MenuItem} to prepend
     */
    public void prependItem(org.gtk.gio.MenuItem item) {
        try {
            DowncallHandles.g_menu_prepend_item.invokeExact(
                    handle(),
                    item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience function for prepending a section menu item to the start
     * of {@code menu}.  Combine g_menu_item_new_section() and g_menu_insert_item() for
     * a more flexible alternative.
     * @param label the section label, or {@code null}
     * @param section a {@link MenuModel} with the items of the section
     */
    public void prependSection(@Nullable java.lang.String label, org.gtk.gio.MenuModel section) {
        try {
            DowncallHandles.g_menu_prepend_section.invokeExact(
                    handle(),
                    (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)),
                    section.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Convenience function for prepending a submenu menu item to the start
     * of {@code menu}.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for
     * a more flexible alternative.
     * @param label the section label, or {@code null}
     * @param submenu a {@link MenuModel} with the items of the submenu
     */
    public void prependSubmenu(@Nullable java.lang.String label, org.gtk.gio.MenuModel submenu) {
        try {
            DowncallHandles.g_menu_prepend_submenu.invokeExact(
                    handle(),
                    (Addressable) (label == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(label, null)),
                    submenu.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes an item from the menu.
     * <p>
     * {@code position} gives the index of the item to remove.
     * <p>
     * It is an error if position is not in range the range from 0 to one
     * less than the number of items in the menu.
     * <p>
     * It is not possible to remove items by identity since items are added
     * to the menu simply by copying their links and attributes (ie:
     * identity of the item itself is not preserved).
     * @param position the position of the item to remove
     */
    public void remove(int position) {
        try {
            DowncallHandles.g_menu_remove.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes all items in the menu.
     */
    public void removeAll() {
        try {
            DowncallHandles.g_menu_remove_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_menu_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Menu.Builder} object constructs a {@link Menu} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Menu.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gio.MenuModel.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Menu} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Menu}.
         * @return A new instance of {@code Menu} with the properties 
         *         that were set in the Builder object.
         */
        public Menu build() {
            return (Menu) org.gtk.gobject.GObject.newWithProperties(
                Menu.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_menu_new = Interop.downcallHandle(
            "g_menu_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_append = Interop.downcallHandle(
            "g_menu_append",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_append_item = Interop.downcallHandle(
            "g_menu_append_item",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_append_section = Interop.downcallHandle(
            "g_menu_append_section",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_append_submenu = Interop.downcallHandle(
            "g_menu_append_submenu",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_freeze = Interop.downcallHandle(
            "g_menu_freeze",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_insert = Interop.downcallHandle(
            "g_menu_insert",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_insert_item = Interop.downcallHandle(
            "g_menu_insert_item",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_insert_section = Interop.downcallHandle(
            "g_menu_insert_section",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_insert_submenu = Interop.downcallHandle(
            "g_menu_insert_submenu",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_prepend = Interop.downcallHandle(
            "g_menu_prepend",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_prepend_item = Interop.downcallHandle(
            "g_menu_prepend_item",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_prepend_section = Interop.downcallHandle(
            "g_menu_prepend_section",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_prepend_submenu = Interop.downcallHandle(
            "g_menu_prepend_submenu",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_remove = Interop.downcallHandle(
            "g_menu_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_menu_remove_all = Interop.downcallHandle(
            "g_menu_remove_all",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_menu_get_type = Interop.downcallHandle(
            "g_menu_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
