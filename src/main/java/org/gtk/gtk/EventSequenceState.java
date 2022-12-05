package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the state of a {@code Gdk.EventSequence] in a [class@Gesture}.
 */
public enum EventSequenceState implements io.github.jwharm.javagi.Enumeration {
    /**
     * The sequence is handled, but not grabbed.
     */
    NONE(0),
    /**
     * The sequence is handled and grabbed.
     */
    CLAIMED(1),
    /**
     * The sequence is denied.
     */
    DENIED(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkEventSequenceState";
    
    private final int value;
    EventSequenceState(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static EventSequenceState of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> CLAIMED;
            case 2 -> DENIED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
