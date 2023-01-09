package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Statuses returned by most of the {@link IOFuncs} functions.
 */
public enum IOStatus implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * An error occurred.
     */
    ERROR(0),
    
    /**
     * Success.
     */
    NORMAL(1),
    
    /**
     * End of file.
     */
    EOF(2),
    
    /**
     * Resource temporarily unavailable.
     */
    AGAIN(3);
    
    private static final java.lang.String C_TYPE_NAME = "GIOStatus";
    
    private final int value;
    
    /**
     * Create a new IOStatus for the provided value
     * @param numeric value the enum value
     */
    IOStatus(int value) {
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
     * Create a new IOStatus for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static IOStatus of(int value) {
        return switch (value) {
            case 0 -> ERROR;
            case 1 -> NORMAL;
            case 2 -> EOF;
            case 3 -> AGAIN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
