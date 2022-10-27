package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when calling a g_converter_convert().
 * @version 2.24
 */
public class ConverterFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No flags.
     */
    public static final ConverterFlags NONE = new ConverterFlags(0);
    
    /**
     * At end of input data
     */
    public static final ConverterFlags INPUT_AT_END = new ConverterFlags(1);
    
    /**
     * Flush data
     */
    public static final ConverterFlags FLUSH = new ConverterFlags(2);
    
    public ConverterFlags(int value) {
        super(value);
    }
}
