package org.gtk.gtk;

/**
 * Specifies how search strings are matched inside text.
 */
public enum StringFilterMatchMode {

    /**
     * The search string and
     *   text must match exactly.
     */
    EXACT,
    
    /**
     * The search string
     *   must be contained as a substring inside the text.
     */
    SUBSTRING,
    
    /**
     * The text must begin
     *   with the search string.
     */
    PREFIX;
    
    public static StringFilterMatchMode fromValue(int value) {
        return switch(value) {
            case 0 -> EXACT;
            case 1 -> SUBSTRING;
            case 2 -> PREFIX;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case EXACT -> 0;
            case SUBSTRING -> 1;
            case PREFIX -> 2;
        };
    }

}
