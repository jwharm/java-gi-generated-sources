package org.gstreamer.gl;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Output anaglyph type to generate when downmixing to mono
 */
public enum GLStereoDownmix implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Dubois optimised Green-Magenta anaglyph
     */
    GREEN_MAGENTA_DUBOIS(0),
    
    /**
     * Dubois optimised Red-Cyan anaglyph
     */
    RED_CYAN_DUBOIS(1),
    
    /**
     * Dubois optimised Amber-Blue anaglyph
     */
    AMBER_BLUE_DUBOIS(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstGLStereoDownmix";
    
    private final int value;
    
    /**
     * Create a new GLStereoDownmix for the provided value
     * @param numeric value the enum value
     */
    GLStereoDownmix(int value) {
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
     * Create a new GLStereoDownmix for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static GLStereoDownmix of(int value) {
        return switch (value) {
            case 0 -> GREEN_MAGENTA_DUBOIS;
            case 1 -> RED_CYAN_DUBOIS;
            case 2 -> AMBER_BLUE_DUBOIS;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
