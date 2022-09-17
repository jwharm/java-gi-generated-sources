package org.gtk.gtk;

/**
 * The widget attributes that can be used when creating a {@link [class@Constraint]}.
 */
public enum ConstraintAttribute {

    /**
     * No attribute, used for constant
     *   relations
     */
    NONE,
    
    /**
     * The left edge of a widget, regardless of
     *   text direction
     */
    LEFT,
    
    /**
     * The right edge of a widget, regardless
     *   of text direction
     */
    RIGHT,
    
    /**
     * The top edge of a widget
     */
    TOP,
    
    /**
     * The bottom edge of a widget
     */
    BOTTOM,
    
    /**
     * The leading edge of a widget, depending
     *   on text direction; equivalent to {@link org.gtk.gtk.ConstraintAttribute#LEFT} for LTR
     *   languages, and {@link org.gtk.gtk.ConstraintAttribute#RIGHT} for RTL ones
     */
    START,
    
    /**
     * The trailing edge of a widget, depending
     *   on text direction; equivalent to {@link org.gtk.gtk.ConstraintAttribute#RIGHT} for LTR
     *   languages, and {@link org.gtk.gtk.ConstraintAttribute#LEFT} for RTL ones
     */
    END,
    
    /**
     * The width of a widget
     */
    WIDTH,
    
    /**
     * The height of a widget
     */
    HEIGHT,
    
    /**
     * The center of a widget, on the
     *   horizontal axis
     */
    CENTER_X,
    
    /**
     * The center of a widget, on the
     *   vertical axis
     */
    CENTER_Y,
    
    /**
     * The baseline of a widget
     */
    BASELINE;
    
    public static ConstraintAttribute fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> LEFT;
            case 2 -> RIGHT;
            case 3 -> TOP;
            case 4 -> BOTTOM;
            case 5 -> START;
            case 6 -> END;
            case 7 -> WIDTH;
            case 8 -> HEIGHT;
            case 9 -> CENTER_X;
            case 10 -> CENTER_Y;
            case 11 -> BASELINE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case LEFT -> 1;
            case RIGHT -> 2;
            case TOP -> 3;
            case BOTTOM -> 4;
            case START -> 5;
            case END -> 6;
            case WIDTH -> 7;
            case HEIGHT -> 8;
            case CENTER_X -> 9;
            case CENTER_Y -> 10;
            case BASELINE -> 11;
        };
    }

}
