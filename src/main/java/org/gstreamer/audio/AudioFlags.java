package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra audio flags
 */
public class AudioFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioFlags";
    
    /**
     * no valid flag
     */
    public static final AudioFlags NONE = new AudioFlags(0);
    
    /**
     * the position array explicitly
     *     contains unpositioned channels.
     */
    public static final AudioFlags UNPOSITIONED = new AudioFlags(1);
    
    public AudioFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public AudioFlags or(AudioFlags... masks) {
        int value = this.getValue();
        for (AudioFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AudioFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static AudioFlags combined(AudioFlags mask, AudioFlags... masks) {
        int value = mask.getValue();
        for (AudioFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AudioFlags(value);
    }
}
