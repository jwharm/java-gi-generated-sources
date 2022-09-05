package org.gtk.gtk;

/**
 * Describes changes in a filter in more detail and allows objects
 * using the filter to optimize refiltering items.
 * 
 * If you are writing an implementation and are not sure which
 * value to pass, %GTK_FILTER_CHANGE_DIFFERENT is always a correct
 * choice.
 */
public enum FilterChange {

    /**
     * The filter change cannot be
     *   described with any of the other enumeration values.
     */
    DIFFERENT,
    
    /**
     * The filter is less strict than
     *   it was before: All items that it used to return %TRUE for
     *   still return %TRUE, others now may, too.
     */
    LESS_STRICT,
    
    /**
     * The filter is more strict than
     *   it was before: All items that it used to return %FALSE for
     *   still return %FALSE, others now may, too.
     */
    MORE_STRICT;
    
    public static FilterChange fromValue(int value) {
        return switch(value) {
            case 0 -> DIFFERENT;
            case 1 -> LESS_STRICT;
            case 2 -> MORE_STRICT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DIFFERENT -> 0;
            case LESS_STRICT -> 1;
            case MORE_STRICT -> 2;
        };
    }

}
