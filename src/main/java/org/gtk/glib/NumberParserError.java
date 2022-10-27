package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by functions converting a string to a number.
 * @version 2.54
 */
public class NumberParserError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * String was not a valid number.
     */
    public static final NumberParserError INVALID = new NumberParserError(0);
    
    /**
     * String was a number, but out of bounds.
     */
    public static final NumberParserError OUT_OF_BOUNDS = new NumberParserError(1);
    
    public NumberParserError(int value) {
        super(value);
    }
}
