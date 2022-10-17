package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Invoked when the name is acquired.
 */
@FunctionalInterface
public interface BusNameAcquiredCallback {
        void onBusNameAcquiredCallback(@NotNull DBusConnection connection, @NotNull java.lang.String name);
}
