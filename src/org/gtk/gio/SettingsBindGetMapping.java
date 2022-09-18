package org.gtk.gio;

/**
 * The type for the function that is used to convert from {@link org.gtk.gio.Settings} to
 * an object property. The @value is already initialized to hold values
 * of the appropriate type.
 */
@FunctionalInterface
public interface SettingsBindGetMapping {
        boolean onSettingsBindGetMapping(org.gtk.gobject.Value value, org.gtk.glib.Variant variant);
}
