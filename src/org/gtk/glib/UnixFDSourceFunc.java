package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * The type of functions to be called when a UNIX fd watch source
 * triggers.
 */
@FunctionalInterface
public interface UnixFDSourceFunc {
        boolean onUnixFDSourceFunc(int fd, IOCondition condition);
}
