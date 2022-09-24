package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * Specifies the type of function passed to g_tree_traverse(). It is
 * passed the key and value of each node, together with the {@code user_data}
 * parameter passed to g_tree_traverse(). If the function returns
 * {@code true}, the traversal is stopped.
 */
@FunctionalInterface
public interface TraverseFunc {
        boolean onTraverseFunc(java.lang.foreign.MemoryAddress key, java.lang.foreign.MemoryAddress value);
}
