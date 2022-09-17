package org.gtk.gtk;

/**
 * The possible values for the <code>GTK_ACCESSIBLE_STATE_INVALID
 * accessible</code> state.
 * 
 * Note that the {@link org.gtk.gtk.AccessibleInvalidState#FALSE} and
 * {@link org.gtk.gtk.AccessibleInvalidState#TRUE} have the same values
 * as <code>false</code> and and %TRUE.
 */
public enum AccessibleInvalidState {

    /**
     * There are no detected errors in the value
     */
    FALSE,
    
    /**
     * The value entered by the user has failed validation
     */
    TRUE,
    
    /**
     * A grammatical error was detected
     */
    GRAMMAR,
    
    /**
     * A spelling error was detected
     */
    SPELLING;
    
    public static AccessibleInvalidState fromValue(int value) {
        return switch(value) {
            case 0 -> FALSE;
            case 1 -> TRUE;
            case 2 -> GRAMMAR;
            case 3 -> SPELLING;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case FALSE -> 0;
            case TRUE -> 1;
            case GRAMMAR -> 2;
            case SPELLING -> 3;
        };
    }

}
