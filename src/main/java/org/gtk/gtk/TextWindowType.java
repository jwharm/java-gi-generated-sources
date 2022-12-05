package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to reference the parts of {@code GtkTextView}.
 */
public enum TextWindowType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Window that floats over scrolling areas.
     */
    WIDGET(1),
    /**
     * Scrollable text window.
     */
    TEXT(2),
    /**
     * Left side border window.
     */
    LEFT(3),
    /**
     * Right side border window.
     */
    RIGHT(4),
    /**
     * Top border window.
     */
    TOP(5),
    /**
     * Bottom border window.
     */
    BOTTOM(6);
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextWindowType";
    
    private final int value;
    TextWindowType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TextWindowType of(int value) {
        return switch (value) {
            case 1 -> WIDGET;
            case 2 -> TEXT;
            case 3 -> LEFT;
            case 4 -> RIGHT;
            case 5 -> TOP;
            case 6 -> BOTTOM;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
