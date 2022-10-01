package org.gtk.gio;

/**
 * Flags used in g_bus_watch_name().
 */
public class BusNameWatcherFlags extends io.github.jwharm.javagi.Bitfield {

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
