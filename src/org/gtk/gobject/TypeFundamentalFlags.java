package org.gtk.gobject;

/**
 * Bit masks used to check or determine specific characteristics of a
 * fundamental type.
 */
public class TypeFundamentalFlags {

    /**
     * Indicates a classed type
     */
    public static final int CLASSED = 1;
    
    /**
     * Indicates an instantiatable type (implies classed)
     */
    public static final int INSTANTIATABLE = 2;
    
    /**
     * Indicates a flat derivable type
     */
    public static final int DERIVABLE = 4;
    
    /**
     * Indicates a deep derivable type (implies derivable)
     */
    public static final int DEEP_DERIVABLE = 8;
    
}
