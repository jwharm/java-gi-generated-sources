package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of a comparison function used to compare two
 * values.  The function should return a negative integer if the first
 * value comes before the second, 0 if they are equal, or a positive
 * integer if the first value comes after the second.
 */
@FunctionalInterface
public interface CompareDataFunc {
        int onCompareDataFunc(@Nullable java.lang.foreign.MemoryAddress a, @Nullable java.lang.foreign.MemoryAddress b);
}
