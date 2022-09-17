package org.gtk.gdk;

/**
 * An enumeration describing the type of an input device in general terms.
 */
public enum InputSource {

    /**
     * the device is a mouse. (This will be reported for the core
     *   pointer, even if it is something else, such as a trackball.)
     */
    MOUSE,
    
    /**
     * the device is a stylus of a graphics tablet or similar device.
     */
    PEN,
    
    /**
     * the device is a keyboard.
     */
    KEYBOARD,
    
    /**
     * the device is a direct-input touch device, such
     *   as a touchscreen or tablet
     */
    TOUCHSCREEN,
    
    /**
     * the device is an indirect touch device, such
     *   as a touchpad
     */
    TOUCHPAD,
    
    /**
     * the device is a trackpoint
     */
    TRACKPOINT,
    
    /**
     * the device is a &#34;pad&#34;, a collection of buttons,
     *   rings and strips found in drawing tablets
     */
    TABLET_PAD;
    
    public static InputSource fromValue(int value) {
        return switch(value) {
            case 0 -> MOUSE;
            case 1 -> PEN;
            case 2 -> KEYBOARD;
            case 3 -> TOUCHSCREEN;
            case 4 -> TOUCHPAD;
            case 5 -> TRACKPOINT;
            case 6 -> TABLET_PAD;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case MOUSE -> 0;
            case PEN -> 1;
            case KEYBOARD -> 2;
            case TOUCHSCREEN -> 3;
            case TOUCHPAD -> 4;
            case TRACKPOINT -> 5;
            case TABLET_PAD -> 6;
        };
    }

}
