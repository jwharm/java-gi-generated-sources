package org.gtk.gtk;

@FunctionalInterface
public interface CellLayoutDataFunc {

        void onCellLayoutDataFunc(CellLayout cellLayout, CellRenderer cell, TreeModel treeModel, TreeIter iter);
}
