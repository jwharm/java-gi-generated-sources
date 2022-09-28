package org.gtk.gtk;

/**
 * Determines the direction of a sort.
 */
public class SortType {

    /**
     * Sorting is in ascending order.
     */
    public static final SortType ASCENDING = new SortType(0);
    
    /**
     * Sorting is in descending order.
     */
    public static final SortType DESCENDING = new SortType(1);
    
    private int value;
    
    public SortType(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SortType[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
