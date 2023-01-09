package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the possible states of an {@link Animation}.
 * <p>
 * The state can be controlled with {@code Animation#play},
 * {@code Animation.pause#], [method@Animation.resume},
 * {@code Animation.reset#] and [method@Animation.skip}.
 * @version 1.0
 */
public enum AnimationState implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * The animation hasn't started yet.
     */
    IDLE(0),
    
    /**
     * The animation has been paused.
     */
    PAUSED(1),
    
    /**
     * The animation is currently playing.
     */
    PLAYING(2),
    
    /**
     * The animation has finished.
     */
    FINISHED(3);
    
    private static final java.lang.String C_TYPE_NAME = "AdwAnimationState";
    
    private final int value;
    
    /**
     * Create a new AnimationState for the provided value
     * @param numeric value the enum value
     */
    AnimationState(int value) {
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
     * Create a new AnimationState for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AnimationState of(int value) {
        return switch (value) {
            case 0 -> IDLE;
            case 1 -> PAUSED;
            case 2 -> PLAYING;
            case 3 -> FINISHED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
