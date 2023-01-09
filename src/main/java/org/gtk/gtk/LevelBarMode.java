package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes how {@link LevelBar} contents should be rendered.
 * <p>
 * Note that this enumeration could be extended with additional modes
 * in the future.
 */
public enum LevelBarMode implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * the bar has a continuous mode
     */
    CONTINUOUS(0),
    
    /**
     * the bar has a discrete mode
     */
    DISCRETE(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkLevelBarMode";
    
    private final int value;
    
    /**
     * Create a new LevelBarMode for the provided value
     * @param numeric value the enum value
     */
    LevelBarMode(int value) {
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
     * Create a new LevelBarMode for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static LevelBarMode of(int value) {
        return switch (value) {
            case 0 -> CONTINUOUS;
            case 1 -> DISCRETE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
