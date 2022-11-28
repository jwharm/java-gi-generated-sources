package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * These are some terminal style flags you can use when creating your
 * debugging categories to make them stand out in debugging output.
 */
public class DebugColorFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstDebugColorFlags";
    
    /**
     * Use black as foreground color.
     */
    public static final DebugColorFlags FG_BLACK = new DebugColorFlags(0);
    
    /**
     * Use red as foreground color.
     */
    public static final DebugColorFlags FG_RED = new DebugColorFlags(1);
    
    /**
     * Use green as foreground color.
     */
    public static final DebugColorFlags FG_GREEN = new DebugColorFlags(2);
    
    /**
     * Use yellow as foreground color.
     */
    public static final DebugColorFlags FG_YELLOW = new DebugColorFlags(3);
    
    /**
     * Use blue as foreground color.
     */
    public static final DebugColorFlags FG_BLUE = new DebugColorFlags(4);
    
    /**
     * Use magenta as foreground color.
     */
    public static final DebugColorFlags FG_MAGENTA = new DebugColorFlags(5);
    
    /**
     * Use cyan as foreground color.
     */
    public static final DebugColorFlags FG_CYAN = new DebugColorFlags(6);
    
    /**
     * Use white as foreground color.
     */
    public static final DebugColorFlags FG_WHITE = new DebugColorFlags(7);
    
    /**
     * Use black as background color.
     */
    public static final DebugColorFlags BG_BLACK = new DebugColorFlags(0);
    
    /**
     * Use red as background color.
     */
    public static final DebugColorFlags BG_RED = new DebugColorFlags(16);
    
    /**
     * Use green as background color.
     */
    public static final DebugColorFlags BG_GREEN = new DebugColorFlags(32);
    
    /**
     * Use yellow as background color.
     */
    public static final DebugColorFlags BG_YELLOW = new DebugColorFlags(48);
    
    /**
     * Use blue as background color.
     */
    public static final DebugColorFlags BG_BLUE = new DebugColorFlags(64);
    
    /**
     * Use magenta as background color.
     */
    public static final DebugColorFlags BG_MAGENTA = new DebugColorFlags(80);
    
    /**
     * Use cyan as background color.
     */
    public static final DebugColorFlags BG_CYAN = new DebugColorFlags(96);
    
    /**
     * Use white as background color.
     */
    public static final DebugColorFlags BG_WHITE = new DebugColorFlags(112);
    
    /**
     * Make the output bold.
     */
    public static final DebugColorFlags BOLD = new DebugColorFlags(256);
    
    /**
     * Underline the output.
     */
    public static final DebugColorFlags UNDERLINE = new DebugColorFlags(512);
    
    public DebugColorFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DebugColorFlags combined(DebugColorFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DebugColorFlags combined(DebugColorFlags mask, DebugColorFlags... masks) {
        for (DebugColorFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
