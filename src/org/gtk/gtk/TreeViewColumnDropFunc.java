package org.gtk.gtk;

@FunctionalInterface
public interface TreeViewColumnDropFunc {

        void onTreeViewColumnDropFunc(TreeView treeView, TreeViewColumn column, TreeViewColumn prevColumn, TreeViewColumn nextColumn);
}
