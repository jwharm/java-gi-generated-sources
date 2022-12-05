package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link MountOperationResult} is returned as a result when a request for
 * information is send by the mounting operation.
 */
public enum MountOperationResult implements io.github.jwharm.javagi.Enumeration {
    /**
     * The request was fulfilled and the
     *     user specified data is now available
     */
    HANDLED(0),
    /**
     * The user requested the mount operation
     *     to be aborted
     */
    ABORTED(1),
    /**
     * The request was unhandled (i.e. not
     *     implemented)
     */
    UNHANDLED(2);
    
    private static final java.lang.String C_TYPE_NAME = "GMountOperationResult";
    
    private final int value;
    MountOperationResult(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static MountOperationResult of(int value) {
        return switch (value) {
            case 0 -> HANDLED;
            case 1 -> ABORTED;
            case 2 -> UNHANDLED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
