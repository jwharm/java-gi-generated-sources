package org.gtk.gtk;

@FunctionalInterface
public interface TreeCellDataFunc {

        void onTreeCellDataFunc(TreeViewColumn treeColumn, CellRenderer cell, TreeModel treeModel, TreeIter iter);
}
