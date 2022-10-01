package org.gtk.gio;

/**
 * Flags used when constructing a {@link DBusObjectManagerClient}.
 */
public class DBusObjectManagerClientFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final DBusObjectManagerClientFlags NONE = new DBusObjectManagerClientFlags(0);
    
    /**
     * If not set and the
     *   manager is for a well-known name, then request the bus to launch
     *   an owner for the name if no-one owns the name. This flag can only
     *   be used in managers for well-known names.
     */
    public static final DBusObjectManagerClientFlags DO_NOT_AUTO_START = new DBusObjectManagerClientFlags(1);
    
    public DBusObjectManagerClientFlags(int value) {
        super(value);
    }
    
}
