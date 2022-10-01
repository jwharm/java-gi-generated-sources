package org.gtk.gio;

/**
 * Message types used in {@link DBusMessage}.
 */
public class DBusMessageType extends io.github.jwharm.javagi.Enumeration {

    /**
     * Message is of invalid type.
     */
    public static final DBusMessageType INVALID = new DBusMessageType(0);
    
    /**
     * Method call.
     */
    public static final DBusMessageType METHOD_CALL = new DBusMessageType(1);
    
    /**
     * Method reply.
     */
    public static final DBusMessageType METHOD_RETURN = new DBusMessageType(2);
    
    /**
     * Error reply.
     */
    public static final DBusMessageType ERROR = new DBusMessageType(3);
    
    /**
     * Signal emission.
     */
    public static final DBusMessageType SIGNAL = new DBusMessageType(4);
    
    public DBusMessageType(int value) {
        super(value);
    }
    
}
