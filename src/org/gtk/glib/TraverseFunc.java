package org.gtk.glib;

/**
 * Specifies the type of function passed to g_tree_traverse(). It is
 * passed the key and value of each node, together with the @user_data
 * parameter passed to g_tree_traverse(). If the function returns
 * %TRUE, the traversal is stopped.
 */
@FunctionalInterface
public interface TraverseFunc {
        boolean onTraverseFunc(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value);
}
