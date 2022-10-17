package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of functions to be called when a UNIX fd watch source
 * triggers.
 */
@FunctionalInterface
public interface UnixFDSourceFunc {
        boolean onUnixFDSourceFunc(@NotNull int fd, @NotNull IOCondition condition);
}
