package org.gtk.gtk;

/**
 * Warnings that can occur while parsing CSS.
 * <p>
 * Unlike {@code GtkCssParserError}s, warnings do not cause the parser to
 * skip any input, but they indicate issues that should be fixed.
 */
public class CssParserWarning {

    /**
     * The given construct is
     *   deprecated and will be removed in a future version
     */
    public static final CssParserWarning DEPRECATED = new CssParserWarning(0);
    
    /**
     * A syntax construct was used
     *   that should be avoided
     */
    public static final CssParserWarning SYNTAX = new CssParserWarning(1);
    
    /**
     * A feature is not implemented
     */
    public static final CssParserWarning UNIMPLEMENTED = new CssParserWarning(2);
    
    private int value;
    
    public CssParserWarning(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(CssParserWarning[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
