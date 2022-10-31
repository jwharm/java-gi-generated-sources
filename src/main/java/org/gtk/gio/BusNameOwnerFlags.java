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
    
    public BusNameOwnerFlags(int value) {
        super(value);
    }
}
