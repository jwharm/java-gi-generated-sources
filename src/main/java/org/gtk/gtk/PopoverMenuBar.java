package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkPopoverMenuBar} presents a horizontal bar of items that pop
 * up popover menus when clicked.
 * <p>
 * <img src="./doc-files/menubar.png" alt="An example GtkPopoverMenuBar">
 * <p>
 * The only way to create instances of {@code GtkPopoverMenuBar} is
 * from a {@code GMenuModel}.
 * <p>
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkPopoverMenuBar} uses the {@link AccessibleRole#MENU_BAR} role,
 * the menu items use the {@link AccessibleRole#MENU_ITEM} role and
 * the menus use the {@link AccessibleRole#MENU} role.
 */
public class PopoverMenuBar extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public PopoverMenuBar(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to PopoverMenuBar */
    public static PopoverMenuBar castFrom(org.gtk.gobject.Object gobject) {
        return new PopoverMenuBar(gobject.refcounted());
    }
    
    private static Refcounted constructNewFromModel(@Nullable org.gtk.gio.MenuModel model) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_popover_menu_bar_new_from_model.invokeExact(model.handle()), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkPopoverMenuBar} from a {@code GMenuModel}.
     * @param model a {@code GMenuModel}
     * @return a new {@code GtkPopoverMenuBar}
     */
    public static PopoverMenuBar newFromModel(@Nullable org.gtk.gio.MenuModel model) {
        return new PopoverMenuBar(constructNewFromModel(model));
    }
    
    /**
     * Adds a custom widget to a generated menubar.
     * <p>
     * For this to work, the menu model of {@code bar} must have an
     * item with a {@code custom} attribute that matches {@code id}.
     * @param child the {@code GtkWidget} to add
     * @param id the ID to insert {@code child} at
     * @return {@code true} if {@code id} was found and the widget added
     */
    public boolean addChild(@NotNull org.gtk.gtk.Widget child, @NotNull java.lang.String id) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(id, "Parameter 'id' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_menu_bar_add_child.invokeExact(handle(), child.handle(), Interop.allocateNativeString(id));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the model from which the contents of {@code bar} are taken.
     * @return a {@code GMenuModel}
     */
    public @Nullable org.gtk.gio.MenuModel getMenuModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_popover_menu_bar_get_menu_model.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
    }
    
    /**
     * Removes a widget that has previously been added with
     * gtk_popover_menu_bar_add_child().
     * @param child the {@code GtkWidget} to remove
     * @return {@code true} if the widget was removed
     */
    public boolean removeChild(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_menu_bar_remove_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets a menu model from which {@code bar} should take
     * its contents.
     * @param model a {@code GMenuModel}
     */
    public void setMenuModel(@Nullable org.gtk.gio.MenuModel model) {
        java.util.Objects.requireNonNullElse(model, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_popover_menu_bar_set_menu_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_popover_menu_bar_new_from_model = Interop.downcallHandle(
            "gtk_popover_menu_bar_new_from_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_menu_bar_add_child = Interop.downcallHandle(
            "gtk_popover_menu_bar_add_child",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_menu_bar_get_menu_model = Interop.downcallHandle(
            "gtk_popover_menu_bar_get_menu_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_menu_bar_remove_child = Interop.downcallHandle(
            "gtk_popover_menu_bar_remove_child",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_popover_menu_bar_set_menu_model = Interop.downcallHandle(
            "gtk_popover_menu_bar_set_menu_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
