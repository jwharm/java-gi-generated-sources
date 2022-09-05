package org.gtk.gio;

@FunctionalInterface
public interface BusNameAcquiredCallback {

    /**
     * Invoked when the name is acquired.
     */
    public void onBusNameAcquiredCallback(DBusConnection connection, java.lang.String name, jdk.incubator.foreign.MemoryAddress userData);
}
