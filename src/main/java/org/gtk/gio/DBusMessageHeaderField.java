package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Header fields used in {@link DBusMessage}.
 * @version 2.26
 */
public class DBusMessageHeaderField extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Not a valid header field.
     */
    public static final DBusMessageHeaderField INVALID = new DBusMessageHeaderField(0);
    
    /**
     * The object path.
     */
    public static final DBusMessageHeaderField PATH = new DBusMessageHeaderField(1);
    
    /**
     * The interface name.
     */
    public static final DBusMessageHeaderField INTERFACE = new DBusMessageHeaderField(2);
    
    /**
     * The method or signal name.
     */
    public static final DBusMessageHeaderField MEMBER = new DBusMessageHeaderField(3);
    
    /**
     * The name of the error that occurred.
     */
    public static final DBusMessageHeaderField ERROR_NAME = new DBusMessageHeaderField(4);
    
    /**
     * The serial number the message is a reply to.
     */
    public static final DBusMessageHeaderField REPLY_SERIAL = new DBusMessageHeaderField(5);
    
    /**
     * The name the message is intended for.
     */
    public static final DBusMessageHeaderField DESTINATION = new DBusMessageHeaderField(6);
    
    /**
     * Unique name of the sender of the message (filled in by the bus).
     */
    public static final DBusMessageHeaderField SENDER = new DBusMessageHeaderField(7);
    
    /**
     * The signature of the message body.
     */
    public static final DBusMessageHeaderField SIGNATURE = new DBusMessageHeaderField(8);
    
    /**
     * The number of UNIX file descriptors that accompany the message.
     */
    public static final DBusMessageHeaderField NUM_UNIX_FDS = new DBusMessageHeaderField(9);
    
    public DBusMessageHeaderField(int value) {
        super(value);
    }
}
