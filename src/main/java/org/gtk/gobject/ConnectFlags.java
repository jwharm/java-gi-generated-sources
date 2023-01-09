package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The connection flags are used to specify the behaviour of a signal's
 * connection.
 */
public class ConnectFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GConnectFlags";
    
    /**
     * Default behaviour (no special flags). Since: 2.74
     */
    public static final ConnectFlags DEFAULT = new ConnectFlags(0);
    
    /**
     * If set, the handler should be called after the
     *  default handler of the signal. Normally, the handler is called before
     *  the default handler.
     */
    public static final ConnectFlags AFTER = new ConnectFlags(1);
    
    /**
     * If set, the instance and data should be swapped when
     *  calling the handler; see g_signal_connect_swapped() for an example.
     */
    public static final ConnectFlags SWAPPED = new ConnectFlags(2);
    
    /**
     * Create a new ConnectFlags with the provided value
     */
    public ConnectFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ConnectFlags or(ConnectFlags... masks) {
        int value = this.getValue();
        for (ConnectFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ConnectFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ConnectFlags combined(ConnectFlags mask, ConnectFlags... masks) {
        int value = mask.getValue();
        for (ConnectFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ConnectFlags(value);
    }
}
