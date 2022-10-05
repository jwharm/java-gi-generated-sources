package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkSingleSelection} is a {@code GtkSelectionModel} that allows selecting a single
 * item.
 * <p>
 * Note that the selection is <strong>persistent</strong> -- if the selected item is removed
 * and re-added in the same {@code Gio.ListModel::items-changed} emission, it
 * stays selected. In particular, this means that changing the sort order of an
 * underlying sort model will preserve the selection.
 */
public class SingleSelection extends org.gtk.gobject.Object implements org.gtk.gio.ListModel, SelectionModel {

    public SingleSelection(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SingleSelection */
    public static SingleSelection castFrom(org.gtk.gobject.Object gobject) {
        return new SingleSelection(gobject.refcounted());
    }
    
    static final MethodHandle gtk_single_selection_new = Interop.downcallHandle(
        "gtk_single_selection_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.gtk.gio.ListModel model) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_single_selection_new.invokeExact(model.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new selection to handle {@code model}.
     */
    public SingleSelection(org.gtk.gio.ListModel model) {
        super(constructNew(model));
    }
    
    static final MethodHandle gtk_single_selection_get_autoselect = Interop.downcallHandle(
        "gtk_single_selection_get_autoselect",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks if autoselect has been enabled or disabled via
     * gtk_single_selection_set_autoselect().
     */
    public boolean getAutoselect() {
        try {
            var RESULT = (int) gtk_single_selection_get_autoselect.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_single_selection_get_can_unselect = Interop.downcallHandle(
        "gtk_single_selection_get_can_unselect",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code true}, gtk_selection_model_unselect_item() is supported and allows
     * unselecting the selected item.
     */
    public boolean getCanUnselect() {
        try {
            var RESULT = (int) gtk_single_selection_get_can_unselect.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_single_selection_get_model = Interop.downcallHandle(
        "gtk_single_selection_get_model",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the model that {@code self} is wrapping.
     */
    public org.gtk.gio.ListModel getModel() {
        try {
            var RESULT = (MemoryAddress) gtk_single_selection_get_model.invokeExact(handle());
            return new org.gtk.gio.ListModel.ListModelImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_single_selection_get_selected = Interop.downcallHandle(
        "gtk_single_selection_get_selected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the position of the selected item.
     * <p>
     * If no item is selected, {@code GTK_INVALID_LIST_POSITION} is returned.
     */
    public int getSelected() {
        try {
            var RESULT = (int) gtk_single_selection_get_selected.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_single_selection_get_selected_item = Interop.downcallHandle(
        "gtk_single_selection_get_selected_item",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the selected item.
     * <p>
     * If no item is selected, {@code null} is returned.
     */
    public org.gtk.gobject.Object getSelectedItem() {
        try {
            var RESULT = (MemoryAddress) gtk_single_selection_get_selected_item.invokeExact(handle());
            return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_single_selection_set_autoselect = Interop.downcallHandle(
        "gtk_single_selection_set_autoselect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Enables or disables autoselect.
     * <p>
     * If {@code autoselect} is {@code true}, {@code self} will enforce that an item is always
     * selected. It will select a new item when the currently selected
     * item is deleted and it will disallow unselecting the current item.
     */
    public void setAutoselect(boolean autoselect) {
        try {
            gtk_single_selection_set_autoselect.invokeExact(handle(), autoselect ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_single_selection_set_can_unselect = Interop.downcallHandle(
        "gtk_single_selection_set_can_unselect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * If {@code true}, unselecting the current item via
     * gtk_selection_model_unselect_item() is supported.
     * <p>
     * Note that setting {@code Gtk.SingleSelection:autoselect} will
     * cause unselecting to not work, so it practically makes no sense
     * to set both at the same time the same time.
     */
    public void setCanUnselect(boolean canUnselect) {
        try {
            gtk_single_selection_set_can_unselect.invokeExact(handle(), canUnselect ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_single_selection_set_model = Interop.downcallHandle(
        "gtk_single_selection_set_model",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the model that {@code self} should wrap.
     * <p>
     * If {@code model} is {@code null}, {@code self} will be empty.
     */
    public void setModel(org.gtk.gio.ListModel model) {
        try {
            gtk_single_selection_set_model.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_single_selection_set_selected = Interop.downcallHandle(
        "gtk_single_selection_set_selected",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Selects the item at the given position.
     * <p>
     * If the list does not have an item at {@code position} or
     * {@code GTK_INVALID_LIST_POSITION} is given, the behavior depends on the
     * value of the {@code Gtk.SingleSelection:autoselect} property:
     * If it is set, no change will occur and the old item will stay
     * selected. If it is unset, the selection will be unset and no item
     * will be selected.
     */
    public void setSelected(int position) {
        try {
            gtk_single_selection_set_selected.invokeExact(handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
