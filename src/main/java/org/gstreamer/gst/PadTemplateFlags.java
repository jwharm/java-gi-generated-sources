package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags for the padtemplate
 */
public class PadTemplateFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstPadTemplateFlags";
    
    /**
     * first flag that can be used by subclasses.
     */
    public static final PadTemplateFlags LAST = new PadTemplateFlags(256);
    
    public PadTemplateFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public PadTemplateFlags or(PadTemplateFlags mask) {
        return new PadTemplateFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static PadTemplateFlags combined(PadTemplateFlags mask, PadTemplateFlags... masks) {
        int value = mask.getValue();        for (PadTemplateFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PadTemplateFlags(value);
    }
}
