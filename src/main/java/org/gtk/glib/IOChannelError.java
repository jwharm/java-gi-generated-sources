package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by {@link IOChannel} operations.
 */
public class IOChannelError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GIOChannelError";
    
    /**
     * File too large.
     */
    public static final IOChannelError FBIG = new IOChannelError(0);
    
    /**
     * Invalid argument.
     */
    public static final IOChannelError INVAL = new IOChannelError(1);
    
    /**
     * IO error.
     */
    public static final IOChannelError IO = new IOChannelError(2);
    
    /**
     * File is a directory.
     */
    public static final IOChannelError ISDIR = new IOChannelError(3);
    
    /**
     * No space left on device.
     */
    public static final IOChannelError NOSPC = new IOChannelError(4);
    
    /**
     * No such device or address.
     */
    public static final IOChannelError NXIO = new IOChannelError(5);
    
    /**
     * Value too large for defined datatype.
     */
    public static final IOChannelError OVERFLOW = new IOChannelError(6);
    
    /**
     * Broken pipe.
     */
    public static final IOChannelError PIPE = new IOChannelError(7);
    
    /**
     * Some other error.
     */
    public static final IOChannelError FAILED = new IOChannelError(8);
    
    public IOChannelError(int value) {
        super(value);
    }
}
