package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Granularity types that extend the text selection. Use the
 * {@code GtkTextView::extend-selection} signal to customize the selection.
 */
public enum TextExtendSelection implements io.github.jwharm.javagi.Enumeration {
    /**
     * Selects the current word. It is triggered by
     *   a double-click for example.
     */
    WORD(0),
    /**
     * Selects the current line. It is triggered by
     *   a triple-click for example.
     */
    LINE(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextExtendSelection";
    
    private final int value;
    TextExtendSelection(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TextExtendSelection of(int value) {
        return switch (value) {
            case 0 -> WORD;
            case 1 -> LINE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
