package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The result of a {@link Promise}
 * @version 1.14
 */
public enum PromiseResult implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Initial state. Waiting for transition to any
     * 	other state.
     */
    PENDING(0),
    
    /**
     * Interrupted by the consumer as it doesn't
     * 	want the value anymore.
     */
    INTERRUPTED(1),
    
    /**
     * A producer marked a reply
     */
    REPLIED(2),
    
    /**
     * The promise expired (the carrying object
     * 	lost all refs) and the promise will never be fulfilled.
     */
    EXPIRED(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstPromiseResult";
    
    private final int value;
    
    /**
     * Create a new PromiseResult for the provided value
     * @param numeric value the enum value
     */
    PromiseResult(int value) {
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
     * Create a new PromiseResult for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PromiseResult of(int value) {
        return switch (value) {
            case 0 -> PENDING;
            case 1 -> INTERRUPTED;
            case 2 -> REPLIED;
            case 3 -> EXPIRED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
