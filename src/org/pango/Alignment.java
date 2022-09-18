package org.pango;

/**
 * <code>PangoAlignment</code> describes how to align the lines of a <code>PangoLayout</code>
 * within the available space.
 * <p>
 * If the <code>PangoLayout</code> is set to justify using {@link org.pango.Layout<code>#setJustify</code> ,
 * this only affects partial lines.
 * <p>
 * See {@link org.pango.Layout<code>#setAutoDir</code>  for how text direction affects
 * the interpretation of <code>PangoAlignment</code> values.
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
