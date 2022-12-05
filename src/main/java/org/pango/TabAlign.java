package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoTabAlign} specifies where the text appears relative to the tab stop
 * position.
 */
public enum TabAlign implements io.github.jwharm.javagi.Enumeration {
    /**
     * the text appears to the right of the tab stop position
     */
    LEFT(0),
    /**
     * the text appears to the left of the tab stop position
     *   until the available space is filled. Since: 1.50
     */
    RIGHT(1),
    /**
     * the text is centered at the tab stop position
     *   until the available space is filled. Since: 1.50
     */
    CENTER(2),
    /**
     * text before the first occurrence of the decimal point
     *   character appears to the left of the tab stop position (until the available
     *   space is filled), the rest to the right. Since: 1.50
     */
    DECIMAL(3);
    
    private static final java.lang.String C_TYPE_NAME = "PangoTabAlign";
    
    private final int value;
    TabAlign(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TabAlign of(int value) {
        return switch (value) {
            case 0 -> LEFT;
            case 1 -> RIGHT;
            case 2 -> CENTER;
            case 3 -> DECIMAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
