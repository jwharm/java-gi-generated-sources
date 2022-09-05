package org.gtk.gtk;

/**
 * The possible values for the %GTK_ACCESSIBLE_STATE_PRESSED
 * accessible state.
 * 
 * Note that the %GTK_ACCESSIBLE_TRISTATE_FALSE and
 * %GTK_ACCESSIBLE_TRISTATE_TRUE have the same values
 * as %FALSE and %TRUE.
 */
public enum AccessibleTristate {

    /**
     * The state is `false`
     */
    FALSE,
    
    /**
     * The state is `true`
     */
    TRUE,
    
    /**
     * The state is `mixed`
     */
    MIXED;
    
    public static AccessibleTristate fromValue(int value) {
        return switch(value) {
            case 0 -> FALSE;
            case 1 -> TRUE;
            case 2 -> MIXED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FALSE -> 0;
            case TRUE -> 1;
            case MIXED -> 2;
        };
    }

}
