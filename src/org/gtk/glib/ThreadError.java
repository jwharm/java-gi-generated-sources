package org.gtk.glib;

/**
 * Possible errors of thread related functions.
 */
public class ThreadError extends io.github.jwharm.javagi.Enumeration {

    /**
     * a thread couldn't be created due to resource
     *                        shortage. Try again later.
     */
    public static final ThreadError THREAD_ERROR_AGAIN = new ThreadError(0);
    
    public ThreadError(int value) {
        super(value);
    }
    
}
