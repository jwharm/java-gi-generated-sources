package org.gtk.gio;

@FunctionalInterface
public interface DBusInterfaceMethodCallFunc {

    /**
     * The type of the @method_call function in #GDBusInterfaceVTable.
     */
    public void onDBusInterfaceMethodCallFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, DBusMethodInvocation invocation, jdk.incubator.foreign.MemoryAddress userData);
}
