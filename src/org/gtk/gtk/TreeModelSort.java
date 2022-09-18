package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A GtkTreeModel which makes an underlying tree model sortable
 * <p>
 * The <code>GtkTreeModelSort</code> is a model which implements the <code>GtkTreeSortable</code>
 * interface.  It does not hold any data itself, but rather is created with
 * a child model and proxies its data.  It has identical column types to
 * this child model, and the changes in the child are propagated.  The
 * primary purpose of this model is to provide a way to sort a different
 * model without modifying it. Note that the sort function used by<code>GtkTreeModelSort</code> is not guaranteed to be stable.
 * <p>
 * The use of this is best demonstrated through an example.  In the
 * following sample code we create two <code>GtkTreeView</code> widgets each with a
 * view of the same data.  As the model is wrapped here by a<code>GtkTreeModelSort</code>, the two <code>GtkTreeView</code>s can each sort their
 * view of the data without affecting the other.  By contrast, if we
 * simply put the same model in each widget, then sorting the first would
 * sort the second.
 * <p>
 * <h2>Using a</h2><code>GtkTreeModelSort</code>
 * <p>
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
 * {
 *   GtkTreeView *tree_view1;
 *   GtkTreeView *tree_view2;
 *   GtkTreeModel *sort_model1;
 *   GtkTreeModel *sort_model2;
 *   GtkTreeModel *child_model;
 * <p>
 *   // get the child model
 *   child_model = get_my_model ();
 * <p>
 *   // Create the first tree
 *   sort_model1 = gtk_tree_model_sort_new_with_model (child_model);
 *   tree_view1 = gtk_tree_view_new_with_model (sort_model1);
 * <p>
 *   // Create the second tree
 *   sort_model2 = gtk_tree_model_sort_new_with_model (child_model);
 *   tree_view2 = gtk_tree_view_new_with_model (sort_model2);
 * <p>
 *   // Now we can sort the two models independently
 *   gtk_tree_sortable_set_sort_column_id (GTK_TREE_SORTABLE (sort_model1),
 *                                         COLUMN_1, GTK_SORT_ASCENDING);
 *   gtk_tree_sortable_set_sort_column_id (GTK_TREE_SORTABLE (sort_model2),
 *                                         COLUMN_1, GTK_SORT_DESCENDING);
 * }
 * ]}|
 * <p>
 * To demonstrate how to access the underlying child model from the sort
 * model, the next example will be a callback for the <code>GtkTreeSelection</code><code>GtkTreeSelection::changed</code> signal.  In this callback, we get a string
 * from COLUMN_1 of the model.  We then modify the string, find the same
 * selected row on the child model, and change the row there.
 * 
 * <code>#</code>  Accessing the child model of in a selection changed callback
 * 
 * |{@link [&<code>#60</code> !-- language=&<code>#34</code> C&<code>#34</code>  --&<code>#62</code> 
 * void
 * selection_changed (GtkTreeSelection *selection, gpointer data)
 * {
 *   GtkTreeModel *sort_model = NULL;
 *   GtkTreeModel *child_model;
 *   GtkTreeIter sort_iter;
 *   GtkTreeIter child_iter;
 *   char *some_data = NULL;
 *   char *modified_data;
 * 
 *   // Get the current selected row and the model.
 *   if (! gtk_tree_selection_get_selected (selection,
 *                                          &<code>#38</code> sort_model,
 *                                          &<code>#38</code> sort_iter))
 *     return;
 * 
 *   // Look up the current value on the selected row and get
 *   // a new value to change it to.
 *   gtk_tree_model_get (GTK_TREE_MODEL (sort_model), &<code>#38</code> sort_iter,
 *                       COLUMN_1, &<code>#38</code> some_data,
 *                       -1);
 * 
 *   modified_data = change_the_data (some_data);
 *   g_free (some_data);
 * 
 *   // Get an iterator on the child model, instead of the sort model.
 *   gtk_tree_model_sort_convert_iter_to_child_iter (GTK_TREE_MODEL_SORT (sort_model),
 *                                                   &<code>#38</code> child_iter,
 *                                                   &<code>#38</code> sort_iter);
 * 
 *   // Get the child model and change the value of the row. In this
 *   // example, the child model is a GtkListStore. It could be any other
 *   // type of model, though.
 *   child_model = gtk_tree_model_sort_get_model (GTK_TREE_MODEL_SORT (sort_model));
 *   gtk_list_store_set (GTK_LIST_STORE (child_model), &<code>#38</code> child_iter,
 *                       COLUMN_1, &<code>#38</code> modified_data,
 *                       -1);
 *   g_free (modified_data);
 * }
 * ]}|
 */
public class TreeModelSort extends org.gtk.gobject.Object implements TreeDragSource, TreeModel, TreeSortable {

    public TreeModelSort(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TreeModelSort */
    public static TreeModelSort castFrom(org.gtk.gobject.Object gobject) {
        return new TreeModelSort(gobject.getReference());
    }
    
    private static Reference constructNewWithModel(TreeModel childModel) {
        Reference RESULT = References.get(gtk_h.gtk_tree_model_sort_new_with_model(childModel.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkTreeModelSort</code>, with @child_model as the child model.
     */
    public static TreeModelSort newWithModel(TreeModel childModel) {
        return new TreeModelSort(constructNewWithModel(childModel));
    }
    
    /**
     * This function should almost never be called.  It clears the @tree_model_sort
     * of any cached iterators that haven&<code>#8217</code> t been reffed with
     * gtk_tree_model_ref_node().  This might be useful if the child model being
     * sorted is static (and doesn&<code>#8217</code> t change often) and there has been a lot of
     * unreffed access to nodes.  As a side effect of this function, all unreffed
     * iters will be invalid.
     */
    public void clearCache() {
        gtk_h.gtk_tree_model_sort_clear_cache(handle());
    }
    
    /**
     * Sets @sort_iter to point to the row in @tree_model_sort that corresponds to
     * the row pointed at by @child_iter.  If @sort_iter was not set, <code>false</code> is returned.  Note: a boolean is only returned since 2.14.
     */
    public boolean convertChildIterToIter(TreeIter sortIter, TreeIter childIter) {
        var RESULT = gtk_h.gtk_tree_model_sort_convert_child_iter_to_iter(handle(), sortIter.handle(), childIter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Converts @child_path to a path relative to @tree_model_sort.  That is,
     * @child_path points to a path in the child model.  The returned path will
     * point to the same row in the sorted model.  If @child_path isn&<code>#8217</code> t a valid
     * path on the child model, then <code>null</code> is returned.
     */
    public TreePath convertChildPathToPath(TreePath childPath) {
        var RESULT = gtk_h.gtk_tree_model_sort_convert_child_path_to_path(handle(), childPath.handle());
        return new TreePath(References.get(RESULT, true));
    }
    
    /**
     * Sets @child_iter to point to the row pointed to by @sorted_iter.
     */
    public void convertIterToChildIter(TreeIter childIter, TreeIter sortedIter) {
        gtk_h.gtk_tree_model_sort_convert_iter_to_child_iter(handle(), childIter.handle(), sortedIter.handle());
    }
    
    /**
     * Converts @sorted_path to a path on the child model of @tree_model_sort.
     * That is, @sorted_path points to a location in @tree_model_sort.  The
     * returned path will point to the same location in the model not being
     * sorted.  If @sorted_path does not point to a location in the child model,
     * <code>null</code> is returned.
     */
    public TreePath convertPathToChildPath(TreePath sortedPath) {
        var RESULT = gtk_h.gtk_tree_model_sort_convert_path_to_child_path(handle(), sortedPath.handle());
        return new TreePath(References.get(RESULT, true));
    }
    
    /**
     * Returns the model the <code>GtkTreeModelSort</code> is sorting.
     */
    public TreeModel getModel() {
        var RESULT = gtk_h.gtk_tree_model_sort_get_model(handle());
        return new TreeModel.TreeModelImpl(References.get(RESULT, false));
    }
    
    /**
     * &<code>#62</code>  This function is slow. Only use it for debugging and/or testing
     * &<code>#62</code>  purposes.
     * <p>
     * Checks if the given iter is a valid iter for this <code>GtkTreeModelSort</code>.
     */
    public boolean iterIsValid(TreeIter iter) {
        var RESULT = gtk_h.gtk_tree_model_sort_iter_is_valid(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * This resets the default sort function to be in the &<code>#8220</code> unsorted&<code>#8221</code>  state.  That
     * is, it is in the same order as the child model. It will re-sort the model
     * to be in the same order as the child model only if the <code>GtkTreeModelSort</code>
     * is in &<code>#8220</code> unsorted&<code>#8221</code>  state.
     */
    public void resetDefaultSortFunc() {
        gtk_h.gtk_tree_model_sort_reset_default_sort_func(handle());
    }
    
}
