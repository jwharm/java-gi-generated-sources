package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes a type of line wrapping.
 */
public enum WrapMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * do not wrap lines; just make the text area wider
     */
    NONE(0),
    /**
     * wrap text, breaking lines anywhere the cursor can
     *   appear (between characters, usually - if you want to be technical,
     *   between graphemes, see pango_get_log_attrs())
     */
    CHAR(1),
    /**
     * wrap text, breaking lines in between words
     */
    WORD(2),
    /**
     * wrap text, breaking lines in between words, or if
     *   that is not enough, also between graphemes
     */
    WORD_CHAR(3);
    
    private static final java.lang.String C_TYPE_NAME = "GtkWrapMode";
    
    private final int value;
    WrapMode(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static WrapMode of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> CHAR;
            case 2 -> WORD;
            case 3 -> WORD_CHAR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
