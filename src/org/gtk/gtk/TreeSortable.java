package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The interface for sortable models used by GtkTreeView
 * <p>
 * {@code GtkTreeSortable} is an interface to be implemented by tree models which
 * support sorting. The {@code GtkTreeView} uses the methods provided by this interface
 * to sort the model.
 */
public interface TreeSortable extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Returns {@code true} if the model has a default sort function. This is used
     * primarily by GtkTreeViewColumns in order to determine if a model can
     * go back to the default state, or not.
     */
    public default boolean hasDefaultSortFunc() {
        var RESULT = gtk_h.gtk_tree_sortable_has_default_sort_func(handle());
        return (RESULT != 0);
    }
    
    /**
     * Sets the default comparison function used when sorting to be {@code sort_func}.
     * If the current sort column id of {@code sortable} is
     * {@code GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID}, then the model will sort using
     * this function.
     * <p>
     * If {@code sort_func} is {@code null}, then there will be no default comparison function.
     * This means that once the model  has been sorted, it can’t go back to the
     * default state. In this case, when the current sort column id of {@code sortable}
     * is {@code GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID}, the model will be unsorted.
     */
    public default void setDefaultSortFunc(TreeIterCompareFunc sortFunc) {
        try {
            gtk_h.gtk_tree_sortable_set_default_sort_func(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(sortFunc.hashCode(), sortFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Sets the current sort column to be {@code sort_column_id}. The {@code sortable} will
     * resort itself to reflect this change, after emitting a
     * {@code GtkTreeSortable::sort-column-changed} signal. {@code sort_column_id} may either be
     * a regular column id, or one of the following special values:
     * <p>
     * <ul>
     * <li>{@code GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID}: the default sort function
     *   will be used, if it is set
     * </ul>
     * <p>
     * <ul>
     * <li>{@code GTK_TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID}: no sorting will occur
     */
    public default void setSortColumnId(int sortColumnId, SortType order) {
        gtk_h.gtk_tree_sortable_set_sort_column_id(handle(), sortColumnId, order.getValue());
    }
    
    /**
     * Sets the comparison function used when sorting to be {@code sort_func}. If the
     * current sort column id of {@code sortable} is the same as {@code sort_column_id}, then
     * the model will sort using this function.
     */
    public default void setSortFunc(int sortColumnId, TreeIterCompareFunc sortFunc) {
        try {
            gtk_h.gtk_tree_sortable_set_sort_func(handle(), sortColumnId, 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(sortFunc.hashCode(), sortFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Emits a {@code GtkTreeSortable::sort-column-changed} signal on {@code sortable}.
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
     * or sort order of {@code sortable} is changed. The signal is emitted before
     * the contents of {@code sortable} are resorted.
     */
    public default SignalHandle onSortColumnChanged(SortColumnChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("sort-column-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeSortable.class, "__signalTreeSortableSortColumnChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalTreeSortableSortColumnChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (TreeSortable.SortColumnChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new TreeSortable.TreeSortableImpl(References.get(source)));
    }
    
    class TreeSortableImpl extends org.gtk.gobject.Object implements TreeSortable {
        public TreeSortableImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
