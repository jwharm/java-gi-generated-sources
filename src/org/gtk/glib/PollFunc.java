package org.gtk.glib;

@FunctionalInterface
public interface PollFunc {

    /**
     * Specifies the type of function passed to g_main_context_set_poll_func().
     * The semantics of the function should match those of the poll() system call.
     */
    public int onPollFunc(PollFD ufds, int nfsd, int timeout);
}
