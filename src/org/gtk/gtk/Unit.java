package org.gtk.gtk;

/**
 * See also gtk_print_settings_set_paper_width().
 */
public enum Unit {

    /**
     * No units.
     */
    NONE,
    
    /**
     * Dimensions in points.
     */
    POINTS,
    
    /**
     * Dimensions in inches.
     */
    INCH,
    
    /**
     * Dimensions in millimeters
     */
    MM;
    
    public static Unit fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> POINTS;
            case 2 -> INCH;
            case 3 -> MM;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case POINTS -> 1;
            case INCH -> 2;
            case MM -> 3;
        };
    }

}
