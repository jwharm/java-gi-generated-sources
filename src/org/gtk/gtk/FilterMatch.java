package org.gtk.gtk;

/**
 * Describes the known strictness of a filter.
 * 
 * Note that for filters where the strictness is not known,
 * {@link org.gtk.gtk.FilterMatch#SOME} is always an acceptable value,
 * even if a filter does match all or no items.
 */
public enum FilterMatch {

    /**
     * The filter matches some items,
     *   gtk_filter_match() may return <code>true</code> or or %FALSE
     */
    SOME,
    
    /**
     * The filter does not match any item,
     *   gtk_filter_match() will always return 
     *       
     *       
     *         The filter does not match any item,
     *   gtk_filter_match() will always return %FALSE.
     */
    NONE,
    
    /**
     * The filter matches all items,
     *   gtk_filter_match() will alays return 
     *       
     *       
     *         The filter matches all items,
     *   gtk_filter_match() will alays return %TRUE.
     */
    ALL;
    
    public static FilterMatch fromValue(int value) {
        return switch(value) {
            case 0 -> SOME;
            case 1 -> NONE;
            case 2 -> ALL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case SOME -> 0;
            case NONE -> 1;
            case ALL -> 2;
        };
    }

}
