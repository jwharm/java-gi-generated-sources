package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Type of the callback passed to gtk_tree_model_foreach() to
 * iterate over the rows in a tree model.
 */
@FunctionalInterface
public interface TreeModelForeachFunc {
        boolean onTreeModelForeachFunc(@NotNull TreeModel model, @NotNull TreePath path, @NotNull TreeIter iter);
}
