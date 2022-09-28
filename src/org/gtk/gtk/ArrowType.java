package org.gtk.gtk;

/**
 * Used to indicate the direction in which an arrow should point.
 */
public class ArrowType {

    /**
     * Represents an upward pointing arrow.
     */
    public static final ArrowType UP = new ArrowType(0);
    
    /**
     * Represents a downward pointing arrow.
     */
    public static final ArrowType DOWN = new ArrowType(1);
    
    /**
     * Represents a left pointing arrow.
     */
    public static final ArrowType LEFT = new ArrowType(2);
    
    /**
     * Represents a right pointing arrow.
     */
    public static final ArrowType RIGHT = new ArrowType(3);
    
    /**
     * No arrow.
     */
    public static final ArrowType NONE = new ArrowType(4);
    
    private int value;
    
    public ArrowType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(ArrowType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
