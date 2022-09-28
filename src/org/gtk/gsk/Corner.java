package org.gtk.gsk;

/**
 * The corner indices used by {@code GskRoundedRect}.
 */
public class Corner {

    /**
     * The top left corner
     */
    public static final Corner TOP_LEFT = new Corner(0);
    
    /**
     * The top right corner
     */
    public static final Corner TOP_RIGHT = new Corner(1);
    
    /**
     * The bottom right corner
     */
    public static final Corner BOTTOM_RIGHT = new Corner(2);
    
    /**
     * The bottom left corner
     */
    public static final Corner BOTTOM_LEFT = new Corner(3);
    
    private int value;
    
    public Corner(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(Corner[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
