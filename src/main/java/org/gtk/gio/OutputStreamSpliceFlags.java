package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GOutputStreamSpliceFlags determine how streams should be spliced.
 */
public class OutputStreamSpliceFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GOutputStreamSpliceFlags";
    
    /**
     * Do not close either stream.
     */
    public static final OutputStreamSpliceFlags NONE = new OutputStreamSpliceFlags(0);
    
    /**
     * Close the source stream after
     *     the splice.
     */
    public static final OutputStreamSpliceFlags CLOSE_SOURCE = new OutputStreamSpliceFlags(1);
    
    /**
     * Close the target stream after
     *     the splice.
     */
    public static final OutputStreamSpliceFlags CLOSE_TARGET = new OutputStreamSpliceFlags(2);
    
    /**
     * Create a new OutputStreamSpliceFlags with the provided value
     */
    public OutputStreamSpliceFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public OutputStreamSpliceFlags or(OutputStreamSpliceFlags... masks) {
        int value = this.getValue();
        for (OutputStreamSpliceFlags arg : masks) {
            value |= arg.getValue();
        }
        return new OutputStreamSpliceFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static OutputStreamSpliceFlags combined(OutputStreamSpliceFlags mask, OutputStreamSpliceFlags... masks) {
        int value = mask.getValue();
        for (OutputStreamSpliceFlags arg : masks) {
            value |= arg.getValue();
        }
        return new OutputStreamSpliceFlags(value);
    }
}
