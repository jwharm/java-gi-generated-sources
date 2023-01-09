package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoCoverageLevel} is used to indicate how well a font can
 * represent a particular Unicode character for a particular script.
 * <p>
 * Since 1.44, only {@link CoverageLevel#NONE} and {@link CoverageLevel#EXACT}
 * will be returned.
 */
public enum CoverageLevel implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The character is not representable with
     *   the font.
     */
    NONE(0),
    
    /**
     * The character is represented in a
     *   way that may be comprehensible but is not the correct
     *   graphical form. For instance, a Hangul character represented
     *   as a a sequence of Jamos, or a Latin transliteration of a
     *   Cyrillic word.
     */
    FALLBACK(1),
    
    /**
     * The character is represented as
     *   basically the correct graphical form, but with a stylistic
     *   variant inappropriate for the current script.
     */
    APPROXIMATE(2),
    
    /**
     * The character is represented as the
     *   correct graphical form.
     */
    EXACT(3);
    
    private static final java.lang.String C_TYPE_NAME = "PangoCoverageLevel";
    
    private final int value;
    
    /**
     * Create a new CoverageLevel for the provided value
     * @param numeric value the enum value
     */
    CoverageLevel(int value) {
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
     * Create a new CoverageLevel for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static CoverageLevel of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> FALLBACK;
            case 2 -> APPROXIMATE;
            case 3 -> EXACT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
