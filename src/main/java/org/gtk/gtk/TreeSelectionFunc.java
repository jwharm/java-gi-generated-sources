package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A function used by gtk_tree_selection_set_select_function() to filter
 * whether or not a row may be selected. It is called whenever a row's
 * state might change.
 * <p>
 * A return value of {@code true} indicates to {@code selection} that it is okay to
 * change the selection.
 */
@FunctionalInterface
public interface TreeSelectionFunc {
        boolean onTreeSelectionFunc(@NotNull TreeSelection selection, @NotNull TreeModel model, @NotNull TreePath path, @NotNull boolean pathCurrentlySelected);
}
