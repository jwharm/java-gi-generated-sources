package org.gtk.gobject;

/**
 * Bit masks used to check or determine characteristics of a type.
 */
public class TypeFlags extends io.github.jwharm.javagi.Bitfield {

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
    
    public TypeFlags(int value) {
        super(value);
    }
    
}