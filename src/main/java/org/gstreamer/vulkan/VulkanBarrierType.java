package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum VulkanBarrierType implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * no barrier type
     */
    NONE(0),
    
    TYPE_MEMORY(1),
    
    TYPE_BUFFER(2),
    
    TYPE_IMAGE(3);
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanBarrierType";
    
    private final int value;
    
    /**
     * Create a new VulkanBarrierType for the provided value
     * @param numeric value the enum value
     */
    VulkanBarrierType(int value) {
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
     * Create a new VulkanBarrierType for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VulkanBarrierType of(int value) {
        return switch (value) {
            case 0 -> NONE;
            case 1 -> TYPE_MEMORY;
            case 2 -> TYPE_BUFFER;
            case 3 -> TYPE_IMAGE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
