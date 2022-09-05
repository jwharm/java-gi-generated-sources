package org.gtk.gio;

@FunctionalInterface
public interface BusNameLostCallback {

    /**
     * Invoked when the name is lost or @connection has been closed.
     */
    public void onBusNameLostCallback(DBusConnection connection, java.lang.String name, jdk.incubator.foreign.MemoryAddress userData);
}
