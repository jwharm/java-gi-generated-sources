package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkTreeListRowSorter</code> is a special-purpose sorter that will apply a given
 * sorter to the levels in a tree.
 * <p>
 * Here is an example for setting up a column view with a tree model and
 * a <code>GtkTreeListSorter</code>:
 * <p><pre>c
 * column_sorter = gtk_column_view_get_sorter (view);
 * sorter = gtk_tree_list_row_sorter_new (g_object_ref (column_sorter));
 * sort_model = gtk_sort_list_model_new (tree_model, sorter);
 * selection = gtk_single_selection_new (sort_model);
 * gtk_column_view_set_model (view, G_LIST_MODEL (selection));
 * </pre>
 */
public class TreeListRowSorter extends Sorter {

    public TreeListRowSorter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeListRowSorter */
    public static TreeListRowSorter castFrom(org.gtk.gobject.Object gobject) {
        return new TreeListRowSorter(gobject.getReference());
    }
    
    private static Reference constructNew(Sorter sorter) {
        Reference RESULT = References.get(gtk_h.gtk_tree_list_row_sorter_new(sorter.getReference().unowned().handle()), true);
        return RESULT;
    }
    
    /**
     * Create a special-purpose sorter that applies the sorting
     * of @sorter to the levels of a <code>GtkTreeListModel</code>.
     * 
     * Note that this sorter relies on {@link [property@Gtk.TreeListModel:passthrough] (ref=property)}
     * being <code>false</code> as it can only sort {@link org.gtk.gtk.TreeListRow}s.
     */
    public TreeListRowSorter(Sorter sorter) {
        super(constructNew(sorter));
    }
    
    /**
     * Returns the sorter used by @self.
     */
    public Sorter getSorter() {
        var RESULT = gtk_h.gtk_tree_list_row_sorter_get_sorter(handle());
        return new Sorter(References.get(RESULT, false));
    }
    
    /**
     * Sets the sorter to use for items with the same parent.
     * 
     * This sorter will be passed the {@link [property@Gtk.TreeListRow:item] (ref=property)} of
     * the tree list rows passed to @self.
     */
    public void setSorter(Sorter sorter) {
        gtk_h.gtk_tree_list_row_sorter_set_sorter(handle(), sorter.handle());
    }
    
}
