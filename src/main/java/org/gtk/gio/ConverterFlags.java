package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when calling a g_converter_convert().
 * @version 2.24
 */
public class ConverterFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GConverterFlags";
    
    /**
     * No flags.
     */
    public static final ConverterFlags NONE = new ConverterFlags(0);
    
    /**
     * At end of input data
     */
    public static final ConverterFlags INPUT_AT_END = new ConverterFlags(1);
    
    /**
     * Flush data
     */
    public static final ConverterFlags FLUSH = new ConverterFlags(2);
    
    /**
     * Create a new ConverterFlags with the provided value
     */
    public ConverterFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ConverterFlags or(ConverterFlags... masks) {
        int value = this.getValue();
        for (ConverterFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ConverterFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ConverterFlags combined(ConverterFlags mask, ConverterFlags... masks) {
        int value = mask.getValue();
        for (ConverterFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ConverterFlags(value);
    }
}
