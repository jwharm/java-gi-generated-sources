package org.gtk.glib;

/**
 * Specifies the type of function passed to g_tree_foreach_node(). It is
 * passed each node, together with the @user_data parameter passed to
 * g_tree_foreach_node(). If the function returns <code>true</code>  the traversal is
 * stopped.
 */
@FunctionalInterface
public interface TraverseNodeFunc {
        boolean onTraverseNodeFunc(TreeNode node);
}
