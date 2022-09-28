package org.gtk.gobject;

/**
 * Bit masks used to check or determine characteristics of a type.
 */
public class TypeFlags {

    /**
     * Indicates an abstract type. No instances can be
     *  created for an abstract type
     */
    public static final TypeFlags ABSTRACT = new TypeFlags(16);
    
    /**
     * Indicates an abstract value type, i.e. a type
     *  that introduces a value table, but can't be used for
     *  g_value_init()
     */
    public static final TypeFlags VALUE_ABSTRACT = new TypeFlags(32);
    
    /**
     * Indicates a final type. A final type is a non-derivable
     *  leaf node in a deep derivable type hierarchy tree. Since: 2.70
     */
    public static final TypeFlags FINAL = new TypeFlags(64);
    
    private int value;
    
    public TypeFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TypeFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public TypeFlags combined(TypeFlags mask) {
        return new TypeFlags(this.getValue() | mask.getValue());
    }
    
    public static TypeFlags combined(TypeFlags mask, TypeFlags... masks) {
        int value = mask.getValue();
        for (TypeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TypeFlags(value);
    }
    
}
