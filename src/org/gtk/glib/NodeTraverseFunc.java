package org.gtk.glib;

@FunctionalInterface
public interface NodeTraverseFunc {

    /**
     * Specifies the type of function passed to g_node_traverse(). The
     * function is called with each of the nodes visited, together with the
     * user data passed to g_node_traverse(). If the function returns
     * %TRUE, then the traversal is stopped.
     */
    public boolean onNodeTraverseFunc(Node node, jdk.incubator.foreign.MemoryAddress data);
}
