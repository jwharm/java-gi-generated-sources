package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VarIntT extends io.github.jwharm.javagi.ObjectBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_var_int_t";
    
    private static final GroupLayout memoryLayout = MemoryLayout.unionLayout(
        Interop.valueLayout.C_INT.withName("u32"),
        Interop.valueLayout.C_INT.withName("i32"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_SHORT).withName("u16"),
        MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_SHORT).withName("i16"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("u8"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("i8")
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
     * Create a VarIntT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VarIntT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}

