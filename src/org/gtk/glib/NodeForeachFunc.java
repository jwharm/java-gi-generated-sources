package org.gtk.glib;

@FunctionalInterface
public interface NodeForeachFunc {

    /**
     * Specifies the type of function passed to g_node_children_foreach().
     * The function is called with each child node, together with the user
     * data passed to g_node_children_foreach().
     */
    public void onNodeForeachFunc(Node node, jdk.incubator.foreign.MemoryAddress data);
}
