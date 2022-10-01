package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * The type of the callback functions used for iterating over the
 * cell renderers and their allocated areas inside a {@code GtkCellArea},
 * see gtk_cell_area_foreach_alloc().
 */
@FunctionalInterface
public interface CellAllocCallback {
        boolean onCellAllocCallback(CellRenderer renderer, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle cellBackground);
}
