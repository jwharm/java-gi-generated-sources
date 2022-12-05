package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible statuses of a one-time initialization function
 * controlled by a {@link Once} struct.
 * @version 2.4
 */
public enum OnceStatus implements io.github.jwharm.javagi.Enumeration {
    /**
     * the function has not been called yet.
     */
    NOTCALLED(0),
    /**
     * the function call is currently in progress.
     */
    PROGRESS(1),
    /**
     * the function has been called.
     */
    READY(2);
    
    private static final java.lang.String C_TYPE_NAME = "GOnceStatus";
    
    private final int value;
    OnceStatus(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static OnceStatus of(int value) {
        return switch (value) {
            case 0 -> NOTCALLED;
            case 1 -> PROGRESS;
            case 2 -> READY;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
