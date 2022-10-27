package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Invoked when the name being watched is known to have to have an owner.
 * @version 2.26
 */
@FunctionalInterface
public interface BusNameAppearedCallback {
        void onBusNameAppearedCallback(@NotNull org.gtk.gio.DBusConnection connection, @NotNull java.lang.String name, @NotNull java.lang.String nameOwner);
}
