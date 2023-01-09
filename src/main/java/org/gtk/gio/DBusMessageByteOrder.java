package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enumeration used to describe the byte order of a D-Bus message.
 * @version 2.26
 */
public enum DBusMessageByteOrder implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The byte order is big endian.
     */
    BIG_ENDIAN(66),
    
    /**
     * The byte order is little endian.
     */
    LITTLE_ENDIAN(108);
    
    private static final java.lang.String C_TYPE_NAME = "GDBusMessageByteOrder";
    
    private final int value;
    
    /**
     * Create a new DBusMessageByteOrder for the provided value
     * @param numeric value the enum value
     */
    DBusMessageByteOrder(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new DBusMessageByteOrder for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static DBusMessageByteOrder of(int value) {
        return switch (value) {
            case 66 -> BIG_ENDIAN;
            case 108 -> LITTLE_ENDIAN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
