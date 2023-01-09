package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration that affects font sizes for superscript
 * and subscript positioning and for (emulated) Small Caps.
 * @version 1.50
 */
public enum FontScale implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Leave the font size unchanged
     */
    NONE(0),
    
    /**
     * Change the font to a size suitable for superscripts
     */
    SUPERSCRIPT(1),
    
    /**
     * Change the font to a size suitable for subscripts
     */
    SUBSCRIPT(2),
    
    /**
     * Change the font to a size suitable for Small Caps
     */
    SMALL_CAPS(3);
    
    private static final java.lang.String C_TYPE_NAME = "PangoFontScale";
    
    private final int value;
    
    /**
     * Create a new FontScale for the provided value
     * @param numeric value the enum value
     */
    FontScale(int value) {
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
     * Create a new FontScale for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static FontScale of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> SUPERSCRIPT;
            case 2 -> SUBSCRIPT;
            case 3 -> SMALL_CAPS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
