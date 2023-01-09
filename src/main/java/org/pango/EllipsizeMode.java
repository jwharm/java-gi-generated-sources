package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoEllipsizeMode} describes what sort of ellipsization
 * should be applied to text.
 * <p>
 * In the ellipsization process characters are removed from the
 * text in order to make it fit to a given width and replaced
 * with an ellipsis.
 */
public enum EllipsizeMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No ellipsization
     */
    NONE(0),
    
    /**
     * Omit characters at the start of the text
     */
    START(1),
    
    /**
     * Omit characters in the middle of the text
     */
    MIDDLE(2),
    
    /**
     * Omit characters at the end of the text
     */
    END(3);
    
    private static final java.lang.String C_TYPE_NAME = "PangoEllipsizeMode";
    
    private final int value;
    
    /**
     * Create a new EllipsizeMode for the provided value
     * @param numeric value the enum value
     */
    EllipsizeMode(int value) {
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
     * Create a new EllipsizeMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static EllipsizeMode of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> START;
            case 2 -> MIDDLE;
            case 3 -> END;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
