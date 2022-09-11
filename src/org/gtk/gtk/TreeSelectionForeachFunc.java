package org.gtk.gtk;

@FunctionalInterface
public interface TreeSelectionForeachFunc {

        void onTreeSelectionForeachFunc(TreeModel model, TreePath path, TreeIter iter);
}
