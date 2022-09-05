package org.gtk.gtk;

/**
 * Focus movement types.
 */
public enum DirectionType {

    /**
     * Move forward.
     */
    TAB_FORWARD,
    
    /**
     * Move backward.
     */
    TAB_BACKWARD,
    
    /**
     * Move up.
     */
    UP,
    
    /**
     * Move down.
     */
    DOWN,
    
    /**
     * Move left.
     */
    LEFT,
    
    /**
     * Move right.
     */
    RIGHT;
    
    public static DirectionType fromValue(int value) {
        return switch(value) {
            case 0 -> TAB_FORWARD;
            case 1 -> TAB_BACKWARD;
            case 2 -> UP;
            case 3 -> DOWN;
            case 4 -> LEFT;
            case 5 -> RIGHT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case TAB_FORWARD -> 0;
            case TAB_BACKWARD -> 1;
            case UP -> 2;
            case DOWN -> 3;
            case LEFT -> 4;
            case RIGHT -> 5;
        };
    }

}
