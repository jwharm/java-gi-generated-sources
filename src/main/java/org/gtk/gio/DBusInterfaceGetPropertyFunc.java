package org.gtk.gio;

import io.github.jwharm.javagi.*;

/**
 * The type of the {@code get_property} function in {@link DBusInterfaceVTable}.
 */
@FunctionalInterface
public interface DBusInterfaceGetPropertyFunc {
        org.gtk.glib.Variant onDBusInterfaceGetPropertyFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String propertyName);
}
