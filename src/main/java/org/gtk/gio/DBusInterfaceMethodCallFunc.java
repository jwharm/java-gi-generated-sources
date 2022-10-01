package org.gtk.gio;

import io.github.jwharm.javagi.*;

/**
 * The type of the {@code method_call} function in {@link DBusInterfaceVTable}.
 */
@FunctionalInterface
public interface DBusInterfaceMethodCallFunc {
        void onDBusInterfaceMethodCallFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String methodName, org.gtk.glib.Variant parameters, DBusMethodInvocation invocation);
}
