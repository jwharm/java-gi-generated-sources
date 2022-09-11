package org.gtk.gio;

/**
 * The type for the function that is used to convert an object property
 * value to a #GVariant for storing it in #GSettings.
 */
@FunctionalInterface
public interface SettingsBindSetMapping {
        org.gtk.glib.Variant onSettingsBindSetMapping(org.gtk.gobject.Value value, org.gtk.glib.VariantType expectedType);
}
