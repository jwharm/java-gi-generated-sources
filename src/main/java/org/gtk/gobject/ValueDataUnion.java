package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class ValueDataUnion extends ObjectBase {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "_Value__data__union";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.unionLayout(
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
    }
    
    /**
     * Create a ValueDataUnion proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ValueDataUnion(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ValueDataUnion> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ValueDataUnion(input, ownership);
}

