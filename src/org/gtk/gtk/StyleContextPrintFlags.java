package org.gtk.gtk;

/**
 * Flags that modify the behavior of gtk_style_context_to_string().
 * 
 * New values may be added to this enumeration.
 */
public class StyleContextPrintFlags {

    /**
     * Default value.
     */
    public static final int NONE = 0;
    
    /**
     * Print the entire tree of
     *   CSS nodes starting at the style context's node
     */
    public static final int RECURSE = 1;
    
    /**
     * Show the values of the
     *   CSS properties for each node
     */
    public static final int SHOW_STYLE = 2;
    
    /**
     * Show information about
     *   what changes affect the styles
     */
    public static final int SHOW_CHANGE = 4;
    
}
