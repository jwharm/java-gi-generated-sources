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
    
    private static final java.lang.String C_TYPE_NAME = "GBusNameWatcherFlags";
    
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
    
    /**
     * Create a new BusNameWatcherFlags with the provided value
     */
    public BusNameWatcherFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BusNameWatcherFlags or(BusNameWatcherFlags... masks) {
        int value = this.getValue();
        for (BusNameWatcherFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BusNameWatcherFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BusNameWatcherFlags combined(BusNameWatcherFlags mask, BusNameWatcherFlags... masks) {
        int value = mask.getValue();
        for (BusNameWatcherFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BusNameWatcherFlags(value);
    }
}
