package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ValueDataUnion extends io.github.jwharm.javagi.ObjectBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "_Value__data__union";
    
    private static final GroupLayout memoryLayout = MemoryLayout.unionLayout(
        Interop.valueLayout.C_INT.withName("v_int"),
        Interop.valueLayout.C_INT.withName("v_uint"),
        Interop.valueLayout.C_LONG.withName("v_long"),
        Interop.valueLayout.C_LONG.withName("v_ulong"),
        Interop.valueLayout.C_LONG.withName("v_int64"),
        Interop.valueLayout.C_LONG.withName("v_uint64"),
        Interop.valueLayout.C_FLOAT.withName("v_float"),
        Interop.valueLayout.C_DOUBLE.withName("v_double"),
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

