package org.gtk.gobject;

/**
 * Bit masks used to check or determine specific characteristics of a
 * fundamental type.
 */
public class TypeFundamentalFlags extends io.github.jwharm.javagi.Bitfield {

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
    
}
