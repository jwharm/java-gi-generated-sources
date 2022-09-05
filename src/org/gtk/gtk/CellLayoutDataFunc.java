package org.gtk.gtk;

@FunctionalInterface
public interface CellLayoutDataFunc {

    /**
     * A function which should set the value of @cell_layout’s cell renderer(s)
     * as appropriate.
     */
    public void onCellLayoutDataFunc(CellLayout cellLayout, CellRenderer cell, TreeModel treeModel, TreeIter iter, jdk.incubator.foreign.MemoryAddress data);
}
