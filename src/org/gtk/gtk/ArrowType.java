package org.gtk.gtk;

/**
 * Used to indicate the direction in which an arrow should point.
 */
public enum ArrowType {

    /**
     * Represents an upward pointing arrow.
     */
    UP,
    
    /**
     * Represents a downward pointing arrow.
     */
    DOWN,
    
    /**
     * Represents a left pointing arrow.
     */
    LEFT,
    
    /**
     * Represents a right pointing arrow.
     */
    RIGHT,
    
    /**
     * No arrow.
     */
    NONE;
    
    public static ArrowType fromValue(int value) {
        return switch(value) {
            case 0 -> UP;
            case 1 -> DOWN;
            case 2 -> LEFT;
            case 3 -> RIGHT;
            case 4 -> NONE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UP -> 0;
            case DOWN -> 1;
            case LEFT -> 2;
            case RIGHT -> 3;
            case NONE -> 4;
        };
    }

}
