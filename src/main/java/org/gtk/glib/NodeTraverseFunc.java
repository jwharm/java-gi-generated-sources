package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_node_traverse(). The
 * function is called with each of the nodes visited, together with the
 * user data passed to g_node_traverse(). If the function returns
 * {@code true}, then the traversal is stopped.
 */
@FunctionalInterface
public interface NodeTraverseFunc {
        boolean onNodeTraverseFunc(@NotNull Node node);
}
