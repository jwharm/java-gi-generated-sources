package org.gtk.gio;

/**
 * Flags used when constructing a #GDBusObjectManagerClient.
 */
public class DBusObjectManagerClientFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * If not set and the
     *   manager is for a well-known name, then request the bus to launch
     *   an owner for the name if no-one owns the name. This flag can only
     *   be used in managers for well-known names.
     */
    public static final int DO_NOT_AUTO_START = 1;
    
}
