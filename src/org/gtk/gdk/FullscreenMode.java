package org.gtk.gdk;

/**
 * Indicates which monitor a surface should span over when in fullscreen mode.
 */
public enum FullscreenMode {

    /**
     * Fullscreen on current monitor only.
     */
    CURRENT_MONITOR,
    
    /**
     * Span across all monitors when fullscreen.
     */
    ALL_MONITORS;
    
    public static FullscreenMode fromValue(int value) {
        return switch(value) {
            case 0 -> CURRENT_MONITOR;
            case 1 -> ALL_MONITORS;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case CURRENT_MONITOR -> 0;
            case ALL_MONITORS -> 1;
        };
    }

}
