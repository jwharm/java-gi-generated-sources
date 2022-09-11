package org.gtk.gio;

/**
 * The type of the @enumerate function in #GDBusSubtreeVTable.
 * 
 * This function is called when generating introspection data and also
 * when preparing to dispatch incoming messages in the event that the
 * %G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES flag is not
 * specified (ie: to verify that the object path is valid).
 * 
 * Hierarchies are not supported; the items that you return should not
 * contain the `/` character.
 * 
 * The return value will be freed with g_strfreev().
 */
@FunctionalInterface
public interface DBusSubtreeEnumerateFunc {
        void onDBusSubtreeEnumerateFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath);
}
