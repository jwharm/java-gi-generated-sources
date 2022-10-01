package org.gtk.gtk;

/**
 * Specifies how search strings are matched inside text.
 */
public class StringFilterMatchMode extends io.github.jwharm.javagi.Enumeration {

    /**
     * The search string and
     *   text must match exactly.
     */
    public static final StringFilterMatchMode EXACT = new StringFilterMatchMode(0);
    
    /**
     * The search string
     *   must be contained as a substring inside the text.
     */
    public static final StringFilterMatchMode SUBSTRING = new StringFilterMatchMode(1);
    
    /**
     * The text must begin
     *   with the search string.
     */
    public static final StringFilterMatchMode PREFIX = new StringFilterMatchMode(2);
    
    public StringFilterMatchMode(int value) {
        super(value);
    }
    
}
