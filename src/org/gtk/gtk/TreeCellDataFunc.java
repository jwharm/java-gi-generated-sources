package org.gtk.gtk;

/**
 * A function to set the properties of a cell instead of just using the
 * straight mapping between the cell and the model.
 * 
 * This function is useful for customizing the cell renderer. For example,
 * a function might get an* integer from the @tree_model, and render it to
 * the &#8220;text&#8221; attribute of &#8220;cell&#8221; by converting it to its written equivalent.
 * 
 * See also: gtk_tree_view_column_set_cell_data_func()
 */
@FunctionalInterface
public interface TreeCellDataFunc {
        void onTreeCellDataFunc(TreeViewColumn treeColumn, CellRenderer cell, TreeModel treeModel, TreeIter iter);
}
