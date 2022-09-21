package org.gtk.gdk;

/**
 * Defines how device axes are interpreted by GTK.
 * <p>
 * Note that the X and Y axes are not really needed; pointer devices
 * report their location via the x/y members of events regardless. Whether
 * X and Y are present as axes depends on the GDK backend.
 */
public enum AxisUse {

    /**
     * the axis is ignored.
     */
    IGNORE,
    
    /**
     * the axis is used as the x axis.
     */
    X,
    
    /**
     * the axis is used as the y axis.
     */
    Y,
    
    /**
     * the axis is used as the scroll x delta
     */
    DELTA_X,
    
    /**
     * the axis is used as the scroll y delta
     */
    DELTA_Y,
    
    /**
     * the axis is used for pressure information.
     */
    PRESSURE,
    
    /**
     * the axis is used for x tilt information.
     */
    XTILT,
    
    /**
     * the axis is used for y tilt information.
     */
    YTILT,
    
    /**
     * the axis is used for wheel information.
     */
    WHEEL,
    
    /**
     * the axis is used for pen/tablet distance information
     */
    DISTANCE,
    
    /**
     * the axis is used for pen rotation information
     */
    ROTATION,
    
    /**
     * the axis is used for pen slider information
     */
    SLIDER,
    
    /**
     * a constant equal to the numerically highest axis value.
     */
    LAST;
    
    public static AxisUse fromValue(int value) {
        return switch(value) {
            case 0 -> IGNORE;
            case 1 -> X;
            case 2 -> Y;
            case 3 -> DELTA_X;
            case 4 -> DELTA_Y;
            case 5 -> PRESSURE;
            case 6 -> XTILT;
            case 7 -> YTILT;
            case 8 -> WHEEL;
            case 9 -> DISTANCE;
            case 10 -> ROTATION;
            case 11 -> SLIDER;
            case 12 -> LAST;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case IGNORE -> 0;
            case X -> 1;
            case Y -> 2;
            case DELTA_X -> 3;
            case DELTA_Y -> 4;
            case PRESSURE -> 5;
            case XTILT -> 6;
            case YTILT -> 7;
            case WHEEL -> 8;
            case DISTANCE -> 9;
            case ROTATION -> 10;
            case SLIDER -> 11;
            case LAST -> 12;
        };
    }

}
