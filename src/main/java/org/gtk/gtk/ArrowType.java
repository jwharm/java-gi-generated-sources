package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to indicate the direction in which an arrow should point.
 */
public enum ArrowType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Represents an upward pointing arrow.
     */
    UP(0),
    /**
     * Represents a downward pointing arrow.
     */
    DOWN(1),
    /**
     * Represents a left pointing arrow.
     */
    LEFT(2),
    /**
     * Represents a right pointing arrow.
     */
    RIGHT(3),
    /**
     * No arrow.
     */
    NONE(4);
    
    private static final java.lang.String C_TYPE_NAME = "GtkArrowType";
    
    private final int value;
    ArrowType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static ArrowType of(int value) {
        return switch (value) {
            case 0 -> UP;
            case 1 -> DOWN;
            case 2 -> LEFT;
            case 3 -> RIGHT;
            case 4 -> NONE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
