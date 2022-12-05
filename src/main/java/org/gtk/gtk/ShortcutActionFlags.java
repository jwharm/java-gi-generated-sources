package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * List of flags that can be passed to action activation.
 * <p>
 * More flags may be added in the future.
 */
public class ShortcutActionFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkShortcutActionFlags";
    
    /**
     * The action is the only
     *   action that can be activated. If this flag is not set,
     *   a future activation may select a different action.
     */
    public static final ShortcutActionFlags EXCLUSIVE = new ShortcutActionFlags(1);
    
    public ShortcutActionFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public ShortcutActionFlags or(ShortcutActionFlags mask) {
        return new ShortcutActionFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static ShortcutActionFlags combined(ShortcutActionFlags mask, ShortcutActionFlags... masks) {
        int value = mask.getValue();        for (ShortcutActionFlags arg : masks) {
            value |= arg.getValue();
        }
        return new ShortcutActionFlags(value);
    }
}
