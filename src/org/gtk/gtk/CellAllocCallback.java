package org.gtk.gtk;

@FunctionalInterface
public interface CellAllocCallback {

    /**
     * The type of the callback functions used for iterating over the
     * cell renderers and their allocated areas inside a `GtkCellArea`,
     * see gtk_cell_area_foreach_alloc().
     */
    public boolean onCellAllocCallback(CellRenderer renderer, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle cellBackground, jdk.incubator.foreign.MemoryAddress data);
}
