package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags that modify the behavior of gtk_style_context_to_string().
 * <p>
 * New values may be added to this enumeration.
 */
public class StyleContextPrintFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkStyleContextPrintFlags";
    
    /**
     * Default value.
     */
    public static final StyleContextPrintFlags NONE = new StyleContextPrintFlags(0);
    
    /**
     * Print the entire tree of
     *   CSS nodes starting at the style context's node
     */
    public static final StyleContextPrintFlags RECURSE = new StyleContextPrintFlags(1);
    
    /**
     * Show the values of the
     *   CSS properties for each node
     */
    public static final StyleContextPrintFlags SHOW_STYLE = new StyleContextPrintFlags(2);
    
    /**
     * Show information about
     *   what changes affect the styles
     */
    public static final StyleContextPrintFlags SHOW_CHANGE = new StyleContextPrintFlags(4);
    
    /**
     * Create a new StyleContextPrintFlags with the provided value
     */
    public StyleContextPrintFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public StyleContextPrintFlags or(StyleContextPrintFlags... masks) {
        int value = this.getValue();
        for (StyleContextPrintFlags arg : masks) {
            value |= arg.getValue();
        }
        return new StyleContextPrintFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static StyleContextPrintFlags combined(StyleContextPrintFlags mask, StyleContextPrintFlags... masks) {
        int value = mask.getValue();
        for (StyleContextPrintFlags arg : masks) {
            value |= arg.getValue();
        }
        return new StyleContextPrintFlags(value);
    }
}
