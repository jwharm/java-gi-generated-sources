package org.gtk.gtk;

/**
 * The possible values for the {@link AccessibleProperty#SORT}
 * accessible property.
 */
public enum AccessibleSort {

    /**
     * There is no defined sort applied to the column.
     */
    NONE,
    
    /**
     * Items are sorted in ascending order by this column.
     */
    ASCENDING,
    
    /**
     * Items are sorted in descending order by this column.
     */
    DESCENDING,
    
    /**
     * A sort algorithm other than ascending or
     *    descending has been applied.
     */
    OTHER;
    
    public static AccessibleSort fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> ASCENDING;
            case 2 -> DESCENDING;
            case 3 -> OTHER;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case ASCENDING -> 1;
            case DESCENDING -> 2;
            case OTHER -> 3;
        };
    }

}
