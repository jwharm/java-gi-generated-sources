package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Message types used in {@link DBusMessage}.
 * @version 2.26
 */
public class DBusMessageType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Message is of invalid type.
     */
    public static final DBusMessageType INVALID = new DBusMessageType(0);
    
    /**
     * Method call.
     */
    public static final DBusMessageType METHOD_CALL = new DBusMessageType(1);
    
    /**
     * Method reply.
     */
    public static final DBusMessageType METHOD_RETURN = new DBusMessageType(2);
    
    /**
     * Error reply.
     */
    public static final DBusMessageType ERROR = new DBusMessageType(3);
    
    /**
     * Signal emission.
     */
    public static final DBusMessageType SIGNAL = new DBusMessageType(4);
    
    public DBusMessageType(int value) {
        super(value);
    }
}
