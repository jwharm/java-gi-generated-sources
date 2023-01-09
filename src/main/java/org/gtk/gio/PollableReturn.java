package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Return value for various IO operations that signal errors via the
 * return value and not necessarily via a {@link org.gtk.glib.Error}.
 * <p>
 * This enum exists to be able to return errors to callers without having to
 * allocate a {@link org.gtk.glib.Error}. Allocating {@code GErrors} can be quite expensive for
 * regularly happening errors like {@link IOErrorEnum#WOULD_BLOCK}.
 * <p>
 * In case of {@link PollableReturn#FAILED} a {@link org.gtk.glib.Error} should be set for the
 * operation to give details about the error that happened.
 * @version 2.60
 */
public enum PollableReturn implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Generic error condition for when an operation fails.
     */
    FAILED(0),
    
    /**
     * The operation was successfully finished.
     */
    OK(1),
    
    /**
     * The operation would block.
     */
    WOULD_BLOCK(-27);
    
    private static final java.lang.String C_TYPE_NAME = "GPollableReturn";
    
    private final int value;
    
    /**
     * Create a new PollableReturn for the provided value
     * @param numeric value the enum value
     */
    PollableReturn(int value) {
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
     * Create a new PollableReturn for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static PollableReturn of(int value) {
        return switch (value) {
            case 0 -> FAILED;
            case 1 -> OK;
            case -27 -> WOULD_BLOCK;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
