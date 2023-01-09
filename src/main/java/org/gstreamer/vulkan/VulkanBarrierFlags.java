package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum VulkanBarrierFlags implements io.github.jwharm.javagi.Enumeration {
    
    NONE(0);
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanBarrierFlags";
    
    private final int value;
    
    /**
     * Create a new VulkanBarrierFlags for the provided value
     * @param numeric value the enum value
     */
    VulkanBarrierFlags(int value) {
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
     * Create a new VulkanBarrierFlags for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VulkanBarrierFlags of(int value) {
        return switch (value) {
            case 0 -> NONE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
