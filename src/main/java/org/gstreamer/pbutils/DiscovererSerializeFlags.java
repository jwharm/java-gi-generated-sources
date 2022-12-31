package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * You can use these flags to control what is serialized by
 * gst_discoverer_info_to_variant()
 * @version 1.6
 */
public class DiscovererSerializeFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstDiscovererSerializeFlags";
    
    /**
     * Serialize only basic information, excluding
     * caps, tags and miscellaneous information
     */
    public static final DiscovererSerializeFlags BASIC = new DiscovererSerializeFlags(0);
    
    /**
     * Serialize the caps for each stream
     */
    public static final DiscovererSerializeFlags CAPS = new DiscovererSerializeFlags(1);
    
    /**
     * Serialize the tags for each stream
     */
    public static final DiscovererSerializeFlags TAGS = new DiscovererSerializeFlags(2);
    
    /**
     * Serialize miscellaneous information for each stream
     */
    public static final DiscovererSerializeFlags MISC = new DiscovererSerializeFlags(4);
    
    /**
     * Serialize all the available info, including
     * caps, tags and miscellaneous information
     */
    public static final DiscovererSerializeFlags ALL = new DiscovererSerializeFlags(7);
    
    public DiscovererSerializeFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param masks one or more values to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public DiscovererSerializeFlags or(DiscovererSerializeFlags... masks) {
        int value = this.getValue();
        for (DiscovererSerializeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DiscovererSerializeFlags(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static DiscovererSerializeFlags combined(DiscovererSerializeFlags mask, DiscovererSerializeFlags... masks) {
        int value = mask.getValue();
        for (DiscovererSerializeFlags arg : masks) {
            value |= arg.getValue();
        }
        return new DiscovererSerializeFlags(value);
    }
}
