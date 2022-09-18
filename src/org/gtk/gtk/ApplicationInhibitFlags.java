package org.gtk.gtk;

/**
 * Types of user actions that may be blocked by <code>GtkApplication</code>.
 * 
 * See {@link org.gtk.gtk.Application<code>#inhibit</code> .
 */
public class ApplicationInhibitFlags {

    /**
     * Inhibit ending the user session
     *   by logging out or by shutting down the computer
     */
    public static final int LOGOUT = 1;
    
    /**
     * Inhibit user switching
     */
    public static final int SWITCH = 2;
    
    /**
     * Inhibit suspending the
     *   session or computer
     */
    public static final int SUSPEND = 4;
    
    /**
     * Inhibit the session being
     *   marked as idle (and possibly locked)
     */
    public static final int IDLE = 8;
    
}
