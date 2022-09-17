package org.gtk.glib;

/**
 * Prototype of a #GChildWatchSource callback, called when a child
 * process has exited.
 * <p>
 * To interpret @wait_status, see the documentation
 * for g_spawn_check_wait_status(). In particular,
 * on Unix platforms, note that it is usually not equal
 * to the integer passed to <code>exit()</code> or returned from <code>main()</code>.
 */
@FunctionalInterface
public interface ChildWatchFunc {
        void onChildWatchFunc(Pid pid, int waitStatus);
}
