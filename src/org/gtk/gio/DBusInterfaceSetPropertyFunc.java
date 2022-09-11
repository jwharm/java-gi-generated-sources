package org.gtk.gio;

@FunctionalInterface
public interface DBusInterfaceSetPropertyFunc {

        void onDBusInterfaceSetPropertyFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String propertyName, org.gtk.glib.Variant value, org.gtk.glib.Error[] error);
}
