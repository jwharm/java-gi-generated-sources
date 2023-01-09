package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the possible transitions in a {@link Squeezer} widget.
 * @version 1.0
 */
public enum SqueezerTransitionType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * No transition
     */
    NONE(0),
    
    /**
     * A cross-fade
     */
    CROSSFADE(1);
    
    private static final java.lang.String C_TYPE_NAME = "AdwSqueezerTransitionType";
    
    private final int value;
    
    /**
     * Create a new SqueezerTransitionType for the provided value
     * @param numeric value the enum value
     */
    SqueezerTransitionType(int value) {
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
     * Create a new SqueezerTransitionType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static SqueezerTransitionType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> CROSSFADE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
