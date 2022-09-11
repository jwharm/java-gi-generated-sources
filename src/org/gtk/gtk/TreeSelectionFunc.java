package org.gtk.gtk;

@FunctionalInterface
public interface TreeSelectionFunc {

        void onTreeSelectionFunc(TreeSelection selection, TreeModel model, TreePath path, boolean pathCurrentlySelected);
}
