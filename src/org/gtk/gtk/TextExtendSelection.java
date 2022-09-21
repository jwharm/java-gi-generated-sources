package org.gtk.gtk;

/**
 * Granularity types that extend the text selection. Use the
 * {@code GtkTextView::extend-selection} signal to customize the selection.
 */
public enum TextExtendSelection {

    /**
     * Selects the current word. It is triggered by
     *   a double-click for example.
     */
    WORD,
    
    /**
     * Selects the current line. It is triggered by
     *   a triple-click for example.
     */
    LINE;
    
    public static TextExtendSelection fromValue(int value) {
        return switch(value) {
            case 0 -> WORD;
            case 1 -> LINE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case WORD -> 0;
            case LINE -> 1;
        };
    }

}
