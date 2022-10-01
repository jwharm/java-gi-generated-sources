package org.gtk.gtk;

/**
 * Error codes that identify various errors that can occur while
 * using the GTK printing support.
 */
public class PrintError extends io.github.jwharm.javagi.Enumeration {

    /**
     * An unspecified error occurred.
     */
    public static final PrintError GENERAL = new PrintError(0);
    
    /**
     * An internal error occurred.
     */
    public static final PrintError INTERNAL_ERROR = new PrintError(1);
    
    /**
     * A memory allocation failed.
     */
    public static final PrintError NOMEM = new PrintError(2);
    
    /**
     * An error occurred while loading a page setup
     *   or paper size from a key file.
     */
    public static final PrintError INVALID_FILE = new PrintError(3);
    
    public PrintError(int value) {
        super(value);
    }
    
}
