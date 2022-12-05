package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when constructing a {@link DBusObjectManagerClient}.
 * @version 2.30
 */
public class DBusObjectManagerClientFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GDBusObjectManagerClientFlags";
    
    /**
     * No flags set.
     */
    public static final DBusObjectManagerClientFlags NONE = new DBusObjectManagerClientFlags(0);
    
    /**
     * If not set and the
     *   manager is for a well-known name, then request the bus to launch
     *   an owner for the name if no-one owns the name. This flag can only
     *   be used in managers for well-known names.
     */
    public static final DBusObjectManagerClientFlags DO_NOT_AUTO_START = new DBusObjectManagerClientFlags(1);
    
    public DBusObjectManagerClientFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DBusObjectManagerClientFlags or(DBusObjectManagerClientFlags mask) {
        return new DBusObjectManagerClientFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DBusObjectManagerClientFlags combined(DBusObjectManagerClientFlags mask, DBusObjectManagerClientFlags... masks) {
        int value = mask.getValue();        for (DBusObjectManagerClientFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusObjectManagerClientFlags(value);
    }
}
