package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code set_property} function in {@link DBusInterfaceVTable}.
 * @version 2.26
 */
@FunctionalInterface
public interface DBusInterfaceSetPropertyFunc {
        boolean onDBusInterfaceSetPropertyFunc(@NotNull org.gtk.gio.DBusConnection connection, @NotNull java.lang.String sender, @NotNull java.lang.String objectPath, @NotNull java.lang.String interfaceName, @NotNull java.lang.String propertyName, @NotNull org.gtk.glib.Variant value, @NotNull PointerProxy<org.gtk.glib.Error> error);
}
