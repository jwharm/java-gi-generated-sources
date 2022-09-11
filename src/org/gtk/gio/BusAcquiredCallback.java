package org.gtk.gio;

/**
 * Invoked when a connection to a message bus has been obtained.
 */
@FunctionalInterface
public interface BusAcquiredCallback {
        void onBusAcquiredCallback(DBusConnection connection, java.lang.String name);
}
