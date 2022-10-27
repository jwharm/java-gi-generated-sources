package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of functions that are used to 'duplicate' an object.
 * What this means depends on the context, it could just be
 * incrementing the reference count, if {@code data} is a ref-counted
 * object.
 */
@FunctionalInterface
public interface DuplicateFunc {
        java.lang.foreign.MemoryAddress onDuplicateFunc();
}
