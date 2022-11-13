package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * the selection functions do <em>not</em> indicate if selection or unselection happened.
 * They are only meant to indicate complete failure, like when this mode of
 * selecting is not supported by the model.
 * <p>
 * Selections may happen asynchronously, so the only reliable way to find out
 * when an item was selected is to listen to the signals that indicate selection.
 */
public interface SelectionModel extends io.github.jwharm.javagi.Proxy {
    
    /**
     * Cast object to SelectionModel if its GType is a (or inherits from) "GtkSelectionModel".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SelectionModel} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSelectionModel", a ClassCastException will be thrown.
     */
    public static SelectionModel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkSelectionModel"))) {
            return new SelectionModelImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSelectionModel");
        }
    }
    
    /**
     * Gets the set containing all currently selected items in the model.
     * <p>
     * This function may be slow, so if you are only interested in single item,
     * consider using {@link SelectionModel#isSelected} or if you are only
     * interested in a few, consider {@link SelectionModel#getSelectionInRange}.
     * @return a {@code GtkBitset} containing all the values currently
     *   selected in {@code model}. If no items are selected, the bitset is empty.
     *   The bitset must not be modified.
     */
    default @NotNull org.gtk.gtk.Bitset getSelection() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_selection_model_get_selection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Bitset(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the set of selected items in a range.
     * <p>
     * This function is an optimization for
     * {@link SelectionModel#getSelection} when you are only
     * interested in part of the model's selected state. A common use
     * case is in response to the {@code Gtk.SelectionModel::selection-changed}
     * signal.
     * @param position start of the queired range
     * @param nItems number of items in the queried range
     * @return A {@code GtkBitset} that matches the selection state
     *   for the given range with all other values being undefined.
     *   The bitset must not be modified.
     */
    default @NotNull org.gtk.gtk.Bitset getSelectionInRange(int position, int nItems) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_selection_model_get_selection_in_range.invokeExact(
                    handle(),
                    position,
                    nItems);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Bitset(RESULT, Ownership.FULL);
    }
    
    /**
     * Checks if the given item is selected.
     * @param position the position of the item to query
     * @return {@code true} if the item is selected
     */
    default boolean isSelected(int position) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_selection_model_is_selected.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Requests to select all items in the model.
     * @return {@code true} if this action was supported and no fallback should be
     *   tried. This does not mean that all items are now selected.
     */
    default boolean selectAll() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_selection_model_select_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Requests to select an item in the model.
     * @param position the position of the item to select
     * @param unselectRest whether previously selected items should be unselected
     * @return {@code true} if this action was supported and no fallback should be
     *   tried. This does not mean the item was selected.
     */
    default boolean selectItem(int position, boolean unselectRest) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_selection_model_select_item.invokeExact(
                    handle(),
                    position,
                    unselectRest ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Requests to select a range of items in the model.
     * @param position the first item to select
     * @param nItems the number of items to select
     * @param unselectRest whether previously selected items should be unselected
     * @return {@code true} if this action was supported and no fallback should be
     *   tried. This does not mean the range was selected.
     */
    default boolean selectRange(int position, int nItems, boolean unselectRest) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_selection_model_select_range.invokeExact(
                    handle(),
                    position,
                    nItems,
                    unselectRest ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Helper function for implementations of {@code GtkSelectionModel}.
     * <p>
     * Call this when a the selection changes to emit the
     * {@code Gtk.SelectionModel::selection-changed} signal.
     * @param position the first changed item
     * @param nItems the number of changed items
     */
    default void selectionChanged(int position, int nItems) {
        try {
            DowncallHandles.gtk_selection_model_selection_changed.invokeExact(
                    handle(),
                    position,
                    nItems);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param selected bitmask specifying if items should be selected or unselected
     * @param mask bitmask specifying which items should be updated
     * @return {@code true} if this action was supported and no fallback should be
     *   tried. This does not mean that all items were updated according
     *   to the inputs.
     */
    default boolean setSelection(@NotNull org.gtk.gtk.Bitset selected, @NotNull org.gtk.gtk.Bitset mask) {
        java.util.Objects.requireNonNull(selected, "Parameter 'selected' must not be null");
        java.util.Objects.requireNonNull(mask, "Parameter 'mask' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_selection_model_set_selection.invokeExact(
                    handle(),
                    selected.handle(),
                    mask.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Requests to unselect all items in the model.
     * @return {@code true} if this action was supported and no fallback should be
     *   tried. This does not mean that all items are now unselected.
     */
    default boolean unselectAll() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_selection_model_unselect_all.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Requests to unselect an item in the model.
     * @param position the position of the item to unselect
     * @return {@code true} if this action was supported and no fallback should be
     *   tried. This does not mean the item was unselected.
     */
    default boolean unselectItem(int position) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_selection_model_unselect_item.invokeExact(
                    handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Requests to unselect a range of items in the model.
     * @param position the first item to unselect
     * @param nItems the number of items to unselect
     * @return {@code true} if this action was supported and no fallback should be
     *   tried. This does not mean the range was unselected.
     */
    default boolean unselectRange(int position, int nItems) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_selection_model_unselect_range.invokeExact(
                    handle(),
                    position,
                    nItems);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface SelectionChanged {
        void signalReceived(SelectionModel source, int position, int nItems);
    }
    
    /**
     * Emitted when the selection state of some of the items in {@code model} changes.
     * <p>
     * Note that this signal does not specify the new selection state of the
     * items, they need to be queried manually. It is also not necessary for
     * a model to change the selection state of any of the items in the selection
     * model, though it would be rather useless to emit such a signal.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<SelectionModel.SelectionChanged> onSelectionChanged(SelectionModel.SelectionChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("selection-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(SelectionModel.Callbacks.class, "signalSelectionModelSelectionChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<SelectionModel.SelectionChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_selection_model_get_selection = Interop.downcallHandle(
            "gtk_selection_model_get_selection",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_selection_model_get_selection_in_range = Interop.downcallHandle(
            "gtk_selection_model_get_selection_in_range",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_selection_model_is_selected = Interop.downcallHandle(
            "gtk_selection_model_is_selected",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_selection_model_select_all = Interop.downcallHandle(
            "gtk_selection_model_select_all",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_selection_model_select_item = Interop.downcallHandle(
            "gtk_selection_model_select_item",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_selection_model_select_range = Interop.downcallHandle(
            "gtk_selection_model_select_range",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_selection_model_selection_changed = Interop.downcallHandle(
            "gtk_selection_model_selection_changed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_selection_model_set_selection = Interop.downcallHandle(
            "gtk_selection_model_set_selection",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_selection_model_unselect_all = Interop.downcallHandle(
            "gtk_selection_model_unselect_all",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_selection_model_unselect_item = Interop.downcallHandle(
            "gtk_selection_model_unselect_item",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_selection_model_unselect_range = Interop.downcallHandle(
            "gtk_selection_model_unselect_range",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalSelectionModelSelectionChanged(MemoryAddress source, int position, int nItems, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (SelectionModel.SelectionChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new SelectionModel.SelectionModelImpl(source, Ownership.UNKNOWN), position, nItems);
        }
    }
    
    class SelectionModelImpl extends org.gtk.gobject.Object implements SelectionModel {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public SelectionModelImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
