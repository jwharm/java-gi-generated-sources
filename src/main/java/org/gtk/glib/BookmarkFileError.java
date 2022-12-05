package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by bookmark file parsing.
 */
public enum BookmarkFileError implements io.github.jwharm.javagi.Enumeration {
    /**
     * URI was ill-formed
     */
    INVALID_URI(0),
    /**
     * a requested field was not found
     */
    INVALID_VALUE(1),
    /**
     * a requested application did
     *     not register a bookmark
     */
    APP_NOT_REGISTERED(2),
    /**
     * a requested URI was not found
     */
    URI_NOT_FOUND(3),
    /**
     * document was ill formed
     */
    READ(4),
    /**
     * the text being parsed was
     *     in an unknown encoding
     */
    UNKNOWN_ENCODING(5),
    /**
     * an error occurred while writing
     */
    WRITE(6),
    /**
     * requested file was not found
     */
    FILE_NOT_FOUND(7);
    
    private static final java.lang.String C_TYPE_NAME = "GBookmarkFileError";
    
    private final int value;
    BookmarkFileError(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static BookmarkFileError of(int value) {
        return switch (value) {
            case 0 -> INVALID_URI;
            case 1 -> INVALID_VALUE;
            case 2 -> APP_NOT_REGISTERED;
            case 3 -> URI_NOT_FOUND;
            case 4 -> READ;
            case 5 -> UNKNOWN_ENCODING;
            case 6 -> WRITE;
            case 7 -> FILE_NOT_FOUND;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
