package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Invoked when the name is lost or {@code connection} has been closed.
 * @version 2.26
 */
@FunctionalInterface
public interface BusNameLostCallback {
        void onBusNameLostCallback(@NotNull org.gtk.gio.DBusConnection connection, @NotNull java.lang.String name);
}
