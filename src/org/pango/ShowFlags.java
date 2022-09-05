package org.pango;

/**
 * These flags affect how Pango treats characters that are normally
 * not visible in the output.
 */
public class ShowFlags {

    /**
     * No special treatment for invisible characters
     */
    public static final int NONE = 0;
    
    /**
     * Render spaces, tabs and newlines visibly
     */
    public static final int SPACES = 1;
    
    /**
     * Render line breaks visibly
     */
    public static final int LINE_BREAKS = 2;
    
    /**
     * Render default-ignorable Unicode
     *   characters visibly
     */
    public static final int IGNORABLES = 4;
    
}
