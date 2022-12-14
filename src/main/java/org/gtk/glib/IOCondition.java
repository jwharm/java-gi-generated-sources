package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A bitwise combination representing a condition to watch for on an
 * event source.
 */
public class IOCondition extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GIOCondition";
    
    /**
     * There is data to read.
     */
    public static final IOCondition IN = new IOCondition(1);
    
    /**
     * Data can be written (without blocking).
     */
    public static final IOCondition OUT = new IOCondition(4);
    
    /**
     * There is urgent data to read.
     */
    public static final IOCondition PRI = new IOCondition(2);
    
    /**
     * Error condition.
     */
    public static final IOCondition ERR = new IOCondition(8);
    
    /**
     * Hung up (the connection has been broken, usually for
     *            pipes and sockets).
     */
    public static final IOCondition HUP = new IOCondition(16);
    
    /**
     * Invalid request. The file descriptor is not open.
     */
    public static final IOCondition NVAL = new IOCondition(32);
    
    /**
     * Create a new IOCondition with the provided value
     */
    public IOCondition(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public IOCondition or(IOCondition... masks) {
        int value = this.getValue();
        for (IOCondition arg : masks) {
            value |= arg.getValue();
        }
        return new IOCondition(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static IOCondition combined(IOCondition mask, IOCondition... masks) {
        int value = mask.getValue();
        for (IOCondition arg : masks) {
            value |= arg.getValue();
        }
        return new IOCondition(value);
    }
}
