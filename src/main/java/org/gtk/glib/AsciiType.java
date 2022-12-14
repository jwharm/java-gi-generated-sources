package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AsciiType extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GAsciiType";
    
    public static final AsciiType ALNUM = new AsciiType(1);
    
    public static final AsciiType ALPHA = new AsciiType(2);
    
    public static final AsciiType CNTRL = new AsciiType(4);
    
    public static final AsciiType DIGIT = new AsciiType(8);
    
    public static final AsciiType GRAPH = new AsciiType(16);
    
    public static final AsciiType LOWER = new AsciiType(32);
    
    public static final AsciiType PRINT = new AsciiType(64);
    
    public static final AsciiType PUNCT = new AsciiType(128);
    
    public static final AsciiType SPACE = new AsciiType(256);
    
    public static final AsciiType UPPER = new AsciiType(512);
    
    public static final AsciiType XDIGIT = new AsciiType(1024);
    
    /**
     * Create a new AsciiType with the provided value
     */
    public AsciiType(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public AsciiType or(AsciiType... masks) {
        int value = this.getValue();
        for (AsciiType arg : masks) {
            value |= arg.getValue();
        }
        return new AsciiType(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static AsciiType combined(AsciiType mask, AsciiType... masks) {
        int value = mask.getValue();
        for (AsciiType arg : masks) {
            value |= arg.getValue();
        }
        return new AsciiType(value);
    }
}
