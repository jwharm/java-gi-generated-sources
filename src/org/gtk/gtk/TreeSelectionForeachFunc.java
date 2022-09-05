package org.gtk.gtk;

@FunctionalInterface
public interface TreeSelectionForeachFunc {

    /**
     * A function used by gtk_tree_selection_selected_foreach() to map all
     * selected rows.  It will be called on every selected row in the view.
     */
    public void onTreeSelectionForeachFunc(TreeModel model, TreePath path, TreeIter iter, jdk.incubator.foreign.MemoryAddress data);
}
