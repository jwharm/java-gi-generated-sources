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
    
    private static final java.lang.String C_TYPE_NAME = "GtkPopoverMenuBar";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PopoverMenuBar proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PopoverMenuBar(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PopoverMenuBar if its GType is a (or inherits from) "GtkPopoverMenuBar".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PopoverMenuBar} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkPopoverMenuBar", a ClassCastException will be thrown.
     */
    public static PopoverMenuBar castFrom(org.gtk.gobject.Object gobject) {
            return new PopoverMenuBar(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNewFromModel(@Nullable org.gtk.gio.MenuModel model) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_popover_menu_bar_new_from_model.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
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
        return new PopoverMenuBar(constructNewFromModel(model), Ownership.NONE);
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
            RESULT = (int) DowncallHandles.gtk_popover_menu_bar_add_child.invokeExact(
                    handle(),
                    child.handle(),
                    Interop.allocateNativeString(id));
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_popover_menu_bar_get_menu_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(RESULT, Ownership.NONE);
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
            RESULT = (int) DowncallHandles.gtk_popover_menu_bar_remove_child.invokeExact(
                    handle(),
                    child.handle());
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
        try {
            DowncallHandles.gtk_popover_menu_bar_set_menu_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_popover_menu_bar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link PopoverMenuBar.Build} object constructs a {@link PopoverMenuBar} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PopoverMenuBar} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PopoverMenuBar} using {@link PopoverMenuBar#castFrom}.
         * @return A new instance of {@code PopoverMenuBar} with the properties 
         *         that were set in the Build object.
         */
        public PopoverMenuBar construct() {
            return PopoverMenuBar.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PopoverMenuBar.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The {@code GMenuModel} from which the menu bar is created.
         * <p>
         * The model should only contain submenus as toplevel elements.
         * @param menuModel The value for the {@code menu-model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMenuModel(org.gtk.gio.MenuModel menuModel) {
            names.add("menu-model");
            values.add(org.gtk.gobject.Value.create(menuModel));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_popover_menu_bar_new_from_model = Interop.downcallHandle(
            "gtk_popover_menu_bar_new_from_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_popover_menu_bar_add_child = Interop.downcallHandle(
            "gtk_popover_menu_bar_add_child",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_popover_menu_bar_get_menu_model = Interop.downcallHandle(
            "gtk_popover_menu_bar_get_menu_model",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_popover_menu_bar_remove_child = Interop.downcallHandle(
            "gtk_popover_menu_bar_remove_child",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_popover_menu_bar_set_menu_model = Interop.downcallHandle(
            "gtk_popover_menu_bar_set_menu_model",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_popover_menu_bar_get_type = Interop.downcallHandle(
            "gtk_popover_menu_bar_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
