package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 2.60
 */
public class PollableReturn extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GPollableReturn";
    
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
    public static final PollableReturn WOULD_BLOCK = new PollableReturn(0);
    
    public PollableReturn(int value) {
        super(value);
    }
}
