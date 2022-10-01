package org.gtk.glib;

/**
 * A type which is used to hold a process identification.
 * <p>
 * On UNIX, processes are identified by a process id (an integer),
 * while Windows uses process handles (which are pointers).
 * <p>
 * GPid is used in GLib only for descendant processes spawned with
 * the g_spawn functions.
 */
public class Pid extends io.github.jwharm.javagi.Alias<Integer> {
    public Pid(int value) {
        super(value);
    }
    
}
