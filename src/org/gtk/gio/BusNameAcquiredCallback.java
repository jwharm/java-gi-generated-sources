package org.gtk.gio;

@FunctionalInterface
public interface BusNameAcquiredCallback {

        void onBusNameAcquiredCallback(DBusConnection connection, java.lang.String name);
}
