package org.gtk.gio;

@FunctionalInterface
public interface DBusSignalCallback {

        void onDBusSignalCallback(DBusConnection connection, java.lang.String senderName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String signalName, org.gtk.glib.Variant parameters);
}
