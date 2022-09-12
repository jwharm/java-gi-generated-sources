package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A type which is used to hold a process identification.
 * 
 * On UNIX, processes are identified by a process id (an integer),
 * while Windows uses process handles (which are pointers).
 * 
 * GPid is used in GLib only for descendant processes spawned with
 * the g_spawn functions.
 */
public class Pid {

    private final int value;
    
    public Pid(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
}
