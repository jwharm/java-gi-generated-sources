package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Function type for determining whether the row pointed to by {@code iter} should
 * be rendered as a separator. A common way to implement this is to have a
 * boolean column in the model, whose values the {@code GtkTreeViewRowSeparatorFunc}
 * returns.
 */
@FunctionalInterface
public interface TreeViewRowSeparatorFunc {
        boolean onTreeViewRowSeparatorFunc(@NotNull TreeModel model, @NotNull TreeIter iter);
}
