package org.gtk.gtk;

/**
 * See also gtk_print_settings_set_orientation().
 */
public enum PageOrientation {

    /**
     * Portrait mode.
     */
    PORTRAIT,
    
    /**
     * Landscape mode.
     */
    LANDSCAPE,
    
    /**
     * Reverse portrait mode.
     */
    REVERSE_PORTRAIT,
    
    /**
     * Reverse landscape mode.
     */
    REVERSE_LANDSCAPE;
    
    public static PageOrientation fromValue(int value) {
        return switch(value) {
            case 0 -> PORTRAIT;
            case 1 -> LANDSCAPE;
            case 2 -> REVERSE_PORTRAIT;
            case 3 -> REVERSE_LANDSCAPE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case PORTRAIT -> 0;
            case LANDSCAPE -> 1;
            case REVERSE_PORTRAIT -> 2;
            case REVERSE_LANDSCAPE -> 3;
        };
    }

}
