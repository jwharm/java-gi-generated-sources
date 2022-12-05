package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoAlignment} describes how to align the lines of a {@code PangoLayout}
 * within the available space.
 * <p>
 * If the {@code PangoLayout} is set to justify using {@link Layout#setJustify},
 * this only affects partial lines.
 * <p>
 * See {@link Layout#setAutoDir} for how text direction affects
 * the interpretation of {@code PangoAlignment} values.
 */
public enum Alignment implements io.github.jwharm.javagi.Enumeration {
    /**
     * Put all available space on the right
     */
    LEFT(0),
    /**
     * Center the line within the available space
     */
    CENTER(1),
    /**
     * Put all available space on the left
     */
    RIGHT(2);
    
    private static final java.lang.String C_TYPE_NAME = "PangoAlignment";
    
    private final int value;
    Alignment(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static Alignment of(int value) {
        return switch (value) {
            case 0 -> LEFT;
            case 1 -> CENTER;
            case 2 -> RIGHT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
