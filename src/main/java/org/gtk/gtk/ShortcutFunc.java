package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Prototype for shortcuts based on user callbacks.
 */
@FunctionalInterface
public interface ShortcutFunc {
        boolean onShortcutFunc(@NotNull Widget widget, @Nullable org.gtk.glib.Variant args);
}
