package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The interface for sortable models used by GtkTreeView
 * 
 * `GtkTreeSortable` is an interface to be implemented by tree models which
 * support sorting. The `GtkTreeView` uses the methods provided by this interface
 * to sort the model.
 */
public interface TreeSortable extends io.github.jwharm.javagi.interop.NativeAddress {

    /**
     * Returns %TRUE if the model has a default sort function. This is used
     * primarily by GtkTreeViewColumns in order to determine if a model can
     * go back to the default state, or not.
     */
    public default boolean hasDefaultSortFunc() {
        var RESULT = gtk_h.gtk_tree_sortable_has_default_sort_func(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the current sort column to be @sort_column_id. The @sortable will
     * resort itself to reflect this change, after emitting a
     * `GtkTreeSortable::sort-column-changed` signal. @sort_column_id may either be
     * a regular column id, or one of the following special values:
     * 
     * - %GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID: the default sort function
     *   will be used, if it is set
     * 
     * - %GTK_TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID: no sorting will occur
     */
    public default void setSortColumnId(int sortColumnId, SortType order) {
        gtk_h.gtk_tree_sortable_set_sort_column_id(handle(), sortColumnId, order.getValue());
    }
    
    /**
     * Emits a `GtkTreeSortable::sort-column-changed` signal on @sortable.
     */
    public default void sortColumnChanged() {
        gtk_h.gtk_tree_sortable_sort_column_changed(handle());
    }
    
    @FunctionalInterface
    public interface SortColumnChangedHandler {
        void signalReceived(TreeSortable source);
    }
    
    /**
     * The ::sort-column-changed signal is emitted when the sort column
     * or sort order of @sortable is changed. The signal is emitted before
     * the contents of @sortable are resorted.
     */
    public default void onSortColumnChanged(SortColumnChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTreeSortableSortColumnChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("sort-column-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    class TreeSortableImpl extends org.gtk.gobject.Object implements TreeSortable {
        public TreeSortableImpl(io.github.jwharm.javagi.interop.Reference reference) {
            super(reference);
        }
    }
}
