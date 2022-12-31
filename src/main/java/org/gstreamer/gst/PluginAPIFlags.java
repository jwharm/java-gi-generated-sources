package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PluginAPIFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstPluginAPIFlags";
    
    /**
     * Ignore enum members when generating
     *   the plugins cache. This is useful if the members of the enum are generated
     *   dynamically, in order not to expose incorrect documentation to the end user.
     */
    public static final PluginAPIFlags MEMBERS = new PluginAPIFlags(1);
    
    public PluginAPIFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public PluginAPIFlags or(PluginAPIFlags... masks) {
        int value = this.getValue();
        for (PluginAPIFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PluginAPIFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static PluginAPIFlags combined(PluginAPIFlags mask, PluginAPIFlags... masks) {
        int value = mask.getValue();
        for (PluginAPIFlags arg : masks) {
            value |= arg.getValue();
        }
        return new PluginAPIFlags(value);
    }
}
