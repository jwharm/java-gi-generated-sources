package org.gtk.gtk;

/**
 * Types of user actions that may be blocked by {@code GtkApplication}.
 * <p>
 * See {@link Application#inhibit}.
 */
public class ApplicationInhibitFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * Inhibit ending the user session
     *   by logging out or by shutting down the computer
     */
    public static final ApplicationInhibitFlags LOGOUT = new ApplicationInhibitFlags(1);
    
    /**
     * Inhibit user switching
     */
    public static final ApplicationInhibitFlags SWITCH = new ApplicationInhibitFlags(2);
    
    /**
     * Inhibit suspending the
     *   session or computer
     */
    public static final ApplicationInhibitFlags SUSPEND = new ApplicationInhibitFlags(4);
    
    /**
     * Inhibit the session being
     *   marked as idle (and possibly locked)
     */
    public static final ApplicationInhibitFlags IDLE = new ApplicationInhibitFlags(8);
    
    public ApplicationInhibitFlags(int value) {
        super(value);
    }
    
}
