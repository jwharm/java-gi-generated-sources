package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Pipeline flags
 */
public class PipelineFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstPipelineFlags";
    
    /**
     * this pipeline works with a fixed clock
     */
    public static final PipelineFlags FIXED_CLOCK = new PipelineFlags(524288);
    
    /**
     * offset to define more flags
     */
    public static final PipelineFlags LAST = new PipelineFlags(8388608);
    
    public PipelineFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public PipelineFlags or(PipelineFlags mask) {
        return new PipelineFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static PipelineFlags combined(PipelineFlags mask, PipelineFlags... masks) {
        int value = mask.getValue();        for (PipelineFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PipelineFlags(value);
    }
}
