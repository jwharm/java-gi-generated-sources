package org.gtk.gio;

/**
 * Enumeration used to describe the byte order of a D-Bus message.
 */
public class DBusMessageByteOrder extends io.github.jwharm.javagi.Enumeration {

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
