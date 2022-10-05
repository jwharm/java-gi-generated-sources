package org.pango;

/**
 * These flags affect how Pango treats characters that are normally
 * not visible in the output.
 */
public class ShowFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * No special treatment for invisible characters
     */
    public static final ShowFlags NONE = new ShowFlags(0);
    
    /**
     * Render spaces, tabs and newlines visibly
     */
    public static final ShowFlags SPACES = new ShowFlags(1);
    
    /**
     * Render line breaks visibly
     */
    public static final ShowFlags LINE_BREAKS = new ShowFlags(2);
    
    /**
     * Render default-ignorable Unicode
     *   characters visibly
     */
    public static final ShowFlags IGNORABLES = new ShowFlags(4);
    
    public ShowFlags(int value) {
        super(value);
    }
    
}