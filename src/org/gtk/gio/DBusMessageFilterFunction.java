package org.gtk.gio;

@FunctionalInterface
public interface DBusMessageFilterFunction {

        void onDBusMessageFilterFunction(DBusConnection connection, DBusMessage message, boolean incoming);
}
