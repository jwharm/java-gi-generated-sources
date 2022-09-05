package org.gtk.gtk;

@FunctionalInterface
public interface CellCallback {

    /**
     * The type of the callback functions used for iterating over
     * the cell renderers of a `GtkCellArea`, see gtk_cell_area_foreach().
     */
    public boolean onCellCallback(CellRenderer renderer, jdk.incubator.foreign.MemoryAddress data);
}
