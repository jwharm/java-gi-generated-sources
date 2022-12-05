package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible values for the {@link AccessibleState#INVALID}
 * accessible state.
 * <p>
 * Note that the {@link AccessibleInvalidState#FALSE} and
 * {@link AccessibleInvalidState#TRUE} have the same values
 * as {@code false} and {@code true}.
 */
public enum AccessibleInvalidState implements io.github.jwharm.javagi.Enumeration {
    /**
     * There are no detected errors in the value
     */
    FALSE(0),
    /**
     * The value entered by the user has failed validation
     */
    TRUE(1),
    /**
     * A grammatical error was detected
     */
    GRAMMAR(2),
    /**
     * A spelling error was detected
     */
    SPELLING(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkAccessibleInvalidState";
    
    private final int value;
    AccessibleInvalidState(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AccessibleInvalidState of(int value) {
        return switch (value) {
            case 0 -> FALSE;
            case 1 -> TRUE;
            case 2 -> GRAMMAR;
            case 3 -> SPELLING;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
