package org.gtk.gtk;

/**
 * Determines the direction of a sort.
 */
public class SortType extends io.github.jwharm.javagi.Enumeration {

    /**
     * Sorting is in ascending order.
     */
    public static final SortType ASCENDING = new SortType(0);
    
    /**
     * Sorting is in descending order.
     */
    public static final SortType DESCENDING = new SortType(1);
    
    public SortType(int value) {
        super(value);
    }
    
}
