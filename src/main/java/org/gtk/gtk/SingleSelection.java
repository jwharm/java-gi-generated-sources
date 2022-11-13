package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkSingleSelection} is a {@code GtkSelectionModel} that allows selecting a single
 * item.
 * <p>
 * Note that the selection is <em>persistent</em> -- if the selected item is removed
 * and re-added in the same {@code Gio.ListModel::items-changed} emission, it
 * stays selected. In particular, this means that changing the sort order of an
 * underlying sort model will preserve the selection.
 */
public class SingleSelection extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, org.gtk.gtk.SelectionModel {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSingleSelection";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SingleSelection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SingleSelection(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SingleSelection if its GType is a (or inherits from) "GtkSingleSelection".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SingleSelection} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSingleSelection", a ClassCastException will be thrown.
     */
    public static SingleSelection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkSingleSelection"))) {
            return new SingleSelection(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSingleSelection");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gio.ListModel model) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_single_selection_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        model.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Creates a new selection to handle {@code model}.
     * @param model the {@code GListModel} to manage
     */
    public SingleSelection(@Nullable org.gtk.gio.ListModel model) {
        super(constructNew(model), Ownership.FULL);
    }
    
    /**
     * Checks if autoselect has been enabled or disabled via
     * gtk_single_selection_set_autoselect().
     * @return {@code true} if autoselect is enabled
     */
    public boolean getAutoselect() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_single_selection_get_autoselect.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * If {@code true}, gtk_selection_model_unselect_item() is supported and allows
     * unselecting the selected item.
     * @return {@code true} to support unselecting
     */
    public boolean getCanUnselect() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_single_selection_get_can_unselect.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the model that {@code self} is wrapping.
     * @return The model being wrapped
     */
    public @Nullable org.gtk.gio.ListModel getModel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_single_selection_get_model.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.ListModel.ListModelImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the position of the selected item.
     * <p>
     * If no item is selected, {@code GTK_INVALID_LIST_POSITION} is returned.
     * @return The position of the selected item
     */
    public int getSelected() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_single_selection_get_selected.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the selected item.
     * <p>
     * If no item is selected, {@code null} is returned.
     * @return The selected item
     */
    public @Nullable org.gtk.gobject.Object getSelectedItem() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_single_selection_get_selected_item.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.NONE);
    }
    
    /**
     * Enables or disables autoselect.
     * <p>
     * If {@code autoselect} is {@code true}, {@code self} will enforce that an item is always
     * selected. It will select a new item when the currently selected
     * item is deleted and it will disallow unselecting the current item.
     * @param autoselect {@code true} to always select an item
     */
    public void setAutoselect(boolean autoselect) {
        try {
            DowncallHandles.gtk_single_selection_set_autoselect.invokeExact(
                    handle(),
                    autoselect ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code true}, unselecting the current item via
     * gtk_selection_model_unselect_item() is supported.
     * <p>
     * Note that setting {@code Gtk.SingleSelection:autoselect} will
     * cause unselecting to not work, so it practically makes no sense
     * to set both at the same time the same time.
     * @param canUnselect {@code true} to allow unselecting
     */
    public void setCanUnselect(boolean canUnselect) {
        try {
            DowncallHandles.gtk_single_selection_set_can_unselect.invokeExact(
                    handle(),
                    canUnselect ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the model that {@code self} should wrap.
     * <p>
     * If {@code model} is {@code null}, {@code self} will be empty.
     * @param model A {@code GListModel} to wrap
     */
    public void setModel(@Nullable org.gtk.gio.ListModel model) {
        try {
            DowncallHandles.gtk_single_selection_set_model.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Selects the item at the given position.
     * <p>
     * If the list does not have an item at {@code position} or
     * {@code GTK_INVALID_LIST_POSITION} is given, the behavior depends on the
     * value of the {@code Gtk.SingleSelection:autoselect} property:
     * If it is set, no change will occur and the old item will stay
     * selected. If it is unset, the selection will be unset and no item
     * will be selected.
     * @param position the item to select or {@code GTK_INVALID_LIST_POSITION}
     */
    public void setSelected(int position) {
        try {
            DowncallHandles.gtk_single_selection_set_selected.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_single_selection_new = Interop.downcallHandle(
            "gtk_single_selection_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_single_selection_get_autoselect = Interop.downcallHandle(
            "gtk_single_selection_get_autoselect",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_single_selection_get_can_unselect = Interop.downcallHandle(
            "gtk_single_selection_get_can_unselect",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_single_selection_get_model = Interop.downcallHandle(
            "gtk_single_selection_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_single_selection_get_selected = Interop.downcallHandle(
            "gtk_single_selection_get_selected",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_single_selection_get_selected_item = Interop.downcallHandle(
            "gtk_single_selection_get_selected_item",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_single_selection_set_autoselect = Interop.downcallHandle(
            "gtk_single_selection_set_autoselect",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_single_selection_set_can_unselect = Interop.downcallHandle(
            "gtk_single_selection_set_can_unselect",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_single_selection_set_model = Interop.downcallHandle(
            "gtk_single_selection_set_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_single_selection_set_selected = Interop.downcallHandle(
            "gtk_single_selection_set_selected",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
