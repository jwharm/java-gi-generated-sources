package org.pango;

/**
 * {@code PangoAlignment} describes how to align the lines of a {@code PangoLayout}
 * within the available space.
 * <p>
 * If the {@code PangoLayout} is set to justify using {@link Layout#setJustify},
 * this only affects partial lines.
 * <p>
 * See {@link Layout#setAutoDir} for how text direction affects
 * the interpretation of {@code PangoAlignment} values.
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
