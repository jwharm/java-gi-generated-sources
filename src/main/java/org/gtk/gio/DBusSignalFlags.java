package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when subscribing to signals via g_dbus_connection_signal_subscribe().
 * @version 2.26
 */
public class DBusSignalFlags extends io.github.jwharm.javagi.Bitfield {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * No flags set.
     */
    public static final DBusSignalFlags NONE = new DBusSignalFlags(0);
    
    /**
     * Don't actually send the AddMatch
     * D-Bus call for this signal subscription.  This gives you more control
     * over which match rules you add (but you must add them manually).
     */
    public static final DBusSignalFlags NO_MATCH_RULE = new DBusSignalFlags(1);
    
    /**
     * Match first arguments that
     * contain a bus or interface name with the given namespace.
     */
    public static final DBusSignalFlags MATCH_ARG0_NAMESPACE = new DBusSignalFlags(2);
    
    /**
     * Match first arguments that
     * contain an object path that is either equivalent to the given path,
     * or one of the paths is a subpath of the other.
     */
    public static final DBusSignalFlags MATCH_ARG0_PATH = new DBusSignalFlags(4);
    
    public DBusSignalFlags(int value) {
        super(value);
    }
}
