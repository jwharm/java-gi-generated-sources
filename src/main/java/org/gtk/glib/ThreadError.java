package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Possible errors of thread related functions.
 */
public class ThreadError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * a thread couldn't be created due to resource
     *                        shortage. Try again later.
     */
    public static final ThreadError THREAD_ERROR_AGAIN = new ThreadError(0);
    
    public ThreadError(int value) {
        super(value);
    }
}
