package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A function of this signature is used to copy the node data
 * when doing a deep-copy of a tree.
 */
@FunctionalInterface
public interface CopyFunc {
        java.lang.foreign.MemoryAddress onCopyFunc(@NotNull java.lang.foreign.MemoryAddress src);
}
