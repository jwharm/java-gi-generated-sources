package org.gtk.gtk;

@FunctionalInterface
public interface TreeIterCompareFunc {

        void onTreeIterCompareFunc(TreeModel model, TreeIter a, TreeIter b);
}
