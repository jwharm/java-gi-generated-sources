package org.gtk.glib;

/**
 * The possible statuses of a one-time initialization function
 * controlled by a {@link Once} struct.
 */
public class OnceStatus extends io.github.jwharm.javagi.Enumeration {

    /**
     * the function has not been called yet.
     */
    public static final OnceStatus NOTCALLED = new OnceStatus(0);
    
    /**
     * the function call is currently in progress.
     */
    public static final OnceStatus PROGRESS = new OnceStatus(1);
    
    /**
     * the function has been called.
     */
    public static final OnceStatus READY = new OnceStatus(2);
    
    public OnceStatus(int value) {
        super(value);
    }
    
}
