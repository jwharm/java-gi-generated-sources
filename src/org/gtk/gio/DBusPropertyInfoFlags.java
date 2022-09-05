package org.gtk.gio;

/**
 * Flags describing the access control of a D-Bus property.
 */
public class DBusPropertyInfoFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Property is readable.
     */
    public static final int READABLE = 1;
    
    /**
     * Property is writable.
     */
    public static final int WRITABLE = 2;
    
}
