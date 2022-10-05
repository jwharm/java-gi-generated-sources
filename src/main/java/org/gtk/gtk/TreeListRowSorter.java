package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkTreeListRowSorter} is a special-purpose sorter that will apply a given
 * sorter to the levels in a tree.
 * <p>
 * Here is an example for setting up a column view with a tree model and
 * a {@code GtkTreeListSorter}:
 * <p>
 * <pre>{@code c
 * column_sorter = gtk_column_view_get_sorter (view);
 * sorter = gtk_tree_list_row_sorter_new (g_object_ref (column_sorter));
 * sort_model = gtk_sort_list_model_new (tree_model, sorter);
 * selection = gtk_single_selection_new (sort_model);
 * gtk_column_view_set_model (view, G_LIST_MODEL (selection));
 * }</pre>
 */
public class TreeListRowSorter extends Sorter {

    public TreeListRowSorter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TreeListRowSorter */
    public static TreeListRowSorter castFrom(org.gtk.gobject.Object gobject) {
        return new TreeListRowSorter(gobject.refcounted());
    }
    
    static final MethodHandle gtk_tree_list_row_sorter_new = Interop.downcallHandle(
        "gtk_tree_list_row_sorter_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(Sorter sorter) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_tree_list_row_sorter_new.invokeExact(sorter.refcounted().unowned().handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a special-purpose sorter that applies the sorting
     * of {@code sorter} to the levels of a {@code GtkTreeListModel}.
     * <p>
     * Note that this sorter relies on {@code Gtk.TreeListModel:passthrough}
     * being {@code false} as it can only sort {@link TreeListRow}s.
     */
    public TreeListRowSorter(Sorter sorter) {
        super(constructNew(sorter));
    }
    
    static final MethodHandle gtk_tree_list_row_sorter_get_sorter = Interop.downcallHandle(
        "gtk_tree_list_row_sorter_get_sorter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the sorter used by {@code self}.
     */
    public Sorter getSorter() {
        try {
            var RESULT = (MemoryAddress) gtk_tree_list_row_sorter_get_sorter.invokeExact(handle());
            return new Sorter(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_tree_list_row_sorter_set_sorter = Interop.downcallHandle(
        "gtk_tree_list_row_sorter_set_sorter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the sorter to use for items with the same parent.
     * <p>
     * This sorter will be passed the {@code Gtk.TreeListRow:item} of
     * the tree list rows passed to {@code self}.
     */
    public void setSorter(Sorter sorter) {
        try {
            gtk_tree_list_row_sorter_set_sorter.invokeExact(handle(), sorter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
