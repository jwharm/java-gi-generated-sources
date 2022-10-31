package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Error codes returned by key file parsing.
 */
public class KeyFileError extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GKeyFileError";
    
    /**
     * the text being parsed was in
     *   an unknown encoding
     */
    public static final KeyFileError UNKNOWN_ENCODING = new KeyFileError(0);
    
    /**
     * document was ill-formed
     */
    public static final KeyFileError PARSE = new KeyFileError(1);
    
    /**
     * the file was not found
     */
    public static final KeyFileError NOT_FOUND = new KeyFileError(2);
    
    /**
     * a requested key was not found
     */
    public static final KeyFileError KEY_NOT_FOUND = new KeyFileError(3);
    
    /**
     * a requested group was not found
     */
    public static final KeyFileError GROUP_NOT_FOUND = new KeyFileError(4);
    
    /**
     * a value could not be parsed
     */
    public static final KeyFileError INVALID_VALUE = new KeyFileError(5);
    
    public KeyFileError(int value) {
        super(value);
    }
}
