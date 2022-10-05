package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkSelectionModel} is an interface that add support for selection to list models.
 * <p>
 * This support is then used by widgets using list models to add the ability
 * to select and unselect various items.
 * <p>
 * GTK provides default implementations of the most common selection modes such
 * as {@link SingleSelection}, so you will only need to implement this
 * interface if you want detailed control about how selections should be handled.
 * <p>
 * A {@code GtkSelectionModel} supports a single boolean per item indicating if an item is
 * selected or not. This can be queried via {@link SelectionModel#isSelected}.
 * When the selected state of one or more items changes, the model will emit the
 * {@code Gtk.SelectionModel::selection-changed} signal by calling the
 * {@link SelectionModel#selectionChanged} function. The positions given
 * in that signal may have their selection state changed, though that is not a
 * requirement. If new items added to the model via the
 * {@code Gio.ListModel::items-changed} signal are selected or not is up to the
 * implementation.
 * <p>
 * Note that items added via {@code Gio.ListModel::items-changed} may already
 * be selected and no {@code Gtk.SelectionModel::selection-changed} will be
 * emitted for them. So to track which items are selected, it is necessary to
 * listen to both signals.
 * <p>
 * Additionally, the interface can expose functionality to select and unselect
 * items. If these functions are implemented, GTK's list widgets will allow users
 * to select and unselect items. However, {@code GtkSelectionModel}s are free to only
 * implement them partially or not at all. In that case the widgets will not
 * support the unimplemented operations.
 * <p>
 * When selecting or unselecting is supported by a model, the return values of
 * the selection functions do <strong>not</strong> indicate if selection or unselection happened.
 * They are only meant to indicate complete failure, like when this mode of
 * selecting is not supported by the model.
 * <p>
 * Selections may happen asynchronously, so the only reliable way to find out
 * when an item was selected is to listen to the signals that indicate selection.
 */
public interface SelectionModel extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle gtk_selection_model_get_selection = Interop.downcallHandle(
        "gtk_selection_model_get_selection",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the set containing all currently selected items in the model.
     * <p>
     * This function may be slow, so if you are only interested in single item,
     * consider using {@link SelectionModel#isSelected} or if you are only
     * interested in a few, consider {@link SelectionModel#getSelectionInRange}.
     */
    public default Bitset getSelection() {
        try {
            var RESULT = (MemoryAddress) gtk_selection_model_get_selection.invokeExact(handle());
            return new Bitset(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_selection_model_get_selection_in_range = Interop.downcallHandle(
        "gtk_selection_model_get_selection_in_range",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the set of selected items in a range.
     * <p>
     * This function is an optimization for
     * {@link SelectionModel#getSelection} when you are only
     * interested in part of the model's selected state. A common use
     * case is in response to the {@code Gtk.SelectionModel::selection-changed}
     * signal.
     */
    public default Bitset getSelectionInRange(int position, int nItems) {
        try {
            var RESULT = (MemoryAddress) gtk_selection_model_get_selection_in_range.invokeExact(handle(), position, nItems);
            return new Bitset(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_selection_model_is_selected = Interop.downcallHandle(
        "gtk_selection_model_is_selected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Checks if the given item is selected.
     */
    public default boolean isSelected(int position) {
        try {
            var RESULT = (int) gtk_selection_model_is_selected.invokeExact(handle(), position);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_selection_model_select_all = Interop.downcallHandle(
        "gtk_selection_model_select_all",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Requests to select all items in the model.
     */
    public default boolean selectAll() {
        try {
            var RESULT = (int) gtk_selection_model_select_all.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_selection_model_select_item = Interop.downcallHandle(
        "gtk_selection_model_select_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Requests to select an item in the model.
     */
    public default boolean selectItem(int position, boolean unselectRest) {
        try {
            var RESULT = (int) gtk_selection_model_select_item.invokeExact(handle(), position, unselectRest ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_selection_model_select_range = Interop.downcallHandle(
        "gtk_selection_model_select_range",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Requests to select a range of items in the model.
     */
    public default boolean selectRange(int position, int nItems, boolean unselectRest) {
        try {
            var RESULT = (int) gtk_selection_model_select_range.invokeExact(handle(), position, nItems, unselectRest ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_selection_model_selection_changed = Interop.downcallHandle(
        "gtk_selection_model_selection_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Helper function for implementations of {@code GtkSelectionModel}.
     * <p>
     * Call this when a the selection changes to emit the
     * {@code Gtk.SelectionModel::selection-changed} signal.
     */
    public default void selectionChanged(int position, int nItems) {
        try {
            gtk_selection_model_selection_changed.invokeExact(handle(), position, nItems);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_selection_model_set_selection = Interop.downcallHandle(
        "gtk_selection_model_set_selection",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Make selection changes.
     * <p>
     * This is the most advanced selection updating method that allows
     * the most fine-grained control over selection changes. If you can,
     * you should try the simpler versions, as implementations are more
     * likely to implement support for those.
     * <p>
     * Requests that the selection state of all positions set in {@code mask}
     * be updated to the respective value in the {@code selected} bitmask.
     * <p>
     * In pseudocode, it would look something like this:
     * <p>
     * <pre>{@code c
     * for (i = 0; i < n_items; i++)
     *   {
     *     // don't change values not in the mask
     *     if (!gtk_bitset_contains (mask, i))
     *       continue;
     * 
     *     if (gtk_bitset_contains (selected, i))
     *       select_item (i);
     *     else
     *       unselect_item (i);
     *   }
     * 
     * gtk_selection_model_selection_changed (model,
     *                                        first_changed_item,
     *                                        n_changed_items);
     * }</pre>
     * <p>
     * {@code mask} and {@code selected} must not be modified. They may refer to the
     * same bitset, which would mean that every item in the set should
     * be selected.
     */
    public default boolean setSelection(Bitset selected, Bitset mask) {
        try {
            var RESULT = (int) gtk_selection_model_set_selection.invokeExact(handle(), selected.handle(), mask.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_selection_model_unselect_all = Interop.downcallHandle(
        "gtk_selection_model_unselect_all",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Requests to unselect all items in the model.
     */
    public default boolean unselectAll() {
        try {
            var RESULT = (int) gtk_selection_model_unselect_all.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_selection_model_unselect_item = Interop.downcallHandle(
        "gtk_selection_model_unselect_item",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Requests to unselect an item in the model.
     */
    public default boolean unselectItem(int position) {
        try {
            var RESULT = (int) gtk_selection_model_unselect_item.invokeExact(handle(), position);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_selection_model_unselect_range = Interop.downcallHandle(
        "gtk_selection_model_unselect_range",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Requests to unselect a range of items in the model.
     */
    public default boolean unselectRange(int position, int nItems) {
        try {
            var RESULT = (int) gtk_selection_model_unselect_range.invokeExact(handle(), position, nItems);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectionChangedHandler {
        void signalReceived(SelectionModel source, int position, int nItems);
    }
    
    /**
     * Emitted when the selection state of some of the items in {@code model} changes.
     * <p>
     * Note that this signal does not specify the new selection state of the
     * items, they need to be queried manually. It is also not necessary for
     * a model to change the selection state of any of the items in the selection
     * model, though it would be rather useless to emit such a signal.
     */
    public default SignalHandle onSelectionChanged(SelectionChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("selection-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SelectionModel.Callbacks.class, "signalSelectionModelSelectionChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalSelectionModelSelectionChanged(MemoryAddress source, int position, int nItems, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (SelectionModel.SelectionChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new SelectionModel.SelectionModelImpl(Refcounted.get(source)), position, nItems);
        }
        
    }
    
    class SelectionModelImpl extends org.gtk.gobject.Object implements SelectionModel {
        public SelectionModelImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
