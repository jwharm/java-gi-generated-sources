package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
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
        boolean onTreeSelectionFunc(@NotNull org.gtk.gtk.TreeSelection selection, @NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreePath path, boolean pathCurrentlySelected);
}
