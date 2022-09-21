package org.gtk.gtk;

/**
 * Specifies a preference for height-for-width or
 * width-for-height geometry management.
 */
public enum SizeRequestMode {

    /**
     * Prefer height-for-width geometry management
     */
    HEIGHT_FOR_WIDTH,
    
    /**
     * Prefer width-for-height geometry management
     */
    WIDTH_FOR_HEIGHT,
    
    /**
     * Don’t trade height-for-width or width-for-height
     */
    CONSTANT_SIZE;
    
    public static SizeRequestMode fromValue(int value) {
        return switch(value) {
            case 0 -> HEIGHT_FOR_WIDTH;
            case 1 -> WIDTH_FOR_HEIGHT;
            case 2 -> CONSTANT_SIZE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case HEIGHT_FOR_WIDTH -> 0;
            case WIDTH_FOR_HEIGHT -> 1;
            case CONSTANT_SIZE -> 2;
        };
    }

}
