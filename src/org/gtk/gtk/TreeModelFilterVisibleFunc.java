package org.gtk.gtk;

@FunctionalInterface
public interface TreeModelFilterVisibleFunc {

        void onTreeModelFilterVisibleFunc(TreeModel model, TreeIter iter);
}
