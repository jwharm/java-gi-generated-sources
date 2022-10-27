package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Invoked when the name is acquired.
 * @version 2.26
 */
@FunctionalInterface
public interface BusNameAcquiredCallback {
        void onBusNameAcquiredCallback(@NotNull org.gtk.gio.DBusConnection connection, @NotNull java.lang.String name);
}
