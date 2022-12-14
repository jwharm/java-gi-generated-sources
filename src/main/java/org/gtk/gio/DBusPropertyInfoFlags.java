package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags describing the access control of a D-Bus property.
 * @version 2.26
 */
public class DBusPropertyInfoFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GDBusPropertyInfoFlags";
    
    /**
     * No flags set.
     */
    public static final DBusPropertyInfoFlags NONE = new DBusPropertyInfoFlags(0);
    
    /**
     * Property is readable.
     */
    public static final DBusPropertyInfoFlags READABLE = new DBusPropertyInfoFlags(1);
    
    /**
     * Property is writable.
     */
    public static final DBusPropertyInfoFlags WRITABLE = new DBusPropertyInfoFlags(2);
    
    /**
     * Create a new DBusPropertyInfoFlags with the provided value
     */
    public DBusPropertyInfoFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DBusPropertyInfoFlags or(DBusPropertyInfoFlags... masks) {
        int value = this.getValue();
        for (DBusPropertyInfoFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusPropertyInfoFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DBusPropertyInfoFlags combined(DBusPropertyInfoFlags mask, DBusPropertyInfoFlags... masks) {
        int value = mask.getValue();
        for (DBusPropertyInfoFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DBusPropertyInfoFlags(value);
    }
}
