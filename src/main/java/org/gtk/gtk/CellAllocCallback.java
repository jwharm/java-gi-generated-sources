package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the callback functions used for iterating over the
 * cell renderers and their allocated areas inside a {@code GtkCellArea},
 * see gtk_cell_area_foreach_alloc().
 */
@FunctionalInterface
public interface CellAllocCallback {
        boolean onCellAllocCallback(@NotNull CellRenderer renderer, @NotNull org.gtk.gdk.Rectangle cellArea, @NotNull org.gtk.gdk.Rectangle cellBackground);
}
