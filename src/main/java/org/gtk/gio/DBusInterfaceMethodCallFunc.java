package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code method_call} function in {@link DBusInterfaceVTable}.
 */
@FunctionalInterface
public interface DBusInterfaceMethodCallFunc {
        void onDBusInterfaceMethodCallFunc(@NotNull DBusConnection connection, @NotNull java.lang.String sender, @NotNull java.lang.String objectPath, @NotNull java.lang.String interfaceName, @NotNull java.lang.String methodName, @NotNull org.gtk.glib.Variant parameters, @NotNull DBusMethodInvocation invocation);
}
