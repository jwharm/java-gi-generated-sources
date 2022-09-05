package org.gtk.gio;

/**
 * Enumeration used to describe the byte order of a D-Bus message.
 */
public enum DBusMessageByteOrder {

    /**
     * The byte order is big endian.
     */
    BIG_ENDIAN,
    
    /**
     * The byte order is little endian.
     */
    LITTLE_ENDIAN;
    
    public static DBusMessageByteOrder fromValue(int value) {
        return switch(value) {
            case 66 -> BIG_ENDIAN;
            case 108 -> LITTLE_ENDIAN;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BIG_ENDIAN -> 66;
            case LITTLE_ENDIAN -> 108;
        };
    }

}
