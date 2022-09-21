package org.gtk.gtk;

/**
 * Describes the known strictness of a filter.
 * <p>
 * Note that for filters where the strictness is not known,
 * {@link FilterMatch#SOME} is always an acceptable value,
 * even if a filter does match all or no items.
 */
public enum FilterMatch {

    /**
     * The filter matches some items,
     *   gtk_filter_match() may return <code>true</code> or <code>false</code>
     */
    SOME,
    
    /**
     * The filter does not match any item,
     *   gtk_filter_match() will always return <code>false</code>.
     */
    NONE,
    
    /**
     * The filter matches all items,
     *   gtk_filter_match() will alays return <code>true</code>.
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
