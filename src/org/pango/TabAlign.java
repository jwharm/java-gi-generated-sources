package org.pango;

/**
 * `PangoTabAlign` specifies where the text appears relative to the tab stop
 * position.
 */
public enum TabAlign {

    /**
     * the text appears to the right of the tab stop position
     */
    LEFT,
    
    /**
     * the text appears to the left of the tab stop position
     *   until the available space is filled. Since: 1.50
     */
    RIGHT,
    
    /**
     * the text is centered at the tab stop position
     *   until the available space is filled. Since: 1.50
     */
    CENTER,
    
    /**
     * text before the first occurrence of the decimal point
     *   character appears to the left of the tab stop position (until the available
     *   space is filled), the rest to the right. Since: 1.50
     */
    DECIMAL;
    
    public static TabAlign fromValue(int value) {
        return switch(value) {
            case 0 -> LEFT;
            case 1 -> RIGHT;
            case 2 -> CENTER;
            case 3 -> DECIMAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case LEFT -> 0;
            case RIGHT -> 1;
            case CENTER -> 2;
            case DECIMAL -> 3;
        };
    }

}
