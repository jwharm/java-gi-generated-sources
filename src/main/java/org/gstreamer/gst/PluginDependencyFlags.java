package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used in connection with gst_plugin_add_dependency().
 */
public class PluginDependencyFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstPluginDependencyFlags";
    
    /**
     * no special flags
     */
    public static final PluginDependencyFlags NONE = new PluginDependencyFlags(0);
    
    /**
     * recurse into subdirectories
     */
    public static final PluginDependencyFlags RECURSE = new PluginDependencyFlags(1);
    
    /**
     * use paths
     *         argument only if none of the environment variables is set
     */
    public static final PluginDependencyFlags PATHS_ARE_DEFAULT_ONLY = new PluginDependencyFlags(2);
    
    /**
     * interpret
     *         filename argument as filter suffix and check all matching files in
     *         the directory
     */
    public static final PluginDependencyFlags FILE_NAME_IS_SUFFIX = new PluginDependencyFlags(4);
    
    /**
     * interpret
     *         filename argument as filter prefix and check all matching files in
     *         the directory. Since: 1.8.
     */
    public static final PluginDependencyFlags FILE_NAME_IS_PREFIX = new PluginDependencyFlags(8);
    
    /**
     * interpret
     *   non-absolute paths as relative to the main executable directory. Since
     *   1.14.
     */
    public static final PluginDependencyFlags PATHS_ARE_RELATIVE_TO_EXE = new PluginDependencyFlags(16);
    
    public PluginDependencyFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public PluginDependencyFlags combined(PluginDependencyFlags mask) {
        this.setValue(this.getValue() | mask.getValue());
        return this;
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static PluginDependencyFlags combined(PluginDependencyFlags mask, PluginDependencyFlags... masks) {
        for (PluginDependencyFlags arg : masks) {
            mask.setValue(mask.getValue() | arg.getValue());
        }
        return mask;
    }
}
