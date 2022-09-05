package org.gtk.gdk;

/**
 * This enumeration describes how the red, green and blue components
 * of physical pixels on an output device are laid out.
 */
public enum SubpixelLayout {

    /**
     * The layout is not known
     */
    UNKNOWN,
    
    /**
     * Not organized in this way
     */
    NONE,
    
    /**
     * The layout is horizontal, the order is RGB
     */
    HORIZONTAL_RGB,
    
    /**
     * The layout is horizontal, the order is BGR
     */
    HORIZONTAL_BGR,
    
    /**
     * The layout is vertical, the order is RGB
     */
    VERTICAL_RGB,
    
    /**
     * The layout is vertical, the order is BGR
     */
    VERTICAL_BGR;
    
    public static SubpixelLayout fromValue(int value) {
        return switch(value) {
            case 0 -> UNKNOWN;
            case 1 -> NONE;
            case 2 -> HORIZONTAL_RGB;
            case 3 -> HORIZONTAL_BGR;
            case 4 -> VERTICAL_RGB;
            case 5 -> VERTICAL_BGR;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case UNKNOWN -> 0;
            case NONE -> 1;
            case HORIZONTAL_RGB -> 2;
            case HORIZONTAL_BGR -> 3;
            case VERTICAL_RGB -> 4;
            case VERTICAL_BGR -> 5;
        };
    }

}
