package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different representations of a stream volume. gst_stream_volume_convert_volume()
 * allows to convert between the different representations.
 * <p>
 * Formulas to convert from a linear to a cubic or dB volume are
 * cbrt(val) and 20 * log10 (val).
 */
public enum StreamVolumeFormat implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Linear scale factor, 1.0 = 100%
     */
    LINEAR(0),
    
    /**
     * Cubic volume scale
     */
    CUBIC(1),
    
    /**
     * Logarithmic volume scale (dB, amplitude not power)
     */
    DB(2);
    
    private static final java.lang.String C_TYPE_NAME = "GstStreamVolumeFormat";
    
    private final int value;
    
    /**
     * Create a new StreamVolumeFormat for the provided value
     * @param numeric value the enum value
     */
    StreamVolumeFormat(int value) {
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
     * Create a new StreamVolumeFormat for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static StreamVolumeFormat of(int value) {
        return switch (value) {
            case 0 -> LINEAR;
            case 1 -> CUBIC;
            case 2 -> DB;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
