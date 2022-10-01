package org.gtk.gtk;

/**
 * The possible values for the {@link AccessibleProperty#AUTOCOMPLETE}
 * accessible property.
 */
public class AccessibleAutocomplete extends io.github.jwharm.javagi.Enumeration {

    /**
     * Automatic suggestions are not displayed.
     */
    public static final AccessibleAutocomplete NONE = new AccessibleAutocomplete(0);
    
    /**
     * When a user is providing input, text
     *    suggesting one way to complete the provided input may be dynamically
     *    inserted after the caret.
     */
    public static final AccessibleAutocomplete INLINE = new AccessibleAutocomplete(1);
    
    /**
     * When a user is providing input, an element
     *    containing a collection of values that could complete the provided input
     *    may be displayed.
     */
    public static final AccessibleAutocomplete LIST = new AccessibleAutocomplete(2);
    
    /**
     * When a user is providing input, an element
     *    containing a collection of values that could complete the provided input
     *    may be displayed. If displayed, one value in the collection is automatically
     *    selected, and the text needed to complete the automatically selected value
     *    appears after the caret in the input.
     */
    public static final AccessibleAutocomplete BOTH = new AccessibleAutocomplete(3);
    
    public AccessibleAutocomplete(int value) {
        super(value);
    }
    
}
