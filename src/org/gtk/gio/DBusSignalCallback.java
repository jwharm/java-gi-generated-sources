package org.gtk.gio;

@FunctionalInterface
public interface DBusSignalCallback {

    /**
     * Signature for callback function used in g_dbus_connection_signal_subscribe().
     */
    public void onDBusSignalCallback(DBusConnection connection, java.lang.String senderName, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String signalName, org.gtk.glib.Variant parameters, jdk.incubator.foreign.MemoryAddress userData);
}
