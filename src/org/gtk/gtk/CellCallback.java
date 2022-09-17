package org.gtk.gtk;

/**
 * The type of the callback functions used for iterating over
 * the cell renderers of a <code>GtkCellArea</code>, see gtk_cell_area_foreach().
 */
@FunctionalInterface
public interface CellCallback {
        boolean onCellCallback(CellRenderer renderer);
}
