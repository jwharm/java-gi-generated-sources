package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Invoked when the name being watched is known not to have to have an owner.
 * <p>
 * This is also invoked when the {@link DBusConnection} on which the watch was
 * established has been closed.  In that case, {@code connection} will be
 * {@code null}.
 */
@FunctionalInterface
public interface BusNameVanishedCallback {
        void onBusNameVanishedCallback(@NotNull DBusConnection connection, @NotNull java.lang.String name);
}
