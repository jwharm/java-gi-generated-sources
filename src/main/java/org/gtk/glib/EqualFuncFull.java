package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of a function used to test two values for
 * equality. The function should return {@code true} if both values are equal
 * and {@code false} otherwise.
 * <p>
 * This is a version of {@link EqualFunc} which provides a {@code user_data} closure from
 * the caller.
 * @version 2.74
 */
@FunctionalInterface
public interface EqualFuncFull {
        boolean onEqualFuncFull(@Nullable java.lang.foreign.MemoryAddress a, @Nullable java.lang.foreign.MemoryAddress b);
}
