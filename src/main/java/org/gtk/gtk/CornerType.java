package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies which corner a child widget should be placed in when packed into
 * a {@code GtkScrolledWindow.}
 * <p>
 * This is effectively the opposite of where the scroll bars are placed.
 */
public enum CornerType implements io.github.jwharm.javagi.Enumeration {
    /**
     * Place the scrollbars on the right and bottom of the
     *   widget (default behaviour).
     */
    TOP_LEFT(0),
    /**
     * Place the scrollbars on the top and right of the
     *   widget.
     */
    BOTTOM_LEFT(1),
    /**
     * Place the scrollbars on the left and bottom of the
     *   widget.
     */
    TOP_RIGHT(2),
    /**
     * Place the scrollbars on the top and left of the
     *   widget.
     */
    BOTTOM_RIGHT(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkCornerType";
    
    private final int value;
    CornerType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static CornerType of(int value) {
        return switch (value) {
            case 0 -> TOP_LEFT;
            case 1 -> BOTTOM_LEFT;
            case 2 -> TOP_RIGHT;
            case 3 -> BOTTOM_RIGHT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
