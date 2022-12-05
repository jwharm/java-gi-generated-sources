package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link DataStreamByteOrder} is used to ensure proper endianness of streaming data sources
 * across various machine architectures.
 */
public enum DataStreamByteOrder implements io.github.jwharm.javagi.Enumeration {
    /**
     * Selects Big Endian byte order.
     */
    BIG_ENDIAN(0),
    /**
     * Selects Little Endian byte order.
     */
    LITTLE_ENDIAN(1),
    /**
     * Selects endianness based on host machine's architecture.
     */
    HOST_ENDIAN(2);
    
    private static final java.lang.String C_TYPE_NAME = "GDataStreamByteOrder";
    
    private final int value;
    DataStreamByteOrder(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DataStreamByteOrder of(int value) {
        return switch (value) {
            case 0 -> BIG_ENDIAN;
            case 1 -> LITTLE_ENDIAN;
            case 2 -> HOST_ENDIAN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
