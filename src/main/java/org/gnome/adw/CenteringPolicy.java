package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes title centering behavior of a {@link HeaderBar} widget.
 * @version 1.0
 */
public enum CenteringPolicy implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Keep the title centered when possible
     */
    LOOSE(0),
    
    /**
     * Keep the title centered at all cost
     */
    STRICT(1);
    
    private static final java.lang.String C_TYPE_NAME = "AdwCenteringPolicy";
    
    private final int value;
    
    /**
     * Create a new CenteringPolicy for the provided value
     * @param numeric value the enum value
     */
    CenteringPolicy(int value) {
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
     * Create a new CenteringPolicy for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static CenteringPolicy of(int value) {
        return switch (value) {
            case 0 -> LOOSE;
            case 1 -> STRICT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
