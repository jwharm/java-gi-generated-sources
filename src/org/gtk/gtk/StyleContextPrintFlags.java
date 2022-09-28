package org.gtk.gtk;

/**
 * Flags that modify the behavior of gtk_style_context_to_string().
 * <p>
 * New values may be added to this enumeration.
 */
public class StyleContextPrintFlags {

    /**
     * Default value.
     */
    public static final StyleContextPrintFlags NONE = new StyleContextPrintFlags(0);
    
    /**
     * Print the entire tree of
     *   CSS nodes starting at the style context's node
     */
    public static final StyleContextPrintFlags RECURSE = new StyleContextPrintFlags(1);
    
    /**
     * Show the values of the
     *   CSS properties for each node
     */
    public static final StyleContextPrintFlags SHOW_STYLE = new StyleContextPrintFlags(2);
    
    /**
     * Show information about
     *   what changes affect the styles
     */
    public static final StyleContextPrintFlags SHOW_CHANGE = new StyleContextPrintFlags(4);
    
    private int value;
    
    public StyleContextPrintFlags(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(StyleContextPrintFlags[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public StyleContextPrintFlags combined(StyleContextPrintFlags mask) {
        return new StyleContextPrintFlags(this.getValue() | mask.getValue());
    }
    
    public static StyleContextPrintFlags combined(StyleContextPrintFlags mask, StyleContextPrintFlags... masks) {
        int value = mask.getValue();
        for (StyleContextPrintFlags arg : masks) {
            value |= arg.getValue();
        }
        return new StyleContextPrintFlags(value);
    }
    
}
