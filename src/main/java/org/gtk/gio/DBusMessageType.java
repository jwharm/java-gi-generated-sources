package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Message types used in {@link DBusMessage}.
 * @version 2.26
 */
public enum DBusMessageType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Message is of invalid type.
     */
    INVALID(0),
    /**
     * Method call.
     */
    METHOD_CALL(1),
    /**
     * Method reply.
     */
    METHOD_RETURN(2),
    /**
     * Error reply.
     */
    ERROR(3),
    /**
     * Signal emission.
     */
    SIGNAL(4);
    
    private static final java.lang.String C_TYPE_NAME = "GDBusMessageType";
    
    private final int value;
    DBusMessageType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static DBusMessageType of(int value) {
        return switch (value) {
            case 0 -> INVALID;
            case 1 -> METHOD_CALL;
            case 2 -> METHOD_RETURN;
            case 3 -> ERROR;
            case 4 -> SIGNAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
