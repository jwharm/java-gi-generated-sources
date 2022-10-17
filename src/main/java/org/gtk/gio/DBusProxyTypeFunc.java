package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Function signature for a function used to determine the {@link org.gtk.glib.Type} to
 * use for an interface proxy (if {@code interface_name} is not {@code null}) or
 * object proxy (if {@code interface_name} is {@code null}).
 * <p>
 * This function is called in the
 * [thread-default main loop][g-main-context-push-thread-default]
 * that {@code manager} was constructed in.
 */
@FunctionalInterface
public interface DBusProxyTypeFunc {
        org.gtk.gobject.Type onDBusProxyTypeFunc(@NotNull DBusObjectManagerClient manager, @NotNull java.lang.String objectPath, @Nullable java.lang.String interfaceName);
}
