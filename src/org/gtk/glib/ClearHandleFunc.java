package org.gtk.glib;

@FunctionalInterface
public interface ClearHandleFunc {

    /**
     * Specifies the type of function passed to g_clear_handle_id().
     * The implementation is expected to free the resource identified
     * by @handle_id; for instance, if @handle_id is a #GSource ID,
     * g_source_remove() can be used.
     */
    public void onClearHandleFunc(int handleId);
}
