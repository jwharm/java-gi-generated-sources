package org.gtk.gtk;

/**
 * A function to set the properties of a cell instead of just using the
 * straight mapping between the cell and the model.
 * 
 * This function is useful for customizing the cell renderer. For example,
 * a function might get an* integer from the @tree_model, and render it to
 * the “text” attribute of “cell” by converting it to its written equivalent.
 * 
 * See also: gtk_tree_view_column_set_cell_data_func()
 */
@FunctionalInterface
public interface TreeCellDataFunc {
        void onTreeCellDataFunc(TreeViewColumn treeColumn, CellRenderer cell, TreeModel treeModel, TreeIter iter);
}
