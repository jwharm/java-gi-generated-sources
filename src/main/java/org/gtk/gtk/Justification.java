package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used for justifying the text inside a {@link Label} widget.
 */
public enum Justification implements io.github.jwharm.javagi.Enumeration {
    /**
     * The text is placed at the left edge of the label.
     */
    LEFT(0),
    /**
     * The text is placed at the right edge of the label.
     */
    RIGHT(1),
    /**
     * The text is placed in the center of the label.
     */
    CENTER(2),
    /**
     * The text is placed is distributed across the label.
     */
    FILL(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkJustification";
    
    private final int value;
    Justification(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static Justification of(int value) {
        return switch (value) {
            case 0 -> LEFT;
            case 1 -> RIGHT;
            case 2 -> CENTER;
            case 3 -> FILL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
