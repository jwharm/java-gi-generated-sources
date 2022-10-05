package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkPopoverMenuBar} presents a horizontal bar of items that pop
 * up popover menus when clicked.
 * <p>
 * <img src="./doc-files/menubar.png" alt="An example GtkPopoverMenuBar">
 * <p>
 * The only way to create instances of {@code GtkPopoverMenuBar} is
 * from a {@code GMenuModel}.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * menubar
 * ├── item[.active]
 * ┊   ╰── popover
 * ╰── item
 *     ╰── popover
 * }</pre>
 * <p>
 * {@code GtkPopoverMenuBar} has a single CSS node with name menubar, below which
 * each item has its CSS node, and below that the corresponding popover.
 * <p>
 * The item whose popover is currently open gets the .active
 * style class.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkPopoverMenuBar} uses the {@link AccessibleRole#MENU_BAR} role,
 * the menu items use the {@link AccessibleRole#MENU_ITEM} role and
 * the menus use the {@link AccessibleRole#MENU} role.
 */
public class PopoverMenuBar extends Widget implements Accessible, Buildable, ConstraintTarget {

    public PopoverMenuBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PopoverMenuBar */
    public static PopoverMenuBar castFrom(org.gtk.gobject.Object gobject) {
        return new PopoverMenuBar(gobject.refcounted());
    }
    
    static final MethodHandle gtk_popover_menu_bar_new_from_model = Interop.downcallHandle(
        "gtk_popover_menu_bar_new_from_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewFromModel(org.gtk.gio.MenuModel model) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_popover_menu_bar_new_from_model.invokeExact(model.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkPopoverMenuBar} from a {@code GMenuModel}.
     */
    public static PopoverMenuBar newFromModel(org.gtk.gio.MenuModel model) {
        return new PopoverMenuBar(constructNewFromModel(model));
    }
    
    static final MethodHandle gtk_popover_menu_bar_add_child = Interop.downcallHandle(
        "gtk_popover_menu_bar_add_child",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a custom widget to a generated menubar.
     * <p>
     * For this to work, the menu model of {@code bar} must have an
     * item with a {@code custom} attribute that matches {@code id}.
     */
    public boolean addChild(Widget child, java.lang.String id) {
        try {
            var RESULT = (int) gtk_popover_menu_bar_add_child.invokeExact(handle(), child.handle(), Interop.allocateNativeString(id).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_menu_bar_get_menu_model = Interop.downcallHandle(
        "gtk_popover_menu_bar_get_menu_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the model from which the contents of {@code bar} are taken.
     */
    public org.gtk.gio.MenuModel getMenuModel() {
        try {
            var RESULT = (MemoryAddress) gtk_popover_menu_bar_get_menu_model.invokeExact(handle());
            return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_menu_bar_remove_child = Interop.downcallHandle(
        "gtk_popover_menu_bar_remove_child",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a widget that has previously been added with
     * gtk_popover_menu_bar_add_child().
     */
    public boolean removeChild(Widget child) {
        try {
            var RESULT = (int) gtk_popover_menu_bar_remove_child.invokeExact(handle(), child.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_popover_menu_bar_set_menu_model = Interop.downcallHandle(
        "gtk_popover_menu_bar_set_menu_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a menu model from which {@code bar} should take
     * its contents.
     */
    public void setMenuModel(org.gtk.gio.MenuModel model) {
        try {
            gtk_popover_menu_bar_set_menu_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
