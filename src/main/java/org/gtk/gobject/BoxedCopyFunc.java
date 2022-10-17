package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * This function is provided by the user and should produce a copy
 * of the passed in boxed structure.
 */
@FunctionalInterface
public interface BoxedCopyFunc {
        java.lang.foreign.MemoryAddress onBoxedCopyFunc(@NotNull java.lang.foreign.MemoryAddress boxed);
}
