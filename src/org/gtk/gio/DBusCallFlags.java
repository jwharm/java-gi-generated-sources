package org.gtk.gio;

/**
 * Flags used in g_dbus_connection_call() and similar APIs.
 */
public class DBusCallFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * The bus must not launch
     * an owner for the destination name in response to this method
     * invocation.
     */
    public static final int NO_AUTO_START = 1;
    
    /**
     * the caller is prepared to
     * wait for interactive authorization. Since 2.46.
     */
    public static final int ALLOW_INTERACTIVE_AUTHORIZATION = 2;
    
}
