package org.gtk.gio;

/**
 * The type of the @introspect function in #GDBusSubtreeVTable.
 * 
 * Subtrees are flat.  @node, if non-<code>NULL,</code> is always exactly one
 * segment of the object path (ie: it never contains a slash).
 * 
 * This function should return <code>null</code> to indicate that there is no object
 * at this node.
 * 
 * If this function returns non-<code>NULL,</code> the return value is expected to
 * be a <code>NULL-terminated</code> array of pointers to #GDBusInterfaceInfo
 * structures describing the interfaces implemented by @node.  This
 * array will have g_dbus_interface_info_unref() called on each item
 * before being freed with g_free().
 * 
 * The difference between returning <code>null</code> and an array containing zero
 * items is that the standard DBus interfaces will returned to the
 * remote introspector in the empty array case, but not in the and an array containing zero
 * items is that the standard DBus interfaces will returned to the
 * remote introspector in the empty array case, but not in the %NULL
 * case.
 */
@FunctionalInterface
public interface DBusSubtreeIntrospectFunc {
        void onDBusSubtreeIntrospectFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String node);
}
