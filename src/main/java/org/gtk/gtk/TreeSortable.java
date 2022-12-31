package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The interface for sortable models used by GtkTreeView
 * <p>
 * {@code GtkTreeSortable} is an interface to be implemented by tree models which
 * support sorting. The {@code GtkTreeView} uses the methods provided by this interface
 * to sort the model.
 */
public interface TreeSortable extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeSortableImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TreeSortableImpl(input, ownership);
    
    /**
     * Fills in {@code sort_column_id} and {@code order} with the current sort column and the
     * order. It returns {@code true} unless the {@code sort_column_id} is
     * {@code GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID} or
     * {@code GTK_TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID}.
     * @param sortColumnId The sort column id to be filled in
     * @param order The {@code GtkSortType} to be filled in
     * @return {@code true} if the sort column is not one of the special sort
     *   column ids.
     */
    default boolean getSortColumnId(Out<Integer> sortColumnId, Out<org.gtk.gtk.SortType> order) {
        MemorySegment sortColumnIdPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemorySegment orderPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_sortable_get_sort_column_id.invokeExact(
                    handle(),
                    (Addressable) sortColumnIdPOINTER.address(),
                    (Addressable) orderPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sortColumnId.set(sortColumnIdPOINTER.get(Interop.valueLayout.C_INT, 0));
        order.set(org.gtk.gtk.SortType.of(orderPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns {@code true} if the model has a default sort function. This is used
     * primarily by GtkTreeViewColumns in order to determine if a model can
     * go back to the default state, or not.
     * @return {@code true}, if the model has a default sort function
     */
    default boolean hasDefaultSortFunc() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_sortable_has_default_sort_func.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
     * @param sortFunc The comparison function
     * @param destroy Destroy notifier of {@code user_data}
     */
    default void setDefaultSortFunc(org.gtk.gtk.TreeIterCompareFunc sortFunc, @Nullable org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_tree_sortable_set_default_sort_func.invokeExact(
                    handle(),
                    (Addressable) sortFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the current sort column to be {@code sort_column_id}. The {@code sortable} will
     * resort itself to reflect this change, after emitting a
     * {@code GtkTreeSortable::sort-column-changed} signal. {@code sort_column_id} may either be
     * a regular column id, or one of the following special values:
     * <ul>
     * <li>{@code GTK_TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID}: the default sort function
     *   will be used, if it is set
     * </ul>
     * <ul>
     * <li>{@code GTK_TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID}: no sorting will occur
     * </ul>
     * @param sortColumnId the sort column id to set
     * @param order The sort order of the column
     */
    default void setSortColumnId(int sortColumnId, org.gtk.gtk.SortType order) {
        try {
            DowncallHandles.gtk_tree_sortable_set_sort_column_id.invokeExact(
                    handle(),
                    sortColumnId,
                    order.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the comparison function used when sorting to be {@code sort_func}. If the
     * current sort column id of {@code sortable} is the same as {@code sort_column_id}, then
     * the model will sort using this function.
     * @param sortColumnId the sort column id to set the function for
     * @param sortFunc The comparison function
     * @param destroy Destroy notifier of {@code user_data}
     */
    default void setSortFunc(int sortColumnId, org.gtk.gtk.TreeIterCompareFunc sortFunc, @Nullable org.gtk.glib.DestroyNotify destroy) {
        try {
            DowncallHandles.gtk_tree_sortable_set_sort_func.invokeExact(
                    handle(),
                    sortColumnId,
                    (Addressable) sortFunc.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) (destroy == null ? MemoryAddress.NULL : (Addressable) destroy.toCallback()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits a {@code GtkTreeSortable::sort-column-changed} signal on {@code sortable}.
     */
    default void sortColumnChanged() {
        try {
            DowncallHandles.gtk_tree_sortable_sort_column_changed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_tree_sortable_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface SortColumnChanged {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceTreeSortable) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SortColumnChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The ::sort-column-changed signal is emitted when the sort column
     * or sort order of {@code sortable} is changed. The signal is emitted before
     * the contents of {@code sortable} are resorted.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public default Signal<TreeSortable.SortColumnChanged> onSortColumnChanged(TreeSortable.SortColumnChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("sort-column-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_get_sort_column_id = Interop.downcallHandle(
            "gtk_tree_sortable_get_sort_column_id",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_has_default_sort_func = Interop.downcallHandle(
            "gtk_tree_sortable_has_default_sort_func",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_set_default_sort_func = Interop.downcallHandle(
            "gtk_tree_sortable_set_default_sort_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_set_sort_column_id = Interop.downcallHandle(
            "gtk_tree_sortable_set_sort_column_id",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_set_sort_func = Interop.downcallHandle(
            "gtk_tree_sortable_set_sort_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_sort_column_changed = Interop.downcallHandle(
            "gtk_tree_sortable_sort_column_changed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_get_type = Interop.downcallHandle(
            "gtk_tree_sortable_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class TreeSortableImpl extends org.gtk.gobject.GObject implements TreeSortable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public TreeSortableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
