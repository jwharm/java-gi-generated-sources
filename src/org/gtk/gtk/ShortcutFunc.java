package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * Prototype for shortcuts based on user callbacks.
 */
@FunctionalInterface
public interface ShortcutFunc {
        boolean onShortcutFunc(Widget widget, org.gtk.glib.Variant args);
}
