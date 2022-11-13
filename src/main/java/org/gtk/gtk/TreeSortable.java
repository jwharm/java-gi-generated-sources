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
    
    /**
     * Cast object to TreeSortable if its GType is a (or inherits from) "GtkTreeSortable".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TreeSortable} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTreeSortable", a ClassCastException will be thrown.
     */
    public static TreeSortable castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkTreeSortable"))) {
            return new TreeSortableImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkTreeSortable");
        }
    }
    
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
    default boolean getSortColumnId(Out<Integer> sortColumnId, @NotNull Out<org.gtk.gtk.SortType> order) {
        java.util.Objects.requireNonNull(sortColumnId, "Parameter 'sortColumnId' must not be null");
        java.util.Objects.requireNonNull(order, "Parameter 'order' must not be null");
        MemorySegment sortColumnIdPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment orderPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_tree_sortable_get_sort_column_id.invokeExact(
                    handle(),
                    (Addressable) sortColumnIdPOINTER.address(),
                    (Addressable) orderPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sortColumnId.set(sortColumnIdPOINTER.get(ValueLayout.JAVA_INT, 0));
        order.set(new org.gtk.gtk.SortType(orderPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return RESULT != 0;
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
        return RESULT != 0;
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
     */
    default void setDefaultSortFunc(@NotNull org.gtk.gtk.TreeIterCompareFunc sortFunc) {
        java.util.Objects.requireNonNull(sortFunc, "Parameter 'sortFunc' must not be null");
        try {
            DowncallHandles.gtk_tree_sortable_set_default_sort_func.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbTreeIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(sortFunc)),
                    Interop.cbDestroyNotifySymbol());
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
    default void setSortColumnId(int sortColumnId, @NotNull org.gtk.gtk.SortType order) {
        java.util.Objects.requireNonNull(order, "Parameter 'order' must not be null");
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
     */
    default void setSortFunc(int sortColumnId, @NotNull org.gtk.gtk.TreeIterCompareFunc sortFunc) {
        java.util.Objects.requireNonNull(sortFunc, "Parameter 'sortFunc' must not be null");
        try {
            DowncallHandles.gtk_tree_sortable_set_sort_func.invokeExact(
                    handle(),
                    sortColumnId,
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbTreeIterCompareFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(sortFunc)),
                    Interop.cbDestroyNotifySymbol());
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
    
    @FunctionalInterface
    public interface SortColumnChanged {
        void signalReceived(TreeSortable source);
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
                handle(),
                Interop.allocateNativeString("sort-column-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TreeSortable.Callbacks.class, "signalTreeSortableSortColumnChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TreeSortable.SortColumnChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_get_sort_column_id = Interop.downcallHandle(
            "gtk_tree_sortable_get_sort_column_id",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_has_default_sort_func = Interop.downcallHandle(
            "gtk_tree_sortable_has_default_sort_func",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_set_default_sort_func = Interop.downcallHandle(
            "gtk_tree_sortable_set_default_sort_func",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_set_sort_column_id = Interop.downcallHandle(
            "gtk_tree_sortable_set_sort_column_id",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_set_sort_func = Interop.downcallHandle(
            "gtk_tree_sortable_set_sort_func",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gtk_tree_sortable_sort_column_changed = Interop.downcallHandle(
            "gtk_tree_sortable_sort_column_changed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
    
    @ApiStatus.Internal
    static class Callbacks {
        
        public static void signalTreeSortableSortColumnChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TreeSortable.SortColumnChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TreeSortable.TreeSortableImpl(source, Ownership.UNKNOWN));
        }
    }
    
    class TreeSortableImpl extends org.gtk.gobject.Object implements TreeSortable {
        
        static {
            Gtk.javagi$ensureInitialized();
        }
        
        public TreeSortableImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
