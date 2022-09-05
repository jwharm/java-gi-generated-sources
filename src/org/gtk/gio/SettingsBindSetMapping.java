package org.gtk.gio;

@FunctionalInterface
public interface SettingsBindSetMapping {

    /**
     * The type for the function that is used to convert an object property
     * value to a #GVariant for storing it in #GSettings.
     */
    public org.gtk.glib.Variant onSettingsBindSetMapping(org.gtk.gobject.Value value, org.gtk.glib.VariantType expectedType, jdk.incubator.foreign.MemoryAddress userData);
}
