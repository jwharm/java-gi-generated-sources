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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public SingleSelection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to SingleSelection if its GType is a (or inherits from) "GtkSingleSelection".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "SingleSelection" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSingleSelection", a ClassCastException will be thrown.
     */
    public static SingleSelection castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkSingleSelection"))) {
            return new SingleSelection(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSingleSelection");
        }
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gio.ListModel model) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_single_selection_new.invokeExact(
                    (Addressable) (model == null ? MemoryAddress.NULL : model.refcounted().unowned().handle())), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new selection to handle {@code model}.
     * @param model the {@code GListModel} to manage
     */
    public SingleSelection(@Nullable org.gtk.gio.ListModel model) {
        super(constructNew(model));
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
        return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
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
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
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
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_single_selection_get_autoselect = Interop.downcallHandle(
            "gtk_single_selection_get_autoselect",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_single_selection_get_can_unselect = Interop.downcallHandle(
            "gtk_single_selection_get_can_unselect",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_single_selection_get_model = Interop.downcallHandle(
            "gtk_single_selection_get_model",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_single_selection_get_selected = Interop.downcallHandle(
            "gtk_single_selection_get_selected",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_single_selection_get_selected_item = Interop.downcallHandle(
            "gtk_single_selection_get_selected_item",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_single_selection_set_autoselect = Interop.downcallHandle(
            "gtk_single_selection_set_autoselect",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_single_selection_set_can_unselect = Interop.downcallHandle(
            "gtk_single_selection_set_can_unselect",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_single_selection_set_model = Interop.downcallHandle(
            "gtk_single_selection_set_model",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_single_selection_set_selected = Interop.downcallHandle(
            "gtk_single_selection_set_selected",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
