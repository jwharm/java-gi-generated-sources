package org.gtk.gtk;

/**
 * Describes the panning direction of a {@link [class@GesturePan]}.
 */
public enum PanDirection {

    /**
     * panned towards the left
     */
    LEFT,
    
    /**
     * panned towards the right
     */
    RIGHT,
    
    /**
     * panned upwards
     */
    UP,
    
    /**
     * panned downwards
     */
    DOWN;
    
    public static PanDirection fromValue(int value) {
        return switch(value) {
            case 0 -> LEFT;
            case 1 -> RIGHT;
            case 2 -> UP;
            case 3 -> DOWN;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LEFT -> 0;
            case RIGHT -> 1;
            case UP -> 2;
            case DOWN -> 3;
        };
    }

}
