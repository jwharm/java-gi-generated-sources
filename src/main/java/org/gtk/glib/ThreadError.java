package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Possible errors of thread related functions.
 */
public enum ThreadError implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * a thread couldn't be created due to resource
     *                        shortage. Try again later.
     */
    THREAD_ERROR_AGAIN(0);
    
    private static final java.lang.String C_TYPE_NAME = "GThreadError";
    
    private final int value;
    
    /**
     * Create a new ThreadError for the provided value
     * @param numeric value the enum value
     */
    ThreadError(int value) {
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
     * Create a new ThreadError for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static ThreadError of(int value) {
        return switch (value) {
            case 0 -> THREAD_ERROR_AGAIN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
