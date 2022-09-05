package org.gtk.glib;

@FunctionalInterface
public interface TraverseNodeFunc {

    /**
     * Specifies the type of function passed to g_tree_foreach_node(). It is
     * passed each node, together with the @user_data parameter passed to
     * g_tree_foreach_node(). If the function returns %TRUE, the traversal is
     * stopped.
     */
    public boolean onTraverseNodeFunc(TreeNode node, jdk.incubator.foreign.MemoryAddress data);
}
