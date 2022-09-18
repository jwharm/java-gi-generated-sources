package org.gtk.gio;

/**
 * The type of the @dispatch function in {@link org.gtk.gio.DBusSubtreeVTable} 
 * 
 * Subtrees are flat.  @node, if non-<code>null</code>  is always exactly one
 * segment of the object path (ie: it never contains a slash).
 */
@FunctionalInterface
public interface DBusSubtreeDispatchFunc {
        DBusInterfaceVTable onDBusSubtreeDispatchFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String node, jdk.incubator.foreign.MemoryAddress outUserData);
}
