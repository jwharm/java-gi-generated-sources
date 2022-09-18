package org.gtk.gtk;

/**
 * Describes changes in a sorter in more detail and allows users
 * to optimize resorting.
 */
public enum SorterChange {

    /**
     * The sorter change cannot be described
     *   by any of the other enumeration values
     */
    DIFFERENT,
    
    /**
     * The sort order was inverted. Comparisons
     *   that returned {@link org.gtk.gtk.Ordering<code>#SMALLER</code>  now return {@link org.gtk.gtk.Ordering<code>#LARGER</code>    and vice versa. Other comparisons return the same values as before.
     */
    INVERTED,
    
    /**
     * The sorter is less strict: Comparisons
     *   may now return {@link org.gtk.gtk.Ordering<code>#EQUAL</code>  that did not do so before.
     */
    LESS_STRICT,
    
    /**
     * The sorter is more strict: Comparisons
     *   that did return {@link org.gtk.gtk.Ordering<code>#EQUAL</code>  may not do so anymore.
     */
    MORE_STRICT;
    
    public static SorterChange fromValue(int value) {
        return switch(value) {
            case 0 -> DIFFERENT;
            case 1 -> INVERTED;
            case 2 -> LESS_STRICT;
            case 3 -> MORE_STRICT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case DIFFERENT -> 0;
            case INVERTED -> 1;
            case LESS_STRICT -> 2;
            case MORE_STRICT -> 3;
        };
    }

}
