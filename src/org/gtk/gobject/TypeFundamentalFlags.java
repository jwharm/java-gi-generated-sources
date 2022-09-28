package org.gtk.gobject;

/**
 * Bit masks used to check or determine specific characteristics of a
 * fundamental type.
 */
public class TypeFundamentalFlags {

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
    
    private int value;
    
    public TypeFundamentalFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TypeFundamentalFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public TypeFundamentalFlags combined(TypeFundamentalFlags mask) {
        return new TypeFundamentalFlags(this.getValue() | mask.getValue());
    }
    
    public static TypeFundamentalFlags combined(TypeFundamentalFlags mask, TypeFundamentalFlags... masks) {
        int value = mask.getValue();
        for (TypeFundamentalFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TypeFundamentalFlags(value);
    }
    
}
