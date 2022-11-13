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
public class ListItem extends org.gtk.gobject.Object {
    
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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ListItem(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ListItem if its GType is a (or inherits from) "GtkListItem".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ListItem} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkListItem", a ClassCastException will be thrown.
     */
    public static ListItem castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkListItem"))) {
            return new ListItem(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkListItem");
        }
    }
    
    /**
     * Checks if a list item has been set to be activatable via
     * gtk_list_item_set_activatable().
     * @return {@code true} if the item is activatable
     */
    public boolean getActivatable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_list_item_get_activatable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the child previously set via gtk_list_item_set_child() or
     * {@code null} if none was set.
     * @return The child
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_item_get_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the model item that associated with {@code self}.
     * <p>
     * If {@code self} is unbound, this function returns {@code null}.
     * @return The item displayed
     */
    public @Nullable org.gtk.gobject.Object getItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_list_item_get_item.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.NONE);
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
            RESULT = (int) DowncallHandles.gtk_list_item_get_position.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gtk_list_item_get_selectable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (int) DowncallHandles.gtk_list_item_get_selected.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
                    activatable ? 1 : 0);
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
                    selectable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_list_item_get_activatable = Interop.downcallHandle(
            "gtk_list_item_get_activatable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_item_get_child = Interop.downcallHandle(
            "gtk_list_item_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_item_get_item = Interop.downcallHandle(
            "gtk_list_item_get_item",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_item_get_position = Interop.downcallHandle(
            "gtk_list_item_get_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_item_get_selectable = Interop.downcallHandle(
            "gtk_list_item_get_selectable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_item_get_selected = Interop.downcallHandle(
            "gtk_list_item_get_selected",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_item_set_activatable = Interop.downcallHandle(
            "gtk_list_item_set_activatable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_list_item_set_child = Interop.downcallHandle(
            "gtk_list_item_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_list_item_set_selectable = Interop.downcallHandle(
            "gtk_list_item_set_selectable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
