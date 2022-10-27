package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Prototype for shortcuts based on user callbacks.
 */
@FunctionalInterface
public interface ShortcutFunc {
        boolean onShortcutFunc(@NotNull org.gtk.gtk.Widget widget, @Nullable org.gtk.glib.Variant args);
}
