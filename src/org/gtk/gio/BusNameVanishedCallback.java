package org.gtk.gio;

@FunctionalInterface
public interface BusNameVanishedCallback {

        void onBusNameVanishedCallback(DBusConnection connection, java.lang.String name);
}
