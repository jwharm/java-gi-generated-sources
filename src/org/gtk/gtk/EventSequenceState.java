package org.gtk.gtk;

/**
 * Describes the state of a {@code Gesture}.
 */
public enum EventSequenceState {

    /**
     * The sequence is handled, but not grabbed.
     */
    NONE,
    
    /**
     * The sequence is handled and grabbed.
     */
    CLAIMED,
    
    /**
     * The sequence is denied.
     */
    DENIED;
    
    public static EventSequenceState fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> CLAIMED;
            case 2 -> DENIED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case CLAIMED -> 1;
            case DENIED -> 2;
        };
    }

}
