package org.gtk.gio;

/**
 * Invoked when the name is acquired.
 */
@FunctionalInterface
public interface BusNameAcquiredCallback {
        void onBusNameAcquiredCallback(DBusConnection connection, java.lang.String name);
}
