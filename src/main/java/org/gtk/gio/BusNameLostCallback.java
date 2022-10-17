package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Invoked when the name is lost or {@code connection} has been closed.
 */
@FunctionalInterface
public interface BusNameLostCallback {
        void onBusNameLostCallback(@NotNull DBusConnection connection, @NotNull java.lang.String name);
}
