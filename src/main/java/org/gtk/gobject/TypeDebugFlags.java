package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These flags used to be passed to g_type_init_with_debug_flags() which
 * is now deprecated.
 * <p>
 * If you need to enable debugging features, use the GOBJECT_DEBUG
 * environment variable.
 */
public class TypeDebugFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GTypeDebugFlags";
    
    /**
     * Print no messages
     */
    public static final TypeDebugFlags NONE = new TypeDebugFlags(0);
    
    /**
     * Print messages about object bookkeeping
     */
    public static final TypeDebugFlags OBJECTS = new TypeDebugFlags(1);
    
    /**
     * Print messages about signal emissions
     */
    public static final TypeDebugFlags SIGNALS = new TypeDebugFlags(2);
    
    /**
     * Keep a count of instances of each type
     */
    public static final TypeDebugFlags INSTANCE_COUNT = new TypeDebugFlags(4);
    
    /**
     * Mask covering all debug flags
     */
    public static final TypeDebugFlags MASK = new TypeDebugFlags(7);
    
    public TypeDebugFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TypeDebugFlags combined(TypeDebugFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TypeDebugFlags combined(TypeDebugFlags mask, TypeDebugFlags... masks) {
        for (TypeDebugFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
