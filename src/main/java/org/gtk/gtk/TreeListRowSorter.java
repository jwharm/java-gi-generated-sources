package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkTreeListRowSorter} is a special-purpose sorter that will apply a given
 * sorter to the levels in a tree.
 * <p>
 * Here is an example for setting up a column view with a tree model and
 * a {@code GtkTreeListSorter}:
 * <pre>{@code c
 * column_sorter = gtk_column_view_get_sorter (view);
 * sorter = gtk_tree_list_row_sorter_new (g_object_ref (column_sorter));
 * sort_model = gtk_sort_list_model_new (tree_model, sorter);
 * selection = gtk_single_selection_new (sort_model);
 * gtk_column_view_set_model (view, G_LIST_MODEL (selection));
 * }</pre>
 */
public class TreeListRowSorter extends org.gtk.gtk.Sorter {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public TreeListRowSorter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeListRowSorter */
    public static TreeListRowSorter castFrom(org.gtk.gobject.Object gobject) {
        return new TreeListRowSorter(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gtk.gtk.Sorter sorter) {
        java.util.Objects.requireNonNullElse(sorter, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_tree_list_row_sorter_new.invokeExact(sorter.refcounted().unowned().handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a special-purpose sorter that applies the sorting
     * of {@code sorter} to the levels of a {@code GtkTreeListModel}.
     * <p>
     * Note that this sorter relies on {@code Gtk.TreeListModel:passthrough}
     * being {@code false} as it can only sort {@link TreeListRow}s.
     * @param sorter a {@code GtkSorter}
     */
    public TreeListRowSorter(@Nullable org.gtk.gtk.Sorter sorter) {
        super(constructNew(sorter));
    }
    
    /**
     * Returns the sorter used by {@code self}.
     * @return the sorter used
     */
    public @Nullable org.gtk.gtk.Sorter getSorter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_tree_list_row_sorter_get_sorter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Sorter(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the sorter to use for items with the same parent.
     * <p>
     * This sorter will be passed the {@code Gtk.TreeListRow:item} of
     * the tree list rows passed to {@code self}.
     * @param sorter The sorter to use
     */
    public void setSorter(@Nullable org.gtk.gtk.Sorter sorter) {
        java.util.Objects.requireNonNullElse(sorter, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_tree_list_row_sorter_set_sorter.invokeExact(handle(), sorter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_tree_list_row_sorter_new = Interop.downcallHandle(
            "gtk_tree_list_row_sorter_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_list_row_sorter_get_sorter = Interop.downcallHandle(
            "gtk_tree_list_row_sorter_get_sorter",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_tree_list_row_sorter_set_sorter = Interop.downcallHandle(
            "gtk_tree_list_row_sorter_set_sorter",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
