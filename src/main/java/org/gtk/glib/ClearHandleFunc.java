package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_clear_handle_id().
 * The implementation is expected to free the resource identified
 * by {@code handle_id}; for instance, if {@code handle_id} is a {@link Source} ID,
 * g_source_remove() can be used.
 */
@FunctionalInterface
public interface ClearHandleFunc {
        void onClearHandleFunc(@NotNull int handleId);
}
