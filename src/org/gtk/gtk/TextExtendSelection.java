package org.gtk.gtk;

/**
 * Granularity types that extend the text selection. Use the
 * {@code GtkTextView::extend-selection} signal to customize the selection.
 */
public class TextExtendSelection {

    /**
     * Selects the current word. It is triggered by
     *   a double-click for example.
     */
    public static final TextExtendSelection WORD = new TextExtendSelection(0);
    
    /**
     * Selects the current line. It is triggered by
     *   a triple-click for example.
     */
    public static final TextExtendSelection LINE = new TextExtendSelection(1);
    
    private int value;
    
    public TextExtendSelection(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(TextExtendSelection[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
}
