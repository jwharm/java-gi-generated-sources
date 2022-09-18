package org.gtk.gio;

/**
 * The type of the @enumerate function in {@link org.gtk.gio.DBusSubtreeVTable} 
 * <p>
 * This function is called when generating introspection data and also
 * when preparing to dispatch incoming messages in the event that the
 * {@link org.gtk.gio.DBusSubtreeFlags<code>#DISPATCH_TO_UNENUMERATED_NODES</code>  flag is not
 * specified (ie: to verify that the object path is valid).
 * <p>
 * Hierarchies are not supported; the items that you return should not
 * contain the <code>/</code> character.
 * 
 * The return value will be freed with g_strfreev().
 */
@FunctionalInterface
public interface DBusSubtreeEnumerateFunc {
        void onDBusSubtreeEnumerateFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath);
}
