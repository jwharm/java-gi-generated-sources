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
 */
public class Menu extends MenuModel {

    public Menu(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Menu */
    public static Menu castFrom(org.gtk.gobject.Object gobject) {
        return new Menu(gobject.refcounted());
    }
    
    private static final MethodHandle g_menu_new = Interop.downcallHandle(
        "g_menu_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_menu_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link Menu}.
     * <p>
     * The new menu has no items.
     */
    public Menu() {
        super(constructNew());
    }
    
    private static final MethodHandle g_menu_append = Interop.downcallHandle(
        "g_menu_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function for appending a normal menu item to the end of
     * {@code menu}.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * flexible alternative.
     */
    public @NotNull void append(@Nullable java.lang.String label, @Nullable java.lang.String detailedAction) {
        try {
            g_menu_append.invokeExact(handle(), Interop.allocateNativeString(label), Interop.allocateNativeString(detailedAction));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_append_item = Interop.downcallHandle(
        "g_menu_append_item",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends {@code item} to the end of {@code menu}.
     * <p>
     * See g_menu_insert_item() for more information.
     */
    public @NotNull void appendItem(@NotNull MenuItem item) {
        try {
            g_menu_append_item.invokeExact(handle(), item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_append_section = Interop.downcallHandle(
        "g_menu_append_section",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function for appending a section menu item to the end of
     * {@code menu}.  Combine g_menu_item_new_section() and g_menu_insert_item() for a
     * more flexible alternative.
     */
    public @NotNull void appendSection(@Nullable java.lang.String label, @NotNull MenuModel section) {
        try {
            g_menu_append_section.invokeExact(handle(), Interop.allocateNativeString(label), section.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_append_submenu = Interop.downcallHandle(
        "g_menu_append_submenu",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function for appending a submenu menu item to the end of
     * {@code menu}.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for a
     * more flexible alternative.
     */
    public @NotNull void appendSubmenu(@Nullable java.lang.String label, @NotNull MenuModel submenu) {
        try {
            g_menu_append_submenu.invokeExact(handle(), Interop.allocateNativeString(label), submenu.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_freeze = Interop.downcallHandle(
        "g_menu_freeze",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void freeze() {
        try {
            g_menu_freeze.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_insert = Interop.downcallHandle(
        "g_menu_insert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function for inserting a normal menu item into {@code menu}.
     * Combine g_menu_item_new() and g_menu_insert_item() for a more flexible
     * alternative.
     */
    public @NotNull void insert(@NotNull int position, @Nullable java.lang.String label, @Nullable java.lang.String detailedAction) {
        try {
            g_menu_insert.invokeExact(handle(), position, Interop.allocateNativeString(label), Interop.allocateNativeString(detailedAction));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_insert_item = Interop.downcallHandle(
        "g_menu_insert_item",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void insertItem(@NotNull int position, @NotNull MenuItem item) {
        try {
            g_menu_insert_item.invokeExact(handle(), position, item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_insert_section = Interop.downcallHandle(
        "g_menu_insert_section",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function for inserting a section menu item into {@code menu}.
     * Combine g_menu_item_new_section() and g_menu_insert_item() for a more
     * flexible alternative.
     */
    public @NotNull void insertSection(@NotNull int position, @Nullable java.lang.String label, @NotNull MenuModel section) {
        try {
            g_menu_insert_section.invokeExact(handle(), position, Interop.allocateNativeString(label), section.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_insert_submenu = Interop.downcallHandle(
        "g_menu_insert_submenu",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function for inserting a submenu menu item into {@code menu}.
     * Combine g_menu_item_new_submenu() and g_menu_insert_item() for a more
     * flexible alternative.
     */
    public @NotNull void insertSubmenu(@NotNull int position, @Nullable java.lang.String label, @NotNull MenuModel submenu) {
        try {
            g_menu_insert_submenu.invokeExact(handle(), position, Interop.allocateNativeString(label), submenu.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_prepend = Interop.downcallHandle(
        "g_menu_prepend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function for prepending a normal menu item to the start
     * of {@code menu}.  Combine g_menu_item_new() and g_menu_insert_item() for a more
     * flexible alternative.
     */
    public @NotNull void prepend(@Nullable java.lang.String label, @Nullable java.lang.String detailedAction) {
        try {
            g_menu_prepend.invokeExact(handle(), Interop.allocateNativeString(label), Interop.allocateNativeString(detailedAction));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_prepend_item = Interop.downcallHandle(
        "g_menu_prepend_item",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepends {@code item} to the start of {@code menu}.
     * <p>
     * See g_menu_insert_item() for more information.
     */
    public @NotNull void prependItem(@NotNull MenuItem item) {
        try {
            g_menu_prepend_item.invokeExact(handle(), item.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_prepend_section = Interop.downcallHandle(
        "g_menu_prepend_section",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function for prepending a section menu item to the start
     * of {@code menu}.  Combine g_menu_item_new_section() and g_menu_insert_item() for
     * a more flexible alternative.
     */
    public @NotNull void prependSection(@Nullable java.lang.String label, @NotNull MenuModel section) {
        try {
            g_menu_prepend_section.invokeExact(handle(), Interop.allocateNativeString(label), section.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_prepend_submenu = Interop.downcallHandle(
        "g_menu_prepend_submenu",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Convenience function for prepending a submenu menu item to the start
     * of {@code menu}.  Combine g_menu_item_new_submenu() and g_menu_insert_item() for
     * a more flexible alternative.
     */
    public @NotNull void prependSubmenu(@Nullable java.lang.String label, @NotNull MenuModel submenu) {
        try {
            g_menu_prepend_submenu.invokeExact(handle(), Interop.allocateNativeString(label), submenu.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_remove = Interop.downcallHandle(
        "g_menu_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
     */
    public @NotNull void remove(@NotNull int position) {
        try {
            g_menu_remove.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_menu_remove_all = Interop.downcallHandle(
        "g_menu_remove_all",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all items in the menu.
     */
    public @NotNull void removeAll() {
        try {
            g_menu_remove_all.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
