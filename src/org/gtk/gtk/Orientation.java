package org.gtk.gtk;

/**
 * Represents the orientation of widgets and other objects.
 * <p>
 * Typical examples are {@code GesturePan}.
 */
public class Orientation {

    /**
     * The element is in horizontal orientation.
     */
    public static final Orientation HORIZONTAL = new Orientation(0);
    
    /**
     * The element is in vertical orientation.
     */
    public static final Orientation VERTICAL = new Orientation(1);
    
    private int value;
    
    public Orientation(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Orientation[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
