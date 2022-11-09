package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Capabilities negotiated with the remote peer.
 * @version 2.26
 */
public class DBusCapabilityFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GDBusCapabilityFlags";
    
    /**
     * No flags set.
     */
    public static final DBusCapabilityFlags NONE = new DBusCapabilityFlags(0);
    
    /**
     * The connection
     * supports exchanging UNIX file descriptors with the remote peer.
     */
    public static final DBusCapabilityFlags UNIX_FD_PASSING = new DBusCapabilityFlags(1);
    
    public DBusCapabilityFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DBusCapabilityFlags combined(DBusCapabilityFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DBusCapabilityFlags combined(DBusCapabilityFlags mask, DBusCapabilityFlags... masks) {
        for (DBusCapabilityFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
