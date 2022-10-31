package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Possible errors of thread related functions.
 */
public class ThreadError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GThreadError";
    
    /**
     * a thread couldn't be created due to resource
     *                        shortage. Try again later.
     */
    public static final ThreadError THREAD_ERROR_AGAIN = new ThreadError(0);
    
    public ThreadError(int value) {
        super(value);
    }
}
