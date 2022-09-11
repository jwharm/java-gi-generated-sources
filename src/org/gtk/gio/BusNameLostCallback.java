package org.gtk.gio;

@FunctionalInterface
public interface BusNameLostCallback {

        void onBusNameLostCallback(DBusConnection connection, java.lang.String name);
}
