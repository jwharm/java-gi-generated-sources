package org.gtk.gio;

@FunctionalInterface
public interface DBusInterfaceGetPropertyFunc {

    /**
     * The type of the @get_property function in #GDBusInterfaceVTable.
     */
    public org.gtk.glib.Variant onDBusInterfaceGetPropertyFunc(DBusConnection connection, java.lang.String sender, java.lang.String objectPath, java.lang.String interfaceName, java.lang.String propertyName, org.gtk.glib.Error[] error, jdk.incubator.foreign.MemoryAddress userData);
}
