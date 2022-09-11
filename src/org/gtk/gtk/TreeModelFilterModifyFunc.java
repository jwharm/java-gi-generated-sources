package org.gtk.gtk;

@FunctionalInterface
public interface TreeModelFilterModifyFunc {

        void onTreeModelFilterModifyFunc(TreeModel model, TreeIter iter, org.gtk.gobject.Value value, int column);
}
