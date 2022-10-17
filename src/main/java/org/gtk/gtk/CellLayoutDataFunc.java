package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A function which should set the value of {@code cell_layout}’s cell renderer(s)
 * as appropriate.
 */
@FunctionalInterface
public interface CellLayoutDataFunc {
        void onCellLayoutDataFunc(@NotNull CellLayout cellLayout, @NotNull CellRenderer cell, @NotNull TreeModel treeModel, @NotNull TreeIter iter);
}
