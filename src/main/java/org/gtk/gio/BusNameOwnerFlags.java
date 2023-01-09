package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used in g_bus_own_name().
 * @version 2.26
 */
public class BusNameOwnerFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GBusNameOwnerFlags";
    
    /**
     * No flags set.
     */
    public static final BusNameOwnerFlags NONE = new BusNameOwnerFlags(0);
    
    /**
     * Allow another message bus connection to claim the name.
     */
    public static final BusNameOwnerFlags ALLOW_REPLACEMENT = new BusNameOwnerFlags(1);
    
    /**
     * If another message bus connection owns the name and have
     * specified {@link BusNameOwnerFlags#ALLOW_REPLACEMENT}, then take the name from the other connection.
     */
    public static final BusNameOwnerFlags REPLACE = new BusNameOwnerFlags(2);
    
    /**
     * If another message bus connection owns the name, immediately
     * return an error from g_bus_own_name() rather than entering the waiting queue for that name. (Since 2.54)
     */
    public static final BusNameOwnerFlags DO_NOT_QUEUE = new BusNameOwnerFlags(4);
    
    /**
     * Create a new BusNameOwnerFlags with the provided value
     */
    public BusNameOwnerFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public BusNameOwnerFlags or(BusNameOwnerFlags... masks) {
        int value = this.getValue();
        for (BusNameOwnerFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BusNameOwnerFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static BusNameOwnerFlags combined(BusNameOwnerFlags mask, BusNameOwnerFlags... masks) {
        int value = mask.getValue();
        for (BusNameOwnerFlags arg : masks) {
            value |= arg.getValue();
        }
        return new BusNameOwnerFlags(value);
    }
}
