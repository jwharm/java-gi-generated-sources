package org.gtk.gtk;

/**
 * Used for justifying the text inside a {@link Label} widget.
 */
public class Justification {

    /**
     * The text is placed at the left edge of the label.
     */
    public static final Justification LEFT = new Justification(0);
    
    /**
     * The text is placed at the right edge of the label.
     */
    public static final Justification RIGHT = new Justification(1);
    
    /**
     * The text is placed in the center of the label.
     */
    public static final Justification CENTER = new Justification(2);
    
    /**
     * The text is placed is distributed across the label.
     */
    public static final Justification FILL = new Justification(3);
    
    private int value;
    
    public Justification(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Justification[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
