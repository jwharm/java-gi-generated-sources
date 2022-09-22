package org.gtk.gio;

/**
 * The type of the {@code dispatch} function in {@link DBusSubtreeVTable}.
 * <p>
 * Subtrees are flat.  {@code node}, if non-<code>null</code>, is always exactly one
 * segment of the object path (ie: it never contains a slash).
 */
@FunctionalInterface
public interface DBusSubtreeDispatchFunc {
        DBusInterfaceVTable onDBusSubtreeDispatchFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String node, java.lang.foreign.MemoryAddress outUserData);
}
