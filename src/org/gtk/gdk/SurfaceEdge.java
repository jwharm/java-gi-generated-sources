package org.gtk.gdk;

/**
 * Determines a surface edge or corner.
 */
public enum SurfaceEdge {

    /**
     * the top left corner.
     */
    NORTH_WEST,
    
    /**
     * the top edge.
     */
    NORTH,
    
    /**
     * the top right corner.
     */
    NORTH_EAST,
    
    /**
     * the left edge.
     */
    WEST,
    
    /**
     * the right edge.
     */
    EAST,
    
    /**
     * the lower left corner.
     */
    SOUTH_WEST,
    
    /**
     * the lower edge.
     */
    SOUTH,
    
    /**
     * the lower right corner.
     */
    SOUTH_EAST;
    
    public static SurfaceEdge fromValue(int value) {
        return switch(value) {
            case 0 -> NORTH_WEST;
            case 1 -> NORTH;
            case 2 -> NORTH_EAST;
            case 3 -> WEST;
            case 4 -> EAST;
            case 5 -> SOUTH_WEST;
            case 6 -> SOUTH;
            case 7 -> SOUTH_EAST;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NORTH_WEST -> 0;
            case NORTH -> 1;
            case NORTH_EAST -> 2;
            case WEST -> 3;
            case EAST -> 4;
            case SOUTH_WEST -> 5;
            case SOUTH -> 6;
            case SOUTH_EAST -> 7;
        };
    }

}
