package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The range of possible top-level types of {@link Variant} instances.
 * @version 2.24
 */
public enum VariantClass implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The {@link Variant} is a boolean.
     */
    BOOLEAN(98),
    
    /**
     * The {@link Variant} is a byte.
     */
    BYTE(121),
    
    /**
     * The {@link Variant} is a signed 16 bit integer.
     */
    INT16(110),
    
    /**
     * The {@link Variant} is an unsigned 16 bit integer.
     */
    UINT16(113),
    
    /**
     * The {@link Variant} is a signed 32 bit integer.
     */
    INT32(105),
    
    /**
     * The {@link Variant} is an unsigned 32 bit integer.
     */
    UINT32(117),
    
    /**
     * The {@link Variant} is a signed 64 bit integer.
     */
    INT64(120),
    
    /**
     * The {@link Variant} is an unsigned 64 bit integer.
     */
    UINT64(116),
    
    /**
     * The {@link Variant} is a file handle index.
     */
    HANDLE(104),
    
    /**
     * The {@link Variant} is a double precision floating
     *                          point value.
     */
    DOUBLE(100),
    
    /**
     * The {@link Variant} is a normal string.
     */
    STRING(115),
    
    /**
     * The {@link Variant} is a D-Bus object path
     *                               string.
     */
    OBJECT_PATH(111),
    
    /**
     * The {@link Variant} is a D-Bus signature string.
     */
    SIGNATURE(103),
    
    /**
     * The {@link Variant} is a variant.
     */
    VARIANT(118),
    
    /**
     * The {@link Variant} is a maybe-typed value.
     */
    MAYBE(109),
    
    /**
     * The {@link Variant} is an array.
     */
    ARRAY(97),
    
    /**
     * The {@link Variant} is a tuple.
     */
    TUPLE(40),
    
    /**
     * The {@link Variant} is a dictionary entry.
     */
    DICT_ENTRY(123);
    
    private static final java.lang.String C_TYPE_NAME = "GVariantClass";
    
    private final int value;
    
    /**
     * Create a new VariantClass for the provided value
     * @param numeric value the enum value
     */
    VariantClass(int value) {
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
     * Create a new VariantClass for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VariantClass of(int value) {
        return switch (value) {
            case 98 -> BOOLEAN;
            case 121 -> BYTE;
            case 110 -> INT16;
            case 113 -> UINT16;
            case 105 -> INT32;
            case 117 -> UINT32;
            case 120 -> INT64;
            case 116 -> UINT64;
            case 104 -> HANDLE;
            case 100 -> DOUBLE;
            case 115 -> STRING;
            case 111 -> OBJECT_PATH;
            case 103 -> SIGNATURE;
            case 118 -> VARIANT;
            case 109 -> MAYBE;
            case 97 -> ARRAY;
            case 40 -> TUPLE;
            case 123 -> DICT_ENTRY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
