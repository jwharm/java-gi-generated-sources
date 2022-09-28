package org.gtk.gtk;

/**
 * Error codes for {@code GtkIconTheme} operations.
 */
public class IconThemeError extends io.github.jwharm.javagi.Enumeration {

    /**
     * The icon specified does not exist in the theme
     */
    public static final IconThemeError NOT_FOUND = new IconThemeError(0);
    
    /**
     * An unspecified error occurred.
     */
    public static final IconThemeError FAILED = new IconThemeError(1);
    
    public IconThemeError(int value) {
        super(value);
    }
    
}
