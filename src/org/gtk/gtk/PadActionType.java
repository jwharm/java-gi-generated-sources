package org.gtk.gtk;

/**
 * The type of a pad action.
 */
public enum PadActionType {

    /**
     * Action is triggered by a pad button
     */
    BUTTON,
    
    /**
     * Action is triggered by a pad ring
     */
    RING,
    
    /**
     * Action is triggered by a pad strip
     */
    STRIP;
    
    public static PadActionType fromValue(int value) {
        return switch(value) {
            case 0 -> BUTTON;
            case 1 -> RING;
            case 2 -> STRIP;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BUTTON -> 0;
            case RING -> 1;
            case STRIP -> 2;
        };
    }

}
