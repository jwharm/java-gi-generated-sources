package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Enumeration used to describe the byte order of a D-Bus message.
 * @version 2.26
 */
public class DBusMessageByteOrder extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GDBusMessageByteOrder";
    
    /**
     * The byte order is big endian.
     */
    public static final DBusMessageByteOrder BIG_ENDIAN = new DBusMessageByteOrder(66);
    
    /**
     * The byte order is little endian.
     */
    public static final DBusMessageByteOrder LITTLE_ENDIAN = new DBusMessageByteOrder(108);
    
    public DBusMessageByteOrder(int value) {
        super(value);
    }
}
