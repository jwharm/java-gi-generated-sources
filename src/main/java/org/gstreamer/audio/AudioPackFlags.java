package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different flags that can be used when packing and unpacking.
 */
public class AudioPackFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioPackFlags";
    
    /**
     * No flag
     */
    public static final AudioPackFlags NONE = new AudioPackFlags(0);
    
    /**
     * When the source has a smaller depth
     *   than the target format, set the least significant bits of the target
     *   to 0. This is likely slightly faster but less accurate. When this flag
     *   is not specified, the most significant bits of the source are duplicated
     *   in the least significant bits of the destination.
     */
    public static final AudioPackFlags TRUNCATE_RANGE = new AudioPackFlags(1);
    
    /**
     * Create a new AudioPackFlags with the provided value
     */
    public AudioPackFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public AudioPackFlags or(AudioPackFlags... masks) {
        int value = this.getValue();
        for (AudioPackFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AudioPackFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static AudioPackFlags combined(AudioPackFlags mask, AudioPackFlags... masks) {
        int value = mask.getValue();
        for (AudioPackFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AudioPackFlags(value);
    }
}
