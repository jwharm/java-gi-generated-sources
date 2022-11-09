package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Bit masks used to check or determine specific characteristics of a
 * fundamental type.
 */
public class TypeFundamentalFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GTypeFundamentalFlags";
    
    /**
     * Indicates a classed type
     */
    public static final TypeFundamentalFlags CLASSED = new TypeFundamentalFlags(1);
    
    /**
     * Indicates an instantiatable type (implies classed)
     */
    public static final TypeFundamentalFlags INSTANTIATABLE = new TypeFundamentalFlags(2);
    
    /**
     * Indicates a flat derivable type
     */
    public static final TypeFundamentalFlags DERIVABLE = new TypeFundamentalFlags(4);
    
    /**
     * Indicates a deep derivable type (implies derivable)
     */
    public static final TypeFundamentalFlags DEEP_DERIVABLE = new TypeFundamentalFlags(8);
    
    public TypeFundamentalFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TypeFundamentalFlags combined(TypeFundamentalFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TypeFundamentalFlags combined(TypeFundamentalFlags mask, TypeFundamentalFlags... masks) {
        for (TypeFundamentalFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
