package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Types of user actions that may be blocked by {@code GtkApplication}.
 * <p>
 * See {@link Application#inhibit}.
 */
public class ApplicationInhibitFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkApplicationInhibitFlags";
    
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
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ApplicationInhibitFlags or(ApplicationInhibitFlags... masks) {
        int value = this.getValue();
        for (ApplicationInhibitFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ApplicationInhibitFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ApplicationInhibitFlags combined(ApplicationInhibitFlags mask, ApplicationInhibitFlags... masks) {
        int value = mask.getValue();
        for (ApplicationInhibitFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ApplicationInhibitFlags(value);
    }
}
