package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type for the function that is used to convert an object property
 * value to a {@link org.gtk.glib.Variant} for storing it in {@link Settings}.
 */
@FunctionalInterface
public interface SettingsBindSetMapping {
        org.gtk.glib.Variant onSettingsBindSetMapping(@NotNull org.gtk.gobject.Value value, @NotNull org.gtk.glib.VariantType expectedType);
}
