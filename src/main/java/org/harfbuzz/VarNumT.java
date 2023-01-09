package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VarNumT extends Struct {
    
    static {
        HarfBuzz.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "hb_var_num_t";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.unionLayout(
            Interop.valueLayout.C_FLOAT.withName("f"),
            Interop.valueLayout.C_INT.withName("u32"),
            Interop.valueLayout.C_INT.withName("i32"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_SHORT).withName("u16"),
            MemoryLayout.sequenceLayout(2, Interop.valueLayout.C_SHORT).withName("i16"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("u8"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.C_BYTE).withName("i8")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a VarNumT proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VarNumT(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VarNumT> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VarNumT(input);
}
