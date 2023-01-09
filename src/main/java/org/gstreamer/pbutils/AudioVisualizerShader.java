package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different types of supported background shading functions.
 */
public enum AudioVisualizerShader implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * no shading
     */
    NONE(0),
    
    /**
     * plain fading
     */
    FADE(1),
    
    /**
     * fade and move up
     */
    FADE_AND_MOVE_UP(2),
    
    /**
     * fade and move down
     */
    FADE_AND_MOVE_DOWN(3),
    
    /**
     * fade and move left
     */
    FADE_AND_MOVE_LEFT(4),
    
    /**
     * fade and move right
     */
    FADE_AND_MOVE_RIGHT(5),
    
    /**
     * fade and move horizontally out
     */
    FADE_AND_MOVE_HORIZ_OUT(6),
    
    /**
     * fade and move horizontally in
     */
    FADE_AND_MOVE_HORIZ_IN(7),
    
    /**
     * fade and move vertically out
     */
    FADE_AND_MOVE_VERT_OUT(8),
    
    /**
     * fade and move vertically in
     */
    FADE_AND_MOVE_VERT_IN(9);
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioVisualizerShader";
    
    private final int value;
    
    /**
     * Create a new AudioVisualizerShader for the provided value
     * @param numeric value the enum value
     */
    AudioVisualizerShader(int value) {
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
     * Create a new AudioVisualizerShader for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AudioVisualizerShader of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> FADE;
            case 2 -> FADE_AND_MOVE_UP;
            case 3 -> FADE_AND_MOVE_DOWN;
            case 4 -> FADE_AND_MOVE_LEFT;
            case 5 -> FADE_AND_MOVE_RIGHT;
            case 6 -> FADE_AND_MOVE_HORIZ_OUT;
            case 7 -> FADE_AND_MOVE_HORIZ_IN;
            case 8 -> FADE_AND_MOVE_VERT_OUT;
            case 9 -> FADE_AND_MOVE_VERT_IN;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
