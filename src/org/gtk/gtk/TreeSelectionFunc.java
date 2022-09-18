package org.gtk.gtk;

/**
 * A function used by gtk_tree_selection_set_select_function() to filter
 * whether or not a row may be selected. It is called whenever a row&<code>#39</code> s
 * state might change.
 * 
 * A return value of <code>true</code> indicates to @selection that it is okay to
 * change the selection.
 */
@FunctionalInterface
public interface TreeSelectionFunc {
        boolean onTreeSelectionFunc(TreeSelection selection, TreeModel model, TreePath path, boolean pathCurrentlySelected);
}
