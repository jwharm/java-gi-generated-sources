package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Used to specify options for gtk_icon_theme_lookup_icon().
 */
public class IconLookupFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkIconLookupFlags";
    
    /**
     * Try to always load regular icons, even
     *   when symbolic icon names are given
     */
    public static final IconLookupFlags FORCE_REGULAR = new IconLookupFlags(1);
    
    /**
     * Try to always load symbolic icons, even
     *   when regular icon names are given
     */
    public static final IconLookupFlags FORCE_SYMBOLIC = new IconLookupFlags(2);
    
    /**
     * Starts loading the texture in the background
     *   so it is ready when later needed.
     */
    public static final IconLookupFlags PRELOAD = new IconLookupFlags(4);
    
    /**
     * Create a new IconLookupFlags with the provided value
     */
    public IconLookupFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public IconLookupFlags or(IconLookupFlags... masks) {
        int value = this.getValue();
        for (IconLookupFlags arg : masks) {
            value |= arg.getValue();
        }
        return new IconLookupFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static IconLookupFlags combined(IconLookupFlags mask, IconLookupFlags... masks) {
        int value = mask.getValue();
        for (IconLookupFlags arg : masks) {
            value |= arg.getValue();
        }
        return new IconLookupFlags(value);
    }
}
