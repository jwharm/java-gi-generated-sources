package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * This function is provided by the user and should free the boxed
 * structure passed.
 */
@FunctionalInterface
public interface BoxedFreeFunc {
        void onBoxedFreeFunc(@NotNull java.lang.foreign.MemoryAddress boxed);
}
