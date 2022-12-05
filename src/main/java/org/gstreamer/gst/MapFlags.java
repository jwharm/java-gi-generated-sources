package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Flags used when mapping memory
 */
public class MapFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstMapFlags";
    
    /**
     * map for read access
     */
    public static final MapFlags READ = new MapFlags(1);
    
    /**
     * map for write access
     */
    public static final MapFlags WRITE = new MapFlags(2);
    
    /**
     * first flag that can be used for custom purposes
     */
    public static final MapFlags FLAG_LAST = new MapFlags(65536);
    
    public MapFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public MapFlags or(MapFlags mask) {
        return new MapFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static MapFlags combined(MapFlags mask, MapFlags... masks) {
        int value = mask.getValue();        for (MapFlags arg : masks) {
            value |= arg.getValue();
        }
        return new MapFlags(value);
    }
}
