package org.gtk.gtk;

/**
 * The possible values for the {@link AccessibleProperty#SORT}
 * accessible property.
 */
public class AccessibleSort {

    /**
     * There is no defined sort applied to the column.
     */
    public static final AccessibleSort NONE = new AccessibleSort(0);
    
    /**
     * Items are sorted in ascending order by this column.
     */
    public static final AccessibleSort ASCENDING = new AccessibleSort(1);
    
    /**
     * Items are sorted in descending order by this column.
     */
    public static final AccessibleSort DESCENDING = new AccessibleSort(2);
    
    /**
     * A sort algorithm other than ascending or
     *    descending has been applied.
     */
    public static final AccessibleSort OTHER = new AccessibleSort(3);
    
    private int value;
    
    public AccessibleSort(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(AccessibleSort[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
