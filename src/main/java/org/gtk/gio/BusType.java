package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration for well-known message buses.
 * @version 2.26
 */
public enum BusType implements io.github.jwharm.javagi.Enumeration {
    /**
     * An alias for the message bus that activated the process, if any.
     */
    STARTER(-1),
    /**
     * Not a message bus.
     */
    NONE(0),
    /**
     * The system-wide message bus.
     */
    SYSTEM(1),
    /**
     * The login session message bus.
     */
    SESSION(2);
    
    private static final java.lang.String C_TYPE_NAME = "GBusType";
    
    private final int value;
    BusType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static BusType of(int value) {
        return switch (value) {
            case -1 -> STARTER;
            case 0 -> NONE;
            case 1 -> SYSTEM;
            case 2 -> SESSION;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
