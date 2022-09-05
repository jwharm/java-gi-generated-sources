package org.gtk.glib;

@FunctionalInterface
public interface TraverseFunc {

    /**
     * Specifies the type of function passed to g_tree_traverse(). It is
     * passed the key and value of each node, together with the @user_data
     * parameter passed to g_tree_traverse(). If the function returns
     * %TRUE, the traversal is stopped.
     */
    public boolean onTraverseFunc(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value, jdk.incubator.foreign.MemoryAddress data);
}
