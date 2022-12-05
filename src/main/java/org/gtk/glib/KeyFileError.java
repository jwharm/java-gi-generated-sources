package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by key file parsing.
 */
public enum KeyFileError implements io.github.jwharm.javagi.Enumeration {
    /**
     * the text being parsed was in
     *   an unknown encoding
     */
    UNKNOWN_ENCODING(0),
    /**
     * document was ill-formed
     */
    PARSE(1),
    /**
     * the file was not found
     */
    NOT_FOUND(2),
    /**
     * a requested key was not found
     */
    KEY_NOT_FOUND(3),
    /**
     * a requested group was not found
     */
    GROUP_NOT_FOUND(4),
    /**
     * a value could not be parsed
     */
    INVALID_VALUE(5);
    
    private static final java.lang.String C_TYPE_NAME = "GKeyFileError";
    
    private final int value;
    KeyFileError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static KeyFileError of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN_ENCODING;
            case 1 -> PARSE;
            case 2 -> NOT_FOUND;
            case 3 -> KEY_NOT_FOUND;
            case 4 -> GROUP_NOT_FOUND;
            case 5 -> INVALID_VALUE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
