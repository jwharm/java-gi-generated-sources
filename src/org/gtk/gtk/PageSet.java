package org.gtk.gtk;

/**
 * See also gtk_print_job_set_page_set().
 */
public enum PageSet {

    /**
     * All pages.
     */
    ALL,
    
    /**
     * Even pages.
     */
    EVEN,
    
    /**
     * Odd pages.
     */
    ODD;
    
    public static PageSet fromValue(int value) {
        return switch(value) {
            case 0 -> ALL;
            case 1 -> EVEN;
            case 2 -> ODD;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ALL -> 0;
            case EVEN -> 1;
            case ODD -> 2;
        };
    }

}
