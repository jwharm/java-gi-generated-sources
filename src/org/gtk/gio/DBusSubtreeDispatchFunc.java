package org.gtk.gio;

@FunctionalInterface
public interface DBusSubtreeDispatchFunc {

    /**
     * The type of the @dispatch function in #GDBusSubtreeVTable.
     * 
     * Subtrees are flat.  @node, if non-%NULL, is always exactly one
     * segment of the object path (ie: it never contains a slash).
     */
    public DBusInterfaceVTable onDBusSubtreeDispatchFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String node, jdk.incubator.foreign.MemoryAddress outUserData, jdk.incubator.foreign.MemoryAddress userData);
}
