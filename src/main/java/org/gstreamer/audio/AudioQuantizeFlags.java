package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra flags that can be passed to gst_audio_quantize_new()
 */
public class AudioQuantizeFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioQuantizeFlags";
    
    /**
     * no flags
     */
    public static final AudioQuantizeFlags NONE = new AudioQuantizeFlags(0);
    
    /**
     * samples are non-interleaved
     */
    public static final AudioQuantizeFlags NON_INTERLEAVED = new AudioQuantizeFlags(1);
    
    /**
     * Create a new AudioQuantizeFlags with the provided value
     */
    public AudioQuantizeFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public AudioQuantizeFlags or(AudioQuantizeFlags... masks) {
        int value = this.getValue();
        for (AudioQuantizeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AudioQuantizeFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static AudioQuantizeFlags combined(AudioQuantizeFlags mask, AudioQuantizeFlags... masks) {
        int value = mask.getValue();
        for (AudioQuantizeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AudioQuantizeFlags(value);
    }
}
