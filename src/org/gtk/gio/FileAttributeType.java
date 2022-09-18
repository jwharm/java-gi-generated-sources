package org.gtk.gio;

/**
 * The data types for file attributes.
 */
public enum FileAttributeType {

    /**
     * indicates an invalid or uninitialized type.
     */
    INVALID,
    
    /**
     * a null terminated UTF8 string.
     */
    STRING,
    
    /**
     * a zero terminated string of non-zero bytes.
     */
    BYTE_STRING,
    
    /**
     * a boolean value.
     */
    BOOLEAN,
    
    /**
     * an unsigned 4-byte/32-bit integer.
     */
    UINT32,
    
    /**
     * a signed 4-byte/32-bit integer.
     */
    INT32,
    
    /**
     * an unsigned 8-byte/64-bit integer.
     */
    UINT64,
    
    /**
     * a signed 8-byte/64-bit integer.
     */
    INT64,
    
    /**
     * a {@link org.gtk.gobject.Object}
     */
    OBJECT,
    
    /**
     * a <code>null</code> terminated char **. Since 2.22
     */
    STRINGV;
    
    public static FileAttributeType fromValue(int value) {
        return switch(value) {
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
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INVALID -> 0;
            case STRING -> 1;
            case BYTE_STRING -> 2;
            case BOOLEAN -> 3;
            case UINT32 -> 4;
            case INT32 -> 5;
            case UINT64 -> 6;
            case INT64 -> 7;
            case OBJECT -> 8;
            case STRINGV -> 9;
        };
    }

}
