package org.gtk.gio;

@FunctionalInterface
public interface BusNameAppearedCallback {

        void onBusNameAppearedCallback(DBusConnection connection, java.lang.String name, java.lang.String nameOwner);
}
