package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by {@link IOChannel} operations.
 */
public enum IOChannelError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * File too large.
     */
    FBIG(0),
    
    /**
     * Invalid argument.
     */
    INVAL(1),
    
    /**
     * IO error.
     */
    IO(2),
    
    /**
     * File is a directory.
     */
    ISDIR(3),
    
    /**
     * No space left on device.
     */
    NOSPC(4),
    
    /**
     * No such device or address.
     */
    NXIO(5),
    
    /**
     * Value too large for defined datatype.
     */
    OVERFLOW(6),
    
    /**
     * Broken pipe.
     */
    PIPE(7),
    
    /**
     * Some other error.
     */
    FAILED(8);
    
    private static final java.lang.String C_TYPE_NAME = "GIOChannelError";
    
    private final int value;
    
    /**
     * Create a new IOChannelError for the provided value
     * @param numeric value the enum value
     */
    IOChannelError(int value) {
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
     * Create a new IOChannelError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static IOChannelError of(int value) {
        return switch (value) {
            case 0 -> FBIG;
            case 1 -> INVAL;
            case 2 -> IO;
            case 3 -> ISDIR;
            case 4 -> NOSPC;
            case 5 -> NXIO;
            case 6 -> OVERFLOW;
            case 7 -> PIPE;
            case 8 -> FAILED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
