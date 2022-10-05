package org.gtk.gio;

import io.github.jwharm.javagi.*;

/**
 * The type for the function that is used to convert from {@link Settings} to
 * an object property. The {@code value} is already initialized to hold values
 * of the appropriate type.
 */
@FunctionalInterface
public interface SettingsBindGetMapping {
        boolean onSettingsBindGetMapping(org.gtk.gobject.Value value, org.gtk.glib.Variant variant);
}