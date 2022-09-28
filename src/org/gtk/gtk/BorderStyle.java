package org.gtk.gtk;

/**
 * Describes how the border of a UI element should be rendered.
 */
public class BorderStyle {

    /**
     * No visible border
     */
    public static final BorderStyle NONE = new BorderStyle(0);
    
    /**
     * Same as {@link BorderStyle#NONE}
     */
    public static final BorderStyle HIDDEN = new BorderStyle(1);
    
    /**
     * A single line segment
     */
    public static final BorderStyle SOLID = new BorderStyle(2);
    
    /**
     * Looks as if the content is sunken into the canvas
     */
    public static final BorderStyle INSET = new BorderStyle(3);
    
    /**
     * Looks as if the content is coming out of the canvas
     */
    public static final BorderStyle OUTSET = new BorderStyle(4);
    
    /**
     * A series of round dots
     */
    public static final BorderStyle DOTTED = new BorderStyle(5);
    
    /**
     * A series of square-ended dashes
     */
    public static final BorderStyle DASHED = new BorderStyle(6);
    
    /**
     * Two parallel lines with some space between them
     */
    public static final BorderStyle DOUBLE = new BorderStyle(7);
    
    /**
     * Looks as if it were carved in the canvas
     */
    public static final BorderStyle GROOVE = new BorderStyle(8);
    
    /**
     * Looks as if it were coming out of the canvas
     */
    public static final BorderStyle RIDGE = new BorderStyle(9);
    
    private int value;
    
    public BorderStyle(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(BorderStyle[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
