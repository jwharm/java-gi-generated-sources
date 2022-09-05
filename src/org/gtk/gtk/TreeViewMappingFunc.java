package org.gtk.gtk;

@FunctionalInterface
public interface TreeViewMappingFunc {

    /**
     * Function used for gtk_tree_view_map_expanded_rows().
     */
    public void onTreeViewMappingFunc(TreeView treeView, TreePath path, jdk.incubator.foreign.MemoryAddress userData);
}
