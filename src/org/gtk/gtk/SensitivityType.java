package org.gtk.gtk;

/**
 * Determines how GTK handles the sensitivity of various controls,
 * such as combo box buttons.
 */
public enum SensitivityType {

    /**
     * The control is made insensitive if no
     *   action can be triggered
     */
    AUTO,
    
    /**
     * The control is always sensitive
     */
    ON,
    
    /**
     * The control is always insensitive
     */
    OFF;
    
    public static SensitivityType fromValue(int value) {
        return switch(value) {
            case 0 -> AUTO;
            case 1 -> ON;
            case 2 -> OFF;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case AUTO -> 0;
            case ON -> 1;
            case OFF -> 2;
        };
    }

}
