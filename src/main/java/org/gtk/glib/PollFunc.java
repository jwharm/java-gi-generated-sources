package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * Specifies the type of function passed to g_main_context_set_poll_func().
 * The semantics of the function should match those of the poll() system call.
 */
@FunctionalInterface
public interface PollFunc {
        int onPollFunc(PollFD ufds, int nfsd, int timeout);
}
