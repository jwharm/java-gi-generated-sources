package org.gtk.gio;

/**
 * The type for the function that is used to convert an object property
 * value to a {@link org.gtk.glib.Variant} for storing it in {@link Settings}.
 */
@FunctionalInterface
public interface SettingsBindSetMapping {
        org.gtk.glib.Variant onSettingsBindSetMapping(org.gtk.gobject.Value value, org.gtk.glib.VariantType expectedType);
}
