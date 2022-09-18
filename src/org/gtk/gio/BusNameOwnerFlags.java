package org.gtk.gio;

/**
 * Flags used in g_bus_own_name().
 */
public class BusNameOwnerFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Allow another message bus connection to claim the name.
     */
    public static final int ALLOW_REPLACEMENT = 1;
    
    /**
     * If another message bus connection owns the name and have
     * specified {@link org.gtk.gio.BusNameOwnerFlags<code>#ALLOW_REPLACEMENT</code>   then take the name from the other connection.
     */
    public static final int REPLACE = 2;
    
    /**
     * If another message bus connection owns the name, immediately
     * return an error from g_bus_own_name() rather than entering the waiting queue for that name. (Since 2.54)
     */
    public static final int DO_NOT_QUEUE = 4;
    
}
