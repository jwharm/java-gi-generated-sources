package org.gtk.gdk;

/**
 * Defines the reference point of a surface and is used in `GdkPopupLayout`.
 */
public enum Gravity {

    /**
     * the reference point is at the top left corner.
     */
    NORTH_WEST,
    
    /**
     * the reference point is in the middle of the top edge.
     */
    NORTH,
    
    /**
     * the reference point is at the top right corner.
     */
    NORTH_EAST,
    
    /**
     * the reference point is at the middle of the left edge.
     */
    WEST,
    
    /**
     * the reference point is at the center of the surface.
     */
    CENTER,
    
    /**
     * the reference point is at the middle of the right edge.
     */
    EAST,
    
    /**
     * the reference point is at the lower left corner.
     */
    SOUTH_WEST,
    
    /**
     * the reference point is at the middle of the lower edge.
     */
    SOUTH,
    
    /**
     * the reference point is at the lower right corner.
     */
    SOUTH_EAST,
    
    /**
     * the reference point is at the top left corner of the
     *  surface itself, ignoring window manager decorations.
     */
    STATIC;
    
    public static Gravity fromValue(int value) {
        return switch(value) {
            case 1 -> NORTH_WEST;
            case 2 -> NORTH;
            case 3 -> NORTH_EAST;
            case 4 -> WEST;
            case 5 -> CENTER;
            case 6 -> EAST;
            case 7 -> SOUTH_WEST;
            case 8 -> SOUTH;
            case 9 -> SOUTH_EAST;
            case 10 -> STATIC;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NORTH_WEST -> 1;
            case NORTH -> 2;
            case NORTH_EAST -> 3;
            case WEST -> 4;
            case CENTER -> 5;
            case EAST -> 6;
            case SOUTH_WEST -> 7;
            case SOUTH -> 8;
            case SOUTH_EAST -> 9;
            case STATIC -> 10;
        };
    }

}
