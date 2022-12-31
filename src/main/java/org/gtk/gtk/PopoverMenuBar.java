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
     * <p>
     * Because PopoverMenuBar is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PopoverMenuBar(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PopoverMenuBar> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PopoverMenuBar(input, ownership);
    
    private static MemoryAddress constructNewFromModel(@Nullable org.gtk.gio.MenuModel model) {
        MemoryAddress RESULT;
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
        var RESULT = constructNewFromModel(model);
        return (org.gtk.gtk.PopoverMenuBar) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.PopoverMenuBar.fromAddress).marshal(RESULT, Ownership.NONE);
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
    public boolean addChild(org.gtk.gtk.Widget child, java.lang.String id) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_menu_bar_add_child.invokeExact(
                    handle(),
                    child.handle(),
                    Marshal.stringToAddress.marshal(id, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return (org.gtk.gio.MenuModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gio.MenuModel.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Removes a widget that has previously been added with
     * gtk_popover_menu_bar_add_child().
     * @param child the {@code GtkWidget} to remove
     * @return {@code true} if the widget was removed
     */
    public boolean removeChild(org.gtk.gtk.Widget child) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_popover_menu_bar_remove_child.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_popover_menu_bar_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PopoverMenuBar.Builder} object constructs a {@link PopoverMenuBar} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PopoverMenuBar.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PopoverMenuBar} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PopoverMenuBar}.
         * @return A new instance of {@code PopoverMenuBar} with the properties 
         *         that were set in the Builder object.
         */
        public PopoverMenuBar build() {
            return (PopoverMenuBar) org.gtk.gobject.GObject.newWithProperties(
                PopoverMenuBar.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The {@code GMenuModel} from which the menu bar is created.
         * <p>
         * The model should only contain submenus as toplevel elements.
         * @param menuModel The value for the {@code menu-model} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMenuModel(org.gtk.gio.MenuModel menuModel) {
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
