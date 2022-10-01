package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * Declares a type of function which takes an arbitrary
 * data pointer argument and has no return value. It is
 * not currently used in GLib or GTK+.
 */
@FunctionalInterface
public interface FreeFunc {
        void onFreeFunc();
}
