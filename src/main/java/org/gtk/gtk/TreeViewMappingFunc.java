package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function used for gtk_tree_view_map_expanded_rows().
 */
@FunctionalInterface
public interface TreeViewMappingFunc {
        void onTreeViewMappingFunc(@NotNull org.gtk.gtk.TreeView treeView, @NotNull org.gtk.gtk.TreePath path);
}
