package org.gtk.gtk;

/**
 * Describes the type of order that a {@code GtkSorter} may produce.
 */
public class SorterOrder extends io.github.jwharm.javagi.Enumeration {

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
    
    public SorterOrder(int value) {
        super(value);
    }
    
}