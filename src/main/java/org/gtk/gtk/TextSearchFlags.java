package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags affecting how a search is done.
 * <p>
 * If neither {@link TextSearchFlags#VISIBLE_ONLY} nor {@link TextSearchFlags#TEXT_ONLY} are
 * enabled, the match must be exact; the special 0xFFFC character will match
 * embedded paintables or child widgets.
 */
public class TextSearchFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextSearchFlags";
    
    /**
     * Search only visible data. A search match may
     * have invisible text interspersed.
     */
    public static final TextSearchFlags VISIBLE_ONLY = new TextSearchFlags(1);
    
    /**
     * Search only text. A match may have paintables or
     * child widgets mixed inside the matched range.
     */
    public static final TextSearchFlags TEXT_ONLY = new TextSearchFlags(2);
    
    /**
     * The text will be matched regardless of
     * what case it is in.
     */
    public static final TextSearchFlags CASE_INSENSITIVE = new TextSearchFlags(4);
    
    /**
     * Create a new TextSearchFlags with the provided value
     */
    public TextSearchFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public TextSearchFlags or(TextSearchFlags... masks) {
        int value = this.getValue();
        for (TextSearchFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TextSearchFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static TextSearchFlags combined(TextSearchFlags mask, TextSearchFlags... masks) {
        int value = mask.getValue();
        for (TextSearchFlags arg : masks) {
            value |= arg.getValue();
        }
        return new TextSearchFlags(value);
    }
}
