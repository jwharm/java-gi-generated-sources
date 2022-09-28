package org.gtk.gtk;

/**
 * Describes the type of order that a {@code GtkSorter} may produce.
 */
public class SorterOrder {

    /**
     * A partial order. Any {@code GtkOrdering} is possible.
     */
    public static final SorterOrder PARTIAL = new SorterOrder(0);
    
    /**
     * No order, all elements are considered equal.
     *   gtk_sorter_compare() will only return {@link Ordering#EQUAL}.
     */
    public static final SorterOrder NONE = new SorterOrder(1);
    
    /**
     * A total order. gtk_sorter_compare() will only
     *   return {@link Ordering#EQUAL} if an item is compared with itself. Two
     *   different items will never cause this value to be returned.
     */
    public static final SorterOrder TOTAL = new SorterOrder(2);
    
    private int value;
    
    public SorterOrder(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SorterOrder[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
