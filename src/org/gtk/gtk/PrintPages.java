package org.gtk.gtk;

/**
 * See also gtk_print_job_set_pages()
 */
public enum PrintPages {

    /**
     * All pages.
     */
    ALL,
    
    /**
     * Current page.
     */
    CURRENT,
    
    /**
     * Range of pages.
     */
    RANGES,
    
    /**
     * Selected pages.
     */
    SELECTION;
    
    public static PrintPages fromValue(int value) {
        return switch(value) {
            case 0 -> ALL;
            case 1 -> CURRENT;
            case 2 -> RANGES;
            case 3 -> SELECTION;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ALL -> 0;
            case CURRENT -> 1;
            case RANGES -> 2;
            case SELECTION -> 3;
        };
    }

}
