package org.gtk.gtk;

/**
 * The values of the GtkSpinType enumeration are used to specify the
 * change to make in gtk_spin_button_spin().
 */
public enum SpinType {

    /**
     * Increment by the adjustments step increment.
     */
    STEP_FORWARD,
    
    /**
     * Decrement by the adjustments step increment.
     */
    STEP_BACKWARD,
    
    /**
     * Increment by the adjustments page increment.
     */
    PAGE_FORWARD,
    
    /**
     * Decrement by the adjustments page increment.
     */
    PAGE_BACKWARD,
    
    /**
     * Go to the adjustments lower bound.
     */
    HOME,
    
    /**
     * Go to the adjustments upper bound.
     */
    END,
    
    /**
     * Change by a specified amount.
     */
    USER_DEFINED;
    
    public static SpinType fromValue(int value) {
        return switch(value) {
            case 0 -> STEP_FORWARD;
            case 1 -> STEP_BACKWARD;
            case 2 -> PAGE_FORWARD;
            case 3 -> PAGE_BACKWARD;
            case 4 -> HOME;
            case 5 -> END;
            case 6 -> USER_DEFINED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case STEP_FORWARD -> 0;
            case STEP_BACKWARD -> 1;
            case PAGE_FORWARD -> 2;
            case PAGE_BACKWARD -> 3;
            case HOME -> 4;
            case END -> 5;
            case USER_DEFINED -> 6;
        };
    }

}
