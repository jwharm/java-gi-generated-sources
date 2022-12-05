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
    VulkanBarrierType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
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
