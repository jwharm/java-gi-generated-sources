package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoWrapMode} describes how to wrap the lines of a {@code PangoLayout}
 * to the desired width.
 * <p>
 * For {@code PANGO_WRAP_WORD}, Pango uses break opportunities that are determined
 * by the Unicode line breaking algorithm. For {@code PANGO_WRAP_CHAR}, Pango allows
 * breaking at grapheme boundaries that are determined by the Unicode text
 * segmentation algorithm.
 */
public enum WrapMode implements io.github.jwharm.javagi.Enumeration {
    /**
     * wrap lines at word boundaries.
     */
    WORD(0),
    /**
     * wrap lines at character boundaries.
     */
    CHAR(1),
    /**
     * wrap lines at word boundaries, but fall back to
     *   character boundaries if there is not enough space for a full word.
     */
    WORD_CHAR(2);
    
    private static final java.lang.String C_TYPE_NAME = "PangoWrapMode";
    
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
            case 0 -> WORD;
            case 1 -> CHAR;
            case 2 -> WORD_CHAR;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
