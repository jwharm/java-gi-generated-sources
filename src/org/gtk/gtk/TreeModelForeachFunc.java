package org.gtk.gtk;

@FunctionalInterface
public interface TreeModelForeachFunc {

        void onTreeModelForeachFunc(TreeModel model, TreePath path, TreeIter iter);
}
