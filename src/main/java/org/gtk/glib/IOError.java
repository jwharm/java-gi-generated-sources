package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link IOError} is only used by the deprecated functions
 * g_io_channel_read(), g_io_channel_write(), and g_io_channel_seek().
 */
public class IOError extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * no error
     */
    public static final IOError NONE = new IOError(0);
    
    /**
     * an EAGAIN error occurred
     */
    public static final IOError AGAIN = new IOError(1);
    
    /**
     * an EINVAL error occurred
     */
    public static final IOError INVAL = new IOError(2);
    
    /**
     * another error occurred
     */
    public static final IOError UNKNOWN = new IOError(3);
    
    public IOError(int value) {
        super(value);
    }
}
