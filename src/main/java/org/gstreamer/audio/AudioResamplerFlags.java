package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Different resampler flags.
 * @version 1.10
 */
public class AudioResamplerFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioResamplerFlags";
    
    /**
     * no flags
     */
    public static final AudioResamplerFlags NONE = new AudioResamplerFlags(0);
    
    /**
     * input samples are non-interleaved.
     *    an array of blocks of samples, one for each channel, should be passed to the
     *    resample function.
     */
    public static final AudioResamplerFlags NON_INTERLEAVED_IN = new AudioResamplerFlags(1);
    
    /**
     * output samples are non-interleaved.
     *    an array of blocks of samples, one for each channel, should be passed to the
     *    resample function.
     */
    public static final AudioResamplerFlags NON_INTERLEAVED_OUT = new AudioResamplerFlags(2);
    
    /**
     * optimize for dynamic updates of the sample
     *    rates with gst_audio_resampler_update(). This will select an interpolating filter
     *    when {@code GST_AUDIO_RESAMPLER_FILTER_MODE_AUTO} is configured.
     */
    public static final AudioResamplerFlags VARIABLE_RATE = new AudioResamplerFlags(4);
    
    public AudioResamplerFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public AudioResamplerFlags or(AudioResamplerFlags mask) {
        return new AudioResamplerFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static AudioResamplerFlags combined(AudioResamplerFlags mask, AudioResamplerFlags... masks) {
        int value = mask.getValue();        for (AudioResamplerFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AudioResamplerFlags(value);
    }
}
