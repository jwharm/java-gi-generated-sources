package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Bit masks used to check or determine characteristics of a type.
 */
public class TypeFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GTypeFlags";
    
    /**
     * No special flags. Since: 2.74
     */
    public static final TypeFlags NONE = new TypeFlags(0);
    
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
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TypeFlags or(TypeFlags mask) {
        return new TypeFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TypeFlags combined(TypeFlags mask, TypeFlags... masks) {
        int value = mask.getValue();        for (TypeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TypeFlags(value);
    }
}
