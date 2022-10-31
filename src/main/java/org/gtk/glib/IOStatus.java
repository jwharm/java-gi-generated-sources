package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Statuses returned by most of the {@link IOFuncs} functions.
 */
public class IOStatus extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GIOStatus";
    
    /**
     * An error occurred.
     */
    public static final IOStatus ERROR = new IOStatus(0);
    
    /**
     * Success.
     */
    public static final IOStatus NORMAL = new IOStatus(1);
    
    /**
     * End of file.
     */
    public static final IOStatus EOF = new IOStatus(2);
    
    /**
     * Resource temporarily unavailable.
     */
    public static final IOStatus AGAIN = new IOStatus(3);
    
    public IOStatus(int value) {
        super(value);
    }
}
