package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Declares a type of function which takes no arguments
 * and has no return value. It is used to specify the type
 * function passed to g_atexit().
 */
@FunctionalInterface
public interface VoidFunc {
        void onVoidFunc();
}
