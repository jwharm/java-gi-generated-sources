package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags passed to gst_audio_channel_mixer_new()
 */
public class AudioChannelMixerFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioChannelMixerFlags";
    
    /**
     * no flag
     */
    public static final AudioChannelMixerFlags NONE = new AudioChannelMixerFlags(0);
    
    /**
     * input channels are not interleaved
     */
    public static final AudioChannelMixerFlags NON_INTERLEAVED_IN = new AudioChannelMixerFlags(1);
    
    /**
     * output channels are not interleaved
     */
    public static final AudioChannelMixerFlags NON_INTERLEAVED_OUT = new AudioChannelMixerFlags(2);
    
    /**
     * input channels are explicitly unpositioned
     */
    public static final AudioChannelMixerFlags UNPOSITIONED_IN = new AudioChannelMixerFlags(4);
    
    /**
     * output channels are explicitly unpositioned
     */
    public static final AudioChannelMixerFlags UNPOSITIONED_OUT = new AudioChannelMixerFlags(8);
    
    public AudioChannelMixerFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public AudioChannelMixerFlags or(AudioChannelMixerFlags... masks) {
        int value = this.getValue();
        for (AudioChannelMixerFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AudioChannelMixerFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static AudioChannelMixerFlags combined(AudioChannelMixerFlags mask, AudioChannelMixerFlags... masks) {
        int value = mask.getValue();
        for (AudioChannelMixerFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AudioChannelMixerFlags(value);
    }
}
