package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code set_property} function in {@link DBusInterfaceVTable}.
 */
@FunctionalInterface
public interface DBusInterfaceSetPropertyFunc {
        boolean onDBusInterfaceSetPropertyFunc(@NotNull DBusConnection connection, @NotNull java.lang.String sender, @NotNull java.lang.String objectPath, @NotNull java.lang.String interfaceName, @NotNull java.lang.String propertyName, @NotNull org.gtk.glib.Variant value);
}
