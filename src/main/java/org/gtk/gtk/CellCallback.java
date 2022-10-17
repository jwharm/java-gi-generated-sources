package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the callback functions used for iterating over
 * the cell renderers of a {@code GtkCellArea}, see gtk_cell_area_foreach().
 */
@FunctionalInterface
public interface CellCallback {
        boolean onCellCallback(@NotNull CellRenderer renderer);
}
