package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Available details for pipeline graphs produced by GST_DEBUG_BIN_TO_DOT_FILE()
 * and GST_DEBUG_BIN_TO_DOT_FILE_WITH_TS().
 */
public class DebugGraphDetails extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstDebugGraphDetails";
    
    /**
     * show caps-name on edges
     */
    public static final DebugGraphDetails MEDIA_TYPE = new DebugGraphDetails(1);
    
    /**
     * show caps-details on edges
     */
    public static final DebugGraphDetails CAPS_DETAILS = new DebugGraphDetails(2);
    
    /**
     * show modified parameters on
     *                                           elements
     */
    public static final DebugGraphDetails NON_DEFAULT_PARAMS = new DebugGraphDetails(4);
    
    /**
     * show element states
     */
    public static final DebugGraphDetails STATES = new DebugGraphDetails(8);
    
    /**
     * show full element parameter values even
     *                                    if they are very long
     */
    public static final DebugGraphDetails FULL_PARAMS = new DebugGraphDetails(16);
    
    /**
     * show all the typical details that one might want
     */
    public static final DebugGraphDetails ALL = new DebugGraphDetails(15);
    
    /**
     * show all details regardless of how large or
     *                                verbose they make the resulting output
     */
    public static final DebugGraphDetails VERBOSE = new DebugGraphDetails(-1);
    
    public DebugGraphDetails(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DebugGraphDetails combined(DebugGraphDetails mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DebugGraphDetails combined(DebugGraphDetails mask, DebugGraphDetails... masks) {
        for (DebugGraphDetails arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
