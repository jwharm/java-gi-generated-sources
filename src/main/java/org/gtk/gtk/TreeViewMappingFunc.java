package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Function used for gtk_tree_view_map_expanded_rows().
 */
@FunctionalInterface
public interface TreeViewMappingFunc {
        void onTreeViewMappingFunc(@NotNull TreeView treeView, @NotNull TreePath path);
}
