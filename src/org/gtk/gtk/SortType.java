package org.gtk.gtk;

/**
 * Determines the direction of a sort.
 */
public enum SortType {

    /**
     * Sorting is in ascending order.
     */
    ASCENDING,
    
    /**
     * Sorting is in descending order.
     */
    DESCENDING;
    
    public static SortType fromValue(int value) {
        return switch(value) {
            case 0 -> ASCENDING;
            case 1 -> DESCENDING;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ASCENDING -> 0;
            case DESCENDING -> 1;
        };
    }

}
