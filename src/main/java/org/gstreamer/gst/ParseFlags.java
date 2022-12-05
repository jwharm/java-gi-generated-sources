package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Parsing options.
 */
public class ParseFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstParseFlags";
    
    /**
     * Do not use any special parsing options.
     */
    public static final ParseFlags NONE = new ParseFlags(0);
    
    /**
     * Always return {@code null} when an error occurs
     *     (default behaviour is to return partially constructed bins or elements
     *      in some cases)
     */
    public static final ParseFlags FATAL_ERRORS = new ParseFlags(1);
    
    /**
     * If a bin only has a single element,
     *     just return the element.
     */
    public static final ParseFlags NO_SINGLE_ELEMENT_BINS = new ParseFlags(2);
    
    /**
     * If more than one toplevel element is described
     *     by the pipeline description string, put them in a {@link Bin} instead of a
     *     {@link Pipeline}. (Since: 1.10)
     */
    public static final ParseFlags PLACE_IN_BIN = new ParseFlags(4);
    
    public ParseFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ParseFlags or(ParseFlags mask) {
        return new ParseFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ParseFlags combined(ParseFlags mask, ParseFlags... masks) {
        int value = mask.getValue();        for (ParseFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ParseFlags(value);
    }
}
