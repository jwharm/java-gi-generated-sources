package org.gtk.gtk;

/**
 * Passed as argument to various keybinding signals for moving the
 * cursor position.
 */
public class MovementStep {

    /**
     * Move forward or back by graphemes
     */
    public static final MovementStep LOGICAL_POSITIONS = new MovementStep(0);
    
    /**
     * Move left or right by graphemes
     */
    public static final MovementStep VISUAL_POSITIONS = new MovementStep(1);
    
    /**
     * Move forward or back by words
     */
    public static final MovementStep WORDS = new MovementStep(2);
    
    /**
     * Move up or down lines (wrapped lines)
     */
    public static final MovementStep DISPLAY_LINES = new MovementStep(3);
    
    /**
     * Move to either end of a line
     */
    public static final MovementStep DISPLAY_LINE_ENDS = new MovementStep(4);
    
    /**
     * Move up or down paragraphs (newline-ended lines)
     */
    public static final MovementStep PARAGRAPHS = new MovementStep(5);
    
    /**
     * Move to either end of a paragraph
     */
    public static final MovementStep PARAGRAPH_ENDS = new MovementStep(6);
    
    /**
     * Move by pages
     */
    public static final MovementStep PAGES = new MovementStep(7);
    
    /**
     * Move to ends of the buffer
     */
    public static final MovementStep BUFFER_ENDS = new MovementStep(8);
    
    /**
     * Move horizontally by pages
     */
    public static final MovementStep HORIZONTAL_PAGES = new MovementStep(9);
    
    private int value;
    
    public MovementStep(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(MovementStep[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
