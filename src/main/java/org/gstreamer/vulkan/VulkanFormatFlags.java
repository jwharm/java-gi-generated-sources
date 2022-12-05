package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VulkanFormatFlags extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanFormatFlags";
    
    /**
     * is a YUV format
     */
    public static final VulkanFormatFlags YUV = new VulkanFormatFlags(1);
    
    /**
     * is a RGB format
     */
    public static final VulkanFormatFlags RGB = new VulkanFormatFlags(2);
    
    /**
     * has an alpha channel
     */
    public static final VulkanFormatFlags ALPHA = new VulkanFormatFlags(4);
    
    /**
     * data is stored in little-endiate byte order
     */
    public static final VulkanFormatFlags LE = new VulkanFormatFlags(8);
    
    /**
     * data is stored complex and cannot be read/write only using the information in the {@link VulkanFormatInfo}
     */
    public static final VulkanFormatFlags COMPLEX = new VulkanFormatFlags(16);
    
    public VulkanFormatFlags(int value) {
        super(value);
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the value to combine with
     * @return the combined value by calculating {@code this | mask} 
     */
    public VulkanFormatFlags or(VulkanFormatFlags mask) {
        return new VulkanFormatFlags(this.getValue() | mask.getValue());
    }
    
    /**
     * Combine (bitwise OR) operation
     * @param mask the first value to combine
     * @param masks the other values to combine
     * @return the combined value by calculating {@code mask | masks[0] | masks[1] | ...} 
     */
    public static VulkanFormatFlags combined(VulkanFormatFlags mask, VulkanFormatFlags... masks) {
        int value = mask.getValue();        for (VulkanFormatFlags arg : masks) {
            value |= arg.getValue();
        }
        return new VulkanFormatFlags(value);
    }
}
