package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VarNumT extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_var_num_t";
    
    private static GroupLayout memoryLayout = MemoryLayout.unionLayout(
        ValueLayout.JAVA_FLOAT.withName("f"),
        ValueLayout.JAVA_INT.withName("u32"),
        ValueLayout.JAVA_INT.withName("i32"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_SHORT).withName("u16"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_SHORT).withName("i16"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_BYTE).withName("u8"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_BYTE).withName("i8")
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
     * Create a VarNumT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VarNumT(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
}

