package org.gtk.gio;

/**
 * Flags used when creating a new {@link DBusConnection}.
 */
public class DBusConnectionFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final DBusConnectionFlags NONE = new DBusConnectionFlags(0);
    
    /**
     * Perform authentication against server.
     */
    public static final DBusConnectionFlags AUTHENTICATION_CLIENT = new DBusConnectionFlags(1);
    
    /**
     * Perform authentication against client.
     */
    public static final DBusConnectionFlags AUTHENTICATION_SERVER = new DBusConnectionFlags(2);
    
    /**
     * When
     * authenticating as a server, allow the anonymous authentication
     * method.
     */
    public static final DBusConnectionFlags AUTHENTICATION_ALLOW_ANONYMOUS = new DBusConnectionFlags(4);
    
    /**
     * Pass this flag if connecting to a peer that is a
     * message bus. This means that the Hello() method will be invoked as part of the connection setup.
     */
    public static final DBusConnectionFlags MESSAGE_BUS_CONNECTION = new DBusConnectionFlags(8);
    
    /**
     * If set, processing of D-Bus messages is
     * delayed until g_dbus_connection_start_message_processing() is called.
     */
    public static final DBusConnectionFlags DELAY_MESSAGE_PROCESSING = new DBusConnectionFlags(16);
    
    /**
     * When authenticating
     * as a server, require the UID of the peer to be the same as the UID of the server. (Since: 2.68)
     */
    public static final DBusConnectionFlags AUTHENTICATION_REQUIRE_SAME_USER = new DBusConnectionFlags(32);
    
    public DBusConnectionFlags(int value) {
        super(value);
    }
    
}
