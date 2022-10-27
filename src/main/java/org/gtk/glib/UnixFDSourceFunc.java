package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of functions to be called when a UNIX fd watch source
 * triggers.
 */
@FunctionalInterface
public interface UnixFDSourceFunc {
        boolean onUnixFDSourceFunc(int fd, @NotNull org.gtk.glib.IOCondition condition);
}
