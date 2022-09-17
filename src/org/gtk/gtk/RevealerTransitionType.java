package org.gtk.gtk;

/**
 * These enumeration values describe the possible transitions
 * when the child of a <code>GtkRevealer</code> widget is shown or hidden.
 */
public enum RevealerTransitionType {

    /**
     * No transition
     */
    NONE,
    
    /**
     * Fade in
     */
    CROSSFADE,
    
    /**
     * Slide in from the left
     */
    SLIDE_RIGHT,
    
    /**
     * Slide in from the right
     */
    SLIDE_LEFT,
    
    /**
     * Slide in from the bottom
     */
    SLIDE_UP,
    
    /**
     * Slide in from the top
     */
    SLIDE_DOWN,
    
    /**
     * Floop in from the left
     */
    SWING_RIGHT,
    
    /**
     * Floop in from the right
     */
    SWING_LEFT,
    
    /**
     * Floop in from the bottom
     */
    SWING_UP,
    
    /**
     * Floop in from the top
     */
    SWING_DOWN;
    
    public static RevealerTransitionType fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> CROSSFADE;
            case 2 -> SLIDE_RIGHT;
            case 3 -> SLIDE_LEFT;
            case 4 -> SLIDE_UP;
            case 5 -> SLIDE_DOWN;
            case 6 -> SWING_RIGHT;
            case 7 -> SWING_LEFT;
            case 8 -> SWING_UP;
            case 9 -> SWING_DOWN;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case CROSSFADE -> 1;
            case SLIDE_RIGHT -> 2;
            case SLIDE_LEFT -> 3;
            case SLIDE_UP -> 4;
            case SLIDE_DOWN -> 5;
            case SWING_RIGHT -> 6;
            case SWING_LEFT -> 7;
            case SWING_UP -> 8;
            case SWING_DOWN -> 9;
        };
    }

}
