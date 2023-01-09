package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum VulkanHandleType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * descripter set layout
     */
    DESCRIPTOR_SET_LAYOUT(1),
    
    /**
     * pipeline layout
     */
    PIPELINE_LAYOUT(2),
    
    /**
     * pipeline
     */
    PIPELINE(3),
    
    /**
     * render pass
     */
    RENDER_PASS(4),
    
    /**
     * sampler
     */
    SAMPLER(5),
    
    /**
     * framebuffer
     */
    FRAMEBUFFER(6),
    
    /**
     * shader
     */
    SHADER(7);
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanHandleType";
    
    private final int value;
    
    /**
     * Create a new VulkanHandleType for the provided value
     * @param numeric value the enum value
     */
    VulkanHandleType(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new VulkanHandleType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VulkanHandleType of(int value) {
        return switch (value) {
            case 1 -> DESCRIPTOR_SET_LAYOUT;
            case 2 -> PIPELINE_LAYOUT;
            case 3 -> PIPELINE;
            case 4 -> RENDER_PASS;
            case 5 -> SAMPLER;
            case 6 -> FRAMEBUFFER;
            case 7 -> SHADER;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
