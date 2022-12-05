package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra flags passed to gst_audio_converter_new() and gst_audio_converter_samples().
 */
public class AudioConverterFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioConverterFlags";
    
    /**
     * no flag
     */
    public static final AudioConverterFlags NONE = new AudioConverterFlags(0);
    
    /**
     * the input sample arrays are writable and can be
     *    used as temporary storage during conversion.
     */
    public static final AudioConverterFlags IN_WRITABLE = new AudioConverterFlags(1);
    
    /**
     * allow arbitrary rate updates with
     *    gst_audio_converter_update_config().
     */
    public static final AudioConverterFlags VARIABLE_RATE = new AudioConverterFlags(2);
    
    public AudioConverterFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public AudioConverterFlags or(AudioConverterFlags mask) {
        return new AudioConverterFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static AudioConverterFlags combined(AudioConverterFlags mask, AudioConverterFlags... masks) {
        int value = mask.getValue();        for (AudioConverterFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AudioConverterFlags(value);
    }
}
