package org.gtk.gio;

@FunctionalInterface
public interface DBusInterfaceMethodCallFunc {

        void onDBusInterfaceMethodCallFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, DBusMethodInvocation invocation);
}
