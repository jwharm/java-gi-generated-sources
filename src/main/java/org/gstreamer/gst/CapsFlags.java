package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Extra flags for a caps.
 */
public class CapsFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstCapsFlags";
    
    /**
     * Caps has no specific content, but can contain
     *    anything.
     */
    public static final CapsFlags ANY = new CapsFlags(16);
    
    public CapsFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public CapsFlags or(CapsFlags mask) {
        return new CapsFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static CapsFlags combined(CapsFlags mask, CapsFlags... masks) {
        int value = mask.getValue();        for (CapsFlags arg : masks) {
            value |= arg.getValue();
        }
        return new CapsFlags(value);
    }
}
