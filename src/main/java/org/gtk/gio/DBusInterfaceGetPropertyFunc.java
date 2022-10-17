package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code get_property} function in {@link DBusInterfaceVTable}.
 */
@FunctionalInterface
public interface DBusInterfaceGetPropertyFunc {
        org.gtk.glib.Variant onDBusInterfaceGetPropertyFunc(@NotNull DBusConnection connection, @NotNull java.lang.String sender, @NotNull java.lang.String objectPath, @NotNull java.lang.String interfaceName, @NotNull java.lang.String propertyName);
}
