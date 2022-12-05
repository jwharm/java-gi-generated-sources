package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used in g_dbus_connection_call() and similar APIs.
 * @version 2.26
 */
public class DBusCallFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GDBusCallFlags";
    
    /**
     * No flags set.
     */
    public static final DBusCallFlags NONE = new DBusCallFlags(0);
    
    /**
     * The bus must not launch
     * an owner for the destination name in response to this method
     * invocation.
     */
    public static final DBusCallFlags NO_AUTO_START = new DBusCallFlags(1);
    
    /**
     * the caller is prepared to
     * wait for interactive authorization. Since 2.46.
     */
    public static final DBusCallFlags ALLOW_INTERACTIVE_AUTHORIZATION = new DBusCallFlags(2);
    
    public DBusCallFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DBusCallFlags or(DBusCallFlags mask) {
        return new DBusCallFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DBusCallFlags combined(DBusCallFlags mask, DBusCallFlags... masks) {
        int value = mask.getValue();        for (DBusCallFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusCallFlags(value);
    }
}
