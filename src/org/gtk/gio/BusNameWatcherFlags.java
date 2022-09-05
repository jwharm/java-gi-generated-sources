package org.gtk.gio;

/**
 * Flags used in g_bus_watch_name().
 */
public class BusNameWatcherFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * If no-one owns the name when
     * beginning to watch the name, ask the bus to launch an owner for the
     * name.
     */
    public static final int AUTO_START = 1;
    
}
