package org.gtk.gio;

/**
 * The type of the @get_property function in {@link org.gtk.gio.DBusInterfaceVTable}
 */
@FunctionalInterface
public interface DBusInterfaceGetPropertyFunc {
        org.gtk.glib.Variant onDBusInterfaceGetPropertyFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String propertyName);
}
