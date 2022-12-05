package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of a pad action.
 */
public enum PadActionType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Action is triggered by a pad button
     */
    BUTTON(0),
    /**
     * Action is triggered by a pad ring
     */
    RING(1),
    /**
     * Action is triggered by a pad strip
     */
    STRIP(2);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPadActionType";
    
    private final int value;
    PadActionType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PadActionType of(int value) {
        return switch (value) {
            case 0 -> BUTTON;
            case 1 -> RING;
            case 2 -> STRIP;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
