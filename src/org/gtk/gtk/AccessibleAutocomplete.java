package org.gtk.gtk;

/**
 * The possible values for the {@link org.gtk.gtk.AccessibleProperty<code>#AUTOCOMPLETE</code>  accessible property.
 */
public enum AccessibleAutocomplete {

    /**
     * Automatic suggestions are not displayed.
     */
    NONE,
    
    /**
     * When a user is providing input, text
     *    suggesting one way to complete the provided input may be dynamically
     *    inserted after the caret.
     */
    INLINE,
    
    /**
     * When a user is providing input, an element
     *    containing a collection of values that could complete the provided input
     *    may be displayed.
     */
    LIST,
    
    /**
     * When a user is providing input, an element
     *    containing a collection of values that could complete the provided input
     *    may be displayed. If displayed, one value in the collection is automatically
     *    selected, and the text needed to complete the automatically selected value
     *    appears after the caret in the input.
     */
    BOTH;
    
    public static AccessibleAutocomplete fromValue(int value) {
        return switch(value) {
            case 0 -> NONE;
            case 1 -> INLINE;
            case 2 -> LIST;
            case 3 -> BOTH;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case NONE -> 0;
            case INLINE -> 1;
            case LIST -> 2;
            case BOTH -> 3;
        };
    }

}
