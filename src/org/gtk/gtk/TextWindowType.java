package org.gtk.gtk;

/**
 * Used to reference the parts of {@code GtkTextView}.
 */
public class TextWindowType {

    /**
     * Window that floats over scrolling areas.
     */
    public static final TextWindowType WIDGET = new TextWindowType(1);
    
    /**
     * Scrollable text window.
     */
    public static final TextWindowType TEXT = new TextWindowType(2);
    
    /**
     * Left side border window.
     */
    public static final TextWindowType LEFT = new TextWindowType(3);
    
    /**
     * Right side border window.
     */
    public static final TextWindowType RIGHT = new TextWindowType(4);
    
    /**
     * Top border window.
     */
    public static final TextWindowType TOP = new TextWindowType(5);
    
    /**
     * Bottom border window.
     */
    public static final TextWindowType BOTTOM = new TextWindowType(6);
    
    private int value;
    
    public TextWindowType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TextWindowType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
