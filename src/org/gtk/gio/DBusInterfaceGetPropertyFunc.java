package org.gtk.gio;

@FunctionalInterface
public interface DBusInterfaceGetPropertyFunc {

        void onDBusInterfaceGetPropertyFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String propertyName, org.gtk.glib.Error[] error);
}
