package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when sending {@code GDBusMessages} on a {@link DBusConnection}.
 * @version 2.26
 */
public class DBusSendMessageFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GDBusSendMessageFlags";
    
    /**
     * No flags set.
     */
    public static final DBusSendMessageFlags NONE = new DBusSendMessageFlags(0);
    
    /**
     * Do not automatically
     * assign a serial number from the {@link DBusConnection} object when
     * sending a message.
     */
    public static final DBusSendMessageFlags PRESERVE_SERIAL = new DBusSendMessageFlags(1);
    
    /**
     * Create a new DBusSendMessageFlags with the provided value
     */
    public DBusSendMessageFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DBusSendMessageFlags or(DBusSendMessageFlags... masks) {
        int value = this.getValue();
        for (DBusSendMessageFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusSendMessageFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DBusSendMessageFlags combined(DBusSendMessageFlags mask, DBusSendMessageFlags... masks) {
        int value = mask.getValue();
        for (DBusSendMessageFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusSendMessageFlags(value);
    }
}
