package org.gtk.gtk;

/**
 * Describes how the border of a UI element should be rendered.
 */
public enum BorderStyle {

    /**
     * No visible border
     */
    NONE,
    
    /**
     * Same as 
     *       
     *       
     *         Same as %GTK_BORDER_STYLE_NONE
     */
    HIDDEN,
    
    /**
     * A single line segment
     */
    SOLID,
    
    /**
     * Looks as if the content is sunken into the canvas
     */
    INSET,
    
    /**
     * Looks as if the content is coming out of the canvas
     */
    OUTSET,
    
    /**
     * A series of round dots
     */
    DOTTED,
    
    /**
     * A series of square-ended dashes
     */
    DASHED,
    
    /**
     * Two parallel lines with some space between them
     */
    DOUBLE,
    
    /**
     * Looks as if it were carved in the canvas
     */
    GROOVE,
    
    /**
     * Looks as if it were coming out of the canvas
     */
    RIDGE;
    
    public static BorderStyle fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> HIDDEN;
            case 2 -> SOLID;
            case 3 -> INSET;
            case 4 -> OUTSET;
            case 5 -> DOTTED;
            case 6 -> DASHED;
            case 7 -> DOUBLE;
            case 8 -> GROOVE;
            case 9 -> RIDGE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case HIDDEN -> 1;
            case SOLID -> 2;
            case INSET -> 3;
            case OUTSET -> 4;
            case DOTTED -> 5;
            case DASHED -> 6;
            case DOUBLE -> 7;
            case GROOVE -> 8;
            case RIDGE -> 9;
        };
    }

}
