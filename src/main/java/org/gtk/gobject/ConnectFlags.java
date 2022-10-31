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
     * whether the handler should be called before or after the
     *  default handler of the signal.
     */
    public static final ConnectFlags AFTER = new ConnectFlags(1);
    
    /**
     * whether the instance and data should be swapped when
     *  calling the handler; see g_signal_connect_swapped() for an example.
     */
    public static final ConnectFlags SWAPPED = new ConnectFlags(2);
    
    public ConnectFlags(int value) {
        super(value);
    }
}
