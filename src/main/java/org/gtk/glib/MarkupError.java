package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by markup parsing.
 */
public enum MarkupError implements io.github.jwharm.javagi.Enumeration {
    /**
     * text being parsed was not valid UTF-8
     */
    BAD_UTF8(0),
    /**
     * document contained nothing, or only whitespace
     */
    EMPTY(1),
    /**
     * document was ill-formed
     */
    PARSE(2),
    /**
     * error should be set by {@link MarkupParser}
     *     functions; element wasn't known
     */
    UNKNOWN_ELEMENT(3),
    /**
     * error should be set by {@link MarkupParser}
     *     functions; attribute wasn't known
     */
    UNKNOWN_ATTRIBUTE(4),
    /**
     * error should be set by {@link MarkupParser}
     *     functions; content was invalid
     */
    INVALID_CONTENT(5),
    /**
     * error should be set by {@link MarkupParser}
     *     functions; a required attribute was missing
     */
    MISSING_ATTRIBUTE(6);
    
    private static final java.lang.String C_TYPE_NAME = "GMarkupError";
    
    private final int value;
    MarkupError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static MarkupError of(int value) {
        return switch (value) {
            case 0 -> BAD_UTF8;
            case 1 -> EMPTY;
            case 2 -> PARSE;
            case 3 -> UNKNOWN_ELEMENT;
            case 4 -> UNKNOWN_ATTRIBUTE;
            case 5 -> INVALID_CONTENT;
            case 6 -> MISSING_ATTRIBUTE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
