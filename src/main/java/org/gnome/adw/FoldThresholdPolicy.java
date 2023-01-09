package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Determines when {@link Flap} will fold.
 * @version 1.0
 */
public enum FoldThresholdPolicy implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Folding is based on the minimum size
     */
    MINIMUM(0),
    
    /**
     * Folding is based on the natural size
     */
    NATURAL(1);
    
    private static final java.lang.String C_TYPE_NAME = "AdwFoldThresholdPolicy";
    
    private final int value;
    
    /**
     * Create a new FoldThresholdPolicy for the provided value
     * @param numeric value the enum value
     */
    FoldThresholdPolicy(int value) {
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
     * Create a new FoldThresholdPolicy for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static FoldThresholdPolicy of(int value) {
        return switch (value) {
            case 0 -> MINIMUM;
            case 1 -> NATURAL;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
