package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Invoked when a connection to a message bus has been obtained.
 */
@FunctionalInterface
public interface BusAcquiredCallback {
        void onBusAcquiredCallback(@NotNull DBusConnection connection, @NotNull java.lang.String name);
}
