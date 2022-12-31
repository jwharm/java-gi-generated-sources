package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link FloatIEEE754} and {@link DoubleIEEE754} unions are used to access the sign,
 * mantissa and exponent of IEEE floats and doubles. These unions are defined
 * as appropriate for a given platform. IEEE floats and doubles are supported
 * (used for storage) by at least Intel, PPC and Sparc.
 */
public class FloatIEEE754 extends ObjectBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFloatIEEE754";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.unionLayout(
            Interop.valueLayout.C_FLOAT.withName("v_float")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a FloatIEEE754 proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected FloatIEEE754(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, FloatIEEE754> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new FloatIEEE754(input, ownership);
}

