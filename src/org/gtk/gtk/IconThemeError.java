package org.gtk.gtk;

/**
 * Error codes for `GtkIconTheme` operations.
 */
public enum IconThemeError {

    /**
     * The icon specified does not exist in the theme
     */
    NOT_FOUND,
    
    /**
     * An unspecified error occurred.
     */
    FAILED;
    
    public static IconThemeError fromValue(int value) {
        return switch(value) {
            case 0 -> NOT_FOUND;
            case 1 -> FAILED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NOT_FOUND -> 0;
            case FAILED -> 1;
        };
    }

}
