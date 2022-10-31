package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An enumeration for well-known message buses.
 * @version 2.26
 */
public class BusType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GBusType";
    
    /**
     * An alias for the message bus that activated the process, if any.
     */
    public static final BusType STARTER = new BusType(-1);
    
    /**
     * Not a message bus.
     */
    public static final BusType NONE = new BusType(0);
    
    /**
     * The system-wide message bus.
     */
    public static final BusType SYSTEM = new BusType(1);
    
    /**
     * The login session message bus.
     */
    public static final BusType SESSION = new BusType(2);
    
    public BusType(int value) {
        super(value);
    }
}
