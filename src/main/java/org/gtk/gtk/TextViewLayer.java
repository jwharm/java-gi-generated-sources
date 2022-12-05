package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to reference the layers of {@code GtkTextView} for the purpose of customized
 * drawing with the ::snapshot_layer vfunc.
 */
public enum TextViewLayer implements io.github.jwharm.javagi.Enumeration {
    /**
     * The layer rendered below the text (but above the background).
     */
    BELOW_TEXT(0),
    /**
     * The layer rendered above the text.
     */
    ABOVE_TEXT(1);
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextViewLayer";
    
    private final int value;
    TextViewLayer(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static TextViewLayer of(int value) {
        return switch (value) {
            case 0 -> BELOW_TEXT;
            case 1 -> ABOVE_TEXT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
