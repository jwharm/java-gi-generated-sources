package org.pango;

/**
 * `PangoAlignment` describes how to align the lines of a `PangoLayout`
 * within the available space.
 * 
 * If the `PangoLayout` is set to justify using [method@Pango.Layout.set_justify],
 * this only affects partial lines.
 * 
 * See [method@Pango.Layout.set_auto_dir] for how text direction affects
 * the interpretation of `PangoAlignment` values.
 */
public enum Alignment {

    /**
     * Put all available space on the right
     */
    LEFT,
    
    /**
     * Center the line within the available space
     */
    CENTER,
    
    /**
     * Put all available space on the left
     */
    RIGHT;
    
    public static Alignment fromValue(int value) {
        return switch(value) {
            case 0 -> LEFT;
            case 1 -> CENTER;
            case 2 -> RIGHT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LEFT -> 0;
            case CENTER -> 1;
            case RIGHT -> 2;
        };
    }

}
