package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of a function used to test two values for
 * equality. The function should return {@code true} if both values are equal
 * and {@code false} otherwise.
 */
@FunctionalInterface
public interface EqualFunc {
        boolean onEqualFunc(@Nullable java.lang.foreign.MemoryAddress a, @Nullable java.lang.foreign.MemoryAddress b);
}
