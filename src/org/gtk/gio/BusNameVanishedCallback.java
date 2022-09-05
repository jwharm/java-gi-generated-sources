package org.gtk.gio;

@FunctionalInterface
public interface BusNameVanishedCallback {

    /**
     * Invoked when the name being watched is known not to have to have an owner.
     * 
     * This is also invoked when the #GDBusConnection on which the watch was
     * established has been closed.  In that case, @connection will be
     * %NULL.
     */
    public void onBusNameVanishedCallback(DBusConnection connection, java.lang.String name, jdk.incubator.foreign.MemoryAddress userData);
}
