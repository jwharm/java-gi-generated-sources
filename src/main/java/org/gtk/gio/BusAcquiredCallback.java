package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Invoked when a connection to a message bus has been obtained.
 * @version 2.26
 */
@FunctionalInterface
public interface BusAcquiredCallback {
        void onBusAcquiredCallback(@NotNull org.gtk.gio.DBusConnection connection, @NotNull java.lang.String name);
}
