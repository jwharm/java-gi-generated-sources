package org.gtk.gtk;

/**
 * The possible values for the {@link AccessibleState#PRESSED}
 * accessible state.
 * <p>
 * Note that the {@link AccessibleTristate#FALSE} and
 * {@link AccessibleTristate#TRUE} have the same values
 * as {@code false} and {@code true}.
 */
public enum AccessibleTristate {

    /**
     * The state is {@code false}
     */
    FALSE,
    
    /**
     * The state is {@code true}
     */
    TRUE,
    
    /**
     * The state is {@code mixed}
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
