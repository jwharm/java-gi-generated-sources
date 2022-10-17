package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_tree_traverse(). It is
 * passed the key and value of each node, together with the {@code user_data}
 * parameter passed to g_tree_traverse(). If the function returns
 * {@code true}, the traversal is stopped.
 */
@FunctionalInterface
public interface TraverseFunc {
        boolean onTraverseFunc(@Nullable java.lang.foreign.MemoryAddress key, @Nullable java.lang.foreign.MemoryAddress value);
}
