package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ValueDataUnion extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "null";
    
    private static GroupLayout memoryLayout = MemoryLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("v_int"),
        ValueLayout.JAVA_INT.withName("v_uint"),
        ValueLayout.JAVA_LONG.withName("v_long"),
        ValueLayout.JAVA_LONG.withName("v_ulong"),
        ValueLayout.JAVA_LONG.withName("v_int64"),
        ValueLayout.JAVA_LONG.withName("v_uint64"),
        ValueLayout.JAVA_FLOAT.withName("v_float"),
        MemoryLayout.paddingLayout(32),
        ValueLayout.JAVA_DOUBLE.withName("v_double"),
        Interop.valueLayout.ADDRESS.withName("v_pointer")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a ValueDataUnion proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ValueDataUnion(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}

