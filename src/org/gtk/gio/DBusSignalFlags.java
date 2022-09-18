package org.gtk.gio;

/**
 * Flags used when subscribing to signals via g_dbus_connection_signal_subscribe().
 */
public class DBusSignalFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Don&<code>#39</code> t actually send the AddMatch
     * D-Bus call for this signal subscription.  This gives you more control
     * over which match rules you add (but you must add them manually).
     */
    public static final int NO_MATCH_RULE = 1;
    
    /**
     * Match first arguments that
     * contain a bus or interface name with the given namespace.
     */
    public static final int MATCH_ARG0_NAMESPACE = 2;
    
    /**
     * Match first arguments that
     * contain an object path that is either equivalent to the given path,
     * or one of the paths is a subpath of the other.
     */
    public static final int MATCH_ARG0_PATH = 4;
    
}
