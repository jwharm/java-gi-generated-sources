package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by bookmark file parsing.
 */
public class BookmarkFileError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GBookmarkFileError";
    
    /**
     * URI was ill-formed
     */
    public static final BookmarkFileError INVALID_URI = new BookmarkFileError(0);
    
    /**
     * a requested field was not found
     */
    public static final BookmarkFileError INVALID_VALUE = new BookmarkFileError(1);
    
    /**
     * a requested application did
     *     not register a bookmark
     */
    public static final BookmarkFileError APP_NOT_REGISTERED = new BookmarkFileError(2);
    
    /**
     * a requested URI was not found
     */
    public static final BookmarkFileError URI_NOT_FOUND = new BookmarkFileError(3);
    
    /**
     * document was ill formed
     */
    public static final BookmarkFileError READ = new BookmarkFileError(4);
    
    /**
     * the text being parsed was
     *     in an unknown encoding
     */
    public static final BookmarkFileError UNKNOWN_ENCODING = new BookmarkFileError(5);
    
    /**
     * an error occurred while writing
     */
    public static final BookmarkFileError WRITE = new BookmarkFileError(6);
    
    /**
     * requested file was not found
     */
    public static final BookmarkFileError FILE_NOT_FOUND = new BookmarkFileError(7);
    
    public BookmarkFileError(int value) {
        super(value);
    }
}
