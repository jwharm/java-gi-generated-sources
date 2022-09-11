package org.gtk.gtk;

@FunctionalInterface
public interface TreeViewSearchEqualFunc {

        void onTreeViewSearchEqualFunc(TreeModel model, int column, java.lang.String key, TreeIter iter);
}
