package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Function signature for a function used to determine the {@link org.gtk.gobject.Type} to
 * use for an interface proxy (if {@code interface_name} is not {@code null}) or
 * object proxy (if {@code interface_name} is {@code null}).
 * <p>
 * This function is called in the
 * [thread-default main loop][g-main-context-push-thread-default]
 * that {@code manager} was constructed in.
 * @version 2.30
 */
@FunctionalInterface
public interface DBusProxyTypeFunc {
        org.gtk.glib.Type onDBusProxyTypeFunc(@NotNull org.gtk.gio.DBusObjectManagerClient manager, @NotNull java.lang.String objectPath, @Nullable java.lang.String interfaceName);
}
