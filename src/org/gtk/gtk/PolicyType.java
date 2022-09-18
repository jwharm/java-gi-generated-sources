package org.gtk.gtk;

/**
 * Determines how the size should be computed to achieve the one of the
 * visibility mode for the scrollbars.
 */
public enum PolicyType {

    /**
     * The scrollbar is always visible. The view size is
     *   independent of the content.
     */
    ALWAYS,
    
    /**
     * The scrollbar will appear and disappear as necessary.
     *   For example, when all of a <code>GtkTreeView</code> can not be seen.
     */
    AUTOMATIC,
    
    /**
     * The scrollbar should never appear. In this mode the
     *   content determines the size.
     */
    NEVER,
    
    /**
     * Don&<code>#39</code> t show a scrollbar, but don&<code>#39</code> t force the
     *   size to follow the content. This can be used e.g. to make multiple
     *   scrolled windows share a scrollbar.
     */
    EXTERNAL;
    
    public static PolicyType fromValue(int value) {
        return switch(value) {
            case 0 -> ALWAYS;
            case 1 -> AUTOMATIC;
            case 2 -> NEVER;
            case 3 -> EXTERNAL;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ALWAYS -> 0;
            case AUTOMATIC -> 1;
            case NEVER -> 2;
            case EXTERNAL -> 3;
        };
    }

}
