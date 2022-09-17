package org.gtk.gio;

/**
 * #GDataStreamByteOrder is used to ensure proper endianness of streaming data sources
 * across various machine architectures.
 */
public enum DataStreamByteOrder {

    /**
     * Selects Big Endian byte order.
     */
    BIG_ENDIAN,
    
    /**
     * Selects Little Endian byte order.
     */
    LITTLE_ENDIAN,
    
    /**
     * Selects endianness based on host machine&#39;s architecture.
     */
    HOST_ENDIAN;
    
    public static DataStreamByteOrder fromValue(int value) {
        return switch(value) {
            case 0 -> BIG_ENDIAN;
            case 1 -> LITTLE_ENDIAN;
            case 2 -> HOST_ENDIAN;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BIG_ENDIAN -> 0;
            case LITTLE_ENDIAN -> 1;
            case HOST_ENDIAN -> 2;
        };
    }

}
