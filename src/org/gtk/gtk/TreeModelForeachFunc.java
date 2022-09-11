package org.gtk.gtk;

/**
 * Type of the callback passed to gtk_tree_model_foreach() to
 * iterate over the rows in a tree model.
 */
@FunctionalInterface
public interface TreeModelForeachFunc {
        boolean onTreeModelForeachFunc(TreeModel model, TreePath path, TreeIter iter);
}
