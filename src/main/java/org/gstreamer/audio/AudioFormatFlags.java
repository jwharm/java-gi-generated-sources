package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The different audio flags that a format info can have.
 */
public class AudioFormatFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioFormatFlags";
    
    /**
     * integer samples
     */
    public static final AudioFormatFlags INTEGER = new AudioFormatFlags(1);
    
    /**
     * float samples
     */
    public static final AudioFormatFlags FLOAT = new AudioFormatFlags(2);
    
    /**
     * signed samples
     */
    public static final AudioFormatFlags SIGNED = new AudioFormatFlags(4);
    
    /**
     * complex layout
     */
    public static final AudioFormatFlags COMPLEX = new AudioFormatFlags(16);
    
    /**
     * the format can be used in
     * {@link AudioFormatUnpack} and {@link AudioFormatPack} functions
     */
    public static final AudioFormatFlags UNPACK = new AudioFormatFlags(32);
    
    /**
     * Create a new AudioFormatFlags with the provided value
     */
    public AudioFormatFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public AudioFormatFlags or(AudioFormatFlags... masks) {
        int value = this.getValue();
        for (AudioFormatFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AudioFormatFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static AudioFormatFlags combined(AudioFormatFlags mask, AudioFormatFlags... masks) {
        int value = mask.getValue();
        for (AudioFormatFlags arg : masks) {
            value |= arg.getValue();
        }
        return new AudioFormatFlags(value);
    }
}
