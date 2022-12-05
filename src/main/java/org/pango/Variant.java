package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration specifying capitalization variant of the font.
 */
public enum Variant implements io.github.jwharm.javagi.Enumeration {
    /**
     * A normal font.
     */
    NORMAL(0),
    /**
     * A font with the lower case characters
     *   replaced by smaller variants of the capital characters.
     */
    SMALL_CAPS(1),
    /**
     * A font with all characters
     *   replaced by smaller variants of the capital characters. Since: 1.50
     */
    ALL_SMALL_CAPS(2),
    /**
     * A font with the lower case characters
     *   replaced by smaller variants of the capital characters.
     *   Petite Caps can be even smaller than Small Caps. Since: 1.50
     */
    PETITE_CAPS(3),
    /**
     * A font with all characters
     *   replaced by smaller variants of the capital characters.
     *   Petite Caps can be even smaller than Small Caps. Since: 1.50
     */
    ALL_PETITE_CAPS(4),
    /**
     * A font with the upper case characters
     *   replaced by smaller variants of the capital letters. Since: 1.50
     */
    UNICASE(5),
    /**
     * A font with capital letters that
     *   are more suitable for all-uppercase titles. Since: 1.50
     */
    TITLE_CAPS(6);
    
    private static final java.lang.String C_TYPE_NAME = "PangoVariant";
    
    private final int value;
    Variant(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static Variant of(int value) {
        return switch (value) {
            case 0 -> NORMAL;
            case 1 -> SMALL_CAPS;
            case 2 -> ALL_SMALL_CAPS;
            case 3 -> PETITE_CAPS;
            case 4 -> ALL_PETITE_CAPS;
            case 5 -> UNICASE;
            case 6 -> TITLE_CAPS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
