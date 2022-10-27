package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by shell functions.
 */
public class ShellError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Mismatched or otherwise mangled quoting.
     */
    public static final ShellError BAD_QUOTING = new ShellError(0);
    
    /**
     * String to be parsed was empty.
     */
    public static final ShellError EMPTY_STRING = new ShellError(1);
    
    /**
     * Some other error.
     */
    public static final ShellError FAILED = new ShellError(2);
    
    public ShellError(int value) {
        super(value);
    }
}
