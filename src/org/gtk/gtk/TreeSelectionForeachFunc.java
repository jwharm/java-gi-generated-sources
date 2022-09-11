package org.gtk.gtk;

/**
 * A function used by gtk_tree_selection_selected_foreach() to map all
 * selected rows.  It will be called on every selected row in the view.
 */
@FunctionalInterface
public interface TreeSelectionForeachFunc {
        void onTreeSelectionForeachFunc(TreeModel model, TreePath path, TreeIter iter);
}
