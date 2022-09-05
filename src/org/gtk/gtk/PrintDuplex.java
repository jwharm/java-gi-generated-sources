package org.gtk.gtk;

/**
 * See also gtk_print_settings_set_duplex().
 */
public enum PrintDuplex {

    /**
     * No duplex.
     */
    SIMPLEX,
    
    /**
     * Horizontal duplex.
     */
    HORIZONTAL,
    
    /**
     * Vertical duplex.
     */
    VERTICAL;
    
    public static PrintDuplex fromValue(int value) {
        return switch(value) {
            case 0 -> SIMPLEX;
            case 1 -> HORIZONTAL;
            case 2 -> VERTICAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case SIMPLEX -> 0;
            case HORIZONTAL -> 1;
            case VERTICAL -> 2;
        };
    }

}
