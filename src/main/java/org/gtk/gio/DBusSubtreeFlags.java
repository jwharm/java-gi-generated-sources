package org.gtk.gio;

/**
 * Flags passed to g_dbus_connection_register_subtree().
 */
public class DBusSubtreeFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No flags set.
     */
    public static final DBusSubtreeFlags NONE = new DBusSubtreeFlags(0);
    
    /**
     * Method calls to objects not in the enumerated range
     *                                                       will still be dispatched. This is useful if you want
     *                                                       to dynamically spawn objects in the subtree.
     */
    public static final DBusSubtreeFlags DISPATCH_TO_UNENUMERATED_NODES = new DBusSubtreeFlags(1);
    
    public DBusSubtreeFlags(int value) {
        super(value);
    }
    
}
