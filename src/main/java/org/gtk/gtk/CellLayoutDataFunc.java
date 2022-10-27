package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function which should set the value of {@code cell_layout}’s cell renderer(s)
 * as appropriate.
 */
@FunctionalInterface
public interface CellLayoutDataFunc {
        void onCellLayoutDataFunc(@NotNull org.gtk.gtk.CellLayout cellLayout, @NotNull org.gtk.gtk.CellRenderer cell, @NotNull org.gtk.gtk.TreeModel treeModel, @NotNull org.gtk.gtk.TreeIter iter);
}
