package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags to use with gtk_set_debug_flags().
 * <p>
 * Settings these flags causes GTK to print out different
 * types of debugging information. Some of these flags are
 * only available when GTK has been configured with {@code -Ddebug=true}.
 */
public class DebugFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkDebugFlags";
    
    /**
     * Information about GtkTextView
     */
    public static final DebugFlags TEXT = new DebugFlags(1);
    
    /**
     * Information about GtkTreeView
     */
    public static final DebugFlags TREE = new DebugFlags(2);
    
    /**
     * Information about keyboard shortcuts
     */
    public static final DebugFlags KEYBINDINGS = new DebugFlags(4);
    
    /**
     * Information about modules and extensions
     */
    public static final DebugFlags MODULES = new DebugFlags(8);
    
    /**
     * Information about size allocation
     */
    public static final DebugFlags GEOMETRY = new DebugFlags(16);
    
    /**
     * Information about icon themes
     */
    public static final DebugFlags ICONTHEME = new DebugFlags(32);
    
    /**
     * Information about printing
     */
    public static final DebugFlags PRINTING = new DebugFlags(64);
    
    /**
     * Trace GtkBuilder operation
     */
    public static final DebugFlags BUILDER = new DebugFlags(128);
    
    /**
     * Information about size requests
     */
    public static final DebugFlags SIZE_REQUEST = new DebugFlags(256);
    
    /**
     * Disable the style property cache
     */
    public static final DebugFlags NO_CSS_CACHE = new DebugFlags(512);
    
    /**
     * Open the GTK inspector
     */
    public static final DebugFlags INTERACTIVE = new DebugFlags(1024);
    
    /**
     * Pretend the pointer is a touchscreen
     */
    public static final DebugFlags TOUCHSCREEN = new DebugFlags(2048);
    
    /**
     * Information about actions and menu models
     */
    public static final DebugFlags ACTIONS = new DebugFlags(4096);
    
    /**
     * Information from layout managers
     */
    public static final DebugFlags LAYOUT = new DebugFlags(8192);
    
    /**
     * Include debug render nodes in the generated snapshots
     */
    public static final DebugFlags SNAPSHOT = new DebugFlags(16384);
    
    /**
     * Information from the constraints solver
     */
    public static final DebugFlags CONSTRAINTS = new DebugFlags(32768);
    
    /**
     * Log unused GtkBuilder objects
     */
    public static final DebugFlags BUILDER_OBJECTS = new DebugFlags(65536);
    
    /**
     * Information about accessibility state changes
     */
    public static final DebugFlags A11Y = new DebugFlags(131072);
    
    /**
     * Information about icon fallback. Since: 4.2
     */
    public static final DebugFlags ICONFALLBACK = new DebugFlags(262144);
    
    public static final DebugFlags INVERT_TEXT_DIR = new DebugFlags(524288);
    
    /**
     * Create a new DebugFlags with the provided value
     */
    public DebugFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DebugFlags or(DebugFlags... masks) {
        int value = this.getValue();
        for (DebugFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DebugFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DebugFlags combined(DebugFlags mask, DebugFlags... masks) {
        int value = mask.getValue();
        for (DebugFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DebugFlags(value);
    }
}
