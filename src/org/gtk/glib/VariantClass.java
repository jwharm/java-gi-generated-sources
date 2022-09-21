package org.gtk.glib;

/**
 * The range of possible top-level types of {@link Variant} instances.
 */
public enum VariantClass {

    /**
     * The {@link Variant} is a boolean.
     */
    BOOLEAN,
    
    /**
     * The {@link Variant} is a byte.
     */
    BYTE,
    
    /**
     * The {@link Variant} is a signed 16 bit integer.
     */
    INT16,
    
    /**
     * The {@link Variant} is an unsigned 16 bit integer.
     */
    UINT16,
    
    /**
     * The {@link Variant} is a signed 32 bit integer.
     */
    INT32,
    
    /**
     * The {@link Variant} is an unsigned 32 bit integer.
     */
    UINT32,
    
    /**
     * The {@link Variant} is a signed 64 bit integer.
     */
    INT64,
    
    /**
     * The {@link Variant} is an unsigned 64 bit integer.
     */
    UINT64,
    
    /**
     * The {@link Variant} is a file handle index.
     */
    HANDLE,
    
    /**
     * The {@link Variant} is a double precision floating
     *                          point value.
     */
    DOUBLE,
    
    /**
     * The {@link Variant} is a normal string.
     */
    STRING,
    
    /**
     * The {@link Variant} is a D-Bus object path
     *                               string.
     */
    OBJECT_PATH,
    
    /**
     * The {@link Variant} is a D-Bus signature string.
     */
    SIGNATURE,
    
    /**
     * The {@link Variant} is a variant.
     */
    VARIANT,
    
    /**
     * The {@link Variant} is a maybe-typed value.
     */
    MAYBE,
    
    /**
     * The {@link Variant} is an array.
     */
    ARRAY,
    
    /**
     * The {@link Variant} is a tuple.
     */
    TUPLE,
    
    /**
     * The {@link Variant} is a dictionary entry.
     */
    DICT_ENTRY;
    
    public static VariantClass fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BOOLEAN -> 98;
            case BYTE -> 121;
            case INT16 -> 110;
            case UINT16 -> 113;
            case INT32 -> 105;
            case UINT32 -> 117;
            case INT64 -> 120;
            case UINT64 -> 116;
            case HANDLE -> 104;
            case DOUBLE -> 100;
            case STRING -> 115;
            case OBJECT_PATH -> 111;
            case SIGNATURE -> 103;
            case VARIANT -> 118;
            case MAYBE -> 109;
            case ARRAY -> 97;
            case TUPLE -> 40;
            case DICT_ENTRY -> 123;
        };
    }

}
