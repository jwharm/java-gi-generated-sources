package org.gtk.glib;

/**
 * Specifies the type of function passed to g_clear_handle_id().
 * The implementation is expected to free the resource identified
 * by {@code handle_id}; for instance, if {@code handle_id} is a {@link Source} ID,
 * g_source_remove() can be used.
 */
@FunctionalInterface
public interface ClearHandleFunc {
        void onClearHandleFunc(int handleId);
}
