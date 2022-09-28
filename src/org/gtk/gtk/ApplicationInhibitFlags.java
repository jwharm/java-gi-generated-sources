package org.gtk.gtk;

/**
 * Types of user actions that may be blocked by {@code GtkApplication}.
 * <p>
 * See {@link Application#inhibit}.
 */
public class ApplicationInhibitFlags {

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
    
    private int value;
    
    public ApplicationInhibitFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ApplicationInhibitFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public ApplicationInhibitFlags combined(ApplicationInhibitFlags mask) {
        return new ApplicationInhibitFlags(this.getValue() | mask.getValue());
    }
    
    public static ApplicationInhibitFlags combined(ApplicationInhibitFlags mask, ApplicationInhibitFlags... masks) {
        int value = mask.getValue();
        for (ApplicationInhibitFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ApplicationInhibitFlags(value);
    }
    
}
