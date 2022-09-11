package org.gtk.gtk;

@FunctionalInterface
public interface TreeViewMappingFunc {

        void onTreeViewMappingFunc(TreeView treeView, TreePath path);
}
