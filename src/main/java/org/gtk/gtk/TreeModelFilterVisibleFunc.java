package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A function which decides whether the row indicated by {@code iter} is visible.
 */
@FunctionalInterface
public interface TreeModelFilterVisibleFunc {
        boolean onTreeModelFilterVisibleFunc(@NotNull TreeModel model, @NotNull TreeIter iter);
}
