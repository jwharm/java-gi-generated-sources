package org.gtk.gio;

@FunctionalInterface
public interface BusNameAppearedCallback {

    /**
     * Invoked when the name being watched is known to have to have an owner.
     */
    public void onBusNameAppearedCallback(DBusConnection connection, java.lang.String name, java.lang.String nameOwner, jdk.incubator.foreign.MemoryAddress userData);
}
