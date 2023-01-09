package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines how a Unicode string is transformed in a canonical
 * form, standardizing such issues as whether a character with
 * an accent is represented as a base character and combining
 * accent or as a single precomposed character. Unicode strings
 * should generally be normalized before comparing them.
 */
public enum NormalizeMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * standardize differences that do not affect the
     *     text content, such as the above-mentioned accent representation
     */
    DEFAULT(0),
    
    /**
     * like {@link NormalizeMode#DEFAULT}, but with
     *     composed forms rather than a maximally decomposed form
     */
    DEFAULT_COMPOSE(1),
    
    /**
     * beyond {@link NormalizeMode#DEFAULT} also standardize the
     *     "compatibility" characters in Unicode, such as SUPERSCRIPT THREE
     *     to the standard forms (in this case DIGIT THREE). Formatting
     *     information may be lost but for most text operations such
     *     characters should be considered the same
     */
    ALL(2),
    
    /**
     * like {@link NormalizeMode#ALL}, but with composed
     *     forms rather than a maximally decomposed form
     */
    ALL_COMPOSE(3);
    
    /**
     * another name for {@link NormalizeMode#DEFAULT}
     */
    public static final NormalizeMode NFD = DEFAULT;
    
    /**
     * another name for {@link NormalizeMode#DEFAULT_COMPOSE}
     */
    public static final NormalizeMode NFC = DEFAULT_COMPOSE;
    
    /**
     * another name for {@link NormalizeMode#ALL}
     */
    public static final NormalizeMode NFKD = ALL;
    
    /**
     * another name for {@link NormalizeMode#ALL_COMPOSE}
     */
    public static final NormalizeMode NFKC = ALL_COMPOSE;
    
    private static final java.lang.String C_TYPE_NAME = "GNormalizeMode";
    
    private final int value;
    
    /**
     * Create a new NormalizeMode for the provided value
     * @param numeric value the enum value
     */
    NormalizeMode(int value) {
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
     * Create a new NormalizeMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static NormalizeMode of(int value) {
        return switch (value) {
            case 0 -> DEFAULT;
            case 1 -> DEFAULT_COMPOSE;
            case 2 -> ALL;
            case 3 -> ALL_COMPOSE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
