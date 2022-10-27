package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration that affects baseline shifts between runs.
 * @version 1.50
 */
public class BaselineShift extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Leave the baseline unchanged
     */
    public static final BaselineShift NONE = new BaselineShift(0);
    
    /**
     * Shift the baseline to the superscript position,
     *   relative to the previous run
     */
    public static final BaselineShift SUPERSCRIPT = new BaselineShift(1);
    
    /**
     * Shift the baseline to the subscript position,
     *   relative to the previous run
     */
    public static final BaselineShift SUBSCRIPT = new BaselineShift(2);
    
    public BaselineShift(int value) {
        super(value);
    }
}
