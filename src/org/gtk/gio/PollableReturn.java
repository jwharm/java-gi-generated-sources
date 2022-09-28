package org.gtk.gio;

/**
 * Return value for various IO operations that signal errors via the
 * return value and not necessarily via a {@link org.gtk.glib.Error}.
 * <p>
 * This enum exists to be able to return errors to callers without having to
 * allocate a {@link org.gtk.glib.Error}. Allocating {@code GErrors} can be quite expensive for
 * regularly happening errors like {@link IOErrorEnum#WOULD_BLOCK}.
 * <p>
 * In case of {@link PollableReturn#FAILED} a {@link org.gtk.glib.Error} should be set for the
 * operation to give details about the error that happened.
 */
public class PollableReturn extends io.github.jwharm.javagi.Enumeration {

    /**
     * Generic error condition for when an operation fails.
     */
    public static final PollableReturn FAILED = new PollableReturn(0);
    
    /**
     * The operation was successfully finished.
     */
    public static final PollableReturn OK = new PollableReturn(1);
    
    /**
     * The operation would block.
     */
    public static final PollableReturn WOULD_BLOCK = new PollableReturn(-27);
    
    public PollableReturn(int value) {
        super(value);
    }
    
}
