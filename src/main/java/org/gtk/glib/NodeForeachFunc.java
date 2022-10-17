package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_node_children_foreach().
 * The function is called with each child node, together with the user
 * data passed to g_node_children_foreach().
 */
@FunctionalInterface
public interface NodeForeachFunc {
        void onNodeForeachFunc(@NotNull Node node);
}
