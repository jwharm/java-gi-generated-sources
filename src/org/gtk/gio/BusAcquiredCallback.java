package org.gtk.gio;

@FunctionalInterface
public interface BusAcquiredCallback {

    /**
     * Invoked when a connection to a message bus has been obtained.
     */
    public void onBusAcquiredCallback(DBusConnection connection, java.lang.String name, jdk.incubator.foreign.MemoryAddress userData);
}
