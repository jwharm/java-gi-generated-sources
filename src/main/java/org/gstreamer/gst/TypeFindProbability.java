package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The probability of the typefind function. Higher values have more certainty
 * in doing a reliable typefind.
 */
public enum TypeFindProbability implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * type undetected.
     */
    NONE(0),
    
    /**
     * unlikely typefind.
     */
    MINIMUM(1),
    
    /**
     * possible type detected.
     */
    POSSIBLE(50),
    
    /**
     * likely a type was detected.
     */
    LIKELY(80),
    
    /**
     * nearly certain that a type was detected.
     */
    NEARLY_CERTAIN(99),
    
    /**
     * very certain a type was detected.
     */
    MAXIMUM(100);
    
    private static final java.lang.String C_TYPE_NAME = "GstTypeFindProbability";
    
    private final int value;
    
    /**
     * Create a new TypeFindProbability for the provided value
     * @param numeric value the enum value
     */
    TypeFindProbability(int value) {
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
     * Create a new TypeFindProbability for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static TypeFindProbability of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> MINIMUM;
            case 50 -> POSSIBLE;
            case 80 -> LIKELY;
            case 99 -> NEARLY_CERTAIN;
            case 100 -> MAXIMUM;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
