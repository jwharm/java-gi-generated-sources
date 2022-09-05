package org.gtk.gio;

/**
 * Flags passed to g_dbus_connection_register_subtree().
 */
public class DBusSubtreeFlags {

    /**
     * No flags set.
     */
    public static final int NONE = 0;
    
    /**
     * Method calls to objects not in the enumerated range
     *                                                       will still be dispatched. This is useful if you want
     *                                                       to dynamically spawn objects in the subtree.
     */
    public static final int DISPATCH_TO_UNENUMERATED_NODES = 1;
    
}
