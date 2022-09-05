package org.gtk.gtk;

/**
 * Used to reference the layers of `GtkTextView` for the purpose of customized
 * drawing with the ::snapshot_layer vfunc.
 */
public enum TextViewLayer {

    /**
     * The layer rendered below the text (but above the background).
     */
    BELOW_TEXT,
    
    /**
     * The layer rendered above the text.
     */
    ABOVE_TEXT;
    
    public static TextViewLayer fromValue(int value) {
        return switch(value) {
            case 0 -> BELOW_TEXT;
            case 1 -> ABOVE_TEXT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case BELOW_TEXT -> 0;
            case ABOVE_TEXT -> 1;
        };
    }

}
