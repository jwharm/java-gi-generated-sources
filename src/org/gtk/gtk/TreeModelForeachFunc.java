package org.gtk.gtk;

@FunctionalInterface
public interface TreeModelForeachFunc {

    /**
     * Type of the callback passed to gtk_tree_model_foreach() to
     * iterate over the rows in a tree model.
     */
    public boolean onTreeModelForeachFunc(TreeModel model, TreePath path, TreeIter iter, jdk.incubator.foreign.MemoryAddress data);
}
