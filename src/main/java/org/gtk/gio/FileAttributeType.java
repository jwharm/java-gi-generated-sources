package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The data types for file attributes.
 */
public enum FileAttributeType implements io.github.jwharm.javagi.Enumeration {
    /**
     * indicates an invalid or uninitialized type.
     */
    INVALID(0),
    /**
     * a null terminated UTF8 string.
     */
    STRING(1),
    /**
     * a zero terminated string of non-zero bytes.
     */
    BYTE_STRING(2),
    /**
     * a boolean value.
     */
    BOOLEAN(3),
    /**
     * an unsigned 4-byte/32-bit integer.
     */
    UINT32(4),
    /**
     * a signed 4-byte/32-bit integer.
     */
    INT32(5),
    /**
     * an unsigned 8-byte/64-bit integer.
     */
    UINT64(6),
    /**
     * a signed 8-byte/64-bit integer.
     */
    INT64(7),
    /**
     * a {@link org.gtk.gobject.Object}.
     */
    OBJECT(8),
    /**
     * a {@code null} terminated char **. Since 2.22
     */
    STRINGV(9);
    
    private static final java.lang.String C_TYPE_NAME = "GFileAttributeType";
    
    private final int value;
    FileAttributeType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static FileAttributeType of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> STRING;
            case 2 -> BYTE_STRING;
            case 3 -> BOOLEAN;
            case 4 -> UINT32;
            case 5 -> INT32;
            case 6 -> UINT64;
            case 7 -> INT64;
            case 8 -> OBJECT;
            case 9 -> STRINGV;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
