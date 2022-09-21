package org.gtk.gtk;

/**
 * Describes which edge of a widget a certain feature is positioned at.
 * <p>
 * For examples, see the tabs of a {@link Notebook}, or the label
 * of a {@link Scale}.
 */
public enum PositionType {

    /**
     * The feature is at the left edge.
     */
    LEFT,
    
    /**
     * The feature is at the right edge.
     */
    RIGHT,
    
    /**
     * The feature is at the top edge.
     */
    TOP,
    
    /**
     * The feature is at the bottom edge.
     */
    BOTTOM;
    
    public static PositionType fromValue(int value) {
        return switch(value) {
            case 0 -> LEFT;
            case 1 -> RIGHT;
            case 2 -> TOP;
            case 3 -> BOTTOM;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LEFT -> 0;
            case RIGHT -> 1;
            case TOP -> 2;
            case BOTTOM -> 3;
        };
    }

}
