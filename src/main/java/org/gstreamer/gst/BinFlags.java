package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstBinFlags are a set of flags specific to bins. Most are set/used
 * internally. They can be checked using the GST_OBJECT_FLAG_IS_SET() macro,
 * and (un)set using GST_OBJECT_FLAG_SET() and GST_OBJECT_FLAG_UNSET().
 */
public class BinFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstBinFlags";
    
    /**
     * Don't resync a state change when elements are added or linked in the bin
     */
    public static final BinFlags NO_RESYNC = new BinFlags(16384);
    
    /**
     * Indicates whether the bin can handle elements that add/remove source pads
     * at any point in time without first posting a no-more-pads signal.
     */
    public static final BinFlags STREAMS_AWARE = new BinFlags(32768);
    
    /**
     * The last enum in the series of flags for bins. Derived classes can use this
     * as first value in a list of flags.
     */
    public static final BinFlags LAST = new BinFlags(524288);
    
    public BinFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BinFlags combined(BinFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BinFlags combined(BinFlags mask, BinFlags... masks) {
        for (BinFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
