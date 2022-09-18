package org.gtk.gio;

/**
 * Flags used when creating a new {@link org.gtk.gio.DBusConnection}
 */
public class DBusConnectionFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Perform authentication against server.
     */
    public static final int AUTHENTICATION_CLIENT = 1;
    
    /**
     * Perform authentication against client.
     */
    public static final int AUTHENTICATION_SERVER = 2;
    
    /**
     * When
     * authenticating as a server, allow the anonymous authentication
     * method.
     */
    public static final int AUTHENTICATION_ALLOW_ANONYMOUS = 4;
    
    /**
     * Pass this flag if connecting to a peer that is a
     * message bus. This means that the Hello() method will be invoked as part of the connection setup.
     */
    public static final int MESSAGE_BUS_CONNECTION = 8;
    
    /**
     * If set, processing of D-Bus messages is
     * delayed until g_dbus_connection_start_message_processing() is called.
     */
    public static final int DELAY_MESSAGE_PROCESSING = 16;
    
    /**
     * When authenticating
     * as a server, require the UID of the peer to be the same as the UID of the server. (Since: 2.68)
     */
    public static final int AUTHENTICATION_REQUIRE_SAME_USER = 32;
    
}
