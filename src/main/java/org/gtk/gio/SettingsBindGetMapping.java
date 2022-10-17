package org.gtk.gio;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type for the function that is used to convert from {@link Settings} to
 * an object property. The {@code value} is already initialized to hold values
 * of the appropriate type.
 */
@FunctionalInterface
public interface SettingsBindGetMapping {
        boolean onSettingsBindGetMapping(@NotNull org.gtk.gobject.Value value, @NotNull org.gtk.glib.Variant variant);
}
