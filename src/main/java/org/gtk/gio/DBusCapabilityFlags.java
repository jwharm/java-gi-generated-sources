package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Capabilities negotiated with the remote peer.
 * @version 2.26
 */
public class DBusCapabilityFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GDBusCapabilityFlags";
    
    /**
     * No flags set.
     */
    public static final DBusCapabilityFlags NONE = new DBusCapabilityFlags(0);
    
    /**
     * The connection
     * supports exchanging UNIX file descriptors with the remote peer.
     */
    public static final DBusCapabilityFlags UNIX_FD_PASSING = new DBusCapabilityFlags(1);
    
    public DBusCapabilityFlags(int value) {
        super(value);
    }
}
