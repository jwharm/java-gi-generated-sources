package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum VulkanBarrierFlags implements io.github.jwharm.javagi.Enumeration {
    NONE(0);
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanBarrierFlags";
    
    private final int value;
    VulkanBarrierFlags(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static VulkanBarrierFlags of(int value) {
        return switch (value) {
            case 0 -> NONE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
