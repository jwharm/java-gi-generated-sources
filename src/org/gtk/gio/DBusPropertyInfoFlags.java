package org.gtk.gio;

/**
 * Flags describing the access control of a D-Bus property.
 */
public class DBusPropertyInfoFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final DBusPropertyInfoFlags NONE = new DBusPropertyInfoFlags(0);
    
    /**
     * Property is readable.
     */
    public static final DBusPropertyInfoFlags READABLE = new DBusPropertyInfoFlags(1);
    
    /**
     * Property is writable.
     */
    public static final DBusPropertyInfoFlags WRITABLE = new DBusPropertyInfoFlags(2);
    
    public DBusPropertyInfoFlags(int value) {
        super(value);
    }
    
}
