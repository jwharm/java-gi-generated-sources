package org.gtk.gio;

@FunctionalInterface
public interface DBusSubtreeDispatchFunc {

        void onDBusSubtreeDispatchFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String node, jdk.incubator.foreign.MemoryAddress outUserData);
}
