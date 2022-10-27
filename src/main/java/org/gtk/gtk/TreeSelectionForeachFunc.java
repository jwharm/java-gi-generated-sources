package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function used by gtk_tree_selection_selected_foreach() to map all
 * selected rows.  It will be called on every selected row in the view.
 */
@FunctionalInterface
public interface TreeSelectionForeachFunc {
        void onTreeSelectionForeachFunc(@NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreePath path, @NotNull org.gtk.gtk.TreeIter iter);
}
