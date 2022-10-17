package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Signature for callback function used in g_dbus_connection_signal_subscribe().
 */
@FunctionalInterface
public interface DBusSignalCallback {
        void onDBusSignalCallback(@NotNull DBusConnection connection, @Nullable java.lang.String senderName, @NotNull java.lang.String objectPath, @NotNull java.lang.String interfaceName, @NotNull java.lang.String signalName, @NotNull org.gtk.glib.Variant parameters);
}
