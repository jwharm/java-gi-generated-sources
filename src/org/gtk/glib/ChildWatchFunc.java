package org.gtk.glib;

@FunctionalInterface
public interface ChildWatchFunc {

    /**
     * Prototype of a #GChildWatchSource callback, called when a child
     * process has exited.
     * 
     * To interpret @wait_status, see the documentation
     * for g_spawn_check_wait_status(). In particular,
     * on Unix platforms, note that it is usually not equal
     * to the integer passed to `exit()` or returned from `main()`.
     */
    public void onChildWatchFunc(Pid pid, int waitStatus, jdk.incubator.foreign.MemoryAddress userData);
}
