package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The plugin loading state
 */
public class PluginFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstPluginFlags";
    
    /**
     * Temporarily loaded plugins
     */
    public static final PluginFlags CACHED = new PluginFlags(16);
    
    /**
     * The plugin won't be scanned (again)
     */
    public static final PluginFlags BLACKLISTED = new PluginFlags(32);
    
    public PluginFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public PluginFlags or(PluginFlags mask) {
        return new PluginFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static PluginFlags combined(PluginFlags mask, PluginFlags... masks) {
        int value = mask.getValue();        for (PluginFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PluginFlags(value);
    }
}
