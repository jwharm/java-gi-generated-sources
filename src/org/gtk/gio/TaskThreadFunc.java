package org.gtk.gio;

/**
 * The prototype for a task function to be run in a thread via
 * g_task_run_in_thread() or g_task_run_in_thread_sync().
 * <p>
 * If the return-on-cancel flag is set on @task, and @cancellable gets
 * cancelled, then the {@link org.gtk.gio.Task} will be completed immediately (as though
 * g_task_return_error_if_cancelled() had been called), without
 * waiting for the task function to complete. However, the task
 * function will continue running in its thread in the background. The
 * function therefore needs to be careful about how it uses
 * externally-visible state in this case. See
 * g_task_set_return_on_cancel() for more details.
 * <p>
 * Other than in that case, @task will be completed when the
 * {@link org.gtk.gio.TaskThreadFunc} returns, not when it calls a<code>g_task_return_</code> function.
 */
@FunctionalInterface
public interface TaskThreadFunc {
        void onTaskThreadFunc(Task task, org.gtk.gobject.Object sourceObject, Cancellable cancellable);
}
