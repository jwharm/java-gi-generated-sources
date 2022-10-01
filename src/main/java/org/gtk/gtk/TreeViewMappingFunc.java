package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * Function used for gtk_tree_view_map_expanded_rows().
 */
@FunctionalInterface
public interface TreeViewMappingFunc {
        void onTreeViewMappingFunc(TreeView treeView, TreePath path);
}
