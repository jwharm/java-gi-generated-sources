package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_main_context_set_poll_func().
 * The semantics of the function should match those of the poll() system call.
 */
@FunctionalInterface
public interface PollFunc {
        int onPollFunc(@NotNull PollFD ufds, @NotNull int nfsd, @NotNull int timeout);
}
