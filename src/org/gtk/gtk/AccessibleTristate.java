package org.gtk.gtk;

/**
 * The possible values for the <code>GTK_ACCESSIBLE_STATE_PRESSED
 * accessible</code> state.
 * 
 * Note that the {@link org.gtk.gtk.AccessibleTristate#FALSE} and
 * {@link org.gtk.gtk.AccessibleTristate#TRUE} have the same values
 * as <code>false</code> and and %TRUE.
 */
public enum AccessibleTristate {

    /**
     * The state is <code>false</code>
     */
    FALSE,
    
    /**
     * The state is <code>true</code>
     */
    TRUE,
    
    /**
     * The state is <code>mixed</code>
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
