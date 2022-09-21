package org.gtk.gtk;

/**
 * Describes the type of order that a {@code GtkSorter} may produce.
 */
public enum SorterOrder {

    /**
     * A partial order. Any {@code GtkOrdering} is possible.
     */
    PARTIAL,
    
    /**
     * No order, all elements are considered equal.
     *   gtk_sorter_compare() will only return {@link Ordering#EQUAL}.
     */
    NONE,
    
    /**
     * A total order. gtk_sorter_compare() will only
     *   return {@link Ordering#EQUAL} if an item is compared with itself. Two
     *   different items will never cause this value to be returned.
     */
    TOTAL;
    
    public static SorterOrder fromValue(int value) {
        return switch(value) {
            case 0 -> PARTIAL;
            case 1 -> NONE;
            case 2 -> TOTAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case PARTIAL -> 0;
            case NONE -> 1;
            case TOTAL -> 2;
        };
    }

}
