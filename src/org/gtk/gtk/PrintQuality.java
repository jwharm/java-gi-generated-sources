package org.gtk.gtk;

/**
 * See also gtk_print_settings_set_quality().
 */
public enum PrintQuality {

    /**
     * Low quality.
     */
    LOW,
    
    /**
     * Normal quality.
     */
    NORMAL,
    
    /**
     * High quality.
     */
    HIGH,
    
    /**
     * Draft quality.
     */
    DRAFT;
    
    public static PrintQuality fromValue(int value) {
        return switch(value) {
            case 0 -> LOW;
            case 1 -> NORMAL;
            case 2 -> HIGH;
            case 3 -> DRAFT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LOW -> 0;
            case NORMAL -> 1;
            case HIGH -> 2;
            case DRAFT -> 3;
        };
    }

}
