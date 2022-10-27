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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
}
