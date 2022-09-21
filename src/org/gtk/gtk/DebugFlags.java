package org.gtk.gtk;

/**
 * Flags to use with gtk_set_debug_flags().
 * <p>
 * Settings these flags causes GTK to print out different
 * types of debugging information. Some of these flags are
 * only available when GTK has been configured with {@code -Ddebug=true}.
 */
public class DebugFlags {

    /**
     * Information about GtkTextView
     */
    public static final int TEXT = 1;
    
    /**
     * Information about GtkTreeView
     */
    public static final int TREE = 2;
    
    /**
     * Information about keyboard shortcuts
     */
    public static final int KEYBINDINGS = 4;
    
    /**
     * Information about modules and extensions
     */
    public static final int MODULES = 8;
    
    /**
     * Information about size allocation
     */
    public static final int GEOMETRY = 16;
    
    /**
     * Information about icon themes
     */
    public static final int ICONTHEME = 32;
    
    /**
     * Information about printing
     */
    public static final int PRINTING = 64;
    
    /**
     * Trace GtkBuilder operation
     */
    public static final int BUILDER = 128;
    
    /**
     * Information about size requests
     */
    public static final int SIZE_REQUEST = 256;
    
    /**
     * Disable the style property cache
     */
    public static final int NO_CSS_CACHE = 512;
    
    /**
     * Open the GTK inspector
     */
    public static final int INTERACTIVE = 1024;
    
    /**
     * Pretend the pointer is a touchscreen
     */
    public static final int TOUCHSCREEN = 2048;
    
    /**
     * Information about actions and menu models
     */
    public static final int ACTIONS = 4096;
    
    /**
     * Information from layout managers
     */
    public static final int LAYOUT = 8192;
    
    /**
     * Include debug render nodes in the generated snapshots
     */
    public static final int SNAPSHOT = 16384;
    
    /**
     * Information from the constraints solver
     */
    public static final int CONSTRAINTS = 32768;
    
    /**
     * Log unused GtkBuilder objects
     */
    public static final int BUILDER_OBJECTS = 65536;
    
    /**
     * Information about accessibility state changes
     */
    public static final int A11Y = 131072;
    
    /**
     * Information about icon fallback. Since: 4.2
     */
    public static final int ICONFALLBACK = 262144;
    
}
