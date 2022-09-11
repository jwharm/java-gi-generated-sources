package org.gtk.gtk;

@FunctionalInterface
public interface TreeViewRowSeparatorFunc {

        void onTreeViewRowSeparatorFunc(TreeModel model, TreeIter iter);
}
