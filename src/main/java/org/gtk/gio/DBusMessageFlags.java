package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Message flags used in {@link DBusMessage}.
 * @version 2.26
 */
public class DBusMessageFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GDBusMessageFlags";
    
    /**
     * No flags set.
     */
    public static final DBusMessageFlags NONE = new DBusMessageFlags(0);
    
    /**
     * A reply is not expected.
     */
    public static final DBusMessageFlags NO_REPLY_EXPECTED = new DBusMessageFlags(1);
    
    /**
     * The bus must not launch an
     * owner for the destination name in response to this message.
     */
    public static final DBusMessageFlags NO_AUTO_START = new DBusMessageFlags(2);
    
    /**
     * If set on a method
     * call, this flag means that the caller is prepared to wait for interactive
     * authorization. Since 2.46.
     */
    public static final DBusMessageFlags ALLOW_INTERACTIVE_AUTHORIZATION = new DBusMessageFlags(4);
    
    public DBusMessageFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DBusMessageFlags or(DBusMessageFlags... masks) {
        int value = this.getValue();
        for (DBusMessageFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusMessageFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DBusMessageFlags combined(DBusMessageFlags mask, DBusMessageFlags... masks) {
        int value = mask.getValue();
        for (DBusMessageFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusMessageFlags(value);
    }
}
