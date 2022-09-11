package org.gtk.gtk;

/**
 * A function which should set the value of @cell_layout’s cell renderer(s)
 * as appropriate.
 */
@FunctionalInterface
public interface CellLayoutDataFunc {
        void onCellLayoutDataFunc(CellLayout cellLayout, CellRenderer cell, TreeModel treeModel, TreeIter iter);
}
