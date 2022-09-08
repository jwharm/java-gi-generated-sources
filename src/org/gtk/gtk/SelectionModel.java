package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkSelectionModel` is an interface that add support for selection to list models.
 * 
 * This support is then used by widgets using list models to add the ability
 * to select and unselect various items.
 * 
 * GTK provides default implementations of the most common selection modes such
 * as [class@Gtk.SingleSelection], so you will only need to implement this
 * interface if you want detailed control about how selections should be handled.
 * 
 * A `GtkSelectionModel` supports a single boolean per item indicating if an item is
 * selected or not. This can be queried via [method@Gtk.SelectionModel.is_selected].
 * When the selected state of one or more items changes, the model will emit the
 * [signal@Gtk.SelectionModel::selection-changed] signal by calling the
 * [method@Gtk.SelectionModel.selection_changed] function. The positions given
 * in that signal may have their selection state changed, though that is not a
 * requirement. If new items added to the model via the
 * [signal@Gio.ListModel::items-changed] signal are selected or not is up to the
 * implementation.
 * 
 * Note that items added via [signal@Gio.ListModel::items-changed] may already
 * be selected and no [signal@Gtk.SelectionModel::selection-changed] will be
 * emitted for them. So to track which items are selected, it is necessary to
 * listen to both signals.
 * 
 * Additionally, the interface can expose functionality to select and unselect
 * items. If these functions are implemented, GTK's list widgets will allow users
 * to select and unselect items. However, `GtkSelectionModel`s are free to only
 * implement them partially or not at all. In that case the widgets will not
 * support the unimplemented operations.
 * 
 * When selecting or unselecting is supported by a model, the return values of
 * the selection functions do *not* indicate if selection or unselection happened.
 * They are only meant to indicate complete failure, like when this mode of
 * selecting is not supported by the model.
 * 
 * Selections may happen asynchronously, so the only reliable way to find out
 * when an item was selected is to listen to the signals that indicate selection.
 */
public interface SelectionModel extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Gets the set containing all currently selected items in the model.
     * 
     * This function may be slow, so if you are only interested in single item,
     * consider using [method@Gtk.SelectionModel.is_selected] or if you are only
     * interested in a few, consider [method@Gtk.SelectionModel.get_selection_in_range].
     */
    public default Bitset getSelection() {
        var RESULT = gtk_h.gtk_selection_model_get_selection(handle());
        return new Bitset(References.get(RESULT, true));
    }
    
    /**
     * Gets the set of selected items in a range.
     * 
     * This function is an optimization for
     * [method@Gtk.SelectionModel.get_selection] when you are only
     * interested in part of the model's selected state. A common use
     * case is in response to the [signal@Gtk.SelectionModel::selection-changed]
     * signal.
     */
    public default Bitset getSelectionInRange(int position, int nItems) {
        var RESULT = gtk_h.gtk_selection_model_get_selection_in_range(handle(), position, nItems);
        return new Bitset(References.get(RESULT, true));
    }
    
    /**
     * Checks if the given item is selected.
     */
    public default boolean isSelected(int position) {
        var RESULT = gtk_h.gtk_selection_model_is_selected(handle(), position);
        return (RESULT != 0);
    }
    
    /**
     * Requests to select all items in the model.
     */
    public default boolean selectAll() {
        var RESULT = gtk_h.gtk_selection_model_select_all(handle());
        return (RESULT != 0);
    }
    
    /**
     * Requests to select an item in the model.
     */
    public default boolean selectItem(int position, boolean unselectRest) {
        var RESULT = gtk_h.gtk_selection_model_select_item(handle(), position, unselectRest ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Requests to select a range of items in the model.
     */
    public default boolean selectRange(int position, int nItems, boolean unselectRest) {
        var RESULT = gtk_h.gtk_selection_model_select_range(handle(), position, nItems, unselectRest ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Helper function for implementations of `GtkSelectionModel`.
     * 
     * Call this when a the selection changes to emit the
     * [signal@Gtk.SelectionModel::selection-changed] signal.
     */
    public default void selectionChanged(int position, int nItems) {
        gtk_h.gtk_selection_model_selection_changed(handle(), position, nItems);
    }
    
    /**
     * Make selection changes.
     * 
     * This is the most advanced selection updating method that allows
     * the most fine-grained control over selection changes. If you can,
     * you should try the simpler versions, as implementations are more
     * likely to implement support for those.
     * 
     * Requests that the selection state of all positions set in @mask
     * be updated to the respective value in the @selected bitmask.
     * 
     * In pseudocode, it would look something like this:
     * 
     * ```c
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
     * ```
     * 
     * @mask and @selected must not be modified. They may refer to the
     * same bitset, which would mean that every item in the set should
     * be selected.
     */
    public default boolean setSelection(Bitset selected, Bitset mask) {
        var RESULT = gtk_h.gtk_selection_model_set_selection(handle(), selected.handle(), mask.handle());
        return (RESULT != 0);
    }
    
    /**
     * Requests to unselect all items in the model.
     */
    public default boolean unselectAll() {
        var RESULT = gtk_h.gtk_selection_model_unselect_all(handle());
        return (RESULT != 0);
    }
    
    /**
     * Requests to unselect an item in the model.
     */
    public default boolean unselectItem(int position) {
        var RESULT = gtk_h.gtk_selection_model_unselect_item(handle(), position);
        return (RESULT != 0);
    }
    
    /**
     * Requests to unselect a range of items in the model.
     */
    public default boolean unselectRange(int position, int nItems) {
        var RESULT = gtk_h.gtk_selection_model_unselect_range(handle(), position, nItems);
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface SelectionChangedHandler {
        void signalReceived(SelectionModel source, int position, int nItems);
    }
    
    /**
     * Emitted when the selection state of some of the items in @model changes.
     * 
     * Note that this signal does not specify the new selection state of the
     * items, they need to be queried manually. It is also not necessary for
     * a model to change the selection state of any of the items in the selection
     * model, though it would be rather useless to emit such a signal.
     */
    public default void onSelectionChanged(SelectionChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSelectionModelSelectionChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("selection-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class SelectionModelImpl extends org.gtk.gobject.Object implements SelectionModel {
        public SelectionModelImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
