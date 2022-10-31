package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used in g_dbus_connection_call() and similar APIs.
 * @version 2.26
 */
public class DBusCallFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GDBusCallFlags";
    
    /**
     * No flags set.
     */
    public static final DBusCallFlags NONE = new DBusCallFlags(0);
    
    /**
     * The bus must not launch
     * an owner for the destination name in response to this method
     * invocation.
     */
    public static final DBusCallFlags NO_AUTO_START = new DBusCallFlags(1);
    
    /**
     * the caller is prepared to
     * wait for interactive authorization. Since 2.46.
     */
    public static final DBusCallFlags ALLOW_INTERACTIVE_AUTHORIZATION = new DBusCallFlags(2);
    
    public DBusCallFlags(int value) {
        super(value);
    }
}
