package org.gtk.gio;

/**
 * The type of the {@code introspect} function in {@link DBusSubtreeVTable}.
 * <p>
 * Subtrees are flat.  {@code node}, if non-{@code null}, is always exactly one
 * segment of the object path (ie: it never contains a slash).
 * <p>
 * This function should return {@code null} to indicate that there is no object
 * at this node.
 * <p>
 * If this function returns non-{@code null}, the return value is expected to
 * be a {@code null}-terminated array of pointers to {@link DBusInterfaceInfo}
 * structures describing the interfaces implemented by {@code node}.  This
 * array will have g_dbus_interface_info_unref() called on each item
 * before being freed with g_free().
 * <p>
 * The difference between returning {@code null} and an array containing zero
 * items is that the standard DBus interfaces will returned to the
 * remote introspector in the empty array case, but not in the {@code null}
 * case.
 */
@FunctionalInterface
public interface DBusSubtreeIntrospectFunc {
        void onDBusSubtreeIntrospectFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String node);
}
