package org.gtk.gtk;

@FunctionalInterface
public interface TreeViewRowSeparatorFunc {

    /**
     * Function type for determining whether the row pointed to by @iter should
     * be rendered as a separator. A common way to implement this is to have a
     * boolean column in the model, whose values the `GtkTreeViewRowSeparatorFunc`
     * returns.
     */
    public boolean onTreeViewRowSeparatorFunc(TreeModel model, TreeIter iter, jdk.incubator.foreign.MemoryAddress data);
}
