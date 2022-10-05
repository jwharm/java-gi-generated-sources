package org.gtk.gtk;

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
public interface TreeSortable extends io.github.jwharm.javagi.Proxy {

    static final MethodHandle gtk_tree_sortable_get_sort_column_id = Interop.downcallHandle(
        "gtk_tree_sortable_get_sort_column_id",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Fills in {@code sort_column_id} and {@code order} with the current sort column and the
     * order. It returns {@code true} unless the {@code sort_column_id} is
     * {@code GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID} or
     * {@code GTK_TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID}.
     */
    public default boolean getSortColumnId(PointerInteger sortColumnId, SortType order) {
        try {
            var RESULT = (int) gtk_tree_sortable_get_sort_column_id.invokeExact(handle(), sortColumnId.handle(), new PointerInteger(order.getValue()).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_sortable_has_default_sort_func = Interop.downcallHandle(
        "gtk_tree_sortable_has_default_sort_func",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if the model has a default sort function. This is used
     * primarily by GtkTreeViewColumns in order to determine if a model can
     * go back to the default state, or not.
     */
    public default boolean hasDefaultSortFunc() {
        try {
            var RESULT = (int) gtk_tree_sortable_has_default_sort_func.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_sortable_set_default_sort_func = Interop.downcallHandle(
        "gtk_tree_sortable_set_default_sort_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
            gtk_tree_sortable_set_default_sort_func.invokeExact(handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(sortFunc.hashCode(), sortFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_sortable_set_sort_column_id = Interop.downcallHandle(
        "gtk_tree_sortable_set_sort_column_id",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
        try {
            gtk_tree_sortable_set_sort_column_id.invokeExact(handle(), sortColumnId, order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_sortable_set_sort_func = Interop.downcallHandle(
        "gtk_tree_sortable_set_sort_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the comparison function used when sorting to be {@code sort_func}. If the
     * current sort column id of {@code sortable} is the same as {@code sort_column_id}, then
     * the model will sort using this function.
     */
    public default void setSortFunc(int sortColumnId, TreeIterCompareFunc sortFunc) {
        try {
            gtk_tree_sortable_set_sort_func.invokeExact(handle(), sortColumnId, 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbTreeIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(sortFunc.hashCode(), sortFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_sortable_sort_column_changed = Interop.downcallHandle(
        "gtk_tree_sortable_sort_column_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Emits a {@code GtkTreeSortable::sort-column-changed} signal on {@code sortable}.
     */
    public default void sortColumnChanged() {
        try {
            gtk_tree_sortable_sort_column_changed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("sort-column-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeSortable.Callbacks.class, "signalTreeSortableSortColumnChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalTreeSortableSortColumnChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TreeSortable.SortColumnChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TreeSortable.TreeSortableImpl(Refcounted.get(source)));
        }
        
    }
    
    class TreeSortableImpl extends org.gtk.gobject.Object implements TreeSortable {
        public TreeSortableImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
