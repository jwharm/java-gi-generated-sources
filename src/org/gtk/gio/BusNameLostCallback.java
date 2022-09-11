package org.gtk.gio;

/**
 * Invoked when the name is lost or @connection has been closed.
 */
@FunctionalInterface
public interface BusNameLostCallback {
        void onBusNameLostCallback(DBusConnection connection, java.lang.String name);
}
