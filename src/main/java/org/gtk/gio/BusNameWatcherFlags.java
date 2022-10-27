package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used in g_bus_watch_name().
 * @version 2.26
 */
public class BusNameWatcherFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No flags set.
     */
    public static final BusNameWatcherFlags NONE = new BusNameWatcherFlags(0);
    
    /**
     * If no-one owns the name when
     * beginning to watch the name, ask the bus to launch an owner for the
     * name.
     */
    public static final BusNameWatcherFlags AUTO_START = new BusNameWatcherFlags(1);
    
    public BusNameWatcherFlags(int value) {
        super(value);
    }
}
