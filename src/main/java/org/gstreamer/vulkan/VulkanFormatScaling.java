package org.gstreamer.vulkan;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public enum VulkanFormatScaling implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * [0, 2^n - 1] -&gt; [0.0, 1.0]
     */
    UNORM(1),
    
    /**
     * [-2^(n-1), 2^(n-1) - 1] -&gt; [-1.0, 1.0]
     */
    SNORM(2),
    
    /**
     * [0, 2^n - 1] -&gt; [0.0, float(2^n - 1)]
     */
    USCALED(3),
    
    /**
     * [-2^(n-1), 2^(n-1) - 1] -&gt; [float(-2^(n-1)), float(2^(n-1) - 1)]
     */
    SSCALED(4),
    
    /**
     * [0, 2^n - 1] -&gt; [0, 2^n - 1]
     */
    UINT(5),
    
    /**
     * [-2^(n-1), 2^(n-1) - 1] -&gt; [-2^(n-1), 2^(n-1) - 1]
     */
    SINT(6),
    
    /**
     * {@code GST_VULKAN_FORMAT_SCALING_UNORM} but the first three components are gamma corrected for the sRGB colour space.
     */
    SRGB(7);
    
    private static final java.lang.String C_TYPE_NAME = "GstVulkanFormatScaling";
    
    private final int value;
    
    /**
     * Create a new VulkanFormatScaling for the provided value
     * @param numeric value the enum value
     */
    VulkanFormatScaling(int value) {
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
     * Create a new VulkanFormatScaling for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static VulkanFormatScaling of(int value) {
        return switch (value) {
            case 1 -> UNORM;
            case 2 -> SNORM;
            case 3 -> USCALED;
            case 4 -> SSCALED;
            case 5 -> UINT;
            case 6 -> SINT;
            case 7 -> SRGB;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
