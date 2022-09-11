package org.gtk.gio;

/**
 * The type of the @method_call function in #GDBusInterfaceVTable.
 */
@FunctionalInterface
public interface DBusInterfaceMethodCallFunc {
        void onDBusInterfaceMethodCallFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, DBusMethodInvocation invocation);
}
