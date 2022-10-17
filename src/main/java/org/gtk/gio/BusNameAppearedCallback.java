package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Invoked when the name being watched is known to have to have an owner.
 */
@FunctionalInterface
public interface BusNameAppearedCallback {
        void onBusNameAppearedCallback(@NotNull DBusConnection connection, @NotNull java.lang.String name, @NotNull java.lang.String nameOwner);
}
