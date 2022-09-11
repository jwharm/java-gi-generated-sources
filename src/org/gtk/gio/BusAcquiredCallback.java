package org.gtk.gio;

@FunctionalInterface
public interface BusAcquiredCallback {

        void onBusAcquiredCallback(DBusConnection connection, java.lang.String name);
}
