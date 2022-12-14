package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The result of gst_iterator_next().
 */
public enum IteratorResult implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No more items in the iterator
     */
    DONE(0),
    
    /**
     * An item was retrieved
     */
    OK(1),
    
    /**
     * Datastructure changed while iterating
     */
    RESYNC(2),
    
    /**
     * An error happened
     */
    ERROR(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstIteratorResult";
    
    private final int value;
    
    /**
     * Create a new IteratorResult for the provided value
     * @param numeric value the enum value
     */
    IteratorResult(int value) {
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
     * Create a new IteratorResult for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static IteratorResult of(int value) {
        return switch (value) {
            case 0 -> DONE;
            case 1 -> OK;
            case 2 -> RESYNC;
            case 3 -> ERROR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
