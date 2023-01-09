package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that apply to a RTP Audio/Video header extension.
 * @version 1.20
 */
public class RTPHeaderExtensionFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPHeaderExtensionFlags";
    
    /**
     * The one byte rtp extension header.
     *              1-16 data bytes per extension with a maximum of
     *              14 extension ids in total.
     */
    public static final RTPHeaderExtensionFlags ONE_BYTE = new RTPHeaderExtensionFlags(1);
    
    /**
     * The two byte rtp extension header.
     *              256 data bytes per extension with a maximum of 255 (or 256
     *              including appbits) extensions in total.
     */
    public static final RTPHeaderExtensionFlags TWO_BYTE = new RTPHeaderExtensionFlags(2);
    
    /**
     * Create a new RTPHeaderExtensionFlags with the provided value
     */
    public RTPHeaderExtensionFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public RTPHeaderExtensionFlags or(RTPHeaderExtensionFlags... masks) {
        int value = this.getValue();
        for (RTPHeaderExtensionFlags arg : masks) {
            value |= arg.getValue();
        }
        return new RTPHeaderExtensionFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static RTPHeaderExtensionFlags combined(RTPHeaderExtensionFlags mask, RTPHeaderExtensionFlags... masks) {
        int value = mask.getValue();
        for (RTPHeaderExtensionFlags arg : masks) {
            value |= arg.getValue();
        }
        return new RTPHeaderExtensionFlags(value);
    }
}
