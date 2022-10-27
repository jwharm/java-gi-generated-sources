package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of the callback passed to gtk_tree_model_foreach() to
 * iterate over the rows in a tree model.
 */
@FunctionalInterface
public interface TreeModelForeachFunc {
        boolean onTreeModelForeachFunc(@NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.TreeIter iter);
}
