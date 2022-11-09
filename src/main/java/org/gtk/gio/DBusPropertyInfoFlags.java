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
    
    public DBusPropertyInfoFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DBusPropertyInfoFlags combined(DBusPropertyInfoFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DBusPropertyInfoFlags combined(DBusPropertyInfoFlags mask, DBusPropertyInfoFlags... masks) {
        for (DBusPropertyInfoFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
