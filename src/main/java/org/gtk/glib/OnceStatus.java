package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible statuses of a one-time initialization function
 * controlled by a {@link Once} struct.
 * @version 2.4
 */
public class OnceStatus extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GOnceStatus";
    
    /**
     * the function has not been called yet.
     */
    public static final OnceStatus NOTCALLED = new OnceStatus(0);
    
    /**
     * the function call is currently in progress.
     */
    public static final OnceStatus PROGRESS = new OnceStatus(1);
    
    /**
     * the function has been called.
     */
    public static final OnceStatus READY = new OnceStatus(2);
    
    public OnceStatus(int value) {
        super(value);
    }
}
