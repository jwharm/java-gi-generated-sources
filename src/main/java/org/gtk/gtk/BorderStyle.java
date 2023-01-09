package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes how the border of a UI element should be rendered.
 */
public enum BorderStyle implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No visible border
     */
    NONE(0),
    
    /**
     * Same as {@link BorderStyle#NONE}
     */
    HIDDEN(1),
    
    /**
     * A single line segment
     */
    SOLID(2),
    
    /**
     * Looks as if the content is sunken into the canvas
     */
    INSET(3),
    
    /**
     * Looks as if the content is coming out of the canvas
     */
    OUTSET(4),
    
    /**
     * A series of round dots
     */
    DOTTED(5),
    
    /**
     * A series of square-ended dashes
     */
    DASHED(6),
    
    /**
     * Two parallel lines with some space between them
     */
    DOUBLE(7),
    
    /**
     * Looks as if it were carved in the canvas
     */
    GROOVE(8),
    
    /**
     * Looks as if it were coming out of the canvas
     */
    RIDGE(9);
    
    private static final java.lang.String C_TYPE_NAME = "GtkBorderStyle";
    
    private final int value;
    
    /**
     * Create a new BorderStyle for the provided value
     * @param numeric value the enum value
     */
    BorderStyle(int value) {
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
     * Create a new BorderStyle for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static BorderStyle of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> HIDDEN;
            case 2 -> SOLID;
            case 3 -> INSET;
            case 4 -> OUTSET;
            case 5 -> DOTTED;
            case 6 -> DASHED;
            case 7 -> DOUBLE;
            case 8 -> GROOVE;
            case 9 -> RIDGE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
