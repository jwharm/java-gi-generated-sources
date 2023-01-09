package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    /**
     * Create a new Pid with the provided value
     */
    public Pid(int value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static Pid[] fromNativeArray(MemoryAddress address, long length) {
        Pid[] array = new Pid[(int) length];
        long bytesSize = Interop.valueLayout.C_INT.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new Pid(address.get(Interop.valueLayout.C_INT, i * bytesSize));
        }
        return array;
    }
}
