package org.gtk.gio;

/**
 * An enumeration for well-known message buses.
 */
public class BusType extends io.github.jwharm.javagi.Enumeration {

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
