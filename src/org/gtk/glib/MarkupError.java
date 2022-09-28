package org.gtk.glib;

/**
 * Error codes returned by markup parsing.
 */
public class MarkupError {

    /**
     * text being parsed was not valid UTF-8
     */
    public static final MarkupError BAD_UTF8 = new MarkupError(0);
    
    /**
     * document contained nothing, or only whitespace
     */
    public static final MarkupError EMPTY = new MarkupError(1);
    
    /**
     * document was ill-formed
     */
    public static final MarkupError PARSE = new MarkupError(2);
    
    /**
     * error should be set by {@link MarkupParser}
     *     functions; element wasn't known
     */
    public static final MarkupError UNKNOWN_ELEMENT = new MarkupError(3);
    
    /**
     * error should be set by {@link MarkupParser}
     *     functions; attribute wasn't known
     */
    public static final MarkupError UNKNOWN_ATTRIBUTE = new MarkupError(4);
    
    /**
     * error should be set by {@link MarkupParser}
     *     functions; content was invalid
     */
    public static final MarkupError INVALID_CONTENT = new MarkupError(5);
    
    /**
     * error should be set by {@link MarkupParser}
     *     functions; a required attribute was missing
     */
    public static final MarkupError MISSING_ATTRIBUTE = new MarkupError(6);
    
    private int value;
    
    public MarkupError(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(MarkupError[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
