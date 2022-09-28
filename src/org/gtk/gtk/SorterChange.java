package org.gtk.gtk;

/**
 * Describes changes in a sorter in more detail and allows users
 * to optimize resorting.
 */
public class SorterChange {

    /**
     * The sorter change cannot be described
     *   by any of the other enumeration values
     */
    public static final SorterChange DIFFERENT = new SorterChange(0);
    
    /**
     * The sort order was inverted. Comparisons
     *   that returned {@link Ordering#SMALLER} now return {@link Ordering#LARGER}
     *   and vice versa. Other comparisons return the same values as before.
     */
    public static final SorterChange INVERTED = new SorterChange(1);
    
    /**
     * The sorter is less strict: Comparisons
     *   may now return {@link Ordering#EQUAL} that did not do so before.
     */
    public static final SorterChange LESS_STRICT = new SorterChange(2);
    
    /**
     * The sorter is more strict: Comparisons
     *   that did return {@link Ordering#EQUAL} may not do so anymore.
     */
    public static final SorterChange MORE_STRICT = new SorterChange(3);
    
    private int value;
    
    public SorterChange(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(SorterChange[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
