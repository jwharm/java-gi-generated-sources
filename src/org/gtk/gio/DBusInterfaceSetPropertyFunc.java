package org.gtk.gio;

/**
 * The type of the {@code set_property} function in {@link DBusInterfaceVTable}.
 */
@FunctionalInterface
public interface DBusInterfaceSetPropertyFunc {
        boolean onDBusInterfaceSetPropertyFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String propertyName, org.gtk.glib.Variant value);
}
