package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class ListItem extends org.gtk.gobject.GObject {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkListItem";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ListItem proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ListItem(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ListItem> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ListItem(input);
    
    /**
     * Checks if a list item has been set to be activatable via
     * gtk_list_item_set_activatable().
     * @return {@code true} if the item is activatable
     */
    public boolean getActivatable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_item_get_activatable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the child previously set via gtk_list_item_set_child() or
     * {@code null} if none was set.
     * @return The child
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_item_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the model item that associated with {@code self}.
     * <p>
     * If {@code self} is unbound, this function returns {@code null}.
     * @return The item displayed
     */
    public @Nullable org.gtk.gobject.GObject getItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_item_get_item.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) Interop.register(RESULT, org.gtk.gobject.GObject.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the position in the model that {@code self} currently displays.
     * <p>
     * If {@code self} is unbound, {@code GTK_INVALID_LIST_POSITION} is returned.
     * @return The position of this item
     */
    public int getPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_item_get_position.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Checks if a list item has been set to be selectable via
     * gtk_list_item_set_selectable().
     * <p>
     * Do not confuse this function with {@link ListItem#getSelected}.
     * @return {@code true} if the item is selectable
     */
    public boolean getSelectable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_item_get_selectable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if the item is displayed as selected.
     * <p>
     * The selected state is maintained by the liste widget and its model
     * and cannot be set otherwise.
     * @return {@code true} if the item is selected.
     */
    public boolean getSelected() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_item_get_selected.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @param activatable if the item should be activatable
     */
    public void setActivatable(boolean activatable) {
        try {
            DowncallHandles.gtk_list_item_set_activatable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(activatable, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the child to be used for this listitem.
     * <p>
     * This function is typically called by applications when
     * setting up a listitem so that the widget can be reused when
     * binding it multiple times.
     * @param child The list item's child or {@code null} to unset
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_list_item_set_child.invokeExact(
                    handle(),
                    (Addressable) (child == null ? MemoryAddress.NULL : child.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param selectable if the item should be selectable
     */
    public void setSelectable(boolean selectable) {
        try {
            DowncallHandles.gtk_list_item_set_selectable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(selectable, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_list_item_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link ListItem.Builder} object constructs a {@link ListItem} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link ListItem.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link ListItem} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ListItem}.
         * @return A new instance of {@code ListItem} with the properties 
         *         that were set in the Builder object.
         */
        public ListItem build() {
            return (ListItem) org.gtk.gobject.GObject.newWithProperties(
                ListItem.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * If the item can be activated by the user.
         * @param activatable The value for the {@code activatable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActivatable(boolean activatable) {
            names.add("activatable");
            values.add(org.gtk.gobject.Value.create(activatable));
            return this;
        }
        
        /**
         * Widget used for display.
         * @param child The value for the {@code child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChild(org.gtk.gtk.Widget child) {
            names.add("child");
            values.add(org.gtk.gobject.Value.create(child));
            return this;
        }
        
        /**
         * Displayed item.
         * @param item The value for the {@code item} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setItem(org.gtk.gobject.GObject item) {
            names.add("item");
            values.add(org.gtk.gobject.Value.create(item));
            return this;
        }
        
        /**
         * Position of the item.
         * @param position The value for the {@code position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPosition(int position) {
            names.add("position");
            values.add(org.gtk.gobject.Value.create(position));
            return this;
        }
        
        /**
         * If the item can be selected by the user.
         * @param selectable The value for the {@code selectable} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSelectable(boolean selectable) {
            names.add("selectable");
            values.add(org.gtk.gobject.Value.create(selectable));
            return this;
        }
        
        /**
         * If the item is currently selected.
         * @param selected The value for the {@code selected} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSelected(boolean selected) {
            names.add("selected");
            values.add(org.gtk.gobject.Value.create(selected));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_list_item_get_activatable = Interop.downcallHandle(
                "gtk_list_item_get_activatable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_item_get_child = Interop.downcallHandle(
                "gtk_list_item_get_child",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_item_get_item = Interop.downcallHandle(
                "gtk_list_item_get_item",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_item_get_position = Interop.downcallHandle(
                "gtk_list_item_get_position",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_item_get_selectable = Interop.downcallHandle(
                "gtk_list_item_get_selectable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_item_get_selected = Interop.downcallHandle(
                "gtk_list_item_get_selected",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_item_set_activatable = Interop.downcallHandle(
                "gtk_list_item_set_activatable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_list_item_set_child = Interop.downcallHandle(
                "gtk_list_item_set_child",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_list_item_set_selectable = Interop.downcallHandle(
                "gtk_list_item_set_selectable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_list_item_get_type = Interop.downcallHandle(
                "gtk_list_item_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_list_item_get_type != null;
    }
}
